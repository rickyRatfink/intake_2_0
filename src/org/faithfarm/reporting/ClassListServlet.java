package org.faithfarm.reporting;

import static net.sf.dynamicreports.report.builder.DynamicReports.col;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import static net.sf.dynamicreports.report.builder.DynamicReports.type;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.dynamicreports.examples.Templates;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.definition.datatype.DRIDataType;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRDataSource;

import org.faithfarm.domain.Intake;
import org.faithfarm.service.data.StudentDao;
import org.faithfarm.util.Validator;


public class ClassListServlet extends HttpServlet {

	private StudentDao dao = new StudentDao();
	private static Validator valid8r = new Validator();

	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			   throws ServletException, IOException
			   {
			      HttpSession session = req.getSession(true);
			      build(resp);  
			      
	 }
	 
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			 throws ServletException, IOException
			 {
			     doGet(req, resp);
			 }
	 
	 private void build( HttpServletResponse resp) {
			
			try {
				JasperReportBuilder report = report();
				
				for (Column column : createColumns()) {
					report.addColumn(col.column(column.title, column.field, (DRIDataType) type.detectType(column.dataType)));
				}
				report
				  .setTemplate(Templates.reportTemplate)
				  .title(Templates.createTitleComponent("Class List (Boynton Beach)"))
				  
				  .pageFooter(Templates.footerComponent)
				  .setDataSource(createDataSource())
				  .toHtml(resp.getOutputStream())
				  .show();
			} catch (DRException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

		private JRDataSource createDataSource() {
			DRDataSource dataSource = new DRDataSource("Student", "Entry Date");
			
			ArrayList list = dao.getClassList("Orientation","BOYNTON BEACH");
			
			for (int i=0;i<list.size();i++) {	
				Intake intake = (Intake)list.get(i);
				String firstName=intake.getFirstName();
				String lastName=intake.getLastName();
				String entryDate=intake.getEntryDate();
				dataSource.add(firstName+" "+lastName,valid8r.convertDate(entryDate));
			}
			return dataSource;
		}

		private List<Column> createColumns() {
			List<Column> columns = new ArrayList<Column>();
			columns.add(new Column("Student",        "Student",      "string"));//dataType = "String", "STRING", "java.lang.String", "text"
			columns.add(new Column("Entry Date",    "Entry Date",  "string"));//dataType = "Integer", "INTEGER", "java.lang.Integer"
			return columns;
		}

		private class Column {
			private String title;
			private String field;
			private String dataType;

			private Column(String title, String field, String dataType) {
				this.title = title;
				this.field = field;
				this.dataType = dataType;
			}
		}
}
