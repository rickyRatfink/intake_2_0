package org.faithfarm.service.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Department;
import org.faithfarm.domain.Job;
import org.faithfarm.domain.Metric;
import org.faithfarm.domain.Module;
import org.faithfarm.domain.ModuleRoster;
import org.faithfarm.domain.Program;
import org.faithfarm.domain.Supervisor;
import org.faithfarm.intake.SecureLogin;
import org.faithfarm.util.Validator;

//import com.mysql.jdbc.PreparedStatement;

public class CWTDao {

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
	LOGGER.setLevel(Level.INFO);
	
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
	public Long insertProgram(Program program, HttpSession session) {

		Long key = new Long("0");

		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_program` ");
			query.append("(");
			query.append("`program_name`,");
			query.append("`description`,");
			query.append("`status`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			query.append("'"+program.getProgramName()+"',");
			query.append("'"+program.getDescription()+"',");
			query.append("'"+program.getStatus()+"',");
			query.append("'"+valid8r.getEpoch()+"',");
			query.append("'"+program.getCreatedBy()+"'");
			query.append(")");
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();
			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			Stmt.close();
			Conn.close();

		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		return key;
	}


	public void getProgramList(HttpSession session) {

		
		try {
		
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT PROGRAM_ID, PROGRAM_NAME, DESCRIPTION, STATUS, CREATION_DATE, CREATED_BY FROM `"+this.getDatabase()+"`.`cwt_program` ");
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			ArrayList list = new ArrayList();
			
			while (RS.next()) {
				Program p = new Program();
				p.setProgramId(RS.getLong(1));
				p.setProgramName(RS.getString(2));
				p.setDescription(RS.getString(3));
				p.setStatus(RS.getString(4));
				p.setCreationDate(RS.getString(5));
				p.setCreatedBy(RS.getString(6));
				list.add(p);			
			}
			session.setAttribute("program_results", list);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	}
	
	
	public void getMetricList(HttpSession session) {

		
		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			//query.append("SELECT METRIC_ID, METRIC_NAME, DESCRIPTION, STATUS, CREATION_DATE, CREATED_BY FROM `"+this.getDatabase()+"`.`cwt_metrics` ");
			query.append("SELECT ");
			query.append("CWT_METRICS.METRIC_ID, METRIC_NAME, CWT_PROGRAM.PROGRAM_ID, CWT_METRICS.DESCRIPTION,"); 
			query.append("CWT_METRICS.STATUS, CWT_METRICS.CREATION_DATE, CWT_METRICS.CREATED_BY ");
			query.append("FROM ");
			query.append("`"+this.getDatabase()+"`.`cwt_metrics` INNER JOIN `"+this.getDatabase()+"`.`cwt_program_metric` ");
			query.append("ON cwt_program_metric.METRIC_ID = CWT_METRICS.METRIC_ID ");
			query.append("INNER JOIN `"+this.getDatabase()+"`.`cwt_program` ");
			query.append("ON CWT_PROGRAM_METRIC.PROGRAM_ID = CWT_PROGRAM.PROGRAM_ID ");
			LOGGER.log(Level.INFO, query.toString());
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			ArrayList list = new ArrayList();
			
			while (RS.next()) {
				Metric p = new Metric();
				Program pr = new Program();
								
				p.setMetricId(RS.getLong(1));
				p.setMetricName(RS.getString(2));
				p.setDescription(RS.getString(4));
				p.setStatus(RS.getString(5));
				p.setCreationDate(RS.getString(6));
				p.setCreatedBy(RS.getString(7));
				
				Long pId = RS.getLong(3);
				pr=this.getProgram(pId, session);
				p.setProgram(pr);
				
				list.add(p);			
			}
			session.setAttribute("metric_results", list);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	}
	
	public void getPrograms(HttpSession session) {

		
		try {
			Connection Conn = this.getConnection();
			StringBuffer query = new StringBuffer();

			query.append("SELECT PROGRAM_ID, PROGRAM_NAME FROM `"+this.getDatabase()+"`.`cwt_program` ");
			LOGGER.log(Level.INFO, query.toString());
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			Map<Long, String> m = new HashMap<Long, String>();
			    
			while (RS.next()) {
				Long key = RS.getLong(1);
				String value = RS.getString(2);
				m.put(key, value);
			}
			session.setAttribute("program_map", m);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	}
	
	public void getDepartments(String farm, HttpSession session) {

		
		try {
		
			Connection Conn = this.getConnection();
			StringBuffer query = new StringBuffer();

			query.append("SELECT DEPARTMENT_ID, TITLE FROM `"+this.getDatabase()+"`.`cwt_department` ");
			if (farm.length()>0)
				query.append(" WHERE FARM_BASE='"+farm+"' ");
			LOGGER.log(Level.INFO, query.toString());
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			Map<Long, String> m = new HashMap<Long, String>();
			    
			while (RS.next()) {
				Long key = RS.getLong(1);
				String value = RS.getString(2);
				m.put(key, value);
			}
			session.setAttribute("department_map", m);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	}
public void getSupervisors(String farm, HttpSession session) {

		
		try {
		
			Connection Conn = this.getConnection();
			StringBuffer query = new StringBuffer();

			query.append("SELECT SUPERVISOR_ID, CONCAT(FIRSTNAME,' ',LASTNAME) AS NAME FROM `"+this.getDatabase()+"`.`cwt_supervisor` ");
			query.append(" INNER JOIN `"+this.getDatabase()+"`.`cwt_department` ON cwt_supervisor.department_id=cwt_department.department_id ");
			if (farm.length()>0)
				query.append(" WHERE FARM_BASE='"+farm+"' ");
			
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			Map<Long, String> m = new HashMap<Long, String>();
			    
			while (RS.next()) {
				Long key = RS.getLong(1);
				String value = RS.getString(2);
				m.put(key, value);
			}
			session.setAttribute("supervisor_map", m);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	}
	
	public void getJobs(String farm, HttpSession session) {

		
		try {
		
			Connection Conn = this.getConnection();
			StringBuffer query = new StringBuffer();

			query.append("SELECT JOB_ID, cwt_job.TITLE FROM `"+this.getDatabase()+"`.`cwt_job` ");
			query.append("INNER JOIN `"+this.getDatabase()+"`.`cwt_department`  ");
			query.append("ON cwt_job.department_id=cwt_department.department_id  ");
			if (farm.length()>0)
				query.append(" WHERE FARM_BASE='"+farm+"' ");
			LOGGER.log(Level.INFO, query.toString());
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			Map<Long, String> m = new HashMap<Long, String>();
			    
			while (RS.next()) {
				Long key = RS.getLong(1);
				String value = RS.getString(2);
				m.put(key, value);
			}
			session.setAttribute("job_map", m);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	}

	
	public void getModuleList(HttpSession session) {

		
		try {
		 
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT MODULE_ID, MODULE_NAME, DESCRIPTION, STATUS, CWT_MODULES.CREATION_DATE, CWT_MODULES.CREATED_BY, MEETING_DAYS, MEETING_TIMES, ");
			query.append(" INSTRUCTOR_ID, MEETING_LOCATION, CONCAT (FIRSTNAME,' ',LASTNAME) as NAME FROM `"+this.getDatabase()+"`.`CWT_MODULES` ");
			query.append(" INNER JOIN `"+this.getDatabase()+"`.cwt_supervisor ");
			query.append(" ON cwt_supervisor.supervisor_id=cwt_modules.instructor_id ");
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			ArrayList list = new ArrayList();
			
			while (RS.next()) {
				Module p = new Module();
				p.setModuleId(RS.getLong(1));
				p.setModuleName(RS.getString(2));
				p.setDescription(RS.getString(3));
				p.setStatus(RS.getString(4));
				p.setCreationDate(RS.getString(5));
				p.setCreatedBy(RS.getString(6));
				p.setMeetingDays(RS.getString(7));
				p.setMeetingTimes(RS.getString(8));
				p.setInstructorId(RS.getLong(9));
				p.setMeetingLocation(RS.getString(10));
				p.setInstructorName(RS.getString(11));
				list.add(p);	 		
			}
			session.setAttribute("module_results", list);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	}

	
	public Program getProgram(Long id, HttpSession session) {

		Program p = new Program();
		
		try {
		
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT * FROM `"+this.getDatabase()+"`.`cwt_program` WHERE PROGRAM_ID="+id);
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			while (RS.next()) {
				p.setProgramId(RS.getLong(1));
				p.setProgramName(RS.getString(2));
				p.setDescription(RS.getString(3));
				p.setStatus(RS.getString(4));
				p.setCreationDate(RS.getString(5));
				p.setCreatedBy(RS.getString(6));
			}
			
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
	
		return p;
	}

	public void getMetrics(HttpSession session) {

		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT METRIC_ID, METRIC_NAME FROM `"+this.getDatabase()+"`.`cwt_metrics` ");
			LOGGER.log(Level.INFO,query.toString());
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			Map<Long, String> m = new HashMap<Long, String>();
			    
			while (RS.next()) {
				Long key = RS.getLong(1);
				String value = RS.getString(2);
				m.put(key, value);
			}
			session.setAttribute("metric_map", m);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	}

	
	
	public Long insertMetric(Metric metric, HttpSession session) {

		Long key = new Long("0");

		try {
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_metrics` ");
			query.append("(");
			//query.append("`program_id`,");
			query.append("`metric_name`,");
			query.append("`description`,");
			query.append("`status`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			//query.append(""+metric.getProgramId()+",");
			query.append("'"+metric.getMetricName()+"',");
			query.append("'"+metric.getDescription()+"',");
			query.append("'"+metric.getStatus()+"',");
			query.append("'"+valid8r.getEpoch()+"',");
			query.append("'"+metric.getCreatedBy()+"'");
			query.append(")");
			LOGGER.log(Level.INFO, query.toString());
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();
			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			
			
			/* 
			 * link metrics to newly created module
			 */
			query = new StringBuffer("");
			Long[]keys = metric.getPrograms();
			for (int i=0;i<keys.length;i++) {
				
				if (keys[i]!=null) {
					query = new StringBuffer("");
					query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_program_metric` ");
					query.append("(");
					query.append("`metric_id`,");
					query.append("`program_id`)");
					query.append(" VALUES (");
					query.append(key+",");
					query.append(keys[i]);
					query.append(")");
					LOGGER.log(Level.INFO, query.toString());
					Stmt = Conn.prepareStatement(query.toString());
					Stmt.executeUpdate(query.toString());
				}
			}
			Stmt.close();
			Conn.close();

		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return key;
	}

	
	public Long insertModule(Module module, HttpSession session) {

		Long key = new Long("0");

		try {
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_modules` ");
			query.append("(");
			query.append("`module_name`,");
			query.append("`description`,");
			query.append("`status`,`meeting_days`,`meeting_times`,`instructor_id`,`meeting_location`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			query.append("'"+module.getModuleName()+"',");
			query.append("'"+module.getDescription()+"',");
			query.append("'"+module.getStatus()+"',");
			query.append("'"+module.getMeetingDays()+"',");
			query.append("'"+module.getMeetingTimes()+"',");
			query.append(""+module.getInstructorId()+",");
			query.append("'"+module.getMeetingLocation()+"',");
			query.append("'"+valid8r.getEpoch()+"',");
			query.append("'"+module.getCreatedBy()+"'");
			query.append(")");
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();
			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			/* 
			 * link metrics to newly created module
			 */
			Long[]keys = module.getMetricId();
			for (int i=0;i<keys.length;i++) {
				
				if (keys[i]!=null) {
					query = new StringBuffer("");
					query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_program_metric_modules` ");
					query.append("(");
					query.append("`metric_id`,");
					query.append("`module_id`,");
					query.append("`status`) ");
					query.append(" VALUES (");
					query.append(keys[i]+",");
					query.append(key+",");
					query.append("'ACTIVE'");
					query.append(")");
					Stmt = Conn.prepareStatement(query.toString());
					Stmt.executeUpdate(query.toString());
				}
			}
			
			
			Stmt.close();
			Conn.close();

		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return key;
	}
	
	public Department getDepartment(Long key, HttpSession session) {
		
		Department p = new Department();
		
		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT DEPARTMENT_ID, FARM_BASE, TITLE, CREATION_DATE, CREATED_BY FROM `"+this.getDatabase()+"`.`cwt_department` ");
			query.append(" WHERE DEPARTMENT_ID="+key);
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			while (RS.next()) {
				
				p.setDepartmentId(RS.getLong(1));
				p.setFarmBase(RS.getString(2));
				p.setTitle(RS.getString(3));
				p.setCreationDate(RS.getString(4));
				p.setCreatedBy(RS.getString(5));
			}
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		return p;	
	}
	public ArrayList getDepartmentList(String farm, HttpSession session) {
		ArrayList list = new ArrayList();
		
		try {
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT DEPARTMENT_ID, FARM_BASE, TITLE, CREATION_DATE, CREATED_BY FROM `"+this.getDatabase()+"`.`cwt_department` ");
			if (farm.length()>0)
				query.append(" WHERE FARM_BASE='"+farm+"' ");
			
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			
			while (RS.next()) {
				Department p = new Department();
				p.setDepartmentId(RS.getLong(1));
				p.setFarmBase(RS.getString(2));
				p.setTitle(RS.getString(3));
				p.setCreationDate(RS.getString(4));
				p.setCreatedBy(RS.getString(5));
				list.add(p);			
			}
			session.setAttribute("department_results", list);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
	
	return list;	
	}
	public Long insertDepartment(Department d, HttpSession session) {
		Long key = new Long("0");

		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_department` ");
			query.append("(`farm_base`,");
			query.append("`title`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			query.append("'"+d.getFarmBase()+"',");
			query.append("'"+d.getTitle()+"',");
			query.append("'"+valid8r.getEpoch()+"',");
			query.append("'"+d.getCreatedBy()+"'");
			query.append(")");
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();
			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			Stmt.close();
			Conn.close();

		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
		}
		return key;
	}	
	
	public Job getJob(Long key, HttpSession session) {
		
		Job p = new Job();
		
		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT Job_ID, DEPARTMENT_ID, TITLE, DESCRIPTION, CREATION_DATE, CREATED_BY FROM `"+this.getDatabase()+"`.`cwt_Job` ");
			query.append(" WHERE Job_ID="+key);
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			while (RS.next()) {				
				p.setJobId(RS.getLong(1));
				p.setDescription(RS.getString(2));
				p.setTitle(RS.getString(3));
				p.setCreationDate(RS.getString(4));
				p.setCreatedBy(RS.getString(5));
			}
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		return p;	
	}
	public void getJobList(String farm, HttpSession session) {
	try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT Job_ID, cwt_job.DEPARTMENT_ID, cwt_department.TITLE, cwt_job.TITLE, DESCRIPTION, cwt_job.CREATION_DATE, cwt_job.CREATED_BY, FARM_BASE FROM `"+this.getDatabase()+"`.`cwt_Job` ");
			query.append("INNER JOIN `"+this.getDatabase()+"`.`cwt_DEPARTMENT` ON cwt_department.department_id=cwt_job.department_id ");
			if (farm.length()>0)
				query.append(" WHERE FARM_BASE='"+farm+"' ");
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			ArrayList list = new ArrayList();
			
			while (RS.next()) {
				Job p = new Job();
				p.setJobId(RS.getLong(1));
				p.setDepartmentId(RS.getLong(2));
				p.setDepartmentTitle(RS.getString(3));
				p.setTitle(RS.getString(4));
				p.setDescription(RS.getString(5));
				p.setCreationDate(RS.getString(6));
				p.setCreatedBy(RS.getString(7));
				p.setFarmBase(RS.getString(8));
				list.add(p);			
			}
			session.setAttribute("job_results", list);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
			
	}
	public Long insertJob(Job d, HttpSession session) {
		Long key = new Long("0");

		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_Job` ");
			query.append("(");
			query.append("`department_id`,");
			query.append("`title`,");
			query.append("`description`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			query.append(d.getDepartmentId()+",");
			query.append("'"+d.getTitle()+"',");
			query.append("'"+d.getDescription()+"',");
			query.append("'"+valid8r.getEpoch()+"',");
			query.append("'"+d.getCreatedBy()+"'");
			query.append(")");
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();
			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			
			/* 
			 * link metrics to newly created module
			 */
			Long[]keys = d.getMetricId();
			for (int i=0;i<keys.length;i++) {
				
				if (keys[i]!=null) {
					query = new StringBuffer("");
					query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_job_metric` ");
					query.append("(");
					query.append("`metric_id`,");
					query.append("`job_id`) ");
					query.append(" VALUES (");
					query.append(keys[i]+",");
					query.append(key+") ");
					Stmt = Conn.prepareStatement(query.toString());
					Stmt.executeUpdate(query.toString());
				}
			}
			Stmt.close();
			Conn.close();

		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return key;
	}
	
	
	
	
	
	
	public Supervisor getSupervisor(Long key, HttpSession session) {
		
		Supervisor p = new Supervisor();
		
		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT SUPERVISOR_ID, DEPARTMENT_ID, FIRSTNAME, LASTNAME, TITLE, CREATION_DATE, CREATED_BY FROM `"+this.getDatabase()+"`.`cwt_Supervisor` ");
			query.append(" WHERE Supervisor_ID="+key);
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			while (RS.next()) {				
				p.setSupervisorId(RS.getLong(1));
				p.setDepartmentId(RS.getLong(2));
				p.setFirstname(RS.getString(3));
				p.setLastname(RS.getString(4));
				p.setLastname(RS.getString(5));
				p.setCreationDate(RS.getString(6));
				p.setCreatedBy(RS.getString(7));
			}
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		return p;	
	}
	public void getSupervisorList(HttpSession session) {
	try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT SUPERVISOR_ID, cwt_Supervisor.DEPARTMENT_ID, FIRSTNAME, LASTNAME, cwt_job.title, cwt_Supervisor.CREATION_DATE, cwt_Supervisor.CREATED_BY, CWT_DEPARTMENT.TITLE, CWT_DEPARTMENT.FARM_BASE ");
			query.append(" FROM `"+this.getDatabase()+"`.`cwt_Supervisor` INNER JOIN `"+this.getDatabase()+"`.`cwt_job` ");
			query.append(" ON cwt_supervisor.job_id=cwt_job.job_id ");
			query.append(" INNER JOIN `"+this.getDatabase()+"`.`cwt_department` ");
			query.append(" ON cwt_job.department_id=cwt_department.department_id ");
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
			
			ArrayList list = new ArrayList();
			
			while (RS.next()) {
				Supervisor p = new Supervisor();
				p.setSupervisorId(RS.getLong(1));
				p.setDepartmentId(RS.getLong(2));
				p.setFirstname(RS.getString(3));
				p.setLastname(RS.getString(4));
				p.setTitle(RS.getString(5));
				p.setCreationDate(RS.getString(6));
				p.setCreatedBy(RS.getString(7));
				p.setDepartmentTitle(RS.getString(8));
				p.setFarmBase(RS.getString(9));
				list.add(p);			
			}
			session.setAttribute("Supervisor_results", list);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
			
	}
	public Long insertSupervisor(Supervisor d,HttpSession session) {
		Long key = new Long("0");

		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+this.getDatabase()+"`.`cwt_supervisor` ");
			query.append("(");
			query.append("`department_id`,");
			query.append("`firstname`,");
			query.append("`lastname`,");
			query.append("`job_id`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			query.append("'"+d.getDepartmentId()+"',");
			query.append("'"+d.getFirstname()+"',");
			query.append("'"+d.getLastname()+"',");
			query.append("'"+d.getJobId()+"',");
			query.append("'"+valid8r.getEpoch()+"',");
			query.append("'"+d.getCreatedBy()+"'");
			query.append(")");
			
			PreparedStatement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString(),
					Stmt.RETURN_GENERATED_KEYS);
			
			Stmt.executeUpdate(query.toString());

			ResultSet generatedKeys = Stmt.getGeneratedKeys();
			if (generatedKeys.next())
				key = generatedKeys.getLong(1);

			Stmt.close();
			Conn.close();

		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return key;
	}
	public Module getModule(Long key, HttpSession session) {

		Module module=new Module();
		
		try {
		
			Connection Conn = this.getConnection();
			StringBuffer query = new StringBuffer();

			query.append("SELECT MODULE_ID, MODULE_NAME, DESCRIPTION, STATUS, CWT_MODULES.CREATION_DATE, CWT_MODULES.CREATED_BY, MEETING_DAYS, MEETING_TIMES, ");
			query.append(" INSTRUCTOR_ID, MEETING_LOCATION, CONCAT (FIRSTNAME,' ',LASTNAME) as NAME FROM `"+this.getDatabase()+"`.`CWT_MODULES` ");
			query.append(" INNER JOIN `"+this.getDatabase()+"`.cwt_supervisor ");
			query.append(" ON cwt_supervisor.supervisor_id=cwt_modules.instructor_id ");
			
			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query.toString());
			ResultSet RS = Stmt.executeQuery(query.toString());
						
			if (RS.next())
				if (RS.isFirst()) {
					module.setModuleId(RS.getLong(1));
					module.setModuleName(RS.getString(2));
					module.setDescription(RS.getString(3));
					module.setStatus(RS.getString(4));
					module.setCreationDate(RS.getString(5));
					module.setCreatedBy(RS.getString(6));
					module.setMeetingDays(RS.getString(7));
					module.setMeetingTimes(RS.getString(8));
					module.setInstructorId(RS.getLong(9));
					module.setMeetingLocation(RS.getString(10));
					module.setInstructorName(RS.getString(11));
				}
			
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
	return module;	
	}
	
	public ArrayList getModuleRoster(Long id, HttpSession session) {
		
		ArrayList list = new ArrayList();
		
		try {
		
			Connection Conn = this.getConnection();
			
			String query= ""+
			"	SELECT DISTINCT INTAKE.INTAKE_ID, CONCAT(INTAKE.FIRSTNAME,' ',INTAKE.LASTNAME) AS STUDENT, CWT_JOB.TITLE, INTAKE.ENTRY_DATE, " +
			"		CWT_DEPARTMENT.TITLE, CONCAT(CWT_SUPERVISOR.FIRSTNAME,' ',CWT_SUPERVISOR.LASTNAME) AS SUPERVISOR " +
			"   FROM CWT_MODULES INNER JOIN CWT_PROGRAM_METRIC_MODULES" + 
			"		ON CWT_MODULES.MODULE_ID=CWT_PROGRAM_METRIC_MODULES.MODULE_ID" +
			"	INNER JOIN CWT_JOB_METRIC" +
			"		ON CWT_JOB_METRIC.METRIC_ID=CWT_PROGRAM_METRIC_MODULES.METRIC_ID" +
			"	INNER JOIN CWT_JOB" +
			"		ON CWT_JOB.JOB_ID = CWT_JOB_METRIC.JOB_ID" +
			"	INNER JOIN INTAKE" +
			"	    ON INTAKE.JOB_ID = CWT_JOB.JOB_ID" +
			"	INNER JOIN STUDENT_HISTORY" +
			"	    ON INTAKE.INTAKE_ID=STUDENT_HISTORY.INTAKE_ID" +
			"	INNER JOIN CWT_DEPARTMENT" +
			"	    ON INTAKE.DEPARTMENT_ID=CWT_DEPARTMENT.DEPARTMENT_ID" +
			"	INNER JOIN CWT_SUPERVISOR" +
			"		ON CWT_SUPERVISOR.DEPARTMENT_ID=CWT_DEPARTMENT.DEPARTMENT_ID" +
			"	WHERE " +
			"		STUDENT_HISTORY.PROGRAM_STATUS='IN PROGRAM'" +
			"       AND CWT_MODULES.MODULE_ID=" + id;

			Statement Stmt = null;
			Stmt = Conn.prepareStatement(query);
			ResultSet rs = Stmt.executeQuery(query);
						
			while (rs.next()) {
					ModuleRoster roster=new ModuleRoster();
					roster.setIntakeId(rs.getLong(1));
					roster.setStudentName(rs.getString(2));
					roster.setJobTitle(rs.getString(3));
					roster.setEntryDate(rs.getString(4));
					roster.setDepartment(rs.getString(5));
					roster.setSupervisor(rs.getString(6));	
					list.add(roster);
			}
			
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			LOGGER.log(Level.SEVERE, E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		return list;
	}
	
	public Validator getValid8r() {
		return valid8r;
	}
	public void setValid8r(Validator valid8r) {
		this.valid8r = valid8r;
	}
	public String getSERVER() {
		return SERVER;
	}
	public void setSERVER(String sERVER) {
		SERVER = sERVER;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
