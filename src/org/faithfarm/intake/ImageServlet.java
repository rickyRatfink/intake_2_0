package org.faithfarm.intake;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.faithfarm.service.data.StudentDao;
import org.faithfarm.util.Validator;

public class ImageServlet extends HttpServlet {

	private Validator valid8r = new Validator();
	private String SERVER = "";
	private String uid = "";
	private String pwd = "";
	private String database = "";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		StudentDao dao = new StudentDao();

		HttpSession session = req.getSession(true);
		Long id = new Long(req.getParameter("id"));
		try {
			
			Connection Conn = this.getConnection();
			Statement Stmt = Conn.createStatement();
			StringBuffer query = new StringBuffer();
			query.append("SELECT IMAGE_HEADSHOT FROM " + this.getDatabase() + ".INTAKE "
					+ " WHERE INTAKE_ID=? ");
System.out.println(query);
			PreparedStatement stmt = Conn.prepareStatement(query.toString());
			stmt.setLong(1, id);
			ResultSet result = stmt.executeQuery();
			result.next();
			//InputStream img = result.getBinaryStream(1); // reading image as
			Blob img = result.getBlob(1);
			byte imgData[] = img.getBytes(1, (int)img.length());
			OutputStream output = resp.getOutputStream();
			resp.setContentType("image/gif");
			output.write(imgData);
			//resp.getWriter().write(img.toString());
			
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			System.out.println(E.getMessage());
			// session.setAttribute("ERROR_" + session.getId(), E.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			// session.setAttribute("ERROR_" + session.getId(), e.getMessage());
			e.printStackTrace();
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	private Connection getConnection() throws SQLException,
			ClassNotFoundException {

		Properties prop = new Properties();

		try {
			// load a properties file
			// prop.load(new
			// FileInputStream("c:\\development\\workspace\\intake_2_0\\src\\properties\\config.properties"));
			prop.load(new FileInputStream("c:\\properties\\config.properties"));
			this.setUid(prop.getProperty("dbuser"));
			this.setPwd(prop.getProperty("dbpassword"));
			this.setDatabase(prop.getProperty("database"));
			this.setSERVER(prop.getProperty("dburl"));

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("jdbc:mysql://" + this.getDatabase() + "/"
				+ database + "," + uid + "," + pwd);
		Connection Conn = DriverManager.getConnection(
				"jdbc:mysql://" + this.getSERVER() + "/" + database, uid, pwd);

		return Conn;
	}

	public String getSERVER() {
		return SERVER;
	}

	public void setSERVER(String sERVER) {
		SERVER = sERVER;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

}
