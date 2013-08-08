package org.faithfarm.service.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Program;
import org.faithfarm.util.Validator;

//import com.mysql.jdbc.PreparedStatement;

public class CWTDao {

	private Validator valid8r = new Validator();
	private String uid = "root";

	private String SERVER = "ffarm_dev";
	private String pwd = "admin";

	// private String SERVER = "ffarm_staging";
	// private String pwd="j35u59538";

	private Connection getConnection() throws SQLException,
			ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection Conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/" + SERVER, uid, pwd);

		return Conn;
	}

	public Long insertProgram(Program program, HttpSession session) {

		Long key = new Long("0");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + SERVER + "", "root",
					"admin");

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+SERVER+"`.`cwt_program` ");
			query.append("(");
			query.append("`program_name`,");
			query.append("`description`,");
			query.append("`status`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			query.append("'"+program.getProgramName()+"',");
			query.append("'"+program.getDescription()+"',");
			query.append("'"+program.getStatus()+"',");
			query.append("'"+valid8r.getEpoch()+"',");
			query.append("'"+program.getCreatedBy()+"'");
			query.append(")");
			
			System.out.println(query);
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();
			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			Stmt.close();
			Conn.close();

		} catch (SQLException E) {
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		return key;
	}

}
