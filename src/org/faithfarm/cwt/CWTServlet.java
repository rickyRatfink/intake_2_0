package org.faithfarm.cwt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Program;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.service.data.CWTDao;
import org.faithfarm.util.Validator;


public class CWTServlet extends HttpServlet {

	private CWTDao dao = new CWTDao();
	private static SystemUser systemUser = new SystemUser();
	private static Program program = new Program();
	private static Validator valid8r = new Validator();

	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			   throws ServletException, IOException
			   {
			   	HttpSession session = req.getSession(true);
				String action = req.getParameter("action");
				Validator valid8r = new Validator();
				boolean pass1 = false;
				String url="pages/cwt/index.jsp";
					
				try {
				
				SystemUser user = (SystemUser)session.getAttribute("USER_"+session.getId());
				
				if (user==null) 
					url="/login";
				else {
					
					if ("programs".equals(action)) {
						url="pages/cwt/programs/results.jsp";
					} else if ("Create Program".equals(action)) {
						url="pages/cwt/programs/create.jsp";
					} else if ("Save Program".equals(action)) {
						pass1=this.validateProgram(user, req);
						if (pass1) {
							Long key = dao.insertProgram(program, session);
							if (key>0)
								url="pages/cwt/programs/results.jsp";
							else
								url="error.jsp";
						}
						else
							url="pages/cwt/programs/create.jsp";
					}
					
				}	
					
				}
				catch (Exception e) {
					session.setAttribute("ERROR", e.getMessage());
					req.getRequestDispatcher("/error.jsp").forward(req, resp);
				}
			      
			      req.getRequestDispatcher("/"+url).forward(req, resp);
	 }
	 
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			 throws ServletException, IOException
			 {
			     doGet(req, resp);
			 }

	 private boolean validateProgram (SystemUser user, HttpServletRequest req) {
		 
		 boolean success=true;
		 
		 this.getProgram().setProgramName(valid8r.cleanData(req.getParameter("programName")));
		 this.getProgram().setDescription(valid8r.cleanData(req.getParameter("description")));
		 this.getProgram().setStatus(valid8r.cleanData(req.getParameter("status")));
		 this.getProgram().setCreatedBy(user.getCreatedBy());			
		 
		 String fieldErr = valid8r.validateRequired("program name", program.getProgramName());
		 if (fieldErr.length() > 0)
				success = false;
		 
		 return success;
	 }
	public CWTDao getDao() {
		return dao;
	}

	public void setDao(CWTDao dao) {
		this.dao = dao;
	}

	public static SystemUser getSystemUser() {
		return systemUser;
	}

	public static void setSystemUser(SystemUser systemUser) {
		CWTServlet.systemUser = systemUser;
	}

	public static Program getProgram() {
		return program;
	}

	public static void setProgram(Program program) {
		CWTServlet.program = program;
	}
	 
	 
}
