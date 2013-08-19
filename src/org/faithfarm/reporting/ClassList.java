package org.faithfarm.reporting;

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



import static net.sf.dynamicreports.report.builder.DynamicReports.col;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import static net.sf.dynamicreports.report.builder.DynamicReports.type;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.definition.datatype.DRIDataType;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.components.table.Column;
import net.sf.jasperreports.engine.JRDataSource;

import org.faithfarm.domain.Intake;
import org.faithfarm.service.data.StudentDao;
import org.faithfarm.util.Validator;

/**
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 */
public class ClassList {

	private StudentDao dao = new StudentDao();
	private static Validator valid8r = new Validator();

	public ClassList() {
		build();
	}

	private void build() {
		
	  try {
			JasperReportBuilder report = report();
			report.addColumn(col.column("Student", "",  (DRIDataType) type.detectType("string")));
			report.addColumn(col.column("Entry Date", "",  (DRIDataType) type.detectType("string")));
			report.setDataSource(createDataSource());
			report.show();
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
			dataSource.add(firstName+" "+lastName+"   "+valid8r.convertDate(entryDate), new Date(), 1, new BigDecimal(500));
		}
		return dataSource;
	}

	public static void main(String[] args) {
		new ClassList();
	}
}