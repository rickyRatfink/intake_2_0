package org.faithfarm.cwt;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Department;
import org.faithfarm.domain.Job;
import org.faithfarm.domain.Metric;
import org.faithfarm.domain.Module;
import org.faithfarm.domain.Program;
import org.faithfarm.domain.Supervisor;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.service.data.CWTDao;
import org.faithfarm.util.Validator;
 

public class CWTServlet extends HttpServlet {

	private CWTDao dao = new CWTDao();
	private static SystemUser systemUser = new SystemUser();
	private static Program program = new Program();
	private static Metric metric = new Metric();
	private static Module module = new Module();
	private static Department department = new Department();
	private static Job job = new Job();
	private static Supervisor supervisor = new Supervisor();
	
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
						dao.getModuleList(session);
						url="pages/cwt/modules/results.jsp";
					} else if ("departments".equals(action)) {	
						dao.getDepartmentList("",session);
						url="pages/cwt/department/results.jsp";
					} else if ("jobs".equals(action)) {	
						dao.getJobList("",session);
						url="pages/cwt/job/results.jsp";
					} else if ("supervisors".equals(action)) {	
						dao.getSupervisorList(session);
						url="pages/cwt/supervisor/results.jsp";
					} else if ("Create Program".equals(action)) {
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
					} else if ("Create Department".equals(action)) {
						this.setDepartment(new Department());
						url="pages/cwt/department/create.jsp";
					} else if ("Save Department".equals(action)) {
						pass1=this.validateDepartment(user, req);
						department.setCreatedBy(user.getUsername());
						if (pass1) {
							Long key = dao.insertDepartment(this.getDepartment(), session);
							if (key>0) {
								req.setAttribute("MESSAGE", "department successfully saved");
								url="pages/cwt/department/results.jsp";
							}
							else
								url="error.jsp";
						}
						else 
							url="pages/cwt/department/create.jsp";
					}
					else if ("Create Job".equals(action)) {
						this.setJob(new Job());
						dao.getMetrics(session);
						dao.getDepartments(user.getFarmBase(),session);
						url="pages/cwt/job/create.jsp";
					} else if ("Save Job".equals(action)) {
						pass1=this.validateJob(user, req);
						if (pass1) {
							Long key = dao.insertJob(this.getJob(), session);
							if (key>0) {
								req.setAttribute("MESSAGE", "job successfully saved");
								url="pages/cwt/job/results.jsp";
							}
							else
								url="error.jsp";
						}
						else 
							url="pages/cwt/job/create.jsp";
					} else if ("Create Supervisor".equals(action)) {
						dao.getJobs("",session);
						dao.getDepartments(user.getFarmBase(),session);
						url="pages/cwt/supervisor/create.jsp";
					} else if ("Save Supervisor".equals(action)) {
						pass1=this.validateSupervisor(user, req);
						supervisor.setCreatedBy(user.getUsername());
						if (pass1) {
							Long key = dao.insertSupervisor(this.getSupervisor(), session);
							if (key>0) {
								req.setAttribute("MESSAGE", "supervisor successfully saved");
								url="pages/cwt/supervisor/results.jsp";
							}
							else
								url="error.jsp";
						}
						else 
							url="pages/cwt/supervisor/create.jsp";
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
		 
		 fieldErr = valid8r.validateRequired("status", program.getStatus());
		 if (fieldErr.length() > 0) {
			 	req.setAttribute("statusErr", fieldErr);
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
		 
		 fieldErr = valid8r.validateRequired("status", metric.getStatus());
		 if (fieldErr.length() > 0) {
			 	req.setAttribute("statusErr", fieldErr);
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
 		 Long[]keys = new Long[200];
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
 		 
 		 fieldErr = valid8r.validateRequired("status", module.getStatus());
		 if (fieldErr.length() > 0) {
			 	req.setAttribute("statusErr", fieldErr);
				success = false;
		 }
 		
 		 if (count == 0) {
 			 	req.setAttribute("metricErr", "you must assign metrics to this module");
 				success = false;
 		 }
 		
 		 return success;
 	 }
     
     
private boolean validateDepartment (SystemUser user, HttpServletRequest req) {
		 
		 boolean success=true;
		 
		 this.getDepartment().setTitle(valid8r.cleanData(req.getParameter("title")));
		 this.getDepartment().setFarmBase(valid8r.cleanData(req.getParameter("farmBase")));
		  this.getMetric().setCreatedBy(user.getUsername());			
		 
		 String fieldErr = valid8r.validateRequired("department title", department.getTitle());
		 if (fieldErr.length() > 0) {
			 	req.setAttribute("departmentNameErr", fieldErr);
				success = false;
		 }
		
		 fieldErr = valid8r.validateRequired("farm location", department.getFarmBase());
		 if (fieldErr.length() > 0) {
			 	req.setAttribute("farmBaseErr", fieldErr);
				success = false;
		 }	 
		
		
		 return success;
	 }
     

private boolean validateJob (SystemUser user, HttpServletRequest req) {
	 
	 boolean success=true;
	 
	 this.getJob().setTitle(valid8r.cleanData(req.getParameter("title")));
	 this.getJob().setDepartmentId(new Long(req.getParameter("departmentId")));
	 this.getJob().setCreatedBy(user.getUsername());			
	 
	 String fieldErr = valid8r.validateRequired("job title", job.getTitle());
	 if (fieldErr.length() > 0) {
		 	req.setAttribute("jobNameErr", fieldErr);
			success = false;
	 }
	
	 fieldErr = valid8r.validateRequired("department", job.getDepartmentId());
	 if (fieldErr.length() > 0) {
		 	req.setAttribute("departmentErr", fieldErr);
			success = false;
	 }	 
	 
	 Map<Long, String> ddl = (Map)req.getSession().getAttribute("metric_map");
		 int count=0;
		 Long[]keys = new Long[200];
     if (ddl!=null) {
       for (Long key:ddl.keySet()) {
    	   if (req.getParameter("metricId"+key)!=null && req.getParameter("metricId"+key).equals(key+"")) {
    		   keys[count]=key;
    		   count++;
    	   }
       }
       this.getJob().setMetricId(keys);
     }
	
	 return success;
}

private boolean validateSupervisor (SystemUser user, HttpServletRequest req) {
	 
	 boolean success=true;
	 
	 this.getSupervisor().setJobId(new Long(valid8r.cleanData(req.getParameter("jobId"))));
	 this.getSupervisor().setFirstname(valid8r.cleanData(req.getParameter("firstname")));
	 this.getSupervisor().setLastname(valid8r.cleanData(req.getParameter("lastname")));
	 this.getSupervisor().setDepartmentId(new Long(valid8r.cleanData(req.getParameter("departmentId"))));
	 this.getSupervisor().setCreatedBy(user.getUsername());
	 String fieldErr = valid8r.validateRequired("firstname", supervisor.getFirstname());
	 if (fieldErr.length() > 0) {
		 	req.setAttribute("firstnameErr", fieldErr);
			success = false;
	 }
	 fieldErr = valid8r.validateRequired("lastname", supervisor.getLastname());
	 if (fieldErr.length() > 0) {
		 	req.setAttribute("lastnameErr", fieldErr);
			success = false;
	 }
	 fieldErr = valid8r.validateRequired("department", supervisor.getDepartmentId());
	 if (fieldErr.length() > 0) {
		 	req.setAttribute("departmentErr", fieldErr);
			success = false;
	 }
	 fieldErr = valid8r.validateRequired("job", supervisor.getJobId());
	 if (fieldErr.length() > 0) {
		 	req.setAttribute("jobErr", fieldErr);
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

	public static Department getDepartment() {
		return department;
	}

	public static void setDepartment(Department department) {
		CWTServlet.department = department;
	}

	public static Job getJob() {
		return job;
	}

	public static void setJob(Job job) {
		CWTServlet.job = job;
	}

	public static Supervisor getSupervisor() {
		return supervisor;
	}

	public static void setSupervisor(Supervisor supervisor) {
		CWTServlet.supervisor = supervisor;
	}

	
	 
	 
}
