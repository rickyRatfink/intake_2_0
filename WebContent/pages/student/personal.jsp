<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="../../includes/header_info.jsp" flush="true"/>
 
<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");
   String warning=(String)request.getAttribute("WARNING");

   String lastNameErr=(String)request.getAttribute("lastNameErr");
   if (lastNameErr==null) lastNameErr="";
   
    String firstNameErr = (String)request.getAttribute("firstNameErr");
   if (firstNameErr==null) firstNameErr="";
	
	String middleInitialErr = (String)request.getAttribute("middleInitialErr");
   if (middleInitialErr==null) middleInitialErr="";

   String ssnErr = (String)request.getAttribute("ssnErr");
   if (ssnErr==null) ssnErr="";
   
   String addressErr = (String)request.getAttribute("addressErr");
   if (addressErr==null) addressErr="";
   
   String cityErr = (String)request.getAttribute("cityErr");
   if (cityErr==null) cityErr="";
   
   String stateErr = (String)request.getAttribute("stateErr");
   if (stateErr==null) stateErr="";
   
   String zipcodeErr = (String)request.getAttribute("zipcodeErr");
   if (zipcodeErr==null) zipcodeErr="";

   String referralPhoneErr = (String)request.getAttribute("referralPhoneErr");
   if (referralPhoneErr==null) referralPhoneErr="";

   String dobErr = (String)request.getAttribute("dobErr");
   if (dobErr==null) dobErr="";

   String ageErr = (String)request.getAttribute("ageErr");
   if (ageErr==null) ageErr="";

  String emergencyContactErr = (String)request.getAttribute("emergencyContactErr");
   if (emergencyContactErr==null) emergencyContactErr="";

  String emergencyRelationshipErr = (String)request.getAttribute("emergencyRelationshipErr");
   if (emergencyRelationshipErr==null) emergencyRelationshipErr="";

  String emergencyPhoneErr = (String)request.getAttribute("emergencyPhoneErr");
   if (emergencyPhoneErr==null) emergencyPhoneErr="";


 String maritalStatusErr = (String)request.getAttribute("maritalStatusErr");
   if (maritalStatusErr==null) maritalStatusErr="";

 String ethnicityErr = (String)request.getAttribute("ethnicityErr");
   if (ethnicityErr==null) ethnicityErr="";

String heightErr = (String)request.getAttribute("heightErr");
   if (heightErr==null) heightErr="";

String weightErr = (String)request.getAttribute("weightErr");
   if (weightErr==null) weightErr="";

String eyecolorErr = (String)request.getAttribute("eyecolorErr");
   if (eyecolorErr==null) eyecolorErr="";

String haircolorErr = (String)request.getAttribute("haircolorErr");
   if (haircolorErr==null) haircolorErr="";

String homeLocationErr = (String)request.getAttribute("homeLocationErr");
   if (homeLocationErr==null) homeLocationErr=""; 

String educationLevelErr = (String)request.getAttribute("educationLevelErr");
   if (educationLevelErr==null) educationLevelErr="";

String graduateFlagErr = (String)request.getAttribute("graduateFlagErr");
   if (graduateFlagErr==null) graduateFlagErr="";

String englishReadErr = (String)request.getAttribute("englishReadErr");
   if (englishReadErr==null) englishReadErr="";

String englishSpeakErr = (String)request.getAttribute("englishSpeakErr");
   if (englishSpeakErr==null) englishSpeakErr="";

String veteranFlagErr = (String)request.getAttribute("veteranFlagErr");
   if (veteranFlagErr==null) veteranFlagErr="";

String branchOfServiceErr = (String)request.getAttribute("branchOfServiceErr");
   if (branchOfServiceErr==null) branchOfServiceErr="";

String rankErr = (String)request.getAttribute("rankErr");
   if (rankErr==null) rankErr="";

String lengthOfServiceErr = (String)request.getAttribute("lengthOfServiceErr");
   if (lengthOfServiceErr==null) lengthOfServiceErr="";

String driversLicenseFlagErr = (String)request.getAttribute("driversLicenseFlagErr");
   if (driversLicenseFlagErr==null) driversLicenseFlagErr="";
   
   String driversLicenseStateErr = (String)request.getAttribute("driversLicenseStateErr");
   if (driversLicenseStateErr==null) driversLicenseStateErr="";
   
   String driversLicenseNumberErr = (String)request.getAttribute("driversLicenseNumberErr");
   if (driversLicenseNumberErr==null) driversLicenseNumberErr="";
   
      String motherLivingFlagErr = (String)request.getAttribute("motherLivingFlagErr");
   if (motherLivingFlagErr==null) motherLivingFlagErr="";
   
      String fatherLivingFlagErr = (String)request.getAttribute("fatherLivingFlagErr");
   if (fatherLivingFlagErr==null) fatherLivingFlagErr="";
 
	
   String required = "<img src='images/required.png'/>";
   
   	String updateFlag = (String)request.getAttribute("updateFlag");
	if (updateFlag==null) updateFlag = request.getParameter("updateFlag");
%>




<tr>
 			<td bgcolor="#ffffff" align="center">

<div class="interior-mid">
  <div class="interior-text-mid">
 
<script language="javascript" type="text/javascript">
function ucase(obj) {
  obj.value=obj.value.toUpperCase();
}

function isNumberKey(evt)
      {
         var charCode = (evt.which) ? evt.which : event.keyCode
         if (charCode > 31 && (charCode < 48 || charCode > 57))
            return false;

         return true;
      }
	  
	  
function moveOnMax(field,nextFieldID){
	  if(field.value.length >= field.maxLength){
	    document.getElementById(nextFieldID).focus();
	  }
	}

</script>

<form method="POST" action="<%=request.getContextPath()%>/intake">
<% if (message!=null) { %>
<h3><font style="color:#0C0"><img src="<%=request.getContextPath()%>/img/success.png"/><%=message %></font></h3><br />	
<% } %>
<% if (warning!=null) { %>
<h3><font style="color:#F90"><img src="<%=request.getContextPath()%>/img/warning.jpg"/><%=warning %></font></h3><br />	
<% } %>
    <table width="750">
	<tr>
		<td colspan="8"><b>Personal Information: </b></td>
	</tr>

    

	<tr>
    	<td colspan="8">
                <table width="100%" border="0">
                <tr>
                	<td>Photo</td>
                	<td colspan="2">
                	<%  //String image = IntakeServlet.getIntake().getImageUrl(); System.out.println("image="+image);
                		if ( IntakeServlet.getIntake().getImageHeadshot()!=null) {  %>
                	    	
                	 		<img src="<%=request.getContextPath()%>/image?id=<%=IntakeServlet.getIntake().getIntakeId() %>" width="200" height="133"/>
                	 
                	 
                	  <% } else { %>
                	       <img src="<%=request.getContextPath()%>/photos/person.jpg" width="200" height="133"/>
                	  <% }  %>
                    </td>
                	<td colspan="5">
                    	You may need to refresh your browser to see the lastest photo.<br/>
                        <a href="<%=request.getContextPath()%>/pages/student/photo.jsp?updateFlag=<%=updateFlag%>">Edit Photo</a>
                    </td>
                </tr>
                <tr>
                <td>Last Name</td>
                <td><input type="text" name="lastname" value="<%=IntakeServlet.getIntake().getLastName()%>" size="30" maxlength="30" <% if (lastNameErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)"></td>
                <td>&nbsp;&nbsp;</td>
                <td>First Name</td>
                <td><input type="text" name="firstname" value="<%=IntakeServlet.getIntake().getFirstName()%>" size="30" maxlength="30" <% if (firstNameErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)"></td>
                <td>&nbsp;&nbsp;</td>
                <td>MI</td>
                <td colspan="2" align="left"><input type="text" name="mi" value="<%=IntakeServlet.getIntake().getMiddleInitial()%>"  size="1" maxlength="1"  <% if (middleInitialErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)"></td>
            </tr>
            <tr>
                <td colspan="3" class="fieldError"><%=lastNameErr%></td>
                <td colspan="3" class="fieldError"><%=firstNameErr%></td>
                <td colspan="2" class="fieldError"><%=middleInitialErr%></td>
            </tr>
            </table>
        </td>
    </tr>
	
	<tr>
    	<td colspan="8">
                <table width="100%" border="0">
                <tr>	
                <td >SSN</td>
                <td>
                <%
				String ssn1="",ssn2="",ssn3="";
				String ssn=IntakeServlet.getIntake().getSsn();
				if (ssn.length()==9) {
					ssn1=ssn.substring(0,3);
					ssn2=ssn.substring(3,5);
					ssn3=ssn.substring(5,9);
				} else {
					 ssn1=valid8r.cleanData(request.getParameter("ssn1"));
					 ssn2=valid8r.cleanData(request.getParameter("ssn2"));
					 ssn3=valid8r.cleanData(request.getParameter("ssn3"));
				}
                %>
                <input id="ssn1"  type="text" name="ssn1" size="3" value="<%=ssn1%>" maxlength="3" <% if (ssnErr.length()>0) { %>class="textboxErr"<% } %> onKeyPress="return isNumberKey(event)" onKeyUp="moveOnMax(this,'ssn2')" >-
                <input id="ssn2"  type="text" name="ssn2" size="2" value="<%=ssn2%>" maxlength="2" <% if (ssnErr.length()>0) { %>class="textboxErr"<% } %> onKeyPress="return isNumberKey(event)" onKeyUp="moveOnMax(this,'ssn3')" >-
                <input id="ssn3"  type="text" name="ssn3" size="4" value="<%=ssn3%>" maxlength="4" <% if (ssnErr.length()>0) { %>class="textboxErr"<% } %> onKeyPress="return isNumberKey(event)" onKeyUp="moveOnMax(this,'referred')" ></td>
                <td>&nbsp;&nbsp;</td>
                <td >Referred to Faith Farm By</td>
                <td><input id="referred" type="text" name="referredBy" value="<%=IntakeServlet.getIntake().getReferredBy()%>" size="28" maxlength="28" onKeyUp="ucase(this)"></td>
           		 </tr>
            
           		 <tr>
                <td colspan="3" class="fieldError"><%=ssnErr%></td>
                <td colspan="3" class="fieldError"></td>
                <td colspan="2"></td>
           		 </tr>
                 </table>
         </td>
   </tr>

	<tr>
    	<td colspan="8">
                <table width="100%" border="0">
                <tr>
                <td>Address of Contact&nbsp;<input type="text" name="address" value="<%=IntakeServlet.getIntake().getAddress()%>" size="30" maxlength="45" <% if (addressErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)">&nbsp;&nbsp;</td>
                <td>City&nbsp;<input type="text" name="city" value="<%=IntakeServlet.getIntake().getCity()%>" size="20" maxlength="25" <% if (cityErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)">&nbsp;&nbsp;</td>
               <td>State&nbsp;
                 <%
                        ArrayList ddl = (ArrayList)session.getAttribute("dll_states");
                        %>
                        <select name="state" <% if (stateErr.length()>0) { %>class="ddlErr"<% } %>>
                        <option value="">
                        <%
                        if (ddl!=null) {
                          for (int j=0;j<ddl.size();j++) {
                            %>
                            <option 
                                value="<%=ddl.get(j)%>"
                                <%
                                if 
                                (ddl.get(j).equals(IntakeServlet.getIntake().getState()))
                                {%>selected<%}%>>
                              <%=ddl.get(j)%>
                            </option>
                            <%
                          }
                          %>
                          <%
                        }
                    %></select>
                &nbsp;&nbsp;</td>
               <td >Zipcode&nbsp;&nbsp;<input type="text" name="zipcode" value="<%=IntakeServlet.getIntake().getZipcode()%>" size="5" maxlength="5" onKeyPress="return isNumberKey(event)" <% if (zipcodeErr.length()>0) { %>class="textboxErr"<% } %>>&nbsp;&nbsp;
                </td>
                </tr>
                <tr>
                <td class="fieldError"><%=addressErr%></td>
                <td class="fieldError"><%=cityErr%></td>
                <td class="fieldError"><%=stateErr%></td>
                <td class="fieldError"><%=zipcodeErr%></td>
            </tr>
            </table>
        </td>
    </tr>
    

	<tr>
    	<td colspan="8"> 
                <table width="100%" border="0">
                <tr>
                <td width="200">Phone Number&nbsp;<i>(xxx)xxx-xxxx</i>&nbsp;
                <input type="text" name="referral_phone"  value="<%=IntakeServlet.getIntake().getReferralPhone()%>" size="20" maxlength="13" <% if (referralPhoneErr.length()>0) { %>class="textboxErr"<% } %> onKeyPress="return isNumberKey(event)"></td>
                <td width="200">Date of Birth&nbsp;<i>(mm/dd/yyyy)</i>&nbsp;<input type="text" name="dob" value="<%=IntakeServlet.getIntake().getDateOfBirth()%>" size="10" maxlength="10"  <% if (dobErr.length()>0) { %>class="textboxErr"<% } %>></td>
                <td>Age&nbsp;<input type="text" name="age" size="2" value="<%=IntakeServlet.getIntake().getAge()%>" size="5" maxlength="2" onkeypress="return isNumberKey(event)" <% if (ageErr.length()>0) { %>class="textboxErr"<% } %>></td>
                </tr>
                 <tr>
                <td class="fieldError"><%=referralPhoneErr%></td>
                <td class="fieldError"><%=dobErr%></td>
                <td class="fieldError"><%=ageErr%></td>               
            	</tr>
                </table>
          </td>
     </tr>
     
     <tr>
          <td colspan="8">
                <table width="100%" border="0">
               
                <tr>
                <td>Emergency Contact&nbsp;<input type="text" name="emergencyContact" value="<%=IntakeServlet.getIntake().getEmergencyContact()%>" size="28" maxlength="28" <% if (emergencyContactErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)"> </td>
                <td>Relationship&nbsp;<input type="text" name="emergencyRelationship" value="<%=IntakeServlet.getIntake().getEmergencyRelationship()%>" size="20" maxlength="20" <% if (emergencyRelationshipErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)"></td>
                <td>Phone&nbsp;<i>(xxx)xxx-xxxx</i>&nbsp;<input type="text" name="emergencyPhone" size="20" value="<%=IntakeServlet.getIntake().getEmergencyPhone()%>" maxlength="13" <% if (emergencyPhoneErr.length()>0) { %>class="textboxErr"<% } %> onKeyPress="return isNumberKey(event)"></td>
                </tr>
                <tr>
                <td class="fieldError"><%=emergencyContactErr%></td>
                <td class="fieldError"><%=emergencyRelationshipErr%></td>
                <td class="fieldError"><%=emergencyPhoneErr%></td>               
            	</tr>
                </table>
          </td>
	</tr>
 
	<tr>
		<td colspan="8">
	        <table width="100%" border="0">
                <tr>
                    <td width="250">Marial Status&nbsp;
                            <%
                            ddl = (ArrayList)session.getAttribute("dll_marital_status");
                            %>
                            <select name="maritalStatus" <% if (maritalStatusErr.length()>0) { %>class="ddlErr"<% } %>>
                            <option value="">
                            <%
                            if (ddl!=null) {
                              for (int j=0;j<ddl.size();j++) {
                                %>
                                <option 
                                    value="<%=ddl.get(j)%>"
                                    <%
                                    if
                                    (ddl.get(j).equals(IntakeServlet.getIntake().getMaritalStatus()))
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
                    <td >Ethnicity
                        <%
                            ddl = (ArrayList)session.getAttribute("dll_ethnicity");
                            %>
                            <select name="ethnicity" <% if (ethnicityErr.length()>0) { %>class="ddlErr"<% } %>>
                            <option value="">
                            <%
                            if (ddl!=null) {
                              for (int j=0;j<ddl.size();j++) {
                                %>
                                <option 
                                    value="<%=ddl.get(j)%>"
                                    <%
                                    if
                                    (ddl.get(j).equals(IntakeServlet.getIntake().getEthnicity()))
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
                <td class="fieldError"><%=maritalStatusErr%></td>
                <td class="fieldError"><%=ethnicityErr%></td>
               </tr>
             </table>
           </td>
     </tr>  
 
	<tr>
		<td colspan="8">
        <table width="100%">
        <tr>
        <td>Height&nbsp;<input type="text" name="height" value="<%=IntakeServlet.getIntake().getHeight()%>"size="5" <% if (heightErr.length()>0) { %>class="textboxErr"<% } %>></td>
		<td>Weight&nbsp;<input type="text" name="weight"  value="<%=IntakeServlet.getIntake().getWeight()%>"size="6" <% if (weightErr.length()>0) { %>class="textboxErr"<% } %>></td>
		<td>Eyes Color&nbsp;
        					<%
                            ddl = (ArrayList)session.getAttribute("dll_eyecolor");
                            %>
                            <select name="eyecolor" <% if (eyecolorErr.length()>0) { %>class="ddlErr"<% } %>>
                            <option value="">
                            <%
                            if (ddl!=null) {
                              for (int j=0;j<ddl.size();j++) {
                                %>
                                <option 
                                    value="<%=ddl.get(j)%>"
                                    <%
                                    if
                                    (ddl.get(j).equals(IntakeServlet.getIntake().getEyeColor()))
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
		<td>Hair Color&nbsp;
        					<%
                            ddl = (ArrayList)session.getAttribute("dll_haircolor");
                            %>
                            <select name="haircolor" <% if (haircolorErr.length()>0) { %>class="ddlErr"<% } %>>
                            <option value="">
                            <%
                            if (ddl!=null) {
                              for (int j=0;j<ddl.size();j++) {
                                %>
                                <option 
                                    value="<%=ddl.get(j)%>"
                                    <%
                                    if
                                    (ddl.get(j).equals(IntakeServlet.getIntake().getHairColor()))
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
        	<td class="fieldError"><%=heightErr%></td>
            <td class="fieldError"><%=weightErr%></td>
            <td class="fieldError"><%=eyecolorErr%></td>
            <td class="fieldError"><%=haircolorErr%></td>
        </tr>
        </table>
       </td>
	</tr>

	<tr>
    <td colspan="8">
        <table width="100%">
        <tr>
        <td>Where do you live?
				&nbsp;&nbsp;
				<%
				ddl = (ArrayList)session.getAttribute("dll_living");
				%>
				<select name="homeLocation" <% if (homeLocationErr.length()>0) { %>class="ddlErr"<% } %>>
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getHomeLocation()))
						{%>selected<%}%>>
					  <%=ddl.get(j)%>
					</option>
					<%
				  }
				  %>
				  <%
				}
			%></td>
		<td>Schooling Completed?
        		&nbsp;
				<%
				ddl = (ArrayList)session.getAttribute("dll_education");
				%>
				<select name="educationLevel" <% if (educationLevelErr.length()>0) { %>class="ddlErr"<% } %>>
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getEducationLevel()))
						{%>selected<%}%>>
					  <%=ddl.get(j)%>
					</option>
					<%
				  }
				  %>
				  <%
				}
			%>
		</td>		
        </tr>
        <tr>
        	<td class="fieldError"><%=homeLocationErr%></td>
            <td class="fieldError"><%=educationLevelErr%></td>
         </tr>
         </table>
        </td>
  
	<tr>
    	<td colspan="8">
        <table width="100%">
        <tr>
        <td>Did you graduate?&nbsp;
        		<%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="graduateFlag" <% if (graduateFlagErr.length()>0) { %>class="ddlErr"<% } %>>
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getGraduateFlag()))
						{%>selected<%}%>>
					  <%=ddl.get(j)%>
					</option>
					<%
				  }
				  %>
				  <%
				}
			%></td>
		<td>Read English? &nbsp;
				<%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="englishReadFlag" <% if (englishReadErr.length()>0) { %>class="ddlErr"<% } %>>
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getEnglishReadFlag()))
						{%>selected<%}%>>
					  <%=ddl.get(j)%>
					</option>
					<%
				  }
				  %>
				  <%
				}
			%>
		</td>
		<td>Speak English?&nbsp;
		
				<%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="englishSpeakFlag" <% if (englishSpeakErr.length()>0) { %>class="ddlErr"<% } %>>
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getEnglishSpeakFlag()))
						{%>selected<%}%>>
					  <%=ddl.get(j)%>
					</option>
					<%
				  }
				  %>
				  <%
				}
			%>
		</td>
        </tr>
        <tr>
        	<td class="fieldError"><%=graduateFlagErr%></td>
            <td class="fieldError"><%=englishReadErr%></td>
            <td class="fieldError"><%=englishSpeakErr%></td>
         </tr>
        </table>
   
     <tr>
		<td colspan="8"><b>Current Income?</b><input type="text" name="incomeAmount" value="<%=IntakeServlet.getIntake().getIncomeAmount() %>" size="10" maxlength="10"/>&nbsp;&nbsp;<b>Check One:</b>&nbsp;
			<input type="checkbox" name="incomeWeeklyFlag" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getIncomeWeeklyFlag())) { %>checked<% } %>/>Weekly&nbsp;&nbsp;
            <input type="checkbox" name="incomeBiWeeklyFlag" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getIncomeBiWeeklyFlag())) { %>checked<% } %> />Bi-Weekly&nbsp;&nbsp;
            <input type="checkbox" name="incomeMonthlyFlag" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getIncomeMonthlyFlag())) { %>checked<% } %>/>Monthly&nbsp;&nbsp;
            <input type="checkbox" name="incomeYearlyFlag" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getIncomeYearlyFlag())) { %>checked<% } %> />Yearly
         </td>
     </tr>
    
	<tr> 
		<td colspan="8">Source(s)?&nbsp;&nbsp;
			<input type="text" name="incomeSource" value="<%=IntakeServlet.getIntake().getIncomeSource() %>" size="40" maxlength="45" onKeyUp="ucase(this)" />
        </td>	
    </tr>

    <tr>
		<td colspan="8"><b>Do you receive government benefits?</b>&nbsp;&nbsp;
			<input type="checkbox" name="ssFlag" value="Social Security"  <% if ("Social Security".equals(IntakeServlet.getIntake().getSSFlag())) { %>checked<% } %> />Social Security&nbsp;&nbsp;
            <input type="checkbox" name="vaFlag" value="VA"  <% if ("VA".equals(IntakeServlet.getIntake().getVAFlag())) { %>checked<% } %>/>VA&nbsp;&nbsp;
            <input type="checkbox" name="wcFlag" value="Workmans Comp"  <% if ("Workmans Comp".equals(IntakeServlet.getIntake().getWCFlag())) { %>checked<% } %> />Workman's Comp
         </td>
     </tr>
    
	<tr>
		<td colspan="8">Other benefits?&nbsp;&nbsp;
			<input type="text" name="other_benefits" size="20" maxlength="20"  value="<%=IntakeServlet.getIntake().getOtherBenefits()%>" onKeyUp="ucase(this)"/>
        </td>	
    </tr>
    
    
    
    

    <tr>
     <td colspan="8">
     	<table width="100%">
        <tr>
        <td width="220">
        <b>Are you a US Veteran?</b> &nbsp;
				<%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="veteranFlag" <% if (veteranFlagErr.length()>0) { %>class="ddlErr"<% } %> >
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getVeteranFlag()))
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
        <td>Branch of Service? &nbsp;
				<%
				ddl = (ArrayList)session.getAttribute("dll_military");
				%>
				<select name="branchOfService" <% if (branchOfServiceErr.length()>0) { %>class="ddlErr"<% } %>>
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getBranchOfService()))
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
            <td class="fieldError"><%=veteranFlagErr%></td>
            <td class="fieldError"><%=branchOfServiceErr%></td>
         </tr>
        </table>
       </td>
     </tr>
  
    <tr>
    	<td colspan="8">
            <table width="100%">
            <tr>
            <td width="220">Highest Rank&nbsp;&nbsp;
                <input type="text" name="rank" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getRank()%>" <% if (rankErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)"/>
            </td>	
            <td >Length Of Service&nbsp;&nbsp;
                <input type="text" name="lengthOfService" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getLengthOfService()%>" <% if (lengthOfServiceErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)"/>
            </td>	
        </tr>
         <tr>
            <td class="fieldError"><%=rankErr%></td>
            <td class="fieldError"><%=lengthOfServiceErr%></td>
         </tr>
         </table>
     </td>
     </tr>
    
    <tr>
     <td colspan="8">
     	<table width="100%">
        <tr>
        <td width="260">Have a Valid Driver's License?&nbsp;&nbsp;
        		<%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="driversLicenseFlag" <% if (driversLicenseFlagErr.length()>0) { %>class="ddlErr"<% } %>>
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getDriversLicenseFlag()))
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
        <td>
        	DL State
			<%
				ddl = (ArrayList)session.getAttribute("dll_states");
				%>
				<select name="driversLicenseState" <% if (driversLicenseStateErr.length()>0) { %>class="ddlErr"<% } %>>
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getDriversLicenseState()))
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
        <td>DL#:&nbsp;&nbsp;
			<input type="text" name="driversLicenseNumber" size="22" maxlength="22" value="<%=IntakeServlet.getIntake().getDriversLicenseNumber()%>" <% if (driversLicenseNumberErr.length()>0) { %>class="textboxErr"<% } %> onKeyUp="ucase(this)"/>
        </td>	
       
    </tr>
    	 <tr>
            <td class="fieldError"><%=driversLicenseFlagErr%></td>
            <td class="fieldError"><%=driversLicenseStateErr%></td>
            <td class="fieldError"><%=driversLicenseNumberErr%></td>
         </tr>
    </table>
    </td></tr>
    
   
    <tr>
     <td colspan="8">
     	<table width="100%">
        <tr>
        <td width="90">
        	<b>Your Family:</b>&nbsp;&nbsp;</td>
            <td width="200">Is your Mother living?
        <%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="motherLivingFlag" <% if (motherLivingFlagErr.length()>0) { %>class="ddlErr"<% } %>>
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getMotherLivingFlag()))
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
           	<td>Is your Father living?
        <%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="fatherLivingFlag" <% if (fatherLivingFlagErr.length()>0) { %>class="ddlErr"<% } %>>
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getFatherLivingFlag()))
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
            <td class="fieldError"></td>
            <td class="fieldError"><%=motherLivingFlagErr%></td>
            <td class="fieldError"><%=fatherLivingFlagErr%></td>
         </tr>
         
         
             <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
        <tr>
     <td colspan="8">
     	<table width="100%">
        <tr>
        <td width="220">Relationship with Mother?&nbsp;&nbsp;<input type="text" name="motherRelationship" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getMotherRelationship()%>" onKeyUp="ucase(this)"  />&nbsp;&nbsp;&nbsp;&nbsp;</td>
    	<td>Relationship with Father?&nbsp;&nbsp;<input type="text" name="fatherRelationship" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getFatherRelationship()%>" onKeyUp="ucase(this)"  />
        <tr>
        
        </table>
    </td></tr>
    
  
    <tr>
    	<td colspan="8">Number of Brothers&nbsp;&nbsp;<input type="text" name="brothers" size="2" value="<%=IntakeServlet.getIntake().getBrothers()%>" onKeyPress="return isNumberKey(event)" />&nbsp;&nbsp;&nbsp;&nbsp;
        				Number of Sisters&nbsp;&nbsp;<input type="text" name="sisters" size="2" value="<%=IntakeServlet.getIntake().getSisters()%>" onKeyPress="return isNumberKey(event)" />&nbsp;&nbsp;&nbsp;&nbsp;
        				Number of Children&nbsp;&nbsp;<input type="text" name="children" size="2" value="<%=IntakeServlet.getIntake().getChildren()%>" onKeyPress="return isNumberKey(event)" />
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>

    <tr>
		<td colspan="8"><b>Homelessness Documentation:</b><br /></td>
	</tr>
    
     <tr>
		<td colspan="8"><br />How long have you been homeless?<br /></td>
      </tr>
      <tr>
      	<td colspan="8">
			<input type="radio" name="homelessLengthOfTime" value="Less than 2 weeks" <% if ("Less than 2 weeks".equals(IntakeServlet.getIntake().getHomelessLengthOfTime())) { %>checked<% } %> />&nbsp;Less than 2 weeks&nbsp;&nbsp;
            <input type="radio" name="homelessLengthOfTime" value="2 weeks to 1 month" <% if ("2 weeks to 1 month".equals(IntakeServlet.getIntake().getHomelessLengthOfTime())) { %>checked<% } %>/>&nbsp;2 weeks to 1 month&nbsp;&nbsp;
            <input type="radio" name="homelessLengthOfTime" value="1 to 3 months" <% if ("1 to 3 months".equals(IntakeServlet.getIntake().getHomelessLengthOfTime())) { %>checked<% } %>/>&nbsp;1 to 3 months&nbsp;&nbsp;
            <input type="radio" name="homelessLengthOfTime" value="3 months to 1 year" <% if ("3 months to 1 year".equals(IntakeServlet.getIntake().getHomelessLengthOfTime())) { %>checked<% } %>/>&nbsp;3 months to 1 year&nbsp;&nbsp;
            <input type="radio" name="homelessLengthOfTime" value="more than 1 year" <% if ("more than 1 year".equals(IntakeServlet.getIntake().getHomelessLengthOfTime())) { %>checked<% } %>/>&nbsp;more than 1 year
         </td>
     </tr>
     <tr>
     	<td></td>
     </tr>
     <tr>
		<td colspan="8"><br />How often have you been homeless?<br /></td>
      </tr>
      <tr>
      	<td colspan="8">
			<input type="radio" name="homelessHowOften" value="Never" <% if ("Never".equals(IntakeServlet.getIntake().getHomelessHowOften())) { %>checked<% } %>/>&nbsp;Never&nbsp;&nbsp;
            <input type="radio" name="homelessHowOften" value="1 to 2 times" <% if ("1 to 2 times".equals(IntakeServlet.getIntake().getHomelessHowOften())) { %>checked<% } %>/>&nbsp;1 to 2 times&nbsp;&nbsp;
            <input type="radio" name="homelessHowOften" value="more than 2 times in 2 years" <% if ("more than 2 times in 2 years".equals(IntakeServlet.getIntake().getHomelessHowOften())) { %>checked<% } %>/>&nbsp;more than 2 times in 2 years&nbsp;&nbsp;
            <input type="radio" name="homelessHowOften" value="Long term" <% if ("Long term".equals(IntakeServlet.getIntake().getHomelessHowOften())) { %>checked<% } %>/>&nbsp;Long term
        </td>
     </tr>
     <tr>
		<td colspan="8"><br />Reason for homelessness:<br /></td>
      </tr>
      <tr>
      	<td colspan="8">
			<input type="radio" name="homelessReason" value="Lack of a fixed, regular and adequate night time residence." <% if ("Lack of a fixed, regular and adequate night time residence.".equals(IntakeServlet.getIntake().getHomelessReason())) { %>checked<% } %>/>&nbsp;Lack of a fixed, regular and adequate night time residence.<br />
            <input type="radio" name="homelessReason" value="Primary night time residence is a shelter designed to provide temporary living accomodations (including welfar hotels, congregate shelters, and transitional housing for the mentally ill)." <% if ("Primary night time residence is a shelter designed to provide temporary living accomodations (including welfar hotels, congregate shelters, and transitional housing for the mentally ill).".equals(IntakeServlet.getIntake().getHomelessReason())) { %>checked<% } %>/>&nbsp;Primary night time residence is a shelter designed to provide temporary living accomodations (including welfar hotels, congregate shelters, and transitional housing for the mentally ill).<br />
            <input type="radio" name="homelessReason" value="Primary night time residence is an institution that provides a temporary residence for individuals intended to be institutionalized." <% if ("Primary night time residence is an institution that provides a temporary residence for individuals intended to be institutionalized.".equals(IntakeServlet.getIntake().getHomelessReason())) { %>checked<% } %>/>&nbsp;Primary night time residence is an institution that provides a temporary residence for individuals intended to be institutionalized.<br />
            <input type="radio" name="homelessReason" value="Primary night time residence is a public or private place not designated for, or ordinarily used as a regular sleeping accomodation for human beings."<% if ("Primary night time residence is a public or private place not designated for, or ordinarily used as a regular sleeping accomodation for human beings.".equals(IntakeServlet.getIntake().getHomelessReason())) { %>checked<% } %> />&nbsp;Primary night time residence is a public or private place not designated for, or ordinarily used as a regular sleeping accomodation for human beings.
        </td>
     </tr>
         </table>
     </td>
     </tr>
   

	<tr>
		<td colspan="8" valign="bottom" align="center" height="45">
            <% if ("YES".equals(updateFlag)) { %>
    	<input type="submit" name="action" value="Update" class="imageButtonSave" title="Update Information" />&nbsp;
    <% } else { %>
    	<input type="submit" name="action" value="Save" class="imageButtonSave" title="Save Information" />&nbsp;
    <% } %></td>
	</tr>

	</table>
     <input type="hidden" name="source" value="personal"/>
      <input type="hidden" name="key" value="<%=IntakeServlet.getIntake().getIntakeId()%>"/>
</form>
  </div>

 
</div>
    