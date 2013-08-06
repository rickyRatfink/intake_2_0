package org.faithfarm.intake;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Intake;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.intake.validation.IntakeValidator;
import org.faithfarm.service.data.IntakeDao;
import org.faithfarm.util.Validator;
 
public class IntakeServlet extends HttpServlet {

	private IntakeDao dao = new IntakeDao();
	private static SystemUser systemUser = new SystemUser();
	private static Intake intake = new Intake();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession(true);
		String action = req.getParameter("action");
		Validator valid8r = new Validator();
		boolean pass1 = false;
		String url="main.jsp";
			
		try {
		
		SystemUser user = (SystemUser)session.getAttribute("USER_"+session.getId());
		if (user==null) {
			this.loadDropDownLists(session);
			url="application.jsp";
		} 
		
			
		//this.setFields(req);
		
		if ("Save Application".equals(action)) {
			this.setFields(req);
			boolean success = validateApplication(req);
			if (!success) 
				url="application.jsp";
			else {
				req.setAttribute("MESSAGE", "Application successfully saved!");
				url="application.jsp";
			}
				
			
			
		
		
		}//end null user else
		req.getRequestDispatcher("/"+url).forward(req, resp);
		}
		catch (Exception e) {
			session.setAttribute("ERROR", e.getMessage());
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	public boolean validateApplication(HttpServletRequest req) {
		boolean success = true;
		IntakeValidator v = new IntakeValidator();

		String fieldErr = "";
		
		this.setFields(req);

		success = v.validate(this.getIntake(), req);
		
		return success;
	}

	private void setFields(HttpServletRequest req) {
		Validator valid8r = new Validator();

		this.getIntake().setLastName(valid8r.cleanData(req.getParameter("lastname")));
		this.getIntake().setFirstName(valid8r.cleanData(req.getParameter("firstname")));
		this.getIntake().setMiddleInitial(valid8r.cleanData(req.getParameter("mi")));
		
		String ssn1=valid8r.cleanData(req.getParameter("ssn1"));
		String ssn2=valid8r.cleanData(req.getParameter("ssn2"));
		String ssn3=valid8r.cleanData(req.getParameter("ssn3"));
		this.getIntake().setSsn(ssn1+ssn2+ssn3);
		
		this.getIntake().setAddress(valid8r.cleanData(req.getParameter("address")));
		this.getIntake().setCity(valid8r.cleanData(req.getParameter("city")));
		this.getIntake().setState(valid8r.cleanData(req.getParameter("state")));
		this.getIntake().setZipcode(valid8r.cleanData(req.getParameter("zipcode")));
		this.getIntake().setReferralPhone(valid8r.cleanData(req.getParameter("referral_phone")));
		this.getIntake().setDateOfBirth(valid8r.cleanData(req.getParameter("dob")));
		this.getIntake().setAge(valid8r.cleanData(req.getParameter("age")));
	
		this.getIntake().setEmergencyContact(valid8r.cleanData(req.getParameter("emergencyContact")));
		this.getIntake().setEmergencyRelationship(valid8r.cleanData(req.getParameter("emergencyRelationship")));
		this.getIntake().setEmergencyPhone(valid8r.cleanData(req.getParameter("emergencyPhone")));
		
		this.getIntake().setMaritalStatus(valid8r.cleanData(req.getParameter("maritalStatus")));
		this.getIntake().setEthnicity(valid8r.cleanData(req.getParameter("ethnicity")));
		
		this.getIntake().setHeight(valid8r.cleanData(req.getParameter("height")));
		this.getIntake().setWeight(valid8r.cleanData(req.getParameter("weight")));
		this.getIntake().setEyeColor(valid8r.cleanData(req.getParameter("eyecolor")));
		this.getIntake().setHairColor(valid8r.cleanData(req.getParameter("haircolor")));
		
		this.getIntake().setHomeLocation(valid8r.cleanData(req.getParameter("homeLocation")));
		this.getIntake().setEducationLevel(valid8r.cleanData(req.getParameter("educationLevel")));
		this.getIntake().setGraduateFlag(valid8r.cleanData(req.getParameter("graduateFlag")));
		this.getIntake().setEnglishSpeakFlag(valid8r.cleanData(req.getParameter("englishSpeakFlag")));
		this.getIntake().setEnglishReadFlag(valid8r.cleanData(req.getParameter("englishReadFlag")));
		
		this.getIntake().setIncomeAmount(valid8r.cleanData(req.getParameter("incomeAmount")));
		this.getIntake().setIncomeWeeklyFlag(valid8r.cleanData(req.getParameter("incomeWeeklyFlag")));
		this.getIntake().setIncomeBiWeeklyFlag(valid8r.cleanData(req.getParameter("incomeBiWeeklyFlag")));
		this.getIntake().setIncomeMonthlyFlag(valid8r.cleanData(req.getParameter("incomeMonthlyFlag")));
		this.getIntake().setIncomeYearlyFlag(valid8r.cleanData(req.getParameter("incomeYearlyFlag")));
		this.getIntake().setIncomeSource(valid8r.cleanData(req.getParameter("incomeSource")));
		
		this.getIntake().setSSFlag(valid8r.cleanData(req.getParameter("ssFlag")));
		this.getIntake().setVAFlag(valid8r.cleanData(req.getParameter("vaFlag")));
		this.getIntake().setWCFlag(valid8r.cleanData(req.getParameter("wcFlag")));
		this.getIntake().setOtherBenefits(valid8r.cleanData(req.getParameter("other_benefits")));
		
		this.getIntake().setVeteranFlag(valid8r.cleanData(req.getParameter("veteranFlag")));
		this.getIntake().setBranchOfService(valid8r.cleanData(req.getParameter("branchOfService")));
		this.getIntake().setRank(valid8r.cleanData(req.getParameter("rank")));
		this.getIntake().setLengthOfService(valid8r.cleanData(req.getParameter("lengthOfService")));
		
		this.getIntake().setDriversLicenseFlag(valid8r.cleanData(req.getParameter("driversLicenseFlag")));
		this.getIntake().setDriversLicenseState(valid8r.cleanData(req.getParameter("driversLicenseState")));
		this.getIntake().setDriversLicenseNumber(valid8r.cleanData(req.getParameter("driversLicenseNumber")));
		this.getIntake().setMotherLivingFlag(valid8r.cleanData(req.getParameter("motherLivingFlag")));
		this.getIntake().setFatherLivingFlag(valid8r.cleanData(req.getParameter("fatherLivingFlag")));
				
		this.getIntake().setReligiousExperience(valid8r.cleanData(req.getParameter("religiousExperience")));
		this.getIntake().setReligion(valid8r.cleanData(req.getParameter("religion")));
		
		this.getIntake().setSober3Years(valid8r.cleanData(req.getParameter("sober3Years")));
		this.getIntake().setSober1Years(valid8r.cleanData(req.getParameter("sober1Years")));
		
		this.getIntake().setAttendAA(valid8r.cleanData(req.getParameter("attendAA")));
		this.getIntake().setYearsAttended(valid8r.cleanData(req.getParameter("yearsAttended")));
		
		this.getIntake().setAbusePhysicalEffects(valid8r.cleanData(req.getParameter("abusePhysicalEffects")));
		
		this.getIntake().setPreviousFaithFarmFlag(valid8r.cleanData(req.getParameter("previousFaithFarmFlag")));
		this.getIntake().setPreviousFaithFarm(valid8r.cleanData(req.getParameter("previousFaithFarm")));
		this.getIntake().setFfYearsAttended(valid8r.cleanData(req.getParameter("ffYearsAttended")));
		this.getIntake().setOtherRehabs(valid8r.cleanData(req.getParameter("otherRehabs")));
		
		this.getIntake().setUsagePattern1(valid8r.cleanData(req.getParameter("usagePattern1")));
		this.getIntake().setUsagePattern2(valid8r.cleanData(req.getParameter("usagePattern2")));
		this.getIntake().setUsagePattern3(valid8r.cleanData(req.getParameter("usagePattern3")));
		this.getIntake().setUsagePattern4(valid8r.cleanData(req.getParameter("usagePattern4")));
		this.getIntake().setUsagePattern5(valid8r.cleanData(req.getParameter("usagePattern5")));
		this.getIntake().setUsagePattern6(valid8r.cleanData(req.getParameter("usagePattern6")));
		
		this.getIntake().setUsageLosses1(valid8r.cleanData(req.getParameter("usageLosses1")));
		this.getIntake().setUsageLosses2(valid8r.cleanData(req.getParameter("usageLosses2")));
		this.getIntake().setUsageLosses3(valid8r.cleanData(req.getParameter("usageLosses3")));
		this.getIntake().setUsageLosses4(valid8r.cleanData(req.getParameter("usageLosses4")));
		this.getIntake().setUsageLosses5(valid8r.cleanData(req.getParameter("usageLosses5")));
		this.getIntake().setUsageLosses6(valid8r.cleanData(req.getParameter("usageLosses6")));
		this.getIntake().setUsageLosses7(valid8r.cleanData(req.getParameter("usageLosses7")));
		this.getIntake().setUsageLosses8(valid8r.cleanData(req.getParameter("usageLosses8")));
		this.getIntake().setUsageLosses9(valid8r.cleanData(req.getParameter("usageLosses9")));
		
		String question[] = new String[]{ 
				"NO","NO","NO","NO","NO","NO",
				"NO","NO","NO","NO","NO","NO",
				"NO","NO","NO","NO","NO","NO",
				"NO","NO","NO","NO","NO","NO",
				"NO","NO","NO","NO","NO","NO","NO","NO","NO","NO" };
		for (int i=0;i<32;i++) {
			question[i]=valid8r.cleanData(req.getParameter("question"+i));
		}
		this.getIntake().setQuestion(question);
		
		String questionAnswer[] = new String[]{ 
				"","","","","","",
				"","","","","","",
				"","","","","","",
				"","","","","","",
				"","","","","","","","","","" };
		String questionAnswerDates[] = new String[]{ 
				"","","","","","",
				"","","","","","",
				"","","","","","",
				"","","","","","",
				"","","","","","","","","","" };
		for (int i=0;i<32;i++) {
			questionAnswer[i]=valid8r.cleanData(req.getParameter("question"+i+"Details"));
			questionAnswerDates[i]=valid8r.cleanData(req.getParameter("question"+i+"Dates"));
		}
		this.getIntake().setQuestionAnswerDetails(questionAnswer);
		this.getIntake().setQuestionAnswerDates(questionAnswerDates);
		
		this.getIntake().setCurrentHealth(valid8r.cleanData(req.getParameter("currentHealth")));
		this.getIntake().setCurrentMedicationsFlag(valid8r.cleanData(req.getParameter("currentMedicationsFlag")));
		this.getIntake().setNeedMedicationFlag(valid8r.cleanData(req.getParameter("needMedicationFlag")));
		this.getIntake().setMedicationSuppyFlag(valid8r.cleanData(req.getParameter("medicationSupplyFlag")));
		this.getIntake().setCurrentMedicationsDetails(valid8r.cleanData(req.getParameter("currentMedicationsDetails")));
		
		this.getIntake().setDoctorsAppointment(valid8r.cleanData(req.getParameter("doctorsAppointment")));
		this.getIntake().setDoctorsAppointmentDate(valid8r.cleanData(req.getParameter("doctorsAppointmentDate")));
		
		
		this.getIntake().setEyewearFlag(valid8r.cleanData(req.getParameter("eyewearFlag")));
		this.getIntake().setEyewearUsage(valid8r.cleanData(req.getParameter("eyewearUsage")));
		
		this.getIntake().setIndustrialInjuryFlag(valid8r.cleanData(req.getParameter("industrialInjuryFlag")));
		this.getIntake().setIndustrialInjuryDate(valid8r.cleanData(req.getParameter("industrialInjuryDate")));
		this.getIntake().setIndustrialInjuryReason(valid8r.cleanData(req.getParameter("industrialInjuryReason")));
		this.getIntake().setIndustrialInjuryLocation(valid8r.cleanData(req.getParameter("industrialInjuryLocation")));
		this.getIntake().setIndustrialInjuryEmployer(valid8r.cleanData(req.getParameter("industrialInjuryEmployer")));
		
		
		this.getIntake().setDisabilityFlag(valid8r.cleanData(req.getParameter("disabilityFlag")));
		this.getIntake().setPhysician(valid8r.cleanData(req.getParameter("physician")));
		this.getIntake().setPhysicianAddress(valid8r.cleanData(req.getParameter("physicianAddress")));
		this.getIntake().setExaminationDate(valid8r.cleanData(req.getParameter("examinationDate")));
		
		String medicalCondition[] = new String[]{ 
				"NO","NO","NO","NO","NO","NO",
				"NO","NO","NO","NO","NO","NO",
				"NO","NO","NO","NO","NO","NO",
				"NO","NO","NO","NO","NO","NO",
				"NO","NO","NO","NO","NO","NO","NO","NO","NO","NO" };
		for (int i=0;i<25;i++) {
			medicalCondition[i]=valid8r.cleanData(req.getParameter("medicalConditionFlag"+i));
		}
		this.getIntake().setMedicalCondition(medicalCondition);
		this.getIntake().setHerniaOperationFlag(valid8r.cleanData(req.getParameter("herniaOperationFlag")));
		
		//this.getIntake().set(valid8r.cleanData(req.getParameter("")));
		
		
		
	} 
	
	private void loadDropDownLists(HttpSession session) {
					    
		      ArrayList states = new ArrayList();
		        states.add("Alabama");
		        states.add("Alaska");
		        states.add("Arizona");
		        states.add("Arkansas");
		        states.add("California");
		        states.add("Colorado");
		        states.add("Connecticut");
		        states.add("Delaware");
		        states.add("Dist of Columbia");
		        states.add("Florida");
		        states.add("Georgia");
		        states.add("Hawaii");
		        states.add("Idaho");
		        states.add("Illinois");
		        states.add("Indiana");
		        states.add("Iowa");
		        states.add("Kansas");
		        states.add("Kentucky");
		        states.add("Louisiana");
		        states.add("Maine");
		        states.add("Maryland");
		        states.add("Massachusetts");
		        states.add("Michigan");
		        states.add("Minnesota");
		        states.add("Mississippi");
		        states.add("Missouri");
		        states.add("Montana");
		        states.add("Nebraska");
		        states.add("Nevada");
		        states.add("New Hampshire");
		        states.add("New Jersey");
		        states.add("New Mexico");
		        states.add("New York");
		        states.add("North Carolina");
		        states.add("North Dakota");
		        states.add("Ohio");
		        states.add("Oklahoma");
		        states.add("Oregon");
		        states.add("Pennsylvania");
		        states.add("Rhode Island");
		        states.add("South Carolina");
		        states.add("South Dakota");
		        states.add("Tennessee");
		        states.add("Texas");
		        states.add("Utah");
		        states.add("Vermont");
		        states.add("Virginia");
		        states.add("Washington");
		        states.add("West Virginia");
		        states.add("Wisconsin");
		        states.add("Wyoming");
		        session.setAttribute("dll_states", states);
		        
		        ArrayList list = new ArrayList();
		        list.add("NO");
		        list.add("YES");
		        session.setAttribute("dll_yesno", list);
		        
		        list = new ArrayList();
		        list.add("Air Force");
		        list.add("Army");
		        list.add("Army National Guard");
		        list.add("Coast Guard");
		        list.add("Marines");
		        list.add("Navy");
		        session.setAttribute("dll_military", list);
		        
		        list = new ArrayList();
		        list.add("All the time");
		        list.add("Occasionally");
		        list.add("Reading");
		        session.setAttribute("dll_eyewear", list);
		        
		        list = new ArrayList();
		        list.add("excellent");
		        list.add("good");
		        list.add("fair");
		        list.add("failing");
		        list.add("poor");
		        session.setAttribute("dll_health", list);
		        
		        list = new ArrayList();
		        list.add("open");
		        list.add("closed");
		        session.setAttribute("dll_claim_status", list);
		        
		        list = new ArrayList();
		        list.add("Christian");
		        list.add("Buddhist");
		        list.add("Catholic");
		        list.add("Hindu");
		        list.add("Jewish");
		        list.add("New Age");
		        list.add("Protestant");
		        list.add("Rastafarian");
		        list.add("Santaria");
		        list.add("Other");
		        session.setAttribute("dll_religion", list);
		        
		        list = new ArrayList();
		        list.add("American Indian/Alaskan Native");
		        list.add("Asian/Pacific Islander");
		        list.add("Black, not Hispanic");
		        list.add("Hispanic");
		        list.add("White, not Hispanic");
		        session.setAttribute("dll_ethnicity", list);
		        
		        list = new ArrayList();
		        list.add("Never Married");
		        list.add("Married");
		        list.add("Divorced");
		        list.add("Separated");
		        list.add("Spouse Deceased");
		        list.add("Lives with Girlfriend");
		        list.add("Lives with Boyfriend");
		        list.add("Remarried");
		        list.add("Re-divorced");
		        session.setAttribute("dll_marital_status", list);
		        
		        list = new ArrayList();
		        list.add("Own Home");
		        list.add("Parent's Home");
		        list.add("Friend's Home");
		        list.add("Halfway Home");
		        list.add("Hotel");
		        list.add("Rehab Program");
		        list.add("Vehicle");
		        list.add("On Street");
		        list.add("Other");
		        session.setAttribute("dll_living", list);
		        
		        list = new ArrayList();
		        list.add("Elementary");
		        list.add("High School");
		        list.add("GED");
		        list.add("Bachelor's Degree");
		        list.add("Master's Degree");
		        list.add("Doctorate Degree");
		        list.add("Associates Degree");
		        list.add("Vocational School");
		        session.setAttribute("dll_education", list);
		        
		        list = new ArrayList();
		        list.add("Brown");
		        list.add("Black");
		        list.add("Blonde");
		        list.add("Blonde/Strawberry");
		        list.add("Gray or Partially Gray");
		        list.add("Partly or Completely Bald");
		        list.add("Red/Auburn");
		        list.add("Sandy");
		        list.add("Salt & Pepper");
		        list.add("Shaved");
		        list.add("White");
		        session.setAttribute("dll_haircolor", list);
		        
		        list = new ArrayList();
		        list.add("Blue");
		        list.add("Brown");
		        list.add("Green");
		        list.add("Hazel");
		        list.add("Other");
		        session.setAttribute("dll_eyecolor", list);
		        
		        int retCode=dao.getQuestions(session);
		        retCode = dao.getMedicalConditions(session);
		        retCode = dao.getJobSkills(session);
	}

	
	public static SystemUser getSystemUser() {
		return systemUser;
	}

	public static void setSystemUser(SystemUser systemUser) {
		IntakeServlet.systemUser = systemUser;
	}

	public static Intake getIntake() {
		return intake;
	}

	public static void setIntake(Intake intake) {
		IntakeServlet.intake = intake;
	}

}
