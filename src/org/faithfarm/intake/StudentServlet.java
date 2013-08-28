package org.faithfarm.intake;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.faithfarm.domain.CourseRotationHistory;
import org.faithfarm.domain.Intake;
import org.faithfarm.domain.StudentHistory;
import org.faithfarm.domain.SystemUser;
import org.faithfarm.service.data.IntakeDao;
import org.faithfarm.service.data.StudentDao;
import org.faithfarm.util.Validator;
@MultipartConfig
public class StudentServlet extends HttpServlet {

	private StudentDao dao = new StudentDao();
	private IntakeDao idao = new IntakeDao();
	private static SystemUser systemUser = new SystemUser();
	private static Validator valid8r = new Validator();
    private static String imagefile = "";
    
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			   throws ServletException, IOException
			   {
			      HttpSession session = req.getSession(true);
			      SystemUser user = (SystemUser)session.getAttribute("USER_"+session.getId());
			      String url="";
			      
			      String action = req.getParameter("action");
			     
			      
			      if ("Apps".equals(action)) {
			    	  GridServlet.setFirstName("");
			    	  GridServlet.setLastName("");
			    	  GridServlet.setEntryDate("");
			    	  GridServlet.setExitDate("");
			    	  GridServlet.setSsn("");
			    	  GridServlet.setDob("");
			    	  GridServlet.setFarm("ALL");
			    	  GridServlet.setPictureFlag("");
			    	  GridServlet.setArchivedFlag("");
			    	  GridServlet.setGedFlag("");
			    	 
			    	  url="pages/applications/results.jsp";
			      } else if ("Search Students".equals(action)) {
			    	  IntakeServlet.setIntake(new Intake());
			    	  
			    	  String ssn1=valid8r.cleanData(req.getParameter("ssn1"));
			    	  String ssn2=valid8r.cleanData(req.getParameter("ssn2"));
			    	  String ssn3=valid8r.cleanData(req.getParameter("ssn3"));
			    	 
			    	  GridServlet.setFirstName(valid8r.cleanData(req.getParameter("firstName")));
			    	  GridServlet.setLastName(valid8r.cleanData(req.getParameter("lastName")));
			    	  GridServlet.setEntryDate(valid8r.cleanData(req.getParameter("entryDate")));
			    	  GridServlet.setExitDate(valid8r.cleanData(req.getParameter("exitDate")));
			    	  GridServlet.setSsn(ssn1+ssn2+ssn3);
			    	  GridServlet.setDob(valid8r.cleanData(req.getParameter("dob")));
			    	  GridServlet.setFarm(valid8r.cleanData(req.getParameter("farm")));
			    	  GridServlet.setPictureFlag(valid8r.cleanData(req.getParameter("pictureFlag")));
			    	  GridServlet.setArchivedFlag(valid8r.cleanData(req.getParameter("archivedFlag")));
			    	  GridServlet.setGedFlag(valid8r.cleanData(req.getParameter("gedFlag")));
			    	  //dao.searchStudents(firstName, lastName, beginDate, endDate, ssn, dob, farm, pictureFlag, archivedFlag, gedFlag, session);
			    	  url="pages/student/results.jsp";
			      } else if ("View/Edit".equals(action)) {
			    	  String key=req.getParameter("key");
			    	  Intake intake=dao.getStudent(key, session);
			    	  //intake.setStudentPhoto(dao.getStudentPhoto(intake.getIntakeId()));
			    	  
			    	  IntakeServlet.setIntake(intake);
			    	  IntakeServlet.loadDropDownLists(session);
			    	  req.setAttribute("updateFlag", "YES");
			    	  url="pages/student/personal.jsp?upateFlag=YES";
			      }
			      else if ("Create Student".equals(action)) {
			    	  Intake intake=new Intake();
			    	  ArrayList list = new ArrayList();
			    	  StudentHistory history = new StudentHistory();
			    	  list.add(history);
			    	  IntakeServlet.setIntake(intake);
			    	  IntakeServlet.getIntake().setHistory(list);
			    	  //IntakeServlet.getIntake().setStudentHistory(history);
			    	  
			    	  IntakeServlet.loadDropDownLists(session);
			    	  url="pages/student/personal.jsp";
			      }
			      else if ("Upload".equals(action)) {
			    	  String imageLocation=this.uploadImage(req, resp);
			    	  System.out.println ("img="+imageLocation);
			    	  InputStream inputStream = new FileInputStream(new File(imageLocation));
			    	  //IntakeServlet.getIntake().setImageUrl(imagefile);
			    	  dao.updateImage(imagefile, IntakeServlet.getIntake().getIntakeId(), session);
			    	  url="pages/student/personal.jsp";
			      }
			      else if ("ClassList".equals(action)) {
			    	  IntakeServlet.setIntake(new Intake());
			    	  
			    	  String farm = req.getParameter("farm");
			    	  ArrayList list0 = dao.getClassList("Orientation", farm);
			    	  session.setAttribute("classlist_0", list0);
			    	  
			    	  ArrayList list1 = dao.getClassList("1", farm);
			    	  session.setAttribute("classlist_1", list1);
			    	  
			    	  ArrayList list2 = dao.getClassList("2", farm);
			    	  session.setAttribute("classlist_2", list2);
			    	  
			    	  ArrayList list3 = dao.getClassList("3", farm);
			    	  session.setAttribute("classlist_3", list3);
			    	  
			    	  ArrayList list4 = dao.getClassList("4", farm);
			    	  session.setAttribute("classlist_4", list4);
			    	  
			    	  ArrayList list5 = dao.getClassList("5", farm);
			    	  session.setAttribute("classlist_5", list5);
			    	  
			    	  ArrayList list6 = dao.getClassList("6", farm);
			    	  session.setAttribute("classlist_6", list6);
			    	  
			    	  ArrayList list7 = dao.getClassList("Fresh Start", farm);
			    	  session.setAttribute("classlist_7", list7);
			    	  
			    	  ArrayList list8 = dao.getClassList("Interns", farm);
			    	  session.setAttribute("classlist_8", list8);
			    	  
			    	  ArrayList list9 = dao.getClassList("SLS", farm);
			    	  session.setAttribute("classlist_9", list9);
			    	  
			    	  ArrayList list10 = dao.getClassList("Student Teacher", farm);
			    	  session.setAttribute("classlist_10", list10);
			    	  
			    	  url="pages/reports/class_list.jsp?farm="+farm;
			      }
			      else if ("Rotate".equals(action)) {
			    	  String farm = req.getParameter("farm");
			    	  ArrayList class0 = dao.getClassList("Orientation", farm);
			    	  ArrayList class1 = dao.getClassList("1", farm);
			    	  ArrayList class2 = dao.getClassList("2", farm);
			    	  ArrayList class3 = dao.getClassList("3", farm);
			    	  ArrayList class4 = dao.getClassList("4", farm);
			    	  ArrayList class5 = dao.getClassList("5", farm);
			    	  ArrayList class6 = dao.getClassList("6", farm);
			    	  session.setAttribute("classlist_0", class0);
			    	  session.setAttribute("classlist_1", class1);
			    	  session.setAttribute("classlist_2", class2);
			    	  session.setAttribute("classlist_3", class3);
			    	  session.setAttribute("classlist_4", class4);
			    	  session.setAttribute("classlist_5", class5);
			    	  session.setAttribute("classlist_6", class6);
			    	  int totalStudents = class0.size()+class1.size()+class2.size()+class3.size()+class4.size()+class6.size();
			    	  
			    	  ArrayList list = idao.getRotationHistory(session);
			    	  if (list.size()>0) {
			    		  CourseRotationHistory history = (CourseRotationHistory)list.get(0);
			    		  Long ldate = new Long(history.getRotationDate());
			    		  history.setRotationDate(valid8r.convertEpoch(ldate));
			    		  session.setAttribute("history_stats", history);
			    		  session.setAttribute("total_students", totalStudents);
			    	  }
			    	  
			    	  url="pages/student/rotate.jsp?farm="+farm;
			      } 
			      else if ("Rotate Students".equals(action)) {
			    	  String farm = req.getParameter("farm");
			    	  int move_0_to_1=0,move_1_to_2=0,move_2_to_3=0,move_3_to_4=0,move_4_to_5=0,move_5_to_6=0, held=0, graduated=0;
			    	  int held0=0,held1=0,held2=0,held3=0,held4=0,held5=0,held6=0;
			    	  
			    	  String sClass="";
 
			    	  for (int c=6;c>-1;c--) {
			    		  if (c==0) sClass="Orientation";
			    		  else sClass=c+"";
			    		  
				    	  ArrayList classRoster=dao.getClassList(sClass, farm);
				    	  for (int i=0;i<classRoster.size();i++) {
				    		  
				    		  Intake intake = (Intake)classRoster.get(i);
				    		  String rotateFlag = req.getParameter("key_"+intake.getIntakeId());			    		  
				    		  if ("YES".equals(rotateFlag)) {
				    			  if (c==6) {
				    				  intake.setCurrentClass("");
				    				  ++graduated;
				    			  } else {
				    				  intake.setCurrentClass((c+1)+"");
				    				  if (c==0)
				    					  ++move_0_to_1;
				    				  if (c==1)
				    					  ++move_1_to_2;
				    				  if (c==2)
				    					  ++move_2_to_3;
				    				  if (c==3)
				    					  ++move_3_to_4;
				    				  if (c==4)
				    					  ++move_4_to_5;
				    				  if (c==5)
				    					  ++move_5_to_6;
				    			  }	 
				    			  
				    			  idao.updateClass(intake, session);
				    		  } else { 
				    			  if (c==0)
				    				  ++held0;
				    			  if (c==1)
				    				  ++held1;
				    			  if (c==2)
				    				  ++held2;
				    			  if (c==3)
				    				  ++held3;
				    			  if (c==4)
				    				  ++held4;
				    			  if (c==5)
				    				  ++held5;
				    			  if (c==6)
				    				  ++held6;
				    		  }//end YES if
				    	  }//end i loop
			    	  }// end c loop
			        idao.updateClassRotationHistory(move_0_to_1, move_1_to_2, move_2_to_3, move_3_to_4, move_4_to_5, move_5_to_6, graduated, 
			        		held0, held1, held2, held3, held4, held5, held6, user.getUsername() , session);
			    	url="pages/cwt/index.jsp";
				   
			      }
			  	req.getRequestDispatcher("/"+url).forward(req, resp);
			  	}
	 
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			 throws ServletException, IOException
			 {
			     doGet(req, resp);
			 }
	 
	 private String uploadImage(HttpServletRequest request,
		        HttpServletResponse response)
		        throws ServletException, IOException {
		    response.setContentType("text/html;charset=UTF-8");

		    // Create path components to save the file
		    
		    
		    String path="";
		    Properties prop = new Properties();
		    
		    try {
	               //load a properties file
	    		//prop.load(new FileInputStream("c:\\development\\workspace\\intake_2_0\\src\\properties\\config.properties"));
	    		prop.load(new FileInputStream("c:\\properties\\config.properties"));
	    		path = prop.getProperty("photo_path"); 
	    	} catch (IOException ex) {
	    		System.out.println (ex.getMessage());
	    		ex.printStackTrace();
	        }
		    //final String path = "C:\\development\\workspace\\intake_2_0\\WebContent\\photos";
		    final Part filePart = request.getPart("file");
		    final String fileName = getFileName(filePart);

		    OutputStream out = null;
		    InputStream filecontent = null;
		    //final PrintWriter writer = response.getWriter();

		    try {
		        out = new FileOutputStream(new File(path + File.separator
		                + fileName));
		        filecontent = filePart.getInputStream();

		        int read = 0;
		        final byte[] bytes = new byte[1024];

		        while ((read = filecontent.read(bytes)) != -1) {
		            out.write(bytes, 0, read);
		        }
		        //writer.println("New file " + fileName + " created at " + path);
		        //LOGGER.log(Level.INFO, new Object[]{fileName, path});
		    } catch (FileNotFoundException fne) {
		        //writer.println("You either did not specify a file to upload or are "
		        //        + "trying to upload a file to a protected or nonexistent "
		        //        + "location.");
		        //writer.println("<br/> ERROR: " + fne.getMessage());

		       // LOGGER.log(Level.DEBUG, new Object[]{fne.getMessage()});
		    } finally {
		        if (out != null) {
		            out.close();
		        }
		        if (filecontent != null) {
		            filecontent.close();
		        }
		        //if (writer != null) {
		        //    writer.close();
		        //}
		    }
		    this.setImagefile(fileName);
		    return path+"\\"+fileName;
		}

	   private String getFileName(final Part part) {
		    final String partHeader = part.getHeader("content-disposition");
		    //LOGGER.log(Level.INFO,  partHeader);
		    for (String content : part.getHeader("content-disposition").split(";")) {
		        if (content.trim().startsWith("filename")) {
		            return content.substring(
		                    content.indexOf('=') + 1).trim().replace("\"", "");
		        }
		    }
		    return null;
		}

	public static String getImagefile() {
		return imagefile;
	}

	public static void setImagefile(String imagefile) {
		StudentServlet.imagefile = imagefile;
	}
	   
}

