/*
 * DynamicJasper: A library for creating reports dynamically by specifying
 * columns, groups, styles, etc. at runtime. It also saves a lot of development
 * time in many cases! (http://sourceforge.net/projects/dynamicjasper)
 *
 * Copyright (C) 2008  FDV Solutions (http://www.fdvsolutions.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 *
 * License as published by the Free Software Foundation; either
 *
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *
 */

package org.faithfarm.reporting;


import java.awt.Color;
import java.text.Format;
import java.util.Date;
import java.util.Map;

import net.sf.jasperreports.view.JasperDesignViewer;
import net.sf.jasperreports.view.JasperViewer;

import org.faithfarm.util.Validator;
import org.jfree.ui.Align;

import ar.com.fdvs.dj.domain.DJCalculation;
import ar.com.fdvs.dj.domain.DJValueFormatter;
import ar.com.fdvs.dj.domain.DynamicReport;
import ar.com.fdvs.dj.domain.ImageBanner;
import ar.com.fdvs.dj.domain.Style;
import ar.com.fdvs.dj.domain.builders.ColumnBuilder;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import ar.com.fdvs.dj.domain.constants.Font;
import ar.com.fdvs.dj.domain.constants.ImageScaleMode;
import ar.com.fdvs.dj.domain.entities.columns.AbstractColumn;
import ar.com.fdvs.dj.domain.constants.HorizontalAlign;

public class FastReportTest extends BaseDjReportTest {

	private static Validator valid8r = new Validator();

	public DynamicReport buildReport() throws Exception {


		/**
		 * Creates the DynamicReportBuilder and sets the basic options for
		 * the report
		 */
		FastReportBuilder drb = new FastReportBuilder();
		Style tStyle = new Style();
		Style headerStyle = new Style();
		headerStyle.setBackgroundColor(Color.cyan);
		
		Font font = new Font();
		font.setFontName("Arial");
		font.setFontSize(10);
		headerStyle.setFont(font);
		headerStyle.setHorizontalAlign(HorizontalAlign.LEFT);
		tStyle.setFont(Font.ARIAL_BIG_BOLD);
		tStyle.setTextColor(Color.BLUE);
		
		AbstractColumn columnName = ColumnBuilder.getNew().setColumnProperty("name", String.class.getName())
			.setTitle("Orientation")
			.setStyle(headerStyle).build();

		AbstractColumn columnEntryDate = ColumnBuilder.getNew().setColumnProperty("entryDate", String.class.getName())
				.setTitle("")
				.setStyle(headerStyle).build();

				
			/*drb.addColumn("State", "state", String.class.getName(),30)
			.addColumn("Branch", "branch", String.class.getName(),30)
			.addColumn("Product Line", "productLine", String.class.getName(),50)
			.addColumn("Item", "item", String.class.getName(),50)
			.addColumn("Item Code", "id", Long.class.getName(),30,true)
			.addColumn("Quantity", "quantity", Long.class.getName(),60,true)
			.addColumn("Amount", "amount", Float.class.getName(),70,true)*/
		 	drb
		 	.addColumn(columnName)
		 	.addColumn(columnEntryDate)
		 	//.addColumn("Student Name","name", String.class.getName(),40)
		    //.addColumn("Entry Date","entryDate", String.class.getName(),30)		
			//.addGroups(0)
			.addImageBanner(System.getProperty("user.dir") +"/WebContent/generated/reports/images/logo.jpg", new Integer(120), new Integer(76), ImageBanner.ALIGN_LEFT, ImageScaleMode.FILL)
        	.setTitle("Class List")
        	.setTitleStyle(tStyle)
        	
			.setSubtitle("Boynton Beach on " + valid8r.convertDate(new Date().toString()))
			.setPrintBackgroundOnOddRows(true)			
			.setUseFullPageWidth(true);   

		drb.addGlobalFooterVariable(drb.getColumn(1), DJCalculation.COUNT, null, new DJValueFormatter() {

            public String getClassName() {
                return String.class.getName();
            }


            public Object evaluate(Object value, Map fields, Map variables,   Map parameters) {
                return (value == null ? "0" : value.toString()) + " Students";
            }
        });


		DynamicReport dr = drb.build();

		return dr;
	}

	public static void main(String[] args) throws Exception {
		FastReportTest test = new FastReportTest();
		test.testReport();
		test.exportToJRXML();
		JasperViewer.viewReport(test.jp);	//finally display the report report
		JasperDesignViewer.viewReportDesign(test.jr);
	}

}
