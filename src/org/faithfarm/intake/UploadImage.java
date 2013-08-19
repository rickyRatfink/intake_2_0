package org.faithfarm.intake;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.*;
import org.faithfarm.service.data.StudentDao;

import javax.servlet.*;
import javax.servlet.http.*;

public class UploadImage {
	
	private StudentDao dao = new StudentDao();
	
	public String uploadImage(HttpServletRequest request, HttpServletResponse response) {
		String finalimage="";
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		System.out.println("request: "+request);
		if (!isMultipart) {
			System.out.println("File Not Uploaded");
		} else {
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			List items = null;

			try {
				items = upload.parseRequest(request);
				System.out.println("items: "+items);
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
			Iterator itr = items.iterator();
			while (itr.hasNext()) {
				FileItem item = (FileItem) itr.next();
				if (item.isFormField()){
					String name = item.getFieldName();
					System.out.println("name: "+name);
					String value = item.getString();
					System.out.println("value: "+value);
				} else {
					try {
						String itemName = item.getName();
						Random generator = new Random();
						int r = Math.abs(generator.nextInt());

						String reg = "[.*]";
						String replacingtext = "";
						System.out.println("Text before replacing is:-" + itemName);
						Pattern pattern = Pattern.compile(reg);
						Matcher matcher = pattern.matcher(itemName);
						StringBuffer buffer = new StringBuffer();

						while (matcher.find()) {
							matcher.appendReplacement(buffer, replacingtext);
						}
						int IndexOf = itemName.indexOf("."); 
						String domainName = itemName.substring(IndexOf);
						System.out.println("domainName: "+domainName);

						finalimage = buffer.toString()+"_"+r+domainName;
						System.out.println("Final Image==="+finalimage);

						

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	return finalimage;
	}
}