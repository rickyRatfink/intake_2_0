/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2013 Ricardo Mariaca
 * http://www.dynamicreports.org
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package org.faithfarm.reporting;

import static net.sf.dynamicreports.report.builder.DynamicReports.col;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import static net.sf.dynamicreports.report.builder.DynamicReports.type;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import net.sf.dynamicreports.examples.Templates;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.definition.datatype.DRIDataType;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRDataSource;

import org.faithfarm.domain.Intake;
import org.faithfarm.service.data.StudentDao;
import org.faithfarm.util.Validator;

/**
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 */
public class TestRpt {

	public TestRpt() {
		build();
	}
	
	private StudentDao dao = new StudentDao();
	private static Validator valid8r = new Validator();
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void build() {
		
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
			  //.toHtml(outputStream);
			  .show();
		} catch (DRException e) {
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

	public static void main(String[] args) {
		new TestRpt();
	}
}