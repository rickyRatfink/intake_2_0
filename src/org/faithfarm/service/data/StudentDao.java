package org.faithfarm.service.data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import org.faithfarm.domain.ClassList;
import org.faithfarm.domain.Intake;
import org.faithfarm.domain.PassHistory;
import org.faithfarm.domain.StudentHistory;
import org.faithfarm.intake.SecureLogin;
import org.faithfarm.util.Validator;

public class StudentDao {

	private final static Logger LOGGER = Logger.getLogger(SecureLogin.class.getName());
	
	private Validator valid8r = new Validator();
	private String SERVER = "";
	private String uid = "";
	private String pwd = "";
	private String database = "";
	// private String SERVER = "ffarm_staging";
	// private String pwd="j35u59538";

	private Connection getConnection() throws SQLException,
			ClassNotFoundException {
		
		Properties prop = new Properties();
		LOGGER.setLevel(Level.SEVERE);
		
    	try {
               //load a properties file
    		//prop.load(new FileInputStream("c:\\development\\workspace\\intake_2_0\\src\\properties\\config.properties"));
    		prop.load(new FileInputStream("c:\\properties\\config.properties"));
    		this.setUid(prop.getProperty("dbuser")); 
    		this.setPwd(prop.getProperty("dbpassword"));
    		this.setDatabase(prop.getProperty("database"));
    		this.setSERVER(prop.getProperty("dburl")); 
    	
    	} catch (IOException ex) {
    		LOGGER.log(Level.SEVERE, ex.getMessage());
    		ex.printStackTrace();
        }
		Class.forName("com.mysql.jdbc.Driver");
        Connection Conn = DriverManager.getConnection(
				"jdbc:mysql://"+this.getSERVER()+"/" + database, uid, pwd);

		return Conn;
	}
	
	public ArrayList getClassListPDF (String classId, String farm) {
		
		ArrayList list = new ArrayList();
	try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT ");
			query.append(" FIRSTNAME,LASTNAME, ENTRY_DATE ");
			query.append(" FROM `"+this.getDatabase()+"`.`intake`  ");
			query.append(" WHERE");
			query.append(" CLASS='"+classId+"' ");
			query.append(" AND FARM_BASE='"+farm.replace("'", "''") +"' AND  ORDER BY ENTRY_DATE ASC");
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			while (RS.next()) {
				//Intake intake = new Intake();
				ClassList roster = new ClassList();
				roster.setName(RS.getString(1)+" "+RS.getString(2));
				roster.setEntryDate(valid8r.convertDate(RS.getString(3)));
				//intake.setFirstName(RS.getString(1));
				//intake.setLastName(RS.getString(2));
				//intake.setEntryDate(valid8r.convertDate(RS.getString(3)));
				//list.add(intake);
				list.add(roster);
		    }
			Stmt.close();
			Conn.close();			
			
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return list;
	}
	
public ArrayList getClassList (String classId, String farm) {
		
		ArrayList list = new ArrayList();
	try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT ");
			query.append(" INTAKE_ID, FIRSTNAME,LASTNAME, ENTRY_DATE ");
			query.append(" FROM `"+this.getDatabase()+"`.`intake`  ");
			query.append(" WHERE");
			query.append(" CLASS='"+classId+"' ");
			query.append(" AND FARM_BASE='"+farm.replace("'", "''") +"' ORDER BY ENTRY_DATE ASC");
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			while (RS.next()) {
				Intake intake = new Intake();
				intake.setIntakeId(RS.getLong(1));
				intake.setFirstName(RS.getString(2));
				intake.setLastName(RS.getString(3));
				intake.setEntryDate(valid8r.convertDate(RS.getString(4)));
				list.add(intake);
			}
			Stmt.close();
			Conn.close();			
			
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return list;
	}
	

public ArrayList getBedList (String farm) {
	
	ArrayList list = new ArrayList();
try {
		
		Connection Conn = this.getConnection();

		StringBuffer query = new StringBuffer();

		query.append("SELECT ");
		query.append(" FIRSTNAME,LASTNAME, ENTRY_DATE ");
		query.append(" FROM `"+this.getDatabase()+"`.`intake`  ");
		query.append(" WHERE");
		query.append("  FARM_BASE='"+farm.replace("'", "''") +"' ORDER BY ENTRY_DATE ASC");
		Statement Stmt = null;
		Stmt = Conn.prepareStatement(query.toString());
		ResultSet RS = Stmt.executeQuery(query.toString());
		
		while (RS.next()) {
			Intake intake = new Intake();
			intake.setFirstName(RS.getString(1));
			intake.setLastName(RS.getString(2));
			intake.setEntryDate(valid8r.convertDate(RS.getString(3)));
			list.add(intake);
		}
		Stmt.close();
		Conn.close();			
		
	
	} catch (SQLException E) {
		LOGGER.log(Level.SEVERE, E.getMessage());
	} catch (ClassNotFoundException e) {
		LOGGER.log(Level.SEVERE, e.getMessage());
	}

	return list;
}

	public ArrayList searchStudents(
			String firstName, String lastName, String entryDate, String exitDate, String ssn,
			String dob, String farm, String pictureFlag, String archivedFlag, String gedFlag,
			HttpSession session) {
		
		ArrayList list = new ArrayList();
		
		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT ");
			
			query.append(" INTAKE_ID,");
			query.append(" LASTNAME, ");
			query.append(" FIRSTNAME, ");
			query.append(" if (MI is null,'',MI), ");
			query.append(" if (DOB is null,'',DOB),");
			query.append(" SSN");
			query.append(" FROM `"+this.getDatabase()+"`.`intake`  ");
			query.append(" WHERE");
			query.append(" 1=1 ");
			if (firstName.length()>0)
				query.append(" AND FIRSTNAME='"+firstName +"'");
			if (lastName.length()>0)
				query.append(" AND LASTNAME='"+ lastName+"'");
			if (ssn.length()>0)
				query.append(" AND SSN='"+ ssn +"'");
			if (dob.length()>0)
				query.append(" AND DOB='"+ dob +"'");
			if (entryDate.length()>0&&exitDate.length()>0)
				query.append(" AND ENTRY_DATE BETWEEN'"+ entryDate +"' AND '"+exitDate+"'");
			if (!"ALL".equals(farm)&&!"".equals(farm))
				query.append(" AND FARM_BASE='"+farm +"'");
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			while (RS.next()) {
				Intake p = new Intake();
				p.setIntakeId(RS.getLong(1));
				p.setLastName(RS.getString(2));
				p.setFirstName(RS.getString(3));
				p.setMiddleInitial(RS.getString(4));
				p.setDateOfBirth(RS.getString(5));
				p.setSsn(RS.getString(6));
				list.add(p);			
			}
			session.setAttribute("student_results", list);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
		}
		
		return list;
	}
	
	public Intake getStudent(String key,HttpSession session) {
	
	Intake intake = new Intake();
	
	try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT * FROM "+this.getDatabase()+".INTAKE WHERE INTAKE_ID="+key);
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			while (RS.next()) { 
				intake.setIntakeId(RS.getLong(1));
				intake.setLastName(valid8r.cleanData(RS.getString(2)));
				intake.setFirstName(valid8r.cleanData(RS.getString(3)));
				intake.setMiddleInitial(valid8r.cleanData(RS.getString(4)));
				intake.setSuffix(valid8r.cleanData(RS.getString(5)));
				intake.setAddress(valid8r.cleanData(RS.getString(6)));
				intake.setCity(valid8r.cleanData(RS.getString(7)));
				intake.setState(valid8r.cleanData(RS.getString(8)));
				intake.setZipcode(valid8r.cleanData(RS.getString(9)));
				intake.setDateOfBirth(valid8r.cleanData(RS.getString(10)));
				intake.setSsn(valid8r.cleanData(RS.getString(11)));
				intake.setAge(valid8r.cleanData(RS.getString(13)));
				intake.setHeight(valid8r.cleanData(RS.getString(14)));
				intake.setWeight(valid8r.cleanData(RS.getString(15)));
				intake.setEthnicity(valid8r.cleanData(RS.getString(16)));
				intake.setHairColor(valid8r.cleanData(RS.getString(17)));
				intake.setEyeColor(valid8r.cleanData(RS.getString(18)));
				intake.setMaritalStatus(valid8r.cleanData(RS.getString(19)));
				intake.setEducationLevel(valid8r.cleanData(RS.getString(20)));
				intake.setGraduateFlag(valid8r.cleanData(RS.getString(21)));
				intake.setTranscriptsFlag(valid8r.cleanData(RS.getString(22)));
				intake.setEnglishSpeakFlag(valid8r.cleanData(RS.getString(23)));
				intake.setEnglishReadFlag(valid8r.cleanData(RS.getString(24)));
				intake.setHomeLocation(valid8r.cleanData(RS.getString(25)));
				intake.setReferredBy(valid8r.cleanData(RS.getString(26)));
				intake.setReferralPhone(valid8r.cleanData(RS.getString(27)));
				intake.setEmergencyContact(valid8r.cleanData(RS.getString(28)));
				intake.setEmergencyPhone(valid8r.cleanData(RS.getString(29)));
				intake.setEmergencyRelationship(valid8r.cleanData(RS.getString(30)));
				intake.setMotherLivingFlag(valid8r.cleanData(RS.getString(31)));
				intake.setFatherLivingFlag(valid8r.cleanData(RS.getString(32)));
				intake.setMotherRelationship(valid8r.cleanData(RS.getString(148)));
				intake.setFatherRelationship(valid8r.cleanData(RS.getString(149)));
				intake.setBrothers(valid8r.cleanData(RS.getString(33)));
				intake.setSisters(valid8r.cleanData(RS.getString(34)));
				intake.setChildren(valid8r.cleanData(RS.getString(35)));
				intake.setVeteranFlag(valid8r.cleanData(RS.getString(36)));
				intake.setBranchOfService(valid8r.cleanData(RS.getString(37)));
				intake.setRank(valid8r.cleanData(RS.getString(38)));
				intake.setLengthOfService(valid8r.cleanData(RS.getString(39)));
				intake.setDriversLicenseFlag(valid8r.cleanData(RS.getString(40)));
				intake.setDriversLicenseNumber(valid8r.cleanData(RS.getString(41)));
				intake.setDriversLicenseState(valid8r.cleanData(RS.getString(42)));
				intake.setGovernmentBenefits(valid8r.cleanData(RS.getString(47)));
				intake.setReligion(valid8r.cleanData(RS.getString(48)));
				intake.setReligiousExperience(valid8r.cleanData(RS.getString(49)));
				intake.setAlcoholLastUsed(valid8r.cleanData(RS.getString(50)));
				intake.setCocaineLastUsed(valid8r.cleanData(RS.getString(51)));
				intake.setMarijuanaLastUsed(valid8r.cleanData(RS.getString(52)));
				intake.setOxycodoneLastUsed(valid8r.cleanData(RS.getString(53)));
				intake.setSpeedLastUsed(valid8r.cleanData(RS.getString(54)));
				intake.setHeroinLastUsed(valid8r.cleanData(RS.getString(55)));
				intake.setXanaxLastUsed(valid8r.cleanData(RS.getString(56)));
				intake.setOtherLastUsed(valid8r.cleanData(RS.getString(57)));
				intake.setAlcoholYearsUsed(valid8r.cleanData(RS.getString(58)));
				intake.setCocaineYearsUsed(valid8r.cleanData(RS.getString(59)));
				intake.setMarijuanaYearsUsed(valid8r.cleanData(RS.getString(60)));
				intake.setOxycodoneYearsUsed(valid8r.cleanData(RS.getString(61)));
				intake.setSpeedYearsUsed(valid8r.cleanData(RS.getString(62)));
				intake.setHeroinYearsUsed(valid8r.cleanData(RS.getString(63)));
				intake.setXanaxYearsUsed(valid8r.cleanData(RS.getString(64)));
				intake.setOtherYearsUsed(valid8r.cleanData(RS.getString(65)));
				intake.setSober1Years(valid8r.cleanData(RS.getString(66)));
				intake.setSober3Years(valid8r.cleanData(RS.getString(67)));
				intake.setUsagePattern(valid8r.cleanData(RS.getString(68)));
				intake.setQtyConsumed1(valid8r.cleanData(RS.getString(69)));
				intake.setQtyConsumed2(valid8r.cleanData(RS.getString(70)));
				intake.setUsageLosses(valid8r.cleanData(RS.getString(71)));
				intake.setAbusePhysicalEffects(valid8r.cleanData(RS.getString(72)));
				intake.setAttendAA(valid8r.cleanData(RS.getString(73)));
				intake.setPreviousFaithFarmFlag(valid8r.cleanData(RS.getString(75)));
				intake.setFfYearsAttended(valid8r.cleanData(RS.getString(76)));
				intake.setPreviousFaithFarm(valid8r.cleanData(RS.getString(77)));
				intake.setCurrentHealth(valid8r.cleanData(RS.getString(78)));
				intake.setCurrentMedicationsFlag(valid8r.cleanData(RS.getString(79)));
				intake.setMedicationSuppyFlag(valid8r.cleanData(RS.getString(80)));
				intake.setNeedMedicationFlag(valid8r.cleanData(RS.getString(81)));
				intake.setCurrentMedications(valid8r.cleanData(RS.getString(82)));
				intake.setRefillDetails(valid8r.cleanData(RS.getString(83)));
				intake.setDoctorsAppointment(valid8r.cleanData(RS.getString(84)));
				intake.setDoctorsAppointmentDate(valid8r.cleanData(RS.getString(85)));
				intake.setEyewearFlag(valid8r.cleanData(RS.getString(86)));
				intake.setEyewearUsage(valid8r.cleanData(RS.getString(87)));
				intake.setHomelessLengthOfTime(valid8r.cleanData(RS.getString(88)));
				intake.setHomelessHowOften(valid8r.cleanData(RS.getString(90)));
				intake.setHomelessReason(valid8r.cleanData(RS.getString(89)));
				intake.setIndustrialInjuryFlag(valid8r.cleanData(RS.getString(91)));
				intake.setIndustrialInjuryDate(valid8r.cleanData(RS.getString(92)));
				intake.setIndustrialInjuryReason(valid8r.cleanData(RS.getString(93)));
				intake.setIndustrialInjuryLocation(valid8r.cleanData(RS.getString(94)));
				intake.setIndustrialInjuryEmployer(valid8r.cleanData(RS.getString(95)));
				intake.setIndustrialInjuryClaimStatus(valid8r.cleanData(RS.getString(96)));
				intake.setDisabilityFlag(valid8r.cleanData(RS.getString(97)));
				intake.setDisabilityDetails(valid8r.cleanData(RS.getString(98)));
				intake.setExaminationDate(valid8r.cleanData(RS.getString(99)));
				intake.setPhysician(valid8r.cleanData(RS.getString(100)));
				intake.setPhysicianAddress(valid8r.cleanData(RS.getString(101)));
				intake.setHerniaSide(valid8r.cleanData(RS.getString(102)));
				intake.setHerniaDate(valid8r.cleanData(RS.getString(151)));
				intake.setHerniaOperationFlag(valid8r.cleanData(RS.getString(103)));
				intake.setHerniaPhysician(valid8r.cleanData(RS.getString(104)));
				intake.setMedicalConditionDetails(valid8r.cleanData(RS.getString(150)));
				intake.setLawsuitFlag(valid8r.cleanData(RS.getString(105)));
				intake.setCurrentLawsuitFlag(valid8r.cleanData(RS.getString(106)));
				intake.setLawsuitDetails(valid8r.cleanData(RS.getString(107)));
				intake.setCurrentLawsuitDetails(valid8r.cleanData(RS.getString(108)));
				intake.setFelonyFlag(valid8r.cleanData(RS.getString(109)));
				intake.setSexualOffenseFlag(valid8r.cleanData(RS.getString(110)));
				intake.setFelonyDetails(valid8r.cleanData(RS.getString(111)));
				intake.setSexualOffenseQty(valid8r.cleanData(RS.getString(112)));
				intake.setSexualOffenseDetails(valid8r.cleanData(RS.getString(113)));
				intake.setProbationFlag(valid8r.cleanData(RS.getString(114)));
				intake.setProbationCounty(valid8r.cleanData(RS.getString(115)));
				intake.setProbationOfficer(valid8r.cleanData(RS.getString(116)));
				intake.setProbationOfficerPhone(valid8r.cleanData(RS.getString(117)));
				intake.setProbationAppt(valid8r.cleanData(RS.getString(118)));
				intake.setProbationApptDetails(valid8r.cleanData(RS.getString(119)));
				intake.setIncomeAmount(valid8r.cleanData(RS.getString(120)));
				intake.setIncomeSource(valid8r.cleanData(RS.getString(121)));
				intake.setIncomeWeeklyFlag(valid8r.cleanData(RS.getString(122)));
				intake.setIncomeMonthlyFlag(valid8r.cleanData(RS.getString(123)));
				//intake.setWorkExperienceOtherDesc(valid8r.cleanData(RS.getString()));
				intake.setApplicationStatus(valid8r.cleanData(RS.getString(124)));
				intake.setApplicationSignature(valid8r.cleanData(RS.getString(125)));
				intake.setIntakeCounselorSignature(valid8r.cleanData(RS.getString(126)));
				intake.setDirectorSignature(valid8r.cleanData(RS.getString(127)));
				intake.setApplicationSignatureDate(valid8r.cleanData(RS.getString(128)));
				intake.setCellDisclosureConsent(valid8r.cleanData(RS.getString(131)));
				intake.setReleaseWaiverConsent(valid8r.cleanData(RS.getString(132)));
				intake.setBiblicalBasedCounselingConsent(valid8r.cleanData(RS.getString(133)));
				intake.setEntryAgreementConsent(valid8r.cleanData(RS.getString(134)));
				intake.setRulesVisitationConsent(valid8r.cleanData(RS.getString(135)));
				intake.setReleaseInformationConsent(valid8r.cleanData(RS.getString(136)));
				intake.setCreationDate(valid8r.cleanData(RS.getString(137)));
				intake.setCreatedBy(valid8r.cleanData(RS.getString(138)));
				intake.setEntryDate(valid8r.cleanData(RS.getString(142)));
				intake.setSubmissionDate(valid8r.cleanData(RS.getString(141)));
				intake.setIntakeStatus(valid8r.cleanData(RS.getString(143)));;
				intake.setProbationState(valid8r.cleanData(RS.getString(147)));
				intake.setExitDate(valid8r.cleanData(RS.getString(154)));
				intake.setFarmBase(valid8r.cleanData(RS.getString(153)));
				intake.setSupervisor(valid8r.cleanData(RS.getString(155)));
				intake.setJob(valid8r.cleanData(RS.getString(156)));
				intake.setCurrentClass(valid8r.cleanData(RS.getString(157)));
				intake.setArea(valid8r.cleanData(RS.getString(158)));
				intake.setRoom(valid8r.cleanData(RS.getString(159)));
				intake.setBed(valid8r.cleanData(RS.getString(160)));
				intake.setArchiveFlag(valid8r.cleanData(RS.getString(161)));				
				intake.setDepartmentId(RS.getLong(162));
				intake.setSupervisorId(RS.getLong(163));
				intake.setJobId(RS.getLong(164));
				intake.setImageHeadshot(RS.getBlob("IMAGE_HEADSHOT"));
				
			}
			
			
			/*
			 * Questions
			 */
			 String answer[] = new String[]{ 
						"","","","","","","",
						"","","","","","","",
						"","","","","","","",
						"","","","","","","",
						"","","","","","",""};
			 String answerDetails[] = new String[]{ 
						"","","","","","","",
						"","","","","","","",
						"","","","","","","",
						"","","","","","","",
						"","","","","","",""};
			 String answerDates[] = new String[]{ 
						"","","","","","","",
						"","","","","","","",
						"","","","","","","",
						"","","","","","","",
						"","","","","","",""};
			   
			   for (int i=0;i<32;i++) { 
				    StringBuffer query1 = new StringBuffer("");
					query1.append("SELECT ANSWER, DETAIL, DATES FROM `"+this.getDatabase()+"`.`intake_question_answer` WHERE QUESTION_ID="+(i+1)+" AND INTAKE_ID="+intake.getIntakeId());
					Stmt = Conn.prepareStatement(query1.toString());
					RS=Stmt.executeQuery(query1.toString());
				
					if (RS.next()) {
						answer[i]="YES";
						answerDetails[i]=RS.getString(2);
						answerDates[i]=RS.getString(3);
					}
					else {
						answer[i]="";
						answerDetails[i]="";
						answerDates[i]="";
					}
			   	
			   }
			   intake.setQuestion(answer);
			   intake.setQuestionAnswerDates(answerDates);
			   intake.setQuestionAnswerDetails(answerDetails);
			
			   /*
			 * medical conditions
			 */ 
			 
			String condition[]=new String[]{ 
					"","","","","","","",
					"","","","","","","",
					"","","","","","","",
					"","","","","","","",
					"","","","","","",""};
			
			for (int i=0;i<26;i++) {
				
			StringBuffer query1 = new StringBuffer("");
			
				query1.append("SELECT intake_medical_condition_id FROM `"+this.getDatabase()+"`.`intake_medical_condition` WHERE MEDICAL_CONDITION_ID="+(i+1)+" AND INTAKE_ID="+intake.getIntakeId());
				Stmt = Conn.prepareStatement(query1.toString());
				RS=Stmt.executeQuery(query1.toString());
			
				if (RS.next())
					condition[i]="YES";
				else
					condition[i]="";
			
			}
			intake.setMedicalCondition(condition);
			
			/*
			 * job skills
			 * 
			 */
			String work[] = new String[]{ 
					"","","","","","","",
					"","","","","","","",
					"","","","","","","",
					"","","","","","","",
					"","","","","","",""};
			
			for (int i=0;i<26;i++) {
				
			StringBuffer query1 = new StringBuffer("");
			
				query1.append("SELECT INTAKE_JOB_SKILL_ID FROM `"+this.getDatabase()+"`.`intake_job_skill` WHERE JOB_SKILL_ID="+(i+1)+" AND INTAKE_ID="+intake.getIntakeId());
				Stmt = Conn.prepareStatement(query1.toString());
				RS=Stmt.executeQuery(query1.toString());
				
				if (RS.next())
					work[i]="YES";
				else
					work[i]="";
			
			
			}
			intake.setWorkExperience(work);

			//get history
			StringBuffer query1 = new StringBuffer("");
			
			ArrayList list = new ArrayList();
			query1.append("SELECT * FROM `"+this.getDatabase()+"`.`student_history` WHERE INTAKE_ID="+intake.getIntakeId()+" ORDER BY STUDENT_HISTORY_ID DESC ");
			Stmt = Conn.prepareStatement(query1.toString());
			RS=Stmt.executeQuery(query1.toString());
			
			while (RS.next()) {
				StudentHistory history = new StudentHistory();
				history.setStudentHistoryId(RS.getLong(1));
				history.setIntakeId(RS.getLong(2));
				history.setPhase(RS.getString(3));
				history.setProgramStatus(RS.getString(4));
				history.setReason(RS.getString(5));
				history.setBeginDate(RS.getString(6));
				history.setEndDate(RS.getString(7));
				history.setCreationDate(RS.getString(8));
				history.setCreatedBy(RS.getString(9));
				history.setFarm(RS.getString(10));
				list.add(history);
			}
			intake.setHistory(list);
			
			
			list = new ArrayList();
			query1 = new StringBuffer("");
			query1.append("SELECT * FROM `"+this.getDatabase()+"`.`student_pass_history` WHERE INTAKE_ID="+intake.getIntakeId()+" ORDER BY STUDENT_PASS_HISTORY_ID DESC ");
			Stmt = Conn.prepareStatement(query1.toString());
			RS=Stmt.executeQuery(query1.toString());
			
			while (RS.next()) {
				PassHistory history = new PassHistory();
				history.setPassHistoryId(RS.getLong(1));
				history.setIntakeId(RS.getLong(2));
				history.setHours(RS.getString(3));
				history.setPassDate(RS.getString(4));
				history.setPassType(RS.getString(5));
				history.setCreationDate(RS.getString(6));
				history.setCreatedBy(RS.getString(7));
				list.add(history);
			}
			intake.setPassHistory(list);
			
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
		}
		
		
	return intake;
	}
	
	public void updateImage (String image, Long key, HttpSession session) throws FileNotFoundException {
		
		// Do something with the Connection
		try {
			Connection Conn = this.getConnection();
			Statement Stmt = Conn.createStatement();
			//InputStream inputStream = new FileInputStream(new File(image));
	    	 
			/* STORES IMAGE AS FILE
			StringBuffer query = new StringBuffer();
			query.append("UPDATE " + this.getDatabase() + ".INTAKE SET IMAGE_HEADSHOT='"
					+ image.replace("\\","/") + "' WHERE INTAKE_ID=" + key + ";");
			System.out.println (query);
			
			Stmt.executeUpdate(query.toString());
			*/
		    String path="";
		    Properties prop = new Properties();
		    
		    try {
	               //load a properties file
	    		//prop.load(new FileInputStream("c:\\development\\workspace\\intake_2_0\\src\\properties\\config.properties"));
	    		prop.load(new FileInputStream("c:\\properties\\config.properties"));
	    		path = prop.getProperty("photo_path"); 
	    	} catch (IOException ex) {
	    		LOGGER.log(Level.SEVERE, ex.getMessage());
	    		ex.printStackTrace();
	        }
			StringBuffer query = new StringBuffer();
			query.append("UPDATE " + this.getDatabase() + ".INTAKE SET IMAGE_HEADSHOT=? "
					+ " WHERE INTAKE_ID=" + key + ";");  
			//FileInputStream io = new FileInputStream(new File("C:\\development\\workspace\\intake_2_0\\WebContent\\photos\\"+image));
			FileInputStream io = new FileInputStream(new File(path+image));
			
			java.sql.PreparedStatement statement = Conn.prepareStatement(query.toString());
			statement.setBinaryStream(1, (InputStream)io,(int)image.length());
			statement.executeUpdate();
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("ERROR_" + session.getId(), E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
			session.setAttribute("ERROR_" + session.getId(), e.getMessage());
			e.printStackTrace();
		}
	}
	
	public BufferedImage getStudentPhoto(Long key) {
	
		BufferedImage buffimg = null;
		
		// Do something with the Connection
		try {
			Connection Conn = this.getConnection();
			Statement Stmt = Conn.createStatement();
			StringBuffer query = new StringBuffer();
			query.append("SELECT IMAGE_STATE_ID " + this.getDatabase() + " WHERE INTAKE_ID=? ");  
			
			PreparedStatement stmt = Conn.prepareStatement(query.toString());
			stmt.setLong(1,key);
			ResultSet result = stmt.executeQuery();
			result.next();
			InputStream img = result.getBinaryStream(1); // reading image as InputStream
			
			buffimg= ImageIO.read(img); // decoding the 
			
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			//session.setAttribute("ERROR_" + session.getId(), E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
			//session.setAttribute("ERROR_" + session.getId(), e.getMessage());
			e.printStackTrace();
		} catch (Exception e1) { LOGGER.log(Level.SEVERE, e1.getMessage()); }
		
		return buffimg;
		
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getSERVER() {
		return SERVER;
	}

	public void setSERVER(String sERVER) {
		SERVER = sERVER;
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
