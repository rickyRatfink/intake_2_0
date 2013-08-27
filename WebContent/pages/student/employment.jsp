<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="../../includes/header_info.jsp" flush="true"/>
 
<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");
   String warning=(String)request.getAttribute("WARNING");
  
    String workExperienceOtherDescErr = (String)request.getAttribute("workExperienceOtherDescErr");
   if (workExperienceOtherDescErr==null) workExperienceOtherDescErr="";

	String updateFlag = (String)request.getAttribute("updateFlag");
	if (updateFlag==null) updateFlag = request.getParameter("updateFlag");
%>
<form method="POST" action="<%=request.getContextPath()%>/intake">
<% if (message!=null) { %>
<h3><font style="color:#0C0"><img src="<%=request.getContextPath()%>/img/success.png"/><%=message %></font></h3><br />	
<% } %>
<% if (warning!=null) { %>
<h3><font style="color:#F90"><img src="<%=request.getContextPath()%>/img/warning.jpg"/><%=warning %></font></h3><br />	
<% } %>
  <table width="750">
	<tr>
		<td colspan="8"><b>Work Experience (Check all that apply):</b><br /></td>
	</tr>
    <tr>
    	<td colspan="8">
    		<table width="100%">
			<%
			 String jobSkill="";
			 
			 String workExperience[] = IntakeServlet.getIntake().getWorkExperience();
		   
			 ArrayList jobSkills = (ArrayList)session.getAttribute("jobSkill");
				for (int i=0;i<jobSkills.size()-3;i+=4) {
			%>
            
            <tr>
            	<td>
                	<% jobSkill = (String)jobSkills.get(i); %>
                     <input type="checkbox" name="jobskill<%=i%>" value="YES" <% if ("YES".equals(workExperience[i])) {%>checked<%}%>/>&nbsp;<%=jobSkill%>
                </td>
                <td>
                	<% jobSkill = (String)jobSkills.get(i+1); %>
                     <input type="checkbox" name="jobskill<%=i+1%>" value="YES" <% if ("YES".equals(workExperience[i+1])) {%>checked<%}%>/>&nbsp;<%=jobSkill%>
                </td>
                <td>
                	<% jobSkill = (String)jobSkills.get(i+2); %>
                     <input type="checkbox" name="jobskill<%=i+2%>" value="YES" <% if ("YES".equals(workExperience[i+2])) {%>checked<%}%>/>&nbsp;<%=jobSkill%>
                </td>
                <td>
                	<% jobSkill = (String)jobSkills.get(i+3); %>
                     <input type="checkbox" name="jobskill<%=i+3%>" value="YES" <% if ("YES".equals(workExperience[i+3])) {%>checked<%}%>/>&nbsp;<%=jobSkill%>
                </td>
                
             </tr>
             <% } %>
             <tr>
             	<td colspan="4" align="left"><input type="checkbox" name="jobskillOther" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getWorkExperienceOtherDesc())) {%>checked<%}%>/>&nbsp;Other&nbsp;<input type="text" name="jobskillOtherDesc" size="20" maxlength="30" <% if (workExperienceOtherDescErr.length()>0) {%>class="textboxErr"<%}%>/>
             </tr>
             <tr>
             	<td colspan="4" class="fieldError"><%=workExperienceOtherDescErr%></td>
             </tr>
             </table>
         </td>
    </tr>

     <tr>
    			<td colspan="8">
                <table width="500">
                <tr>
                	<td>Employer</td>
                    <td>Contact</td>
                    <td>Phone</td>
                    <td>Dates of Employment</td>
                </tr>
                <tr>
                	<td><input type="text" name="employer1" value="<%=IntakeServlet.getIntake().getEmployer1()%>" size="30" maxlength="30"/></td>
                    <td><input type="text" name="employerContact1" value="<%=IntakeServlet.getIntake().getEmployerContact1()%>" size="25" maxlength="30"/></td>
                    <td><input type="text" name="employerPhone1" value="<%=IntakeServlet.getIntake().getEmployerPhone1()%>" size="15" maxlength="15"/></td>
                    <td><input type="text" name="employerDates1" value="<%=IntakeServlet.getIntake().getEmployerDates1()%>" size="20" maxlength="35"/></td>
                </tr>
                
                 <tr>
                	<td><input type="text" name="employer2" value="<%=IntakeServlet.getIntake().getEmployer2()%>" size="30" maxlength="30"/></td>
                    <td><input type="text" name="employerContact2" value="<%=IntakeServlet.getIntake().getEmployerContact2()%>" size="25" maxlength="30"/></td>
                    <td><input type="text" name="employerPhone2" value="<%=IntakeServlet.getIntake().getEmployerPhone2()%>" size="15" maxlength="15"/></td>
                    <td><input type="text" name="employerDates2" value="<%=IntakeServlet.getIntake().getEmployerDates2()%>" size="20" maxlength="35"/></td>
                </tr>
                
                 <tr>
                	<td><input type="text" name="employer3" value="<%=IntakeServlet.getIntake().getEmployer3()%>" size="30" maxlength="30"/></td>
                    <td><input type="text" name="employerContact3" value="<%=IntakeServlet.getIntake().getEmployerContact3()%>" size="25" maxlength="30"/></td>
                    <td><input type="text" name="employerPhone3" value="<%=IntakeServlet.getIntake().getEmployerPhone3()%>" size="15" maxlength="15"/></td>
                    <td><input type="text" name="employerDates3" value="<%=IntakeServlet.getIntake().getEmployerDates3()%>" size="20" maxlength="35"/></td>
                </tr>
                
                 <tr>
                	<td><input type="text" name="employer4" value="<%=IntakeServlet.getIntake().getEmployer4()%>" size="30" maxlength="30"/></td>
                    <td><input type="text" name="employerContact4" value="<%=IntakeServlet.getIntake().getEmployerContact4()%>" size="25" maxlength="30"/></td>
                    <td><input type="text" name="employerPhone4" value="<%=IntakeServlet.getIntake().getEmployerPhone4()%>" size="15" maxlength="15"/></td>
                    <td><input type="text" name="employerDates4" value="<%=IntakeServlet.getIntake().getEmployerDates4()%>" size="20" maxlength="35"/></td>
                </tr>
               
             </tr>
            
             </table>
         </td>
    </tr>




   <tr>
		<td colspan="8" valign="bottom" align="center" height="45">    <% if ("YES".equals(updateFlag)) { %>
    	<input type="submit" name="action" value="Update" class="imageButtonSave" title="Update Information" />&nbsp;
    <% } else { %>
    	<input type="submit" name="action" value="Save" class="imageButtonSave" title="Save Information" />&nbsp;
    <% } %></td>
	</tr>

    </table>

<input type="hidden" name="source" value="employment"/>
 <input type="hidden" name="key" value="<%=IntakeServlet.getIntake().getIntakeId()%>"/>
</form>
    <div class="footer">
        
    </div>
   

</body>
</html>