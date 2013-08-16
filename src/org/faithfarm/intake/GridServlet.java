package org.faithfarm.intake;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.faithfarm.util.Validator;

public class GridServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Validator valid8r = new Validator();

	Connection connection = null;
	private String uid = "root";

	private String SERVER = "ffarm_dev";
	private String pwd = "admin";

	// private String SERVER = "ffarm_staging";
	// private String pwd="j35u59538";

	public GridServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/xml");
    response.addHeader("Cache-Control", "no-cache");
    String resultType=request.getParameter("type");
    System.out.println(">"+resultType);
    
     StringBuffer data = new StringBuffer();
     
     if ("student".equals(resultType)) 
    	 data=this.studentXml(request);
     
     
	response.getWriter().write(data.toString());
    
  }

	private StringBuffer studentXml(HttpServletRequest request) {

		ResultSet rs = null;
		StringBuffer data = null;
		
		int count = 0, totalpages = 0, start = 0;

		int page, limit;

		String sidx = null, sord = null;

		try {
			page = Integer.parseInt(request.getParameter("page"));
		} catch (Exception nullexp) {
			page = 1;
		}

		try {
			limit = Integer.parseInt(request.getParameter("rows"));
		} catch (Exception nullexp) {
			limit = 20;
		}

		try {
			sidx = request.getParameter("sidx");
		} catch (Exception nullexp) {
			sidx = "1";
		}

		try {
			sord = request.getParameter("sord");
		} catch (Exception nullexp) {
			sord = "desc";
		}

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + SERVER, uid, pwd);

			rs = connection.createStatement().executeQuery(
					"select count(*) from intake");

			if (rs.next())
				count = rs.getInt(1);

			if (count > 0)
				totalpages = (int) (count) / limit;
			else
				totalpages = 0;

			if (page > totalpages)
				page = totalpages;

			start = (limit * page) - limit;

			String selectQuery = "select intake_id,lastname,if (mi is null,'',mi), firstname, ssn,dob from intake order by  "
					+ sidx
					+ " "
					+ sord
					+ " limit "
					+ limit
					+ " offset "
					+ start;

			System.out.println(selectQuery);

			rs = connection.createStatement().executeQuery(selectQuery);

			data = new StringBuffer();

			data.append("<?xml version=\"1.0\"?>\n");
			data.append("<rows>");
			data.append("<page>" + page + "</page>");
			data.append("<total>" + totalpages + "</total>");
			data.append("<records>" + count + "</records>");

			while (rs.next()) {
				data.append("<row id='" + rs.getString(1) + "'>");
				data.append("<cell>" + rs.getString(1) + "</cell>");
				data.append("<cell>" + rs.getString(2) + "</cell>");
				data.append("<cell>" + rs.getString(3) + "</cell>");
				data.append("<cell>" + rs.getString(4) + "</cell>");
				data.append("<cell>" + rs.getString(5) + "</cell>");
				data.append("<cell>"
						+ valid8r.decryptSsn(rs.getString(6) + "'") + "</cell>");
				data.append("</row>");
			}

			data.append("</rows>");

			connection.close();
			rs.close();
		} catch (Exception e) {

		} 
		
		return data;
	}
}
