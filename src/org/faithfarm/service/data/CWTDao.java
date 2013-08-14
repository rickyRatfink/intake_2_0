package org.faithfarm.service.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.faithfarm.domain.Metric;
import org.faithfarm.domain.Module;
import org.faithfarm.domain.Program;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.util.Validator;

//import com.mysql.jdbc.PreparedStatement;

public class CWTDao {

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

	public Long insertProgram(Program program, HttpSession session) {

		Long key = new Long("0");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + SERVER + "", "root",
					"admin");

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+SERVER+"`.`cwt_program` ");
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
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		return key;
	}


	public void getProgramList(HttpSession session) {

		
		try {
		
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT PROGRAM_ID, PROGRAM_NAME, DESCRIPTION, STATUS, CREATION_DATE, CREATED_BY FROM `"+SERVER+"`.`cwt_program` ");
			
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
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	
	public void getMetricList(HttpSession session) {

		
		try {
			
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			//query.append("SELECT METRIC_ID, METRIC_NAME, DESCRIPTION, STATUS, CREATION_DATE, CREATED_BY FROM `"+SERVER+"`.`cwt_metrics` ");
			query.append("SELECT ");
			query.append("METRIC_ID, METRIC_NAME, CWT_PROGRAM.PROGRAM_ID, CWT_METRICS.DESCRIPTION,"); 
			query.append("CWT_METRICS.STATUS, CWT_METRICS.CREATION_DATE, CWT_METRICS.CREATED_BY ");
			query.append("FROM ");
			query.append("`"+SERVER+"`.`cwt_metrics` INNER JOIN `"+SERVER+"`.`cwt_program`");
			query.append("ON CWT_METRICS.PROGRAM_ID = CWT_PROGRAM.PROGRAM_ID ");
			
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
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void getPrograms(HttpSession session) {

		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + SERVER + "", "root",
					"admin");

			StringBuffer query = new StringBuffer();

			query.append("SELECT PROGRAM_ID, PROGRAM_NAME FROM `"+SERVER+"`.`cwt_program` ");
			
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
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		
	}

	
	public void getModuleList(HttpSession session) {

		
		try {
		
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT MODULE_ID, MODULE_NAME, DESCRIPTION, STATUS, CREATION_DATE, CREATED_BY FROM `"+SERVER+"`.`CWT_MODULES` ");
			
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
				list.add(p);			
			}
			session.setAttribute("module_results", list);
			Stmt.close();
			Conn.close();
		
		} catch (SQLException E) {
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		
	}

	
	public Program getProgram(Long id, HttpSession session) {

		Program p = new Program();
		
		try {
		
			Connection Conn = this.getConnection();

			StringBuffer query = new StringBuffer();

			query.append("SELECT * FROM `"+SERVER+"`.`cwt_program` WHERE PROGRAM_ID="+id);
			
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
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
	
		return p;
	}

	public void getMetrics(HttpSession session) {

		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + SERVER + "", "root",
					"admin");

			StringBuffer query = new StringBuffer();

			query.append("SELECT METRIC_ID, METRIC_NAME FROM `"+SERVER+"`.`cwt_metrics` ");
			
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
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		
	}

	
	
	public Long insertMetric(Metric metric, HttpSession session) {

		Long key = new Long("0");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + SERVER + "", "root",
					"admin");

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+SERVER+"`.`cwt_metrics` ");
			query.append("(");
			query.append("`program_id`,");
			query.append("`metric_name`,");
			query.append("`description`,");
			query.append("`status`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			query.append(""+metric.getProgramId()+",");
			query.append("'"+metric.getMetricName()+"',");
			query.append("'"+metric.getDescription()+"',");
			query.append("'"+metric.getStatus()+"',");
			query.append("'"+valid8r.getEpoch()+"',");
			query.append("'"+metric.getCreatedBy()+"'");
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
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		return key;
	}

	
	public Long insertModule(Module module, HttpSession session) {

		Long key = new Long("0");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection Conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + SERVER + "", "root",
					"admin");

			StringBuffer query = new StringBuffer();

			query.append("INSERT INTO `"+SERVER+"`.`cwt_modules` ");
			query.append("(");
			query.append("`module_name`,");
			query.append("`description`,");
			query.append("`status`,");
			query.append("`creation_date`,");
			query.append("`created_by`)");
			query.append(" VALUES (");
			query.append("'"+module.getModuleName()+"',");
			query.append("'"+module.getDescription()+"',");
			query.append("'"+module.getStatus()+"',");
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
					query.append("INSERT INTO `"+SERVER+"`.`cwt_program_metric_modules` ");
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
			System.out.println (E.getMessage());
			session.setAttribute("SYSTEM_ERROR", E.getMessage());
		} catch (ClassNotFoundException e) {
			session.setAttribute("SYSTEM_ERROR", e.getMessage());
			e.printStackTrace();
		}
		return key;
	}

}
