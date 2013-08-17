<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="../../includes/header_info.jsp" flush="true"/>
 
<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");
    String warning=(String)request.getAttribute("WARNING");
   
   String currentHealthErr = (String)request.getAttribute("currentHealthErr");
   if (currentHealthErr==null) currentHealthErr="";
   String currentMedicationsFlagErr = (String)request.getAttribute("currentMedicationsFlagErr");
   if (currentMedicationsFlagErr==null) currentMedicationsFlagErr="";
   String needMedicationFlagErr = (String)request.getAttribute("needMedicationFlagErr");
   if (needMedicationFlagErr==null) needMedicationFlagErr="";
   String medicationSupplyFlagErr = (String)request.getAttribute("medicationSupplyFlagErr");
   if (medicationSupplyFlagErr==null) medicationSupplyFlagErr="";
   String doctorsAppointmentErr = (String)request.getAttribute("doctorsAppointmentErr");
   if (doctorsAppointmentErr==null) doctorsAppointmentErr="";
   String doctorsAppointmentDateErr = (String)request.getAttribute("doctorsAppointmentDateErr");
   if (doctorsAppointmentDateErr==null) doctorsAppointmentDateErr="";
 
   String eyewearFlagErr = (String)request.getAttribute("eyewearFlagErr");
   if (eyewearFlagErr==null) eyewearFlagErr="";
  String eyewearUsageErr = (String)request.getAttribute("eyewearUsageErr");
   if (eyewearUsageErr==null) eyewearUsageErr="";
  
  
    String industrialInjuryDateErr = (String)request.getAttribute("industrialInjuryDateErr");
   if (industrialInjuryDateErr==null) industrialInjuryDateErr="";
  
  String industrialInjuryLocationErr = (String)request.getAttribute("industrialInjuryLocationErr");
   if (industrialInjuryLocationErr==null) industrialInjuryLocationErr="";
  
  String industrialInjuryReasonErr = (String)request.getAttribute("industrialInjuryReasonErr");
   if (industrialInjuryReasonErr==null) industrialInjuryReasonErr="";
  
  String industrialInjuryEmployerErr = (String)request.getAttribute("industrialInjuryEmployerErr");
   if (industrialInjuryEmployerErr==null) industrialInjuryEmployerErr="";

   String examinationErr = (String)request.getAttribute("examinationErr");
   if (examinationErr==null) examinationErr="";

   String physicianErr = (String)request.getAttribute("physicianErr");
   if (physicianErr==null) physicianErr="";

   String physicianAddressErr = (String)request.getAttribute("physicianAddressErr");
   if (physicianAddressErr==null) physicianAddressErr="";

   String herniaSideErr = (String)request.getAttribute("herniaSideErr");
   if (herniaSideErr==null) herniaSideErr="";

   String herniaOperationDateErr = (String)request.getAttribute("herniaOperationDateErr");
   if (herniaOperationDateErr==null) herniaOperationDateErr="";

   String herniaPhysicianErr = (String)request.getAttribute("herniaPhysicianErr");
   if (herniaPhysicianErr==null) herniaPhysicianErr="";
   
     String currentMedicationsErr = (String)request.getAttribute("currentMedicationsErr");
   if (currentMedicationsErr==null) currentMedicationsErr="";

 String refillDirectionsErr = (String)request.getAttribute("refillDirectionsErr");
   if (refillDirectionsErr==null) refillDirectionsErr="";

   ArrayList ddl = new ArrayList();
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
		<td colspan="8"><b>Health Information: </b></td>
	</tr>

    

	<tr>
    	<td colspan="8">
        
        
        
        
        
        
        </td>
    </tr>
    
           <% ArrayList questions = (ArrayList)session.getAttribute("questions");
		   String answer[] = IntakeServlet.getIntake().getQuestion();
		   String answerDetails[] = IntakeServlet.getIntake().getQuestionAnswerDetails();
		   String answerDates[] = IntakeServlet.getIntake().getQuestionAnswerDates();
		   
		   for (int i=0;i<15;i++) { 
		   	String question = (String)questions.get(i);
		%>
        <tr>
    	<td colspan="7">
        <%=question%>
        </td>
        <td>
        <%
        	 ddl = (ArrayList)session.getAttribute("dll_yesno");
			
				%>
				<select name="question<%=i%>">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(answer[i]))
						{%>selected<%}%>>
					  <%=ddl.get(j)%>
					</option>
					<%
				  }
				  %>
				  
				<%}%>
                </select><br />
		</td>
        </tr>
        <%}%>
   
	<tr>
		<td colspan="8"><b>Emotional Health:</b></td>
	</tr> 
         <%
		   for (int i=15;i<21;i++) { 
		   	String question = (String)questions.get(i);
			
		 %>
        <tr>
    	<td colspan="5">
        <%=question%>
        </td>
        <td colspan="3">
        <%
        	ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="question<%=i%>">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(answer[i]))
						{%>selected<%}%>>
					  <%=ddl.get(j)%>
					</option>
					<%
				  }
				  %>
				  
				<%}%>
                </select>
		&nbsp;&nbsp;How Long Ago?<input type="text" name="question<%=i%>Dates" value="<%=answerDates[i]%>"  size="10" maxlength="10" onkeyup="javascript:ucase(this)"/></td>
        </tr>
        <tr>
        	<td colspan="8">Please describe:&nbsp;<input type="text" name="question<%=i%>Details" value="<%=answerDetails[i]%>" size="40" maxlength="45" onkeyup="javascript:ucase(this)"/></td>
        </tr>
        <%}%>

	<tr>
		<td colspan="8"><b>Physical Health:</b></td>
	</tr>
	<tr>
		<td colspan="8">
        
        <table width="100%">
        <tr>
        <td>
		Describe your current health?&nbsp;
		<%
                                    ddl = (ArrayList)session.getAttribute("dll_health");
                                    %>
                                	<select name="currentHealth" <% if (currentHealthErr.length()>0) { %>class="ddlErr"<%}%>>
                                    <option value="">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getCurrentHealth()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>
         </td>
         </tr>
         <tr><td class="fieldError"><%=currentHealthErr%></td></tr>
         <tr>
         <td>
		 Are you currently taking medications?&nbsp;
									<%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="currentMedicationsFlag" <% if (currentMedicationsFlagErr.length()>0) { %>class="ddlErr"<%}%>>
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getCurrentMedicationsFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>
        </td>
        </tr>
        <tr><td class="fieldError"><%=currentMedicationsFlagErr%></td></tr>
        <tr>
        <td>
          <i>If yes, which meds:</i>&nbsp;&nbsp;<input type="text" name="currentMedications" value="<%=IntakeServlet.getIntake().getCurrentMedications()%>" <% if (currentMedicationsErr.length()>0) { %>class="textboxErr"<%}%> size="40" maxlength="40" onkeyup="ucase(this)"/>
         </td>
         </tr>
         <tr><td class="fieldError"><%=currentMedicationsErr%></td></tr>
        <tr>
         <td>
		Are you in need of medication?&nbsp;
									<%
									 ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="needMedicationFlag" <% if (needMedicationFlagErr.length()>0) { %>class="ddlErr"<%}%>>
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getNeedMedicationFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>
        </td>
        </tr>
        <tr><td class="fieldError"><%=needMedicationFlagErr%></td></tr>
         <tr>
         <td>
        Do you have enough for 30 days?&nbsp;
									<% 
									ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="medicationSupplyFlag" <% if (medicationSupplyFlagErr.length()>0) { %>class="ddlErr"<%}%>>
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getMedicationSuppyFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>
        </td>
        </tr>
        <tr><td class="fieldError"><%=medicationSupplyFlagErr%></td></tr>
        <tr>
        <td>
          If yes, How do you get refill?&nbsp;&nbsp;<input type="text" name="refillDirections" value="<%=IntakeServlet.getIntake().getRefillDirections()%>" <% if (refillDirectionsErr.length()>0) { %>class="textboxErr"<%}%> size="40" maxlength="40"/>		</td>
         </tr>
         <tr><td class="fieldError"><%=refillDirectionsErr%></td></tr>
         <tr>
         <td> 
			Do you have any doctor appointments in the next 30 days?&nbsp;
		 							<%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="doctorsAppointment" <% if (doctorsAppointmentErr.length()>0) { %>class="ddlErr"<%}%>>
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getDoctorsAppointment()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %>
                                    </select>
             </td>
             </tr>
             <tr><td class="fieldError"><%=doctorsAppointmentErr%></td></tr>
         <tr>
         	<td>If yes, when?&nbsp;<input type="text" name="doctorsAppointmentDate" value="<%=IntakeServlet.getIntake().getDoctorsAppointmentDate()%>" size="25" maxlength="25" <% if (doctorsAppointmentDateErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"/></td>
         </tr>
         <tr><td class="fieldError"><%=doctorsAppointmentDateErr%></td></tr>
         </table>
         </td>
         </tr>
         
         <tr>
         <td colspan="8">
         <%
		   for (int i=21;i<26;i++) { 
		   	String question = (String)questions.get(i);
		 %>
         <table width="100%">
         <tr>
         <td>
         <%=question%>&nbsp;&nbsp;
         <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="question<%=i%>" class="dll">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(answer[i]))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>
         </td>
         </tr>
         <tr>
         <td>
                                    If yes, give diagnosis&nbsp;<input type="text" name="question<%=i%>Details" value="<%=answerDetails[i]%>" size="45" maxlength="45" onkeyup="javascript:ucase(this)"/>
         </td>
         </tr>
         </table>
		<% } %>
        </td>
        </tr>
         <tr>
         <td colspan="8">
         	<table width="100%">
            <tr>
            <td width="300">
                Do you wear glasses or contact lens?&nbsp;
                 <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="eyewearFlag" class="dll">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getEyewearFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>&nbsp;&nbsp;&nbsp;
        </td>
        <td>
		How Often?&nbsp;
		 <%
                                    ddl = (ArrayList)session.getAttribute("dll_eyewear");
                                    %>
                                	<select name="eyewearUsage" <% if (eyewearUsageErr.length()>0) { %>class="ddlErr"<%}%>>
                                    <option value="">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getEyewearUsage()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>
       </td>
       </tr>
       <tr>
       	<td class="fieldError"><%=eyewearFlagErr%></td>
        <td class="fieldError"><%=eyewearUsageErr%></td>
        </tr>
       </table>
       </td>
		
	</td>
	</tr>
    <tr>
         <td colspan="8"></td>
    </tr>
    <tr>
		<td colspan="8"></br><b>Mental Health:</b></td>
	</tr>
	<tr>
		<td colspan="8">
        <%
		   for (int i=26;i<32;i++) { 
		   	String question = (String)questions.get(i);
		 %>
         <%=question%>&nbsp;&nbsp;
         <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="question<%=i%>" class="dll">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(answer[i]))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select><br />
                                    If yes, when&nbsp;<input type="text" name="question<%=i%>Dates" value="<%=answerDates[i]%>" size="15" maxlength="15" onkeyup="javascript:ucase(this)"/>
                                    &nbsp;&nbsp;Details:&nbsp;<input type="text" name="question<%=i%>Details" value="<%=answerDetails[i]%>" size="40" maxlength="45" onkeyup="javascript:ucase(this)"/>
        <br /><br />
		<% } %>
        
        
        </td>
      </tr>
        
        
        
        
        
        
    <tr>
		<td colspan="11"><b>Physical Health History:</b></td>
	</tr>    
	<tr>
		<td colspan="8">
        Have you ever had a state claim for an industrial injury?&nbsp;&nbsp;
         <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="industrialInjuryFlag" class="dll">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getIndustrialInjuryFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>
            </td>
       </tr>
       <tr>
       	<td colspan="8">If yes, when&nbsp;<input type="text" name="industrialInjuryDate" value="<%=IntakeServlet.getIntake().getIndustrialInjuryDate()%>" size="15" maxlength="15" <% if (industrialInjuryDateErr.length()>0) {%> class="textboxErr"<%}%> onkeyup="ucase(this)"/></td>
       </tr>
       <tr><td class="fieldError"><%=industrialInjuryDateErr %></td></tr>
       <tr>
       <td colspan="8">Reason:&nbsp;<input type="text" name="industrialInjuryReason" value="<%=IntakeServlet.getIntake().getIndustrialInjuryReason()%>" size="25" maxlength="45" <% if (industrialInjuryReasonErr.length()>0) {%> class="textboxErr"<%}%> onkeyup="ucase(this)"/></td>
       </tr>
       <tr><td class="fieldError"><%=industrialInjuryReasonErr %></td></tr>
       <tr>
       <td colspan="8">Location&nbsp;<input type="text" name="industrialInjuryLocation" value="<%=IntakeServlet.getIntake().getIndustrialInjuryLocation()%>" size="30" maxlength="30" <% if (industrialInjuryLocationErr.length()>0) {%> class="textboxErr"<%}%> onkeyup="ucase(this)"/></td>
       </tr>
       <tr><td class="fieldError"><%=industrialInjuryLocationErr %></td></tr>
       <tr>
       <td colspan="8">Employer:&nbsp;<input type="text" name="industrialInjuryEmployer" value="<%=IntakeServlet.getIntake().getIndustrialInjuryEmployer()%>" size="30" maxlength="30" <% if (industrialInjuryEmployerErr.length()>0) {%> class="textboxErr"<%}%> onkeyup="ucase(this)"/> </td>
	   </tr>
       <tr><td class="fieldError"><%=industrialInjuryEmployerErr %></td></tr>
    
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    
    <tr>
		<td colspan="8">
        
        <table width="100%">
        <tr>
        <td>
        Do you have any current physical disability?&nbsp;&nbsp;
         <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="disabilityFlag" class="dll">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getDisabilityFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %></select>
            </td>
       </tr>
       <tr>
       <td>
           If yes, date of last examination&nbsp;<input type="text" name="examinationDate" value="<%=IntakeServlet.getIntake().getExaminationDate()%>" size="15" maxlength="15" <% if (examinationErr.length()>0) {%> class="textboxErr"<%}%> onkeyup="ucase(this)"/>
       </td>
       </tr>
       <tr><td class="fieldError"><%=examinationErr%></td></tr>
       <tr>
       <td>
           Physician's Name&nbsp;<input type="text" name="physician" value="<%=IntakeServlet.getIntake().getPhysician()%>" size="25" maxlength="45" <% if (physicianErr.length()>0) {%> class="textboxErr"<%}%> onkeyup="ucase(this)"/>
       </td>
       </tr>
       <tr><td class="fieldError"><%=physicianErr%></td></tr>
       <tr>
       <td>
           Address&nbsp;<input type="text" name="physicianAddress" value="<%=IntakeServlet.getIntake().getPhysicianAddress()%>" size="45" maxlength="45" <% if (physicianAddressErr.length()>0) {%> class="textboxErr"<%}%> onkeyup="ucase(this)">/>
        </td>
		</tr>
        <tr><td class="fieldError"><%=physicianAddressErr%></td></tr>
        </table>
        </td>
        </tr>
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8"><b>Have you ever had any of the following:</b></td>
	</tr>

	<tr>
		<td colspan="8">
			<table>
            <% ArrayList medicalConditions = (ArrayList)session.getAttribute("medicalCondition");
			  String medicalConditionFlag[] = IntakeServlet.getIntake().getMedicalCondition();
				for (int i=0;i<medicalConditions.size()-1;i+=2) {
					String medicalCondition = (String)medicalConditions.get(i);
			%>
				<tr>
					<td>
						<select name="medicalConditionFlag<%=i%>" class="dll">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(medicalConditionFlag[i]))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %>
                            </select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td><%=medicalCondition%></td>								
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>			
						<select name="medicalConditionFlag<%=i+1%>" class="dll">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(medicalConditionFlag[i+1]))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %>
                            </select>
					</td>
					<td>&nbsp;&nbsp;</td>
                    <% medicalCondition = (String)medicalConditions.get(i+1); %>
					<td><%=medicalCondition%></td>
				</tr>
				<% } %>
				<tr>
					<td>			
						<select name="herniaSide" <% if (herniaSideErr.length()>0) { %>class="ddlErr"<%}%>>
							<option value="LEFT" <% if ("LEFT".equals(IntakeServlet.getIntake().getHerniaSide())) { %>selected<%}%>>LEFT</option>
							<option value="RIGHT" <% if ("RIGHT".equals(IntakeServlet.getIntake().getHerniaSide())) { %>selected<%}%>>RIGHT</option>
							<option value="" selected></option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Which side?</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
				</tr>
                <tr><td colspan="8" class="fieldError"><%=herniaSideErr%></td></tr>
				<tr>
					<td>			
						<select name="herniaOperationFlag" >
                                    <option value="">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getHerniaOperationFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %>
                            </select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Was it operated on? </td>
					<td>&nbsp;&nbsp;</td>
					<td>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
				</tr>
                
				<tr>
					<td colspan="8">Date: <input type="text" name="Date" value="<%=IntakeServlet.getIntake().getHerniaDate()%>" size="8" <% if (herniaOperationDateErr.length()>0) { %>class="textboxErr"<%}%>></td>
                </tr>
                 <tr><td colspan="8" class="fieldError"><%=herniaOperationDateErr%></td></tr>
                <tr>
                    <td colspan="8">Physician: <input type="text" name="herniaPhysician" value="<%=IntakeServlet.getIntake().getHerniaPhysician()%>" <% if (herniaPhysicianErr.length()>0) { %>class="textboxErr"<%}%> size="30" maxlength="30"></td>
				</tr>
                 <tr><td colspan="8" class="fieldError"><%=herniaPhysicianErr%></td></tr>
                <tr>
                     <td colspan="8"><i>For any "yes" above, explain details: <input type="text" name="medicalConditionDetails" value="<%=IntakeServlet.getIntake().getMedicalConditionDetails()%>" size="60" maxlength="30"></td>
				</tr>
			</table> 			 					
		</td>
		<td></td>
		<td></td>
	</tr>
    
    <tr>
		<td colspan="8" valign="bottom" align="center" height="45"><input type="submit" name="action" value="Save" class="imageButtonSave" title="Update Information" /></td>
	</tr>

    </table>
<input type="hidden" name="source" value="health"/>

</form>
    <div class="footer">
        
    </div>
   

</body>
</html>