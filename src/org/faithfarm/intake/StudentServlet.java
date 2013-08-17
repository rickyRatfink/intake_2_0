package org.faithfarm.intake;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Intake;
import org.faithfarm.domain.StudentHistory;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.service.data.StudentDao;
import org.faithfarm.util.Validator;


public class StudentServlet extends HttpServlet {

	private StudentDao dao = new StudentDao();
	private static SystemUser systemUser = new SystemUser();
	private static Validator valid8r = new Validator();

	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			   throws ServletException, IOException
			   {
			      HttpSession session = req.getSession(true);
			      String url="";
			      
			      String action = req.getParameter("action");
			      
			      if ("Search Students".equals(action)) {
			    	  String ssn1=valid8r.cleanData(req.getParameter("ssn1"));
			    	  String ssn2=valid8r.cleanData(req.getParameter("ssn2"));
			    	  String ssn3=valid8r.cleanData(req.getParameter("ssn3"));
			    	 
			    	  GridServlet.setFirstName(valid8r.cleanData(req.getParameter("firstName")));
			    	  GridServlet.setLastName(valid8r.cleanData(req.getParameter("lastName")));
			    	  GridServlet.setEntryDate(valid8r.cleanData(req.getParameter("entryDate")));
			    	  GridServlet.setExitDate(valid8r.cleanData(req.getParameter("exitDate")));
			    	  GridServlet.setSsn(ssn1+ssn2+ssn3);
			    	  GridServlet.setDob(valid8r.cleanData(req.getParameter("dob")));
			    	  GridServlet.setFarm(valid8r.cleanData(req.getParameter("farm")));
			    	  GridServlet.setPictureFlag(valid8r.cleanData(req.getParameter("pictureFlag")));
			    	  GridServlet.setArchivedFlag(valid8r.cleanData(req.getParameter("archivedFlag")));
			    	  GridServlet.setGedFlag(valid8r.cleanData(req.getParameter("gedFlag")));
			    	  
			    	  //dao.searchStudents(firstName, lastName, beginDate, endDate, ssn, dob, farm, pictureFlag, archivedFlag, gedFlag, session);
			    	  url="pages/student/results.jsp";
			      } else if ("View/Edit".equals(action)) {
			    	  String key=req.getParameter("key");
			    	  Intake intake=dao.getStudent(key, session);
			    	  IntakeServlet.setIntake(intake);
			    	  IntakeServlet.loadDropDownLists(session);
			    	  url="pages/student/personal.jsp";
			      }
			      else if ("Create Student".equals(action)) {
			    	  Intake intake=new Intake();
			    	  StudentHistory history = new StudentHistory();
			    	  IntakeServlet.setIntake(intake);
			    	  IntakeServlet.setHistory(history);
			    	  IntakeServlet.loadDropDownLists(session);
			    	  url="pages/student/personal.jsp";
			      }
			      
			      
			      req.getRequestDispatcher("/"+url).forward(req, resp);
	 }
	 
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			 throws ServletException, IOException
			 {
			     doGet(req, resp);
			 }
}

