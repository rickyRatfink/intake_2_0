package org.faithfarm.intake;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.faithfarm.util.Validator;



public class GridServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Validator valid8r = new Validator();
	private static String firstName = "";
	private static String lastName = "";
	private static String mi = "";
	private static String entryDate = "";
	private static String exitDate = "";
	private static String dob = "";
	private static String ssn = "";
	private static String archivedFlag = "";
	private static String pictureFlag = "";
	private static String gedFlag = "";
	private static String farm="";
	
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
    
     StringBuffer data = new StringBuffer();
     
     if ("student".equals(resultType)) 
    	 data=this.studentXml(request);
  
    	 response.getWriter().write(data.toString());
    
  }

	private StringBuffer studentXml(HttpServletRequest req) {
	  
	 System.out.println (">"+firstName);
  	 
		ResultSet rs = null;
		StringBuffer data = new StringBuffer("");
		
		int count = 0, totalpages = 0, start = 0, row = 0;

		int page, limit;

		String sidx = null, sord = null;

		try {
			page = Integer.parseInt(req.getParameter("page"));
		} catch (Exception nullexp) {
			page = 1;
		}

		try {
			limit = Integer.parseInt(req.getParameter("rows"));
		} catch (Exception nullexp) {
			limit = 20;
		}

		try {
			sidx = req.getParameter("sidx");
		} catch (Exception nullexp) {
			sidx = "1";
		}

		try {
			sord = req.getParameter("sord");
		} catch (Exception nullexp) {
			sord = "desc";
		}

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + SERVER, uid, pwd);

			StringBuffer selectQuery = new StringBuffer("");
			selectQuery.append("select count(*)  FROM `"+SERVER+"`.`intake`  ");
			selectQuery.append(" WHERE");
			selectQuery.append(" 1=1 ");
				if (firstName.length()>0)
					selectQuery.append(" AND FIRSTNAME='"+firstName +"'");
				if (lastName.length()>0)
					selectQuery.append(" AND LASTNAME='"+ lastName+"'");
				if (ssn.length()>0)
					selectQuery.append(" AND SSN='"+ ssn +"'");
				if (dob.length()>0)
					selectQuery.append(" AND DOB='"+ dob +"'");
				if (entryDate.length()>0&&exitDate.length()>0)
					selectQuery.append(" AND ENTRY_DATE BETWEEN'"+ entryDate +"' AND '"+exitDate+"'");
				if (!"ALL".equals(farm)&&!"".equals(farm))
					selectQuery.append(" AND FARM_BASE='"+farm +"'");

			rs = connection.createStatement().executeQuery(selectQuery.toString());
			
			if (rs.next())
				count = rs.getInt(1);

			if (count > 0)
				totalpages = (int) (count) / limit;
			else
				totalpages = 0;

			if (page > totalpages)
				page = totalpages;

			start = (limit * page) - limit;
			if (start<0)
				start=0;
			
		//if (count>0) {
			selectQuery = new StringBuffer("");
			selectQuery.append("SELECT ");
			selectQuery.append(" INTAKE_ID,");
			selectQuery.append(" LASTNAME, ");
			selectQuery.append(" FIRSTNAME, ");
			selectQuery.append(" if (MI is null,'',MI), ");
			selectQuery.append(" if (DOB is null,'',DOB),");
			selectQuery.append(" SSN");
			selectQuery.append(" FROM `"+SERVER+"`.`intake`  ");
			selectQuery.append(" WHERE");
			selectQuery.append(" 1=1 ");
				if (firstName.length()>0)
					selectQuery.append(" AND FIRSTNAME='"+firstName +"'");
				if (lastName.length()>0)
					selectQuery.append(" AND LASTNAME='"+ lastName+"'");
				if (ssn.length()>0)
					selectQuery.append(" AND SSN='"+ ssn +"'");
				if (dob.length()>0)
					selectQuery.append(" AND DOB='"+ dob +"'");
				if (entryDate.length()>0&&exitDate.length()>0)
					selectQuery.append(" AND ENTRY_DATE BETWEEN'"+ entryDate +"' AND '"+exitDate+"'");
				if (!"ALL".equals(farm)&&!"".equals(farm))
					selectQuery.append(" AND FARM_BASE='"+farm +"'");
				
				selectQuery.append(" order by "+sidx + " "+sord+ " limit "+limit+ " offset "+start);
				;
				
				
				rs = connection.createStatement().executeQuery(selectQuery.toString());
	
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
					data.append("<cell>" + rs.getString(4) + "</cell>");
					data.append("<cell>" + rs.getString(3) + "</cell>");
					data.append("<cell>" + rs.getString(5) + "</cell>");
					data.append("<cell>" + rs.getString(6) + "</cell>");
					data.append("</row>");
					++row;
				} 
				
				if (row==0){
					data.append("<row id='1'>");
					data.append("<cell>No Results</cell>");
					data.append("<cell></cell>");
					data.append("<cell></cell>");
					data.append("<cell></cell>");
					data.append("<cell></cell>");
					data.append("<cell></cell>");
					data.append("</row>");
					for (int i=2;i<22;i++) {
						data.append("<row id='"+i+"'>");
						data.append("<cell></cell>");
						data.append("<cell></cell>");
						data.append("<cell></cell>");
						data.append("<cell></cell>");
						data.append("<cell></cell>");
						data.append("<cell></cell>");
						data.append("</row>");	
					}
				}
				
				data.append("</rows>");
	
				connection.close();
				rs.close();
		//}
		req.getSession().setAttribute("rows",new Integer(row));
		} catch (Exception e) {
			System.out.println (e.getMessage());
		} 
		
		return data;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		GridServlet.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		GridServlet.lastName = lastName;
	}

	public static String getMi() {
		return mi;
	}

	public static void setMi(String mi) {
		GridServlet.mi = mi;
	}

	public static String getEntryDate() {
		return entryDate;
	}

	public static void setEntryDate(String entryDate) {
		GridServlet.entryDate = entryDate;
	}

	public static String getExitDate() {
		return exitDate;
	}

	public static void setExitDate(String exitDate) {
		GridServlet.exitDate = exitDate;
	}

	public static String getDob() {
		return dob;
	}

	public static void setDob(String dob) {
		GridServlet.dob = dob;
	}

	public static String getSsn() {
		return ssn;
	}

	public static void setSsn(String ssn) {
		GridServlet.ssn = ssn;
	}

	public static String getArchivedFlag() {
		return archivedFlag;
	}

	public static void setArchivedFlag(String archivedFlag) {
		GridServlet.archivedFlag = archivedFlag;
	}

	public static String getPictureFlag() {
		return pictureFlag;
	}

	public static void setPictureFlag(String pictureFlag) {
		GridServlet.pictureFlag = pictureFlag;
	}

	public static String getGedFlag() {
		return gedFlag;
	}

	public static void setGedFlag(String gedFlag) {
		GridServlet.gedFlag = gedFlag;
	}

	public static String getFarm() {
		return farm;
	}

	public static void setFarm(String farm) {
		GridServlet.farm = farm;
	}
	
}
