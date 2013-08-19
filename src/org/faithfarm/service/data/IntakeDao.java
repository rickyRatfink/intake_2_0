package org.faithfarm.service.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Address;
import org.faithfarm.domain.Intake;
import org.faithfarm.domain.StudentHistory;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.util.Validator;

//import com.mysql.jdbc.PreparedStatement;

public class IntakeDao {

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

	public Object getObject(Long id, HttpSession session) {
		int retCode = 1;
		ArrayList results = new ArrayList();
		Object obj = new Object();

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer("SELECT * FROM " + SERVER
					+ ".DONOR ");
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

	public int getObjects(String value1, String value2, HttpSession session) {
		int retCode = 1;
		ArrayList results1 = new ArrayList();
		ArrayList results2 = new ArrayList();

		try {

			Connection Conn = this.getConnection();

			// Do something with the Connection
			Statement Stmt = Conn.createStatement();
			StringBuffer s = new StringBuffer("SELECT * FROM " + SERVER
					+ ".DONOR INNER JOIN " + SERVER
					+ ".ADDRESS ON DONOR.DONOR_ID=ADDRESS.DONOR_ID ");
			// s.append("WHERE FIRSTNAME LIKE '%" + firstname +
			// "%' and lastname like '%"+lastname+"%' ");

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

	public void updateIntake(Intake intake, StudentHistory history, String user, HttpSession session) {
		try {

			Connection Conn = this.getConnection();
			// Do something with the Connection

			StringBuffer query = new StringBuffer();

			query.append("UPDATE `" + SERVER + "`.`intake` ");
			query.append("SET ");

			query.append("LASTNAME='" + intake.getLastName() + "',");
			query.append("		FIRSTNAME='" + intake.getFirstName() + "',");
			query.append("		MI='" + intake.getMiddleInitial() + "',");
			query.append("		SUFFIX='" + intake.getSuffix() + "',");
			query.append("		ADDRESS='" + intake.getAddress() + "',");
			query.append("		CITY='" + intake.getCity() + "',");
			query.append("		STATE='" + intake.getState() + "',");
			query.append("		ZIPCODE='" + intake.getZipcode() + "',");
			query.append("		DOB='" + intake.getDateOfBirth() + "',");
			query.append("		SSN='" + intake.getSsn() + "',");
			query.append("		SSN_CARD_FLAG='', ");
			query.append("		AGE='" + intake.getAge() + "',");
			query.append("		HEIGHT='" + intake.getHeight() + "',");
			query.append("		WEIGHT='" + intake.getWeight() + "',");
			query.append("		ETHNICITY='" + intake.getEthnicity() + "',");
			query.append("		HAIR_COLOR='" + intake.getHairColor() + "',");
			query.append("		EYE_COLOR='" + intake.getEyeColor() + "',");
			query.append("		MARITAL_STATUS='" + intake.getMaritalStatus()
					+ "',");
			query.append("		EDUCATION_LEVEL='" + intake.getEducationLevel()
					+ "',");
			query.append("		GRADUATE_FLAG='" + intake.getGraduateFlag() + "',");
			query.append("		TRANSCRIPTS_FLAG='" + intake.getTranscriptsFlag()
					+ "',");
			query.append("		ENGLISH_SPEAKING_FLAG='"
					+ intake.getEnglishSpeakFlag() + "',");
			query.append("		ENGLISH_READING_FLAG='"
					+ intake.getEnglishReadFlag() + "',");
			query.append("		HOME_LOCATION='" + intake.getHomeLocation() + "',");
			query.append("		REFERRED_BY='" + intake.getReferredBy() + "',");
			query.append("		REFERRED_BY_PHONE='" + intake.getReferralPhone()
					+ "',");
			query.append("		EMERGENCY_CONTACT='" + intake.getEmergencyContact()
					+ "',");
			query.append("		EMERGENCY_PHONE='" + intake.getEmergencyPhone()
					+ "',");
			query.append("		EMERGENCRY_RELATIONSHIP='"
					+ intake.getEmergencyRelationship() + "',");
			query.append("		MOTHER_LIVING_FLAG='"
					+ intake.getMotherLivingFlag() + "',");
			query.append("		FATHER_LIVING_FLAG='"
					+ intake.getFatherLivingFlag() + "',");
			query.append("		RELATIONSHIP_WITH_MOTHER='"
					+ intake.getMotherRelationship() + "',");
			query.append("		RELATIONSHIP_WITH_FATHER='"
					+ intake.getFatherRelationship() + "',");
			query.append("		BROTHERS='" + intake.getBrothers() + "',");
			query.append("		SISTERS='" + intake.getSisters() + "',");
			query.append("		CHILDREN='" + intake.getChildren() + "',");
			query.append("VETERAN_STATUS='" + intake.getVeteranFlag() + "',");
			query.append("RANK='" + intake.getRank() + "',");
			query.append("		LENGTH_OF_SERVICE='" + intake.getLengthOfService()
					+ "',");
			query.append("		DL_FLAG='" + intake.getDriversLicenseFlag() + "',");
			query.append("		DL_NUMBER='" + intake.getDriversLicenseNumber()
					+ "',");
			query.append("		DL_STATE='" + intake.getDriversLicenseState()
					+ "',");
			query.append("		DL_EXP_DATE='', ");// Dl exp date
			query.append("		STATE_ID_FLAG='', ");// id state flag
			query.append("		STATE_ID_STATE='', ");// state id state
			query.append("		STATE_ID_EXP_DATE='', ");// state id exp date
			query.append("		GOVERNMENT_BENEFITS_FLAG='"
					+ intake.getGovernmentBenefits() + "',");
			query.append("		RELIGION='" + intake.getReligion() + "',");
			query.append("		RELIGIOUS_EXPERIENCE='"
					+ intake.getReligiousExperience() + "',");
			query.append("		ALCOHOL_LAST_USED='" + intake.getAlcoholLastUsed()
					+ "',");
			query.append("		COCAINE_LAST_USED='" + intake.getCocaineLastUsed()
					+ "',");
			query.append("		MARIJUANA_LAST_USED='"
					+ intake.getMarijuanaLastUsed() + "',");
			query.append("		OXYCODONE_LAST_USED='"
					+ intake.getOxycodoneLastUsed() + "',");
			query.append("		SPEED_LAST_USED='" + intake.getSpeedLastUsed()
					+ "',");
			query.append("		HEROIN_LAST_USED='" + intake.getHeroinLastUsed()
					+ "',");
			query.append("		XANAX_LAST_USED='" + intake.getXanaxLastUsed()
					+ "',");
			query.append("		OTHER_LAST_USED='" + intake.getOtherLastUsed()
					+ "',");
			query.append("		ALCOHOL_YEARS_USED='"
					+ intake.getAlcoholYearsUsed() + "',");
			query.append("		COCAINE_YEARS_USED='"
					+ intake.getCocaineYearsUsed() + "',");
			query.append("					MARIJUANA_YEARS_USED='"
					+ intake.getMarijuanaYearsUsed() + "',");
			query.append("		OXYCODONE_YEARS_USED='"
					+ intake.getOxycodoneYearsUsed() + "',");
			query.append("		SPEED_YEARS_USED='" + intake.getSpeedYearsUsed()
					+ "',");
			query.append("		HEROIN_YEARS_USED='" + intake.getHeroinYearsUsed()
					+ "',");
			query.append("		XANAX_YEARS_USED='" + intake.getXanaxYearsUsed()
					+ "',");
			query.append("		OTHER_YEARS_USED='" + intake.getOtherYearsUsed()
					+ "',");
			query.append("		SOBER_1_YEAR='" + intake.getSober1Years() + "',");
			query.append("		SOBER_3_YEARS='" + intake.getSober3Years() + "',");
			query.append("		USAGE_PATTERN='" + intake.getUsagePattern() + "',");
			query.append("		QUANTITY_PER_WEEK='" + intake.getQtyConsumed1()
					+ "',");
			query.append("		QUANTITY_2_YEARS='" + intake.getQtyConsumed2()
					+ "',");
			query.append("		USAGE_LOSSES='" + intake.getUsageLosses() + "',");
			query.append("		PHYSICAL_EFFECTS='"
					+ intake.getAbusePhysicalEffects() + "',");
			query.append("		AA_FLAG='" + intake.getAttendAA() + "',");
			query.append("		NA_FLAG='" + intake.getAttendNA() + "',");
			query.append("		PREV_FF_FLAG='" + intake.getPreviousFaithFarmFlag()
					+ "',");
			query.append("		PREV_FF_YEAR='" + intake.getFfYearsAttended()
					+ "',");
			query.append("		PREV_FF_OTHER='" + intake.getPreviousFaithFarm()
					+ "',");
			query.append("		CURRENT_HEALTH='" + intake.getCurrentHealth()
					+ "',");
			query.append("			MEDICATION_FLAG='"
					+ intake.getCurrentMedicationsFlag() + "',");
			query.append("			MEDICATION_SUPPLY_FLAG='"
					+ intake.getMedicationSuppyFlag() + "',");
			query.append("			MEDICATION_NEED_FLAG='"
					+ intake.getNeedMedicationFlag() + "',");
			query.append("			MEDICATION_DETAILS='"
					+ intake.getCurrentMedications() + "',");
			query.append("			MEDICATION_REFILL_DETAILS='"
					+ intake.getRefillDetails() + "',");
			query.append("			DOCTOR_APPT_FLAG='"
					+ intake.getDoctorsAppointment() + "',");
			query.append("			DOCTOR_APPT_DETAILS='"
					+ intake.getDoctorsAppointmentDate() + "',");
			query.append("			EYEWEAR_FLAG='" + intake.getEyewearFlag() + "',");
			query.append("			EYEWEAR_USAGE='" + intake.getEyewearUsage() + "',");
			query.append("			HOMELESS_TIME='"
					+ intake.getHomelessLengthOfTime() + "',");
			query.append("			HOMELESS_REASON='" + intake.getHomelessHowOften()
					+ "',");
			query.append("			HOMELESS_HOW_OFTEN='" + intake.getHomelessReason()
					+ "',");
			query.append("			INDUSTRIAL_INJURY_FLAG='"
					+ intake.getIndustrialInjuryFlag() + "',");
			query.append("			INDUSTRIAL_INJURY_DATE='"
					+ intake.getIndustrialInjuryDate() + "',");
			query.append("			INDUSTRIAL_INJURY_REASON='"
					+ intake.getIndustrialInjuryReason() + "',");
			query.append("			INDUSTRIAL_INJURY_LOCATION='"
					+ intake.getIndustrialInjuryLocation() + "',");
			query.append("			INDUSTRIAL_INJURY_EMPLOYER='"
					+ intake.getIndustrialInjuryEmployer() + "',");
			query.append("			INDUSTRIAL_INJURY_CLAIM_STATUS='"
					+ intake.getIndustrialInjuryClaimStatus() + "',");
			query.append("			DISABILITY_FLAG='" + intake.getDisabilityFlag()
					+ "',");
			query.append("			DISABILITY_DETAILS='"
					+ intake.getDisabilityDetails() + "',");
			query.append("			DISABILITY_EXAMINATION_DATE='"
					+ intake.getExaminationDate() + "',");
			query.append("			DISABILITY_PHYSICIAN='" + intake.getPhysician()
					+ "',");
			query.append("			DISABILITY_PHYSICIAN_ADDRESS='"
					+ intake.getPhysicianAddress() + "',");
			query.append("			HERNIA_SIDE='" + intake.getHerniaSide() + "',");
			query.append("			HERNIA_DATE='" + intake.getHerniaDate() + "',");
			query.append("			HERNIA_OPERATION_FLAG='"
					+ intake.getHerniaOperationFlag() + "',");
			query.append("			HERNIA_DETAILS='" + intake.getHerniaPhysician()
					+ "',");
			query.append("			MEDICAL_CONDITION_DETAILS='"
					+ intake.getMedicalConditionDetails() + "',");
			query.append("			LAWSUIT_FLAG='" + intake.getLawsuitFlag() + "',");
			query.append("			CURRENT_LAWSUIT_FLAG='"
					+ intake.getCurrentLawsuitFlag() + "',");
			query.append("			LAWSUIT_DETAILS='" + intake.getLawsuitDetails()
					+ "',");
			query.append("			CURRENT_LAWSUIT_DETAILS='"
					+ intake.getCurrentLawsuitDetails() + "',");
			query.append("			FELONY_FLAG='" + intake.getFelonyFlag() + "',");
			query.append("				SEXUAL_OFFENSE_FLAG='"
					+ intake.getSexualOffenseFlag() + "',");
			query.append("				FELONY_DETAILS='" + intake.getFelonyDetails()
					+ "',");
			query.append("				SEXUAL_OFFENSE_QTY='"
					+ intake.getSexualOffenseQty() + "',");
			query.append("				SEXUAL_OFFENSE_DETAILS='"
					+ intake.getSexualOffenseDetails() + "',");
			query.append("				PROBATION_FLAG='" + intake.getProbationFlag()
					+ "',");
			query.append("				PROBATION_COUNTY='" + intake.getProbationCounty()
					+ "',");
			query.append("				PROBATION_STATE='" + intake.getProbationState()
					+ "',");
			query.append("				PROBATION_OFFICER='"
					+ intake.getProbationOfficer() + "',");
			query.append("				PROBATION_OFFICER_PHONE='"
					+ intake.getProbationOfficerPhone() + "',");
			query.append("				PROBATION_APPT_FLAG='"
					+ intake.getProbationAppt() + "',");
			query.append("				PROBATION_APPT_DETAILS='"
					+ intake.getProbationApptDetails() + "',");
			query.append("				INCOME_AMOUNT='" + intake.getIncomeAmount()
					+ "',");
			query.append("				INCOME_SOURCE='" + intake.getIncomeSource()
					+ "',");
			query.append("				INCOME_WEEKLY_FLAG='"
					+ intake.getIncomeWeeklyFlag() + "',");
			query.append("				INCOME_MONTHLY_FLAG='"
					+ intake.getIncomeMonthlyFlag() + "',");
			query.append("				OTHER_JOB_SKILL='"
					+ intake.getWorkExperienceOtherDesc() + "',");
			query.append("				APPLICATION_STATUS='"
					+ intake.getApplicationStatus() + "',");
			query.append("				APPLICATION_SIGNATURE='"
					+ intake.getApplicationSignature() + "',");
			query.append("				INTAKE_COUNSELOR_SIGNATURE='"
					+ intake.getIntakeCounselorSignature() + "',");
			query.append("				DIRECTOR_SIGNATURE='"
					+ intake.getDirectorSignature() + "',");
			query.append("				APPLICATION_SIGN_DATE='"
					+ intake.getApplicationSignatureDate() + "',");
			query.append("				INTAKE_COUNSELOR_SIGN_DATE='', ");
			query.append("				DIRECTOR_SIGN_DATE='', ");
			query.append("				CELL_DISCLOSURE_CONSENT='"
					+ intake.getCellDisclosureConsent() + "',");
			query.append("				RELEASE_WAIVER_CONSENT='"
					+ intake.getReleaseWaiverConsent() + "',");
			query.append("				BIBLICAL_COUNSELING_CONSENT='"
					+ intake.getBiblicalBasedCounselingConsent() + "',");
			query.append("				ENTRY_AGREEMENT_CONSENT='"
					+ intake.getEntryAgreementConsent() + "',");
			query.append("				RULES_VISITATION_CONSENT='"
					+ intake.getRulesVisitationConsent() + "',");
			query.append("			RELEASE_INFORMATION_CONSENT='"
					+ intake.getReleaseInformationConsent() + "',");
			query.append("			LAST_UPDATED_DATE='" + valid8r.getEpoch() + "',");
			query.append("			LAST_UPDATED_BY='" + user + "', ");
			query.append("			SUBMISSION_DATE='" + valid8r.getEpoch() + "',");
			query.append("			ENTRY_DATE='" + intake.getEntryDate() + "',");
			query.append("			INTAKE_STATUS='" + intake.getIntakeStatus() + "',");
			query.append("			IMAGE_HEADSHOT='', ");
			query.append("			IMAGE_STATE_ID='', ");
			query.append("			IMAGE_SSN='', ");
			query.append("			FARM_BASE='" + intake.getFarmBase() + "',");
			query.append("			SUPERVISOR='" + intake.getSupervisor() + "',");
			query.append("			JOB='" + intake.getJob() + "',");
			query.append("			CLASS='" + intake.getCurrentClass() + "',");
			query.append("			AREA='" + intake.getArea() + "',");
			query.append("			ROOM='" + intake.getRoom() + "',");
			query.append("			BED='" + intake.getBed() + "' WHERE INTAKE_ID = "+intake.getIntakeId());
			System.out.println(query);
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			Stmt.executeUpdate(query.toString());

			/*
			 * 
			 * Questions
			 */
			StringBuffer query1 = new StringBuffer("");
			query1.append("DELETE FROM "+SERVER+".intake_question_answer WHERE INTAKE_ID="+intake.getIntakeId());
			Stmt.executeUpdate(query1.toString());
			
			String answer[] = intake.getQuestion();
			String details[] = intake.getQuestionAnswerDetails();
			String dates[] = intake.getQuestionAnswerDates();

			for (int i = 0; i < 32; i++) {

				query1 = new StringBuffer("");

				if ("YES".equals(answer[i])) {
					query1.append("INSERT INTO `" + SERVER
							+ "`.`intake_question_answer` (question_id, answer, intake_id, detail,dates) ");
					query1.append("VALUES ( ");
					query1.append((i+1)+", ");
					query1.append("'"+answer[i]+"', ");
					query1.append(intake.getIntakeId()+", ");
					query1.append("'"+details[i]+"', ");
					query1.append("'"+dates[i]+"' ) ");
					System.out.println(query1);
					Stmt = Conn.prepareStatement(query1.toString(),
							Stmt.RETURN_GENERATED_KEYS);
					Stmt.executeUpdate(query1.toString());
				}
			}

			/*
			 * medical conditions
			 */
			query1 = new StringBuffer("");
			query1.append("DELETE FROM "+SERVER+".intake_medical_condition WHERE INTAKE_ID="+intake.getIntakeId());
			Stmt.executeUpdate(query1.toString());

			String condition[] = intake.getMedicalCondition();

			for (int i = 0; i < 26; i++) {

				query1 = new StringBuffer("");

				if ("YES".equals(condition[i])) {
					query1.append("INSERT INTO `" + SERVER
							+ "`.`intake_medical_condition` (intake_id, answer, medical_condition_id) VALUES ( ");
					query1.append(intake.getIntakeId()+" ,");
					query1.append("'"+condition[i]+"', ");
					query1.append((i+1)+") ");
					System.out.println(query1);
					Stmt = Conn.prepareStatement(query1.toString());
					Stmt.executeUpdate(query1.toString());
				}
			}

			/*
			 * job skills
			 */
			query1 = new StringBuffer("");
			query1.append("DELETE FROM "+SERVER+".intake_job_skill WHERE INTAKE_ID="+intake.getIntakeId());
			Stmt.executeUpdate(query1.toString());

			String work[] = intake.getWorkExperience();

			for (int i = 0; i < 26; i++) {

				 query1 = new StringBuffer("");

				if ("YES".equals(work[i])) {
					query1.append("INSERT INTO `" + SERVER
							+ "`.`intake_job_skill` (JOB_SKILL_ID, INTAKE_ID) VALUES ( ");
					query1.append((i+1)+",");
					query1.append(intake.getIntakeId()+ ") ");
					System.out.println(query1);
					Stmt = Conn.prepareStatement(query1.toString());
					Stmt.executeUpdate(query1.toString());
				}
			}
			
			
			
			//update student history
			query1 = new StringBuffer("");
			query1.append("SELECT farm, phase, program_status, begin_date, end_date FROM "+SERVER+".student_history WHERE INTAKE_ID="+intake.getIntakeId()+ " order by student_history_id desc");
			ResultSet RS = Stmt.executeQuery(query1.toString());
			boolean updateHistory = false;
			
			if (RS.next())
				if (RS.isFirst()) {
					String location=RS.getString(1);
					String phase=RS.getString(2);
					String status=RS.getString(3);
					String beginDate=RS.getString(4);
					String endDate=RS.getString(5);
					
					if (!location.equals(history.getFarm()))
						updateHistory = true;
					if (!phase.equals(history.getPhase()))
						updateHistory = true;
					if (!status.equals(history.getProgramStatus()))
						updateHistory = true;
					if (!beginDate.equals(history.getBeginDate()))
						updateHistory = true;
					if (!endDate.equals(history.getEndDate()))
						updateHistory = true;
				}
			if (updateHistory)
				this.insertHistory(history, user, session);
			

			
			
			// Clean up after ourselves
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			System.out.println(E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
	}

	public Long insertIntakeApplication(Intake intake, String user,
			HttpSession session) {
		Long key = new Long("0");

		try {

			Connection Conn = this.getConnection();
			// Do something with the Connection

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `" + SERVER + "`.`intake`");
			query.append("(");
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
			query.append("`RELATIONSHIP_WITH_MOTHER`,");
			query.append("`RELATIONSHIP_WITH_FATHER`,");
			query.append("`BROTHERS`,");
			query.append("`SISTERS`,");
			query.append("`CHILDREN`,");
			query.append("`VETERAN_STATUS`,");
			query.append("`BRANCH_OF_SERVICE`,");
			query.append("`RANK`,");
			query.append("`LENGTH_OF_SERVICE`,");
			query.append("`DL_FLAG`,");
			query.append("`DL_NUMBER`,");
			query.append("`DL_STATE`,");
			query.append("`DL_EXP_DATE`,");
			query.append("`STATE_ID_FLAG`,");
			query.append("`STATE_ID_STATE`,");
			query.append("`STATE_ID_EXP_DATE`,");
			query.append("`GOVERNMENT_BENEFITS_FLAG`,");
			query.append("`RELIGION`,");
			query.append("`RELIGIOUS_EXPERIENCE`,");
			query.append("`ALCOHOL_LAST_USED`,");
			query.append("`COCAINE_LAST_USED`,");
			query.append("`MARIJUANA_LAST_USED`,");
			query.append("`OXYCODONE_LAST_USED`,");
			query.append("`SPEED_LAST_USED`,");
			query.append("`HEROIN_LAST_USED`,");
			query.append("`XANAX_LAST_USED`,");
			query.append("`OTHER_LAST_USED`,");
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
			query.append("`HERNIA_DATE`,");
			query.append("`HERNIA_OPERATION_FLAG`,");
			query.append("`HERNIA_DETAILS`,");
			query.append("`MEDICAL_CONDITION_DETAILS`,");
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
			query.append("`PROBATION_COUNTY`,");
			query.append("`PROBATION_STATE`,");
			query.append("`PROBATION_OFFICER`,");
			query.append("`PROBATION_OFFICER_PHONE`,");
			query.append("`PROBATION_APPT_FLAG`,");
			query.append("`PROBATION_APPT_DETAILS`,");
			query.append("`INCOME_AMOUNT`,");
			query.append("`INCOME_SOURCE`,");
			query.append("`INCOME_WEEKLY_FLAG`,");
			query.append("`INCOME_MONTHLY_FLAG`,");
			query.append("`OTHER_JOB_SKILL`,");
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
			query.append("`IMAGE_SSN`,`FARM_BASE`,`SUPERVISOR`,`JOB`,`CLASS`,`AREA`,`ROOM`,`BED`) ");
			query.append("VALUES");
			query.append(" (");

			query.append("'" + intake.getLastName().replace("'", "''") + "',");
			query.append("'" + intake.getFirstName().replace("'", "''") + "',");
			query.append("'" + intake.getMiddleInitial() + "',");
			query.append("'" + intake.getSuffix() + "',");
			query.append("'" + intake.getAddress() + "',");
			query.append("'" + intake.getCity() + "',");
			query.append("'" + intake.getState() + "',");
			query.append("'" + intake.getZipcode() + "',");
			query.append("'" + intake.getDateOfBirth() + "',");
			query.append("'" + intake.getSsn() + "',");
			query.append("'',");
			query.append("'" + intake.getAge() + "',");
			query.append("'" + intake.getHeight().replace("'", "''") + "',");
			query.append("'" + intake.getWeight() + "',");
			query.append("'" + intake.getEthnicity() + "',");
			query.append("'" + intake.getHairColor() + "',");
			query.append("'" + intake.getEyeColor() + "',");
			query.append("'" + intake.getMaritalStatus() + "',");
			query.append("'" + intake.getEducationLevel().replace("'", "''")
					+ "',");
			query.append("'" + intake.getGraduateFlag() + "',");
			query.append("'" + intake.getTranscriptsFlag() + "',");
			query.append("'" + intake.getEnglishSpeakFlag() + "',");
			query.append("'" + intake.getEnglishReadFlag() + "',");
			query.append("'" + intake.getHomeLocation() + "',");
			query.append("'" + intake.getReferredBy() + "',");
			query.append("'" + intake.getReferralPhone() + "',");
			query.append("'" + intake.getEmergencyContact() + "',");
			query.append("'" + intake.getEmergencyPhone() + "',");
			query.append("'" + intake.getEmergencyRelationship() + "',");
			query.append("'" + intake.getMotherLivingFlag() + "',");
			query.append("'" + intake.getFatherLivingFlag() + "',");
			query.append("'" + intake.getMotherRelationship() + "',");
			query.append("'" + intake.getFatherRelationship() + "',");
			query.append("'" + intake.getBrothers() + "',");
			query.append("'" + intake.getSisters() + "',");
			query.append("'" + intake.getChildren() + "',");
			query.append("'" + intake.getVeteranFlag() + "',");
			query.append("'" + intake.getBranchOfService() + "',");
			query.append("'" + intake.getRank() + "',");
			query.append("'" + intake.getLengthOfService() + "',");
			query.append("'" + intake.getDriversLicenseFlag() + "',");
			query.append("'" + intake.getDriversLicenseNumber() + "',");
			query.append("'" + intake.getDriversLicenseState() + "',");
			query.append("'',");// Dl exp date
			query.append("'',");// id state flag
			query.append("'',");// state id state
			query.append("'',");// state id exp date
			query.append("'" + intake.getGovernmentBenefits() + "',");
			query.append("'" + intake.getReligion() + "',");
			query.append("'" + intake.getReligiousExperience() + "',");
			query.append("'" + intake.getAlcoholLastUsed() + "',");
			query.append("'" + intake.getCocaineLastUsed() + "',");
			query.append("'" + intake.getMarijuanaLastUsed() + "',");
			query.append("'" + intake.getOxycodoneLastUsed() + "',");
			query.append("'" + intake.getSpeedLastUsed() + "',");
			query.append("'" + intake.getHeroinLastUsed() + "',");
			query.append("'" + intake.getXanaxLastUsed() + "',");
			query.append("'" + intake.getOtherLastUsed() + "',");
			query.append("'" + intake.getAlcoholYearsUsed() + "',");
			query.append("'" + intake.getCocaineYearsUsed() + "',");
			query.append("'" + intake.getMarijuanaYearsUsed() + "',");
			query.append("'" + intake.getOxycodoneYearsUsed() + "',");
			query.append("'" + intake.getSpeedYearsUsed() + "',");
			query.append("'" + intake.getHeroinYearsUsed() + "',");
			query.append("'" + intake.getXanaxYearsUsed() + "',");
			query.append("'" + intake.getOtherYearsUsed() + "',");
			query.append("'" + intake.getSober1Years() + "',");
			query.append("'" + intake.getSober3Years() + "',");
			query.append("'" + intake.getUsagePattern() + "',");
			query.append("'" + intake.getQtyConsumed1() + "',");
			query.append("'" + intake.getQtyConsumed2() + "',");
			query.append("'" + intake.getUsageLosses() + "',");
			query.append("'" + intake.getAbusePhysicalEffects() + "',");
			query.append("'" + intake.getAttendAA() + "',");
			query.append("'" + intake.getAttendNA() + "',");
			query.append("'" + intake.getPreviousFaithFarmFlag() + "',");
			query.append("'" + intake.getFfYearsAttended() + "',");
			query.append("'" + intake.getPreviousFaithFarm() + "',");
			query.append("'" + intake.getCurrentHealth() + "',");
			query.append("'" + intake.getCurrentMedicationsFlag() + "',");
			query.append("'" + intake.getMedicationSuppyFlag() + "',");
			query.append("'" + intake.getNeedMedicationFlag() + "',");
			query.append("'" + intake.getCurrentMedications() + "',");
			query.append("'" + intake.getRefillDetails() + "',");
			query.append("'" + intake.getDoctorsAppointment() + "',");
			query.append("'" + intake.getDoctorsAppointmentDate() + "',");
			query.append("'" + intake.getEyewearFlag() + "',");
			query.append("'" + intake.getEyewearUsage() + "',");
			query.append("'" + intake.getHomelessLengthOfTime() + "',");
			query.append("'" + intake.getHomelessHowOften() + "',");
			query.append("'" + intake.getHomelessReason() + "',");
			query.append("'" + intake.getIndustrialInjuryFlag() + "',");
			query.append("'" + intake.getIndustrialInjuryDate() + "',");
			query.append("'" + intake.getIndustrialInjuryReason() + "',");
			query.append("'" + intake.getIndustrialInjuryLocation() + "',");
			query.append("'" + intake.getIndustrialInjuryEmployer() + "',");
			query.append("'" + intake.getIndustrialInjuryClaimStatus() + "',");
			query.append("'" + intake.getDisabilityFlag() + "',");
			query.append("'" + intake.getDisabilityDetails() + "',");
			query.append("'" + intake.getExaminationDate() + "',");
			query.append("'" + intake.getPhysician() + "',");
			query.append("'" + intake.getPhysicianAddress() + "',");
			query.append("'" + intake.getHerniaSide() + "',");
			query.append("'" + intake.getHerniaDate() + "',");
			query.append("'" + intake.getHerniaOperationFlag() + "',");
			query.append("'" + intake.getHerniaPhysician() + "',");
			query.append("'" + intake.getMedicalConditionDetails() + "',");
			query.append("'" + intake.getLawsuitFlag() + "',");
			query.append("'" + intake.getCurrentLawsuitFlag() + "',");
			query.append("'" + intake.getLawsuitDetails() + "',");
			query.append("'" + intake.getCurrentLawsuitDetails() + "',");
			query.append("'" + intake.getFelonyFlag() + "',");
			query.append("'" + intake.getSexualOffenseFlag() + "',");
			query.append("'" + intake.getFelonyDetails() + "',");
			query.append("'" + intake.getSexualOffenseQty() + "',");
			query.append("'" + intake.getSexualOffenseDetails() + "',");
			query.append("'" + intake.getProbationFlag() + "',");
			query.append("'" + intake.getProbationCounty() + "',");
			query.append("'" + intake.getProbationState() + "',");
			query.append("'" + intake.getProbationOfficer() + "',");
			query.append("'" + intake.getProbationOfficerPhone() + "',");
			query.append("'" + intake.getProbationAppt() + "',");
			query.append("'" + intake.getProbationApptDetails() + "',");
			query.append("'" + intake.getIncomeAmount() + "',");
			query.append("'" + intake.getIncomeSource() + "',");
			query.append("'" + intake.getIncomeWeeklyFlag() + "',");
			query.append("'" + intake.getIncomeMonthlyFlag() + "',");
			query.append("'" + intake.getWorkExperienceOtherDesc() + "',");
			query.append("'" + intake.getApplicationStatus() + "',");
			query.append("'" + intake.getApplicationSignature() + "',");
			query.append("'" + intake.getIntakeCounselorSignature() + "',");
			query.append("'" + intake.getDirectorSignature() + "',");
			query.append("'" + intake.getApplicationSignatureDate() + "',");
			query.append("'',");
			query.append("'',");
			query.append("'" + intake.getCellDisclosureConsent() + "',");
			query.append("'" + intake.getReleaseWaiverConsent() + "',");
			query.append("'" + intake.getBiblicalBasedCounselingConsent()
					+ "',");
			query.append("'" + intake.getEntryAgreementConsent() + "',");
			query.append("'" + intake.getRulesVisitationConsent() + "',");
			query.append("'" + intake.getReleaseInformationConsent() + "',");
			query.append("'" + valid8r.getEpoch() + "',");
			query.append("'" + user + "',");
			query.append("'',");
			query.append("'',");
			query.append("'" + valid8r.getEpoch() + "',");
			query.append("'" + intake.getEntryDate() + "',");
			query.append("'" + intake.getIntakeStatus() + "',");
			query.append("'',");
			query.append("'',");
			query.append("'',");
			query.append("'" + intake.getFarmBase() + "',");
			query.append("'" + intake.getSupervisor() + "',");
			query.append("'" + intake.getJob() + "',");
			query.append("'" + intake.getCurrentClass() + "',");
			query.append("'" + intake.getArea() + "',");
			query.append("'" + intake.getRoom() + "',");
			query.append("'" + intake.getBed() + "' )");

			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			Stmt.executeUpdate(query.toString());
			ResultSet generatedKeys = Stmt.getGeneratedKeys();

			if (generatedKeys.next())
				key = generatedKeys.getLong(1);
			System.out.println("key=" + key);

			/*
			 * 
			 * Questions
			 */
			String answer[] = intake.getQuestion();
			String details[] = intake.getQuestionAnswerDetails();
			String dates[] = intake.getQuestionAnswerDates();

			for (int i = 0; i < 32; i++) {

				StringBuffer query1 = new StringBuffer("");

				if ("YES".equals(answer[i])) {
					query1.append("INSERT INTO `" + SERVER
							+ "`.`intake_question_answer` (");
					query1.append("`QUESTION_ID`,");
					query1.append("`INTAKE_ID`,");
					query1.append("`ANSWER`,");
					query1.append("`DETAIL`,");
					query1.append("`DATES`)");
					query1.append("VALUES");
					query1.append("(");
					query1.append((i + 1) + "," + key + ",'" + answer[i]
							+ "','" + details[i] + "','" + dates[i] + "');");

					Stmt = Conn.prepareStatement(query1.toString(),
							Stmt.RETURN_GENERATED_KEYS);
					Stmt.executeUpdate(query1.toString());
				}
			}

			/*
			 * medical conditions
			 */
			String condition[] = intake.getMedicalCondition();

			for (int i = 0; i < 26; i++) {

				StringBuffer query1 = new StringBuffer("");

				if ("YES".equals(condition[i])) {
					query1.append("INSERT INTO `" + SERVER
							+ "`.`intake_medical_condition` (");
					query1.append("`MEDICAL_CONDITION_ID`,");
					query1.append("`INTAKE_ID`,");
					query1.append("`ANSWER`)");
					query1.append("VALUES");
					query1.append("(");
					query1.append((i + 1) + "," + key + ",'" + condition[i]
							+ "');");
					Stmt = Conn.prepareStatement(query1.toString(),
							Stmt.RETURN_GENERATED_KEYS);
					Stmt.executeUpdate(query1.toString());
				}
			}

			/*
			 * job skills
			 */
			String work[] = intake.getWorkExperience();

			for (int i = 0; i < 26; i++) {

				StringBuffer query1 = new StringBuffer("");

				if ("YES".equals(work[i])) {
					query1.append("INSERT INTO `" + SERVER
							+ "`.`intake_job_skill` (");
					query1.append("`JOB_SKILL_ID`,");
					query1.append("`INTAKE_ID` ) ");
					query1.append("VALUES");
					query1.append("(");
					query1.append((i + 1) + "," + key + ");");
					System.out.println(query1);
					Stmt = Conn.prepareStatement(query1.toString(),
							Stmt.RETURN_GENERATED_KEYS);
					Stmt.executeUpdate(query1.toString());
				}
			}
			// Clean up after ourselves
			Stmt.close();
			Conn.close();
		} catch (SQLException E) {
			System.out.println(E.getMessage());
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
			StringBuffer s = new StringBuffer("SELECT * FROM " + SERVER
					+ ".QUESTION ORDER BY QUESTION_ID ");

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
			StringBuffer s = new StringBuffer("SELECT * FROM " + SERVER
					+ ".MEDICAL_CONDITION  ");

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
			StringBuffer s = new StringBuffer("SELECT * FROM " + SERVER
					+ ".JOB_SKILL  ");

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
			query.append("UPDATE " + SERVER + ".DONOR SET ");
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
			StringBuffer s = new StringBuffer("SELECT * FROM " + SERVER
					+ ".DONATION ");
			s.append("INNER JOIN " + SERVER
					+ ".DONOR ON DONOR.DONOR_ID=DONATION.DONOR_ID  ");
			s.append("INNER JOIN " + SERVER
					+ ".ADDRESS ON DONOR.DONOR_ID=ADDRESS.DONOR_ID WHERE ");
			if (lastname.length() > 0)
				s.append("DONOR.LASTNAME='" + lastname + "' AND ");
			if (firstname.length() > 0)
				s.append("DONOR.FIRSTNAME='" + firstname + "' AND ");
			if (confirmation.length() > 0)
				s.append("DONATION.DONATION_ID='" + confirmation + "' AND ");
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
					"SELECT USER_ID, USERNAME, USER_ROLE, LOGIN_COUNT, FARM_BASE FROM "
							+ SERVER + ".SYSTEM_USER ");
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
			HttpServletRequest req) {

		boolean success = true;
		ArrayList errors = new ArrayList();

		try {

			if (username.trim().length() == 0 || username.equals("username")) {
				errors.add("Username is required.");
				success = false;
			}
			if (password.trim().length() == 0 || password.equals("password")) {
				errors.add("Password is required.");
				success = false;
			}

			if (success) {

				success = false;

				Connection Conn = this.getConnection();

				// Do something with the Connection
				Statement Stmt = Conn.createStatement();

				ResultSet RS = Stmt
						.executeQuery("SELECT * from SYSTEM_USER WHERE USERNAME='"
								+ username
								+ "' AND PASSWORD='"
								+ password
								+ "'");

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

					if (username.equals(uid)) {

						if (password.equals(pwd)) {
							req.getSession().setAttribute(
									"USER_" + req.getSession().getId(), user);
							this.updateLoginCount(user.getUserId(),
									req.getSession());
							success = true;
						}

					}

				}

				// Clean up after ourselves
				RS.close();
				Stmt.close();
				Conn.close();
			}

			if (!success && errors.size() == 0) {
				errors.add("Your login attempt was not successful. Please try again.");
				success = false;
			}

			req.setAttribute("ERRORS_" + req.getSession().getId(), errors);

		} catch (SQLException E) {
			req.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			req.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}

		return success;
	}

	public int updateLoginCount(Integer id, HttpSession session) {

		int retCode = 0;
		// Do something with the Connection
		try {
			Connection Conn = this.getConnection();
			Statement Stmt = Conn.createStatement();

			StringBuffer query = new StringBuffer();
			query.append("UPDATE "
					+ SERVER
					+ ".SYSTEM_USER SET LOGIN_COUNT=LOGIN_COUNT+1 WHERE USER_ID="
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
			query.append("UPDATE " + SERVER + ".SYSTEM_USER SET PASSWORD='"
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
					"jdbc:mysql://localhost:3306/" + SERVER + "", "root",
					"admin");

			// Do something with the Connection
			/*
			 * StringBuffer query = new StringBuffer();
			 * query.append("INSERT INTO "+SERVER+".DONOR ("); query.append(
			 * " LASTNAME, FIRSTNAME, SUFFIX, CONTACT_PHONE, EMAIL_ADDRESS, CREATION_DATE, CREATED_BY ) VALUES ("
			 * ); query.append("'" + d.getLastname() + "',"); query.append("'" +
			 * d.getFirstname() + "',"); query.append("'" + d.getSuffix() +
			 * "',"); query.append("'" + d.getContactPhone() + "',");
			 * query.append("'" + d.getEmailAddress() + "',"); query.append("'"
			 * + valid8r.getEpoch() + "',"); query.append("'" + d.getCreatedBy()
			 * + "');"); PreparedStatement Stmt = null; Stmt =
			 * Conn.prepareStatement(query.toString(),
			 * Stmt.RETURN_GENERATED_KEYS);
			 * Stmt.executeUpdate(query.toString());
			 * 
			 * ResultSet generatedKeys = Stmt.getGeneratedKeys();
			 * 
			 * if (generatedKeys.next()) key = generatedKeys.getLong(1);
			 * 
			 * // Clean up after ourselves Stmt.close(); Conn.close();
			 */
		} catch (SQLException E) {
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		return key;
	}

	public Long insertHistory(StudentHistory h, String user, HttpSession session) {

		Long key = new Long("0");

		try {
			Connection Conn = this.getConnection();
			// Do something with the Connection

			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO "
					+ SERVER
					+ ".STUDENT_HISTORY (INTAKE_ID, FARM, PHASE, PROGRAM_STATUS, REASON, BEGIN_DATE, END_DATE,CREATION_DATE,CREATED_BY) VALUE(");
			query.append("'" + h.getIntakeId() + "',");
			query.append("'" + h.getFarm() + "',");
			query.append("'" + h.getPhase() + "',");
			query.append("'" + h.getProgramStatus() + "',");
			query.append("'" + h.getReason() + "',");
			query.append("'" + h.getBeginDate() + "',");
			query.append("'" + h.getEndDate() + "',");
			query.append("'" + valid8r.getEpoch() + "',");
			query.append("'" + user + "' );");

			System.out.println(query);
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
			System.out.println(E.getMessage());
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
			query.append("INSERT INTO " + SERVER + ".ADDRESS (");
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
			query.append("INSERT INTO " + SERVER + ".SYSTEM_USER (");
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