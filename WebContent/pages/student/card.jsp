<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="javax.crypto.spec.SecretKeySpec" %>
<%@ page import="javax.crypto.Cipher" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="org.faithfarm.domain.Intake" %>

<%

Validator v8r = new Validator();

Intake student = IntakeServlet.getIntake();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/styles/profile.css"  />
<title>Print Student/Intake Profile</title>

  	<script language="javascript">
	function printPage()
	{
	window.print();
	}
	
</script>
</head>
<body background="#FFFFFF" onLoad="javascript:print();">

<div align="left">
					<table width="700" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td valign="top" class="cardheading">
	                    	<b><%=student.getLastName()%>,&nbsp;<%=student.getFirstName()%>&nbsp;<%=student.getMiddleInitial()%>&nbsp;<%=student.getSuffix()%></b><br />
	            </td>
	            <td valign="top" class="cardheading">
	            <% //Format SSN with dashes
	               
	               String ssn="";
	               
	               try {
	            	   ssn = v8r.decryptSsn(student.getSsn());
	               } catch (Exception e) { ssn="N/A"; } 
	            
	            %>
	                      <b><%=ssn%></b>
	            <td valign="top" class="cardheading">
	                      <b><%=student.getDateOfBirth()%></b>
	            </td>
	            <td valign="top" class="cardheading">
	            <%
	            String sDate = "";
	            try {
		       		sDate = student.getEntryDate();
					java.util.Date nDate = new java.util.Date(sDate);
		        	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
		        	sDate = dateFormat.format(nDate);
		        } catch (Exception e) { sDate=""; }
			            
	            %>
	                      <b><%=sDate%></b>
	            </td>
	          </tr>
	          <tr>
							<td valign="top" class="cardheading">
	                    	Name(Last,First,MI)
	            </td>
	            <td valign="top" class="cardheading">
	                      Social Security Number
	            <td valign="top" class="cardheading">
	                      Birthdate
	            </td>
	            <td valign="top" class="cardheading">
	                      Entry Date
	            </td>
	          </tr>
	       </table>
         
         <table width="700" border="0" cellpadding="0" cellspacing="0">
					<tr>
              <td valign="top" align="left">
                    			<% 
                    			String imageUrl = "/img/person_photos/blank.gif";
                    			%>
                    			<img src="<%=imageUrl%>" border="1" width="180" height="180"/>
                    			
                    	</td>
                 <td valign="top">
          			<br/>
				 					<table width="500" border="0" cellpadding="0" cellspacing="0">
										<tr>
											<td width="10"></td>
											<td valign="top" class="cardheading">
					                    	<b><%=student.getAge()%>/<%=student.getHeight()%>/<%=student.getWeight()%>
					            </td>
					            <td valign="top" class="cardheading">
					            		<% if ("Yes".equals(student.getDriversLicenseStatus())) { %>
					                      <b><%=student.getDriversLicenseNumber()%></b>
					                <% } else { %>
					                			<b>None</b>
					                <% } %>
					            <td valign="top" class="cardheading">
					                      <b><%=student.getMaritalStatus()%></b>
					            </td>
					          </tr>
					          <tr>
					          	<td></td>
											<td valign="top" class="cardheading">
					                    	Description(Age/Weight/Height)
					            </td>
					            <td valign="top" class="cardheading">
					                      Driver's License
					            <td valign="top" class="cardheading">
					                      Marital Status
					            </td>
					          </tr>
					       </table> 
					      <br/>
				 					<table width="500" border="0" cellpadding="0" cellspacing="0">
										<tr>
											<td width="10"></td>
											<td valign="top" class="cardheading">
					                    	<b><%=student.getEyeColor()%>/<%=student.getHairColor()%>
					            </td>
					            <td valign="top" class="cardheading">
					                      <b><%=student.getEthnicity()%></b>
					            </td>
					          </tr>
					          <tr>
					          	<td></td>
											<td valign="top" class="cardheading">
					                    	Eye Color/Hair Color
					            </td>
					            <td valign="top" class="cardheading">
					                      Race/Ethnicity
					            </td>
					          </tr>
					       </table>     
					       <br/>
				 					<table width="500" border="0" cellpadding="0" cellspacing="0">
										<tr>
											<td width="10"></td>
											<td valign="top" class="cardheading">
					                    	<b>
					                    	<%=student.getAddress()%><br/>
					                    	<%=student.getCity()%>,<%=student.getState()%>
					                    	&nbsp;<%=student.getZipcode()%>
					                    	<br/>
					                    		
					            </td>
					            <td valign="top" class="cardheading">
					                    	<b>
					                    	<%=student.getEmergencyContact()%>&nbsp;(<%=student.getEmergencyRelationship()%>)<br/>
					                    	<%=student.getEmergencyPhone()%>
					                    	<br/>
					                    		
					            </td>
					            <td valign="top" class="cardheading">
					                    	<b>
					                    	<% if ("Yes".equals((String)student.getProbationFlag())) { %>
					                    	<%=student.getProbationCounty()%>,<%=student.getProbationState()%><br/>
					                    	<%=student.getProbationOfficer()%>,<%=student.getProbationOfficerPhone()%>
					                    <% } else { %>
					                    	Not On Probation
					                    <% } %>
					                      
					                    		
					            </td>
					          </tr>
					          <tr>
					          	<td></td>
											<td valign="top" class="cardheading">
					                    	Address
					            </td>
					            <td valign="top" class="cardheading">
					                    	Emergency Contact Information
					            </td>
					             <td valign="top" class="cardheading">
					                    	Probation Contact Information
					            </td>
					          </tr>
					       </table> 
					       <br/>
				 					<table width="500" border="0" cellpadding="0" cellspacing="0">
										<tr>
										
											<td valign="top" class="cardheading">
					                    	<b>
					                    	<%=student.getCurrentHealth()%>
					                    	</b>
					                    		
					            </td>
					            <td valign="top" class="cardheading">
					                    	<b>
					                    	<%=student.getCurrentMedicationsFlag()%>
					                    	</b>
					                    		
					            </td>
					            <td valign="top" class="cardheading">
					                    	<b>
					                    	<%=student.getDisabilityFlag()%>
					                    	</b>
					            </td>
					          </tr>
					          <tr>
					           <td valign="top" class="cardheading">
					                    	Health Condition
					            </td>
					            <td valign="top" class="cardheading">
					                    	Medications
					            </td>
					             <td valign="top" class="cardheading">
					                    	Disabled
					            </td>
					          </tr>
					       </table>  
					              			
          		</td>
          </tr>
         </table>
         <br/>
         <table width="700" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td valign="top" class="cardheading">
	                    	<b>None</b><br />
	            </td>
	             <td valign="top" class="cardheading">
	                      <b><%=student.getReligion()%></b>
	            </td>
	           	<td valign="top" class="cardheading">
	                    	  <b><%=student.getGovernmentBenefits()%></b>
	            </td>
											
	          </tr>
	          <tr>
							<td valign="top" class="cardheading">
	                    	Student History (Date,Name,Location,Status)
	            </td>
	            <td valign="top" class="cardheading">
	                      Religious Background
	            </td>
	            <td valign="top" class="cardheading">
	                      Government Benefits
	            </td>
	          </tr>
	       </table>
</div>
<body>
</body>
</html>

