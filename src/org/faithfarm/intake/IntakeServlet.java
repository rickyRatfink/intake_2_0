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
		        list.add("YES");
		        list.add("NO");
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
