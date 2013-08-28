package org.faithfarm.intake;
import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.faithfarm.service.data.StudentDao;

public class UploadImage {
	
	private StudentDao dao = new StudentDao();
	
	public String uploadImage(HttpServletRequest request, HttpServletResponse response) {
		String finalimage="";
		
		
	return finalimage;
	}
}