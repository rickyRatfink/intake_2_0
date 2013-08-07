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

	public Long insertIntake(Intake intake, HttpSession session) {
		Long key = new Long("0");

		try {
			
			Connection Conn = this.getConnection();
			// Do something with the Connection

			StringBuffer query = new StringBuffer();
			
			query.append("INSERT INTO `ffarm_dev`.`intake`");
					query.append("(`INTAKE_ID`,");
					query.append("`LASTNAME`,");
					query.append("`FIRSTNAME`,");
					query.append("`MI`,");
					query.append("`SUFFIX`,");
					query.append("`ADDRESS`,");
					query.append("`CITY`,");
					query.append("`STATE`,");
					query.append("`ZIPCODE`,");
					query.append("`DOB`,");
					query.append("`SSN`,");
					query.append("`SSN_CARD_FLAG`,");
					query.append("`AGE`,");
					query.append("`HEIGHT`,");
					query.append("`WEIGHT`,");
					query.append("`ETHNICITY`,");
					query.append("`HAIR_COLOR`,");
					query.append("`EYE_COLOR`,");
					query.append("`MARITAL_STATUS`,");
					query.append("`EDUCATION_LEVEL`,");
					query.append("`GRADUATE_FLAG`,");
					query.append("`TRANSCRIPTS_FLAG`,");
					query.append("`ENGLISH_SPEAKING_FLAG`,");
					query.append("`ENGLISH_READING_FLAG`,");
					query.append("`HOME_LOCATION`,");
					query.append("`REFERRED_BY`,");
					query.append("`REFERRED_BY_PHONE`,");
					query.append("`EMERGENCY_CONTACT`,");
					query.append("`EMERGENCY_PHONE`,");
					query.append("`EMERGENCRY_RELATIONSHIP`,");
					query.append("`MOTHER_LIVING_FLAG`,");
					query.append("`FATHER_LIVING_FLAG`,");
					query.append("`BROTHERS`,");
					query.append("`SISTERS`,");
					query.append("`CHILDREN`,");
					query.append("`VETERAN_STATUS`,");
					query.append("`BRANCH_OF_SERVICE`,");
					query.append("`RANK`,");
					query.append("`LENGTH_OF_SERVICE`,");
					query.append("`DL_STATUS`,");
					query.append("`DL_NUMBER`,");
					query.append("`DL_STATE`,");
					query.append("`DL_EXP_DATE`,");
					query.append("`STATE_ID_FLAG`,");
					query.append("`STATE_ID_STATE`,");
					query.append("`STATE_ID_EXP_DATE`,");
					query.append("`GOVERNMENT_BENEFITS_FLAG`,");
					query.append("`RELIGION`,");
					query.append("`RELIGIOUS_EXPERIENCE`,");
					query.append("`ALCOHOL_FLAG`,");
					query.append("`COCAINE_FLAG`,");
					query.append("`MARIJUANA_FLAG`,");
					query.append("`OXYCODONE_FLAG`,");
					query.append("`SPEED_FLAG`,");
					query.append("`HEROIN_FLAG`,");
					query.append("`XANAX_FLAG`,");
					query.append("`OTHER_FLAG`,");
					query.append("`ALCOHOL_YEARS_USED`,");
					query.append("`COCAINE_YEARS_USED`,");
					query.append("`MARIJUANA_YEARS_USED`,");
					query.append("`OXYCODONE_YEARS_USED`,");
					query.append("`SPEED_YEARS_USED`,");
					query.append("`HEROIN_YEARS_USED`,");
					query.append("`XANAX_YEARS_USED`,");
					query.append("`OTHER_YEARS_USED`,");
					query.append("`SOBER_1_YEAR`,");
					query.append("`SOBER_3_YEARS`,");
					query.append("`USAGE_PATTERN`,");
					query.append("`QUANTITY_PER_WEEK`,");
					query.append("`QUANTITY_2_YEARS`,");
					query.append("`USAGE_LOSSES`,");
					query.append("`PHYSICAL_EFFECTS`,");
					query.append("`AA_FLAG`,");
					query.append("`NA_FLAG`,");
					query.append("`PREV_FF_FLAG`,");
					query.append("`PREV_FF_YEAR`,");
					query.append("`PREV_FF_OTHER`,");
					query.append("`CURRENT_HEALTH`,");
					query.append("`MEDICATION_FLAG`,");
					query.append("`MEDICATION_SUPPLY_FLAG`,");
					query.append("`MEDICATION_NEED_FLAG`,");
					query.append("`MEDICATION_DETAILS`,");
					query.append("`MEDICATION_REFILL_DETAILS`,");
					query.append("`DOCTOR_APPT_FLAG`,");
					query.append("`DOCTOR_APPT_DETAILS`,");
					query.append("`EYEWEAR_FLAG`,");
					query.append("`EYEWEAR_USAGE`,");
					query.append("`HOMELESS_TIME`,");
					query.append("`HOMELESS_REASON`,");
					query.append("`HOMELESS_HOW_OFTEN`,");
					query.append("`INDUSTRIAL_INJURY_FLAG`,");
					query.append("`INDUSTRIAL_INJURY_DATE`,");
					query.append("`INDUSTRIAL_INJURY_REASON`,");
					query.append("`INDUSTRIAL_INJURY_LOCATION`,");
					query.append("`INDUSTRIAL_INJURY_EMPLOYER`,");
					query.append("`INDUSTRIAL_INJURY_CLAIM_STATUS`,");
					query.append("`DISABILITY_FLAG`,");
					query.append("`DISABILITY_DETAILS`,");
					query.append("`DISABILITY_EXAMINATION_DATE`,");
					query.append("`DISABILITY_PHYSICIAN`,");
					query.append("`DISABILITY_PHYSICIAN_ADDRESS`,");
					query.append("`HERNIA_SIDE`,");
					query.append("`HERNIA_OPERATION_FLAG`,");
					query.append("`HERNIA_DETAILS`,");
					query.append("`LAWSUIT_FLAG`,");
					query.append("`CURRENT_LAWSUIT_FLAG`,");
					query.append("`LAWSUIT_DETAILS`,");
					query.append("`CURRENT_LAWSUIT_DETAILS`,");
					query.append("`FELONY_FLAG`,");
					query.append("`SEXUAL_OFFENSE_FLAG`,");
					query.append("`FELONY_DETAILS`,");
					query.append("`SEXUAL_OFFENSE_QTY`,");
					query.append("`SEXUAL_OFFENSE_DETAILS`,");
					query.append("`PROBATION_FLAG`,");
					query.append("`PROBATION_COUNTY_STATE`,");
					query.append("`PROBATION_OFFICER`,");
					query.append("`PROBATION_OFFICER_PHONE`,");
					query.append("`PROBATION_APPT_FLAG`,");
					query.append("`PROBATION_APPT_DETAILS`,");
					query.append("`INCOME_AMOUNT`,");
					query.append("`INCOME_SOURCE`,");
					query.append("`INCOME_WEEKLY_FLAG`,");
					query.append("`INCOME_MONTHLY_FLAG`,");
					query.append("`APPLICATION_STATUS`,");
					query.append("`APPLICATION_SIGNATURE`,");
					query.append("`INTAKE_COUNSELOR_SIGNATURE`,");
					query.append("`DIRECTOR_SIGNATURE`,");
					query.append("`APPLICATION_SIGN_DATE`,");
					query.append("`INTAKE_COUNSELOR_SIGN_DATE`,");
					query.append("`DIRECTOR_SIGN_DATE`,");
					query.append("`CELL_DISCLOSURE_CONSENT`,");
					query.append("`RELEASE_WAIVER_CONSENT`,");
					query.append("`BIBLICAL_COUNSELING_CONSENT`,");
					query.append("`ENTRY_AGREEMENT_CONSENT`,");
					query.append("`RULES_VISITATION_CONSENT`,");
					query.append("`RELEASE_INFORMATION_CONSENT`,");
					query.append("`CREATION_DATE`,");
					query.append("`CREATED_BY`,");
					query.append("`LAST_UPDATED_DATE`,");
					query.append("`LAST_UPDATED_BY`,");
					query.append("`SUBMISSION_DATE`,");
					query.append("`ENTRY_DATE`,");
					query.append("`INTAKE_STATUS`,");
					query.append("`IMAGE_HEADSHOT`,");
					query.append("`IMAGE_STATE_ID`,");
					query.append("`IMAGE_SSN`");
					query.append("VALUES");
					query.append("(");
			
			
			/*query.append(d.getDonorId() + ",");
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
			*/
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
	
	public int getQuestions(HttpSession session) {
		int retCode = 1;
		ArrayList list = new ArrayList();
		
		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer("SELECT * FROM FFARM_DEV.QUESTION ORDER BY QUESTION_ID ");
			
			ResultSet RS = Stmt.executeQuery(s.toString());
			while (RS.next()) {
				String question = RS.getString(2);
				list.add(question);
			}
			RS.close();
			Stmt.close();
			Conn.close();
			session.setAttribute("questions", list);
			
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

	
	public int getMedicalConditions(HttpSession session) {
		int retCode = 1;
		ArrayList list = new ArrayList();
		
		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer("SELECT * FROM FFARM_DEV.MEDICAL_CONDITION  ");
			
			ResultSet RS = Stmt.executeQuery(s.toString());
			while (RS.next()) {
				String mc = RS.getString(2);
				list.add(mc);
			}
			RS.close();
			Stmt.close();
			Conn.close();
			session.setAttribute("medicalCondition", list);
			
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
	
	public int getJobSkills(HttpSession session) {
		int retCode = 1;
		ArrayList list = new ArrayList();
		
		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer("SELECT * FROM FFARM_DEV.JOB_SKILL  ");
			
			ResultSet RS = Stmt.executeQuery(s.toString());
			while (RS.next()) {
				String js = RS.getString(2);
				list.add(js);
			}
			RS.close();
			Stmt.close();
			Conn.close();
			session.setAttribute("jobSkill", list);
			
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