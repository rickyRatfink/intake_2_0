package org.faithfarm.intake;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.faithfarm.domain.SystemUser;
import org.faithfarm.service.data.IntakeDao;
import org.faithfarm.util.Validator;

public class IntakeServlet extends HttpServlet {

	private IntakeDao dao = new IntakeDao();
	private static SystemUser systemUser = new SystemUser();
	
	private static String dispatchDate="";
	private static String limit="";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession(true);
		String action = req.getParameter("action");
		Validator valid8r = new Validator();
		boolean pass1 = false;
		String url="main.jsp";
			
		try {
		
		SystemUser user = (SystemUser)session.getAttribute("USER_"+session.getId());
		if (user==null) 
			url="index.jsp";
		
		else {
			
		this.setFields(req);
		

		
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

	
	public boolean validateChangePassword(String pwd1, String pwd2, String question, String answer, HttpServletRequest req) {
		boolean success = true;
		Validator valid8r = new Validator();

		String fieldErr = "";

		fieldErr = valid8r.validateRequired("password", pwd1);
		req.setAttribute("field1Err", fieldErr);
		if (fieldErr.length() > 0)
			success = false;
		
		fieldErr = valid8r.validateRequired("password", pwd2);
		req.setAttribute("field2Err", fieldErr);
		if (fieldErr.length() > 0)
			success = false;
		
		if (!pwd1.equals(pwd2)) {
			req.setAttribute("field1Err", "Passwords do not match");
			req.setAttribute("field2Err", "Passwords do not match");
			success = false;
		}
		
		if (pwd1.length()<4) {
			req.setAttribute("field1Err", "Password must be at least 4 characters.");
			success=false;
		}
		
		if (pwd2.length()<4) {
			req.setAttribute("field2Err", "Password must be at least 4 characters.");
			success=false;
		}
		
		fieldErr = valid8r.validateRequired("security question", question);
		req.setAttribute("field3Err", fieldErr);
		if (fieldErr.length() > 0)
			success = false;
		
		fieldErr = valid8r.validateRequired("security answer", answer);
		req.setAttribute("field4Err", fieldErr);
		if (fieldErr.length() > 0)
			success = false;
		
		return success;
	}
	public boolean validateTicket(HttpServletRequest req) {
		boolean success = true;
		Validator valid8r = new Validator();

		String fieldErr = "";
		
		this.setFields(req);

		fieldErr = ""; //valid8r.validateRequired("Lastname", this.getDonor()
				//.getLastname());
		req.setAttribute("field1Err", fieldErr);
		if (fieldErr.length() > 0)
			success = false;
		
		return success;
	}

	private void setFields(HttpServletRequest req) {
		Validator valid8r = new Validator();

		//this.getDonor().setLastname(
		//		valid8r.cleanData(req.getParameter("lastname")));
		
	} 

	
	public static SystemUser getSystemUser() {
		return systemUser;
	}

	public static void setSystemUser(SystemUser systemUser) {
		IntakeServlet.systemUser = systemUser;
	}

}
