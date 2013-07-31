package org.faithfarm.service.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Address;
import org.faithfarm.domain.Intake;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.util.Validator;

//import com.mysql.jdbc.PreparedStatement;

public class IntakeDao {

	private Validator valid8r = new Validator();

	private Connection getConnection() throws SQLException,
			ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection Conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ffarm_dev", "root", "admin");

		return Conn;
	}

	
	
	
	public Object getObject(Long id, HttpSession session) {
		int retCode = 1;
		ArrayList results = new ArrayList();
		Object obj = new Object();

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer("SELECT * FROM FFARM_DEV.DONOR ");
			s.append("WHERE DONOR_ID=" + id);

			ResultSet RS = Stmt.executeQuery(s.toString());
			while (RS.next()) {

			
			}
			RS.close();
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			retCode = 0;
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			retCode = 0;
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}

		return obj;
	}

	public int getObjects(String value1,String value2, HttpSession session) {
		int retCode = 1;
		ArrayList results1 = new ArrayList();
		ArrayList results2 = new ArrayList();
		

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer("SELECT * FROM FFARM_DEV.DONOR INNER JOIN FFARM_DEV.ADDRESS ON DONOR.DONOR_ID=ADDRESS.DONOR_ID ");
			//s.append("WHERE FIRSTNAME LIKE '%" + firstname + "%' and lastname like '%"+lastname+"%' ");

			ResultSet RS = Stmt.executeQuery(s.toString());
			while (RS.next()) {
				Object obj = new Object();
								
			
				
				results1.add(obj);
			}
			RS.close();
			Stmt.close();
			Conn.close();
			session.setAttribute("RESULTS1_" + session.getId(), results1);
			
		} catch (SQLException E) {
			retCode = 0;
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			retCode = 0;
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}

		return retCode;
	}

	public int updateDonor(Object donor, HttpSession session) {
		int retCode = 0;

		// Do something with the Connection
		try {
			Connection Conn = this.getConnection();
			Statement Stmt = Conn.createStatement();

			StringBuffer query = new StringBuffer();
			query.append("UPDATE FFARM_DEV.DONOR SET ");
			retCode = Stmt.executeUpdate(query.toString());
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			session.setAttribute("ERROR_" + session.getId(), E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("ERROR_" + session.getId(), e.getMessage());
			e.printStackTrace();
		}
		return retCode;
	}
	

	
	
	

	public int searchTickets(String lastname, String firstname,
			String confirmation, String dispatchDate, HttpSession session) {
		int retCode = 1;
		ArrayList results = new ArrayList();

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer(
					"SELECT * FROM FFARM_DEV.DONATION ");
			s.append("INNER JOIN FFARM_DEV.DONOR ON DONOR.DONOR_ID=DONATION.DONOR_ID  ");
			s.append("INNER JOIN FFARM_DEV.ADDRESS ON DONOR.DONOR_ID=ADDRESS.DONOR_ID WHERE ");
			if (lastname.length() > 0)
				s.append("DONOR.LASTNAME='" + lastname + "' AND ");
			if (firstname.length() > 0)
				s.append("DONOR.FIRSTNAME='" + firstname + "' AND ");
			if (confirmation.length() > 0)
				s.append("DONATION.DONATION_ID='" + confirmation
						+ "' AND ");
			if (dispatchDate.length() > 0)
				s.append("DONATION.DISPATCH_DATE='" + dispatchDate + "' AND ");
			s.append("1=1");

			ResultSet RS = Stmt.executeQuery(s.toString());
			while (RS.next()) {
			
			}
			session.setAttribute("RESULTS_" + session.getId(), results);
			RS.close();
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			retCode = 0;
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			retCode = 0;
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}

		return retCode;
	}

	public boolean deleteSystemUser(int userId, HttpSession session) {

		boolean retCode = true;

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			String query = "DELETE FROM SYSTEM_USER WHERE USER_ID=" + userId;
			retCode = Stmt.execute(query);
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
			return false;
		} catch (ClassNotFoundException e) {
			retCode = false;
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			return false;
		}
		return true;
	}

	public int searchSystemUsers(String farm, HttpSession session) {
		int retCode = 1;
		ArrayList results = new ArrayList();

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer(
					"SELECT USER_ID, USERNAME, USER_ROLE, LOGIN_COUNT, FARM_BASE FROM FFARM_DEV.SYSTEM_USER ");
			s.append("WHERE FARM_BASE='" + farm + "'  ");
			ResultSet RS = Stmt.executeQuery(s.toString());
			while (RS.next()) {
				SystemUser d = new SystemUser();
				d.setUserId(RS.getInt(1));
				d.setUsername(RS.getString(2));
				d.setUserRole(RS.getString(3));
				d.setLoginCount(RS.getInt(4));
				d.setFarmBase(RS.getString(5));
				results.add(d);
			}
			session.setAttribute("RESULTS_" + session.getId(), results);
			RS.close();
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			retCode = 0;
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			retCode = 0;
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}

		return retCode;
	}

	public boolean secureLogin(String username, String password,
			HttpSession session) {

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();

			ResultSet RS = Stmt.executeQuery("SELECT * from SYSTEM_USER");

			SystemUser user = new SystemUser();

			while (RS.next()) {
				String uid = RS.getString(2);
				String pwd = RS.getString(3);

				user.setUserId(Integer.valueOf(RS.getString(1)));
				user.setUsername(RS.getString(2));
				user.setPassword(RS.getString(3));
				user.setCreationDate(RS.getString(4));
				user.setLastUpdatedDate(RS.getString(5));
				user.setUserRole(RS.getString(6));
				user.setFarmBase(RS.getString(7));
				user.setLoginCount(RS.getInt(8));

				if (username.trim().length() == 0
						|| username.equals("username")) {
					session.setAttribute("ERROR_" + session.getId(),
							"You must enter a username.");
					return false;
				}
				if (password.trim().length() == 0
						|| password.equals("password")) {
					session.setAttribute("ERROR_" + session.getId(),
							"You must enter a password.");
					return false;
				}

				if (username.equals(uid)) {

					if (password.equals(pwd)) {
						session.setAttribute("USER_" + session.getId(), user);
						this.updateLoginCount(user.getUserId(), session);

						return true;
					} else {
						session.setAttribute("ERROR_" + session.getId(),
								"The password entered is incorrect.");
						return false;
					}

				}
			}

			// Clean up after ourselves
			RS.close();
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}

		session.setAttribute("ERROR",
				"The username or password entered is not valid.");

		return false;
	}

	public int updateLoginCount(Integer id, HttpSession session) {

		int retCode = 0;
		// Do something with the Connection
		try {
			Connection Conn = this.getConnection();
			Statement Stmt = Conn.createStatement();

			StringBuffer query = new StringBuffer();
			query.append("UPDATE FFARM_DEV.SYSTEM_USER SET LOGIN_COUNT=LOGIN_COUNT+1 WHERE USER_ID="
					+ id + ";");
			retCode = Stmt.executeUpdate(query.toString());

			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			session.setAttribute("ERROR_" + session.getId(), E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("ERROR_" + session.getId(), e.getMessage());
			e.printStackTrace();
		}

		return retCode;
	}

	public int updatePassword(Integer id, String password, String question,
			String answer, HttpSession session) {

		int retCode = 0;
		// Do something with the Connection
		try {
			Connection Conn = this.getConnection();
			Statement Stmt = Conn.createStatement();

			StringBuffer query = new StringBuffer();
			query.append("UPDATE FFARM_DEV.SYSTEM_USER SET PASSWORD='"
					+ password + "', QUESTION='" + question.replace("'", "''")
					+ "', ANSWER='" + answer + "' WHERE USER_ID=" + id + ";");
			retCode = Stmt.executeUpdate(query.toString());

			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			session.setAttribute("ERROR_" + session.getId(), E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("ERROR_" + session.getId(), e.getMessage());
			e.printStackTrace();
		}

		return retCode;
	}

	
	public Long insertResident(Intake d, HttpSession session) {

		Long key = new Long("0");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ffarm_dev", "root", "admin");

			// Do something with the Connection
/*
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO FFARM_DEV.DONOR (");
			query.append(" LASTNAME, FIRSTNAME, SUFFIX, CONTACT_PHONE, EMAIL_ADDRESS, CREATION_DATE, CREATED_BY ) VALUES (");
			query.append("'" + d.getLastname() + "',");
			query.append("'" + d.getFirstname() + "',");
			query.append("'" + d.getSuffix() + "',");
			query.append("'" + d.getContactPhone() + "',");
			query.append("'" + d.getEmailAddress() + "',");
			query.append("'" + valid8r.getEpoch() + "',");
			query.append("'" + d.getCreatedBy() + "');");
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();

			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			// Clean up after ourselves
			Stmt.close();
			Conn.close();
			*/
		} catch (SQLException E) {
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		return key;
	}

	public Long insertAddress(Address d, HttpSession session) {

		Long key = new Long("0");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = this.getConnection();
			// Do something with the Connection

			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO FFARM_DEV.ADDRESS (");
			query.append(" DONOR_ID,LINE1, LINE2, CITY, STATE, ZIPCODE, MAJOR_INTERSECTION, SUBDIVISION, STREET_SUFFIX, STRUCTURE_TYPE, ");
			query.append("UNIT, BUILDING, FLOOR, ELEVATOR_FLAG, GATED_FLAG, GATE_INSTRUCTIONS, CREATED_BY  ) VALUES (");
			query.append(d.getDonorId() + ",");
			query.append("'" + d.getLine1() + "',");
			query.append("'" + d.getLine2() + "',");
			query.append("'" + d.getCity() + "',");
			query.append("'" + d.getState() + "',");
			query.append("'" + d.getZipcode() + "',");
			query.append("'" + d.getMajorIntersection() + "',");
			query.append("'" + d.getSubdivision() + "',");
			query.append("'" + d.getStreetSuffix() + "',");
			query.append("'" + d.getStructureType() + "',");
			query.append("'" + d.getUnit() + "',");
			query.append("'" + d.getBuilding() + "',");
			query.append("'" + d.getFloor() + "',");
			query.append("'" + d.getElevatorFlag() + "',");
			query.append("'" + d.getGateFlag() + "',");
			query.append("'" + d.getGateInstructions() + "',");
			query.append("'" + d.getCreatedBy() + "');");

			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();

			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			// Clean up after ourselves
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

	public Long insertSystemUser(SystemUser d, HttpSession session) {

		Long key = new Long("0");

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection

			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO FFARM_DEV.SYSTEM_USER (");
			query.append(" USERNAME, PASSWORD, CREATION_DATE, CREATED_BY, USER_ROLE, FARM_BASE ) VALUES (");
			query.append("'" + d.getUsername() + "',");
			query.append("'" + d.getPassword() + "',");
			query.append("'" + valid8r.getEpoch() + "',");
			query.append("'" + d.getCreatedBy() + "',");
			query.append("'" + d.getUserRole() + "',");
			query.append("'" + d.getFarmBase() + "');");

			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();

			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			// Clean up after ourselves
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