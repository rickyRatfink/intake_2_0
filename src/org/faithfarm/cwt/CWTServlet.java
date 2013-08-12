package org.faithfarm.cwt;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Metric;
import org.faithfarm.domain.Module;
import org.faithfarm.domain.Program;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.service.data.CWTDao;
import org.faithfarm.util.Validator;
 

public class CWTServlet extends HttpServlet {

	private CWTDao dao = new CWTDao();
	private static SystemUser systemUser = new SystemUser();
	private static Program program = new Program();
	private static Metric metric = new Metric();
	private static Module module = new Module();
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
						dao.getProgramList(session);
						url="pages/cwt/programs/results.jsp";
					} else if ("metrics".equals(action)) {	
							dao.getMetricList(session);
							url="pages/cwt/metrics/results.jsp";
					} else if ("modules".equals(action)) {
						url="pages/cwt/modules/results.jsp";
					}	else if ("Create Program".equals(action)) {
						this.setProgram(new Program());
						url="pages/cwt/programs/create.jsp";
					} else if ("Save Program".equals(action)) {
						pass1=this.validateProgram(user, req);
						if (pass1) {
							Long key = dao.insertProgram(program, session);
							if (key>0) {
								req.setAttribute("MESSAGE", "program successfully saved");
								url="pages/cwt/programs/results.jsp";
							}
							else
								url="error.jsp";
						}
						else
							url="pages/cwt/programs/create.jsp";
					} else if ("Create Metric".equals(action)) {
						this.setMetric(new Metric());
						dao.getPrograms(session);
						url="pages/cwt/metrics/create.jsp";
						
					
					} else if ("Save Metric".equals(action)) {
						pass1=this.validateMetric(user, req);
						if (pass1) {
							Long key = dao.insertMetric(metric, session);
							if (key>0) {
								req.setAttribute("MESSAGE", "metric successfully saved");
								url="pages/cwt/metrics/results.jsp";
							}
							else
								url="error.jsp";
						}
						else
							url="pages/cwt/metrics/create.jsp";
					} else if ("Create Module".equals(action)) {
						this.setModule(new Module());
						dao.getMetrics(session);
						url="pages/cwt/modules/create.jsp";
					} else if ("Save Module".equals(action)) {
						pass1=this.validateModule(user, req);
						if (pass1) {
							Long key = dao.insertModule(module, session);
							if (key>0) {
								req.setAttribute("MESSAGE", "module successfully saved");
								url="pages/cwt/modules/results.jsp";
							}
							else
								url="error.jsp";
						}
						else
							url="pages/cwt/modules/create.jsp";
					}
					
				}	
					
				}
				catch (Exception e) {
					session.setAttribute("ERROR", e.getMessage());
					e.printStackTrace();
					url="error.jsp";
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
		 this.getProgram().setCreatedBy(user.getUsername());			
		 
		 String fieldErr = valid8r.validateRequired("program name", program.getProgramName());
		 
		 if (fieldErr.length() > 0) {
			 	req.setAttribute("programNameErr", fieldErr);
				success = false;
		 }
		 
		 return success;
	 }
	 
     private boolean validateMetric (SystemUser user, HttpServletRequest req) {
		 
		 boolean success=true;
		 
		 this.getMetric().setProgramId(new Long(req.getParameter("programId")));
		 this.getMetric().setMetricName(valid8r.cleanData(req.getParameter("metricName")));
		 this.getMetric().setDescription(valid8r.cleanData(req.getParameter("description")));
		 this.getMetric().setStatus(valid8r.cleanData(req.getParameter("status")));
		 this.getMetric().setCreatedBy(user.getUsername());			
		 
		 String fieldErr = valid8r.validateRequired("metric name", metric.getMetricName());
		 if (fieldErr.length() > 0) {
			 	req.setAttribute("metricNameErr", fieldErr);
				success = false;
		 }
		
		 fieldErr = valid8r.validateRequired("program", metric.getProgramId());
		 if (fieldErr.length() > 0) {
			 	req.setAttribute("programErr", fieldErr);
				success = false;
		 }
		
		 return success;
	 }
     
     private boolean validateModule(SystemUser user, HttpServletRequest req) {
		 
 		 boolean success=true;
 		 
 		 
 		 
 		 this.getModule().setModuleName(valid8r.cleanData(req.getParameter("moduleName")));
 		 this.getModule().setDescription(valid8r.cleanData(req.getParameter("description")));
 		 this.getModule().setStatus(valid8r.cleanData(req.getParameter("status")));
 		 this.getModule().setCreatedBy(user.getUsername());			
 		 
 		 Map<Long, String> ddl = (Map)req.getSession().getAttribute("metric_map");
 		 int count=0;
 		 Long[]keys = new Long[4];
         if (ddl!=null) {
           for (Long key:ddl.keySet()) {
        	   if (req.getParameter("metricId"+key)!=null && req.getParameter("metricId"+key).equals(key+"")) {
        		   keys[count]=key;
        		   count++;
        	   }
           }
           this.getModule().setMetricId(keys);
                     
         }
 		 String fieldErr = valid8r.validateRequired("module name", module.getModuleName());
 		 if (fieldErr.length() > 0) {
 			 	req.setAttribute("moduleNameErr", fieldErr);
 				success = false;
 		 }
 		
 		 if (count == 0) {
 			 	req.setAttribute("metricErr", "you must assign metrics to this module");
 				success = false;
 		 }
 		
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

	public static Metric getMetric() {
		return metric;
	}

	public static void setMetric(Metric metric) {
		CWTServlet.metric = metric;
	}

	public static Module getModule() {
		return module;
	}

	public static void setModule(Module module) {
		CWTServlet.module = module;
	}

	public static Program getProgram() {
		return program;
	}

	public static void setProgram(Program program) {
		CWTServlet.program = program;
	}

	
	 
	 
}
