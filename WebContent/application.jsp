<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="student_header.jsp" flush="true"/>
 
<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");

   String farmErr=(String)request.getAttribute("farmErr");
   if (farmErr==null) farmErr="";
   
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
 
 
   String religiousExperienceErr = (String)request.getAttribute("religiousExperienceErr");
   if (religiousExperienceErr==null) religiousExperienceErr="";

    String religionErr = (String)request.getAttribute("religionErr");
   if (religionErr==null) religionErr="";

String sober1YearsErr = (String)request.getAttribute("sober1YearsErr");
   if (sober1YearsErr==null) sober1YearsErr="";

String sober3YearsErr = (String)request.getAttribute("sober3YearsErr");
   if (sober3YearsErr==null) sober3YearsErr="";

String yearsAttendedErr = (String)request.getAttribute("yearsAttendedErr");
   if (yearsAttendedErr==null) yearsAttendedErr="";

String previousFaithFarmFlagErr = (String)request.getAttribute("previousFaithFarmFlagErr");
   if (previousFaithFarmFlagErr==null) previousFaithFarmFlagErr="";
   
   String previousFaithFarmErr = (String)request.getAttribute("previousFaithFarmErr");
   if (previousFaithFarmErr==null) previousFaithFarmErr="";
   
   String ffYearsAttendedErr = (String)request.getAttribute("ffYearsAttendedErr");
   if (ffYearsAttendedErr==null) ffYearsAttendedErr="";
   
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
   
  String lawsuitDateErr = (String)request.getAttribute("lawsuitDateErr");
   if (lawsuitDateErr==null) lawsuitDateErr="";

  String lawsuitDetailsErr = (String)request.getAttribute("lawsuitDetailsErr");
   if (lawsuitDetailsErr==null) lawsuitDetailsErr="";

  String currentLawsuitDateErr = (String)request.getAttribute("currentLawsuitDateErr");
   if (currentLawsuitDateErr==null) currentLawsuitDateErr="";

  String currentLawsuitDetailsErr = (String)request.getAttribute("currentLawsuitDetailsErr");
   if (currentLawsuitDetailsErr==null) currentLawsuitDetailsErr="";

  String felonyQtyErr = (String)request.getAttribute("felonyQtyErr");
   if (felonyQtyErr==null) felonyQtyErr="";

  String felonyDetailsErr = (String)request.getAttribute("felonyDetailsErr");
   if (felonyDetailsErr==null) felonyDetailsErr="";

  String sexualOffenseQtyErr = (String)request.getAttribute("sexualOffenseQtyErr");
   if (sexualOffenseQtyErr==null) sexualOffenseQtyErr="";

  String sexualOffenseDetailsErr = (String)request.getAttribute("sexualOffenseDetailsErr");
   if (sexualOffenseDetailsErr==null) sexualOffenseDetailsErr="";

  String probationCountyErr = (String)request.getAttribute("probationCountyErr");
   if (probationCountyErr==null) probationCountyErr="";
   
     String probationStateErr = (String)request.getAttribute("probationStateErr");
   if (probationStateErr==null) probationStateErr="";
   
     String probationOfficerErr = (String)request.getAttribute("probationOfficerErr");
   if (probationOfficerErr==null) probationOfficerErr="";
   
     String probationOfficerPhoneErr = (String)request.getAttribute("probationOfficerPhoneErr");
   if (probationOfficerPhoneErr==null) probationOfficerPhoneErr="";

  String probationApptDetailsErr = (String)request.getAttribute("probationApptDetailsErr");
   if (probationApptDetailsErr==null) probationApptDetailsErr="";

 String workExperienceOtherDescErr = (String)request.getAttribute("workExperienceOtherDescErr");
   if (workExperienceOtherDescErr==null) workExperienceOtherDescErr="";

   String currentMedicationsErr = (String)request.getAttribute("currentMedicationsErr");
   if (currentMedicationsErr==null) currentMedicationsErr="";

 String refillDirectionsErr = (String)request.getAttribute("refillDirectionsErr");
   if (refillDirectionsErr==null) refillDirectionsErr="";

	
   String required = "<img src='images/required.png'/>";
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
<h5><img src="img/success.png"/><%=message %></h5>	
<% } %>
    <table>
	<tr>
		<td colspan="8"><h1><b>Online Student Application for Faith Farm Programs</b></h1></td>
	</tr>
	<tr>
		<td colspan="8"><b>Campus: 
		<%
                        ArrayList farms = (ArrayList)session.getAttribute("dllFarm");
                        %>
                        <select name="farmBase" <% if (farmErr.length()>0) { %>class="ddlErr"<% } %>>
                        <option value="">
                        <%
                        if (farms!=null) {
                          for (int j=0;j<farms.size();j++) {
                            %>
                            <option 
                                value="<%=farms.get(j)%>"
                                <%
                                if 
                                (farms.get(j).equals(IntakeServlet.getIntake().getFarmBase()))
                                {%>selected<%}%>>
                              <%=farms.get(j)%>
                            </option>
                            <%
                          }
                          %>
                          <%
                        }
                    %></select>
		
		</b></td>
	</tr>
	<tr>
		<td colspan="8" class="fieldError"><%=farmErr %></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8"><b>General Information: </b></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    
	<tr>
    	<td colspan="8">
                <table width="100%" border="0">
                <tr>
                <td>Last Name</td>
                <td><input type="text" name="lastname" value="<%=IntakeServlet.getIntake().getLastName()%>" size="30" maxlength="30" <% if (lastNameErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"></td>
                <td>&nbsp;&nbsp;</td>
                <td>First Name</td>
                <td><input type="text" name="firstname" value="<%=IntakeServlet.getIntake().getFirstName()%>" size="30" maxlength="30" <% if (firstNameErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"></td>
                <td>&nbsp;&nbsp;</td>
                <td>MI</td>
                <td colspan="2" align="left"><input type="text" name="mi" value="<%=IntakeServlet.getIntake().getMiddleInitial()%>"  size="1" maxlength="1"  <% if (middleInitialErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"></td>
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
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
    	<td colspan="8">
                <table width="100%" border="0">
                <tr>	
                <td >SSN</td>
                <td>
                <%
                String ssn1=valid8r.cleanData(request.getParameter("ssn1"));
                String ssn2=valid8r.cleanData(request.getParameter("ssn2"));
                String ssn3=valid8r.cleanData(request.getParameter("ssn3"));
                %>
                <input id="ssn1"  type="text" name="ssn1" size="3" value="<%=ssn1%>" maxlength="3" <% if (ssnErr.length()>0) { %>class="textboxErr"<% } %> onkeypress="return isNumberKey(event)" onkeyup="moveOnMax(this,'ssn2')" >-
                <input id="ssn2"  type="text" name="ssn2" size="2" value="<%=ssn2%>" maxlength="2" <% if (ssnErr.length()>0) { %>class="textboxErr"<% } %> onkeypress="return isNumberKey(event)" onkeyup="moveOnMax(this,'ssn3')" >-
                <input id="ssn3"  type="text" name="ssn3" size="4" value="<%=ssn3%>" maxlength="4" <% if (ssnErr.length()>0) { %>class="textboxErr"<% } %> onkeypress="return isNumberKey(event)" onkeyup="moveOnMax(this,'referred')" ></td>
                <td>&nbsp;&nbsp;</td>
                <td >Referred to Faith Farm By</td>
                <td><input id="referred" type="text" name="referredBy" value="<%=IntakeServlet.getIntake().getReferredBy()%>" size="28" maxlength="28" onkeyup="ucase(this)"></td>
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
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
    	<td colspan="8">
                <table width="100%" border="0">
                <tr>
                <td>Address of Contact&nbsp;<input type="text" name="address" value="<%=IntakeServlet.getIntake().getAddress()%>" size="30" maxlength="45" <% if (addressErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)">&nbsp;&nbsp;</td>
                <td>City&nbsp;<input type="text" name="city" value="<%=IntakeServlet.getIntake().getCity()%>" size="20" maxlength="25" <% if (cityErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)">&nbsp;&nbsp;</td>
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
               <td >Zipcode&nbsp;&nbsp;<input type="text" name="zipcode" value="<%=IntakeServlet.getIntake().getZipcode()%>" size="5" maxlength="5" onkeypress="return isNumberKey(event)" <% if (zipcodeErr.length()>0) { %>class="textboxErr"<% } %>>&nbsp;&nbsp;
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
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
    	<td colspan="8"> 
                <table width="100%" border="0">
                <tr>
                <td width="200">Phone Number&nbsp;<i>(xxx)xxx-xxxx</i>&nbsp;
                <input type="text" name="referral_phone"  value="<%=IntakeServlet.getIntake().getReferralPhone()%>" size="20" maxlength="13" <% if (referralPhoneErr.length()>0) { %>class="textboxErr"<% } %> onkeypress="return isNumberKey(event)"></td>
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
                <td colspan="8">&nbsp;</td>
                </tr>
                <tr>
                <td>Emergency Contact&nbsp;<input type="text" name="emergencyContact" value="<%=IntakeServlet.getIntake().getEmergencyContact()%>" size="28" maxlength="28" <% if (emergencyContactErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"> </td>
                <td>Relationship&nbsp;<input type="text" name="emergencyRelationship" value="<%=IntakeServlet.getIntake().getEmergencyRelationship()%>" size="20" maxlength="20" <% if (emergencyRelationshipErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"></td>
                <td>Phone&nbsp;<i>(xxx)xxx-xxxx</i>&nbsp;<input type="text" name="emergencyPhone" size="20" value="<%=IntakeServlet.getIntake().getEmergencyPhone()%>" maxlength="13" <% if (emergencyPhoneErr.length()>0) { %>class="textboxErr"<% } %> onkeypress="return isNumberKey(event)"></td>
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
		<td colspan="8">&nbsp;</td>
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
		<td colspan="8">&nbsp;</td>
	</tr>
	
	<tr>
		<td colspan="8">
        <table width="100%">
        <tr>
        <td>Height&nbsp;<input type="text" name="height" value="<%=IntakeServlet.getIntake().getHeight()%>"size="4" maxlength="5" <% if (heightErr.length()>0) { %>class="textboxErr"<% } %>></td>
		<td>Weight&nbsp;<input type="text" name="weight"  value="<%=IntakeServlet.getIntake().getWeight()%>"size="6" maxlength="5" <% if (weightErr.length()>0) { %>class="textboxErr"<% } %>></td>
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
		<td colspan="8">&nbsp;</td>
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
		<td colspan="8">&nbsp;</td>
	</tr>
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
		<td colspan="8">&nbsp;</td>
	</tr>
     <tr>
		<td colspan="8"><b>Current Income?</b><input type="text" name="incomeAmount" value="<%=IntakeServlet.getIntake().getIncomeAmount() %>" size="10" maxlength="10"/>&nbsp;&nbsp;<b>Check One:</b>&nbsp;
			<input type="checkbox" name="incomeWeeklyFlag" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getIncomeWeeklyFlag())) { %>checked<% } %>/>Weekly&nbsp;&nbsp;
            <input type="checkbox" name="incomeBiWeeklyFlag" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getIncomeBiWeeklyFlag())) { %>checked<% } %> />Bi-Weekly&nbsp;&nbsp;
            <input type="checkbox" name="incomeMonthlyFlag" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getIncomeMonthlyFlag())) { %>checked<% } %>/>Monthly&nbsp;&nbsp;
            <input type="checkbox" name="incomeYearlyFlag" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getIncomeYearlyFlag())) { %>checked<% } %> />Yearly
         </td>
     </tr>
     <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr> 
		<td colspan="8">Source(s)?&nbsp;&nbsp;
			<input type="text" name="incomeSource" value="<%=IntakeServlet.getIntake().getIncomeSource() %>" size="40" maxlength="45" onkeyup="ucase(this)" />
        </td>	
    </tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
		<td colspan="8"><b>Do you receive government benefits?</b>&nbsp;&nbsp;
			<input type="checkbox" name="ssFlag" value="Social Security"  <% if ("Social Security".equals(IntakeServlet.getIntake().getSSFlag())) { %>checked<% } %> />Social Security&nbsp;&nbsp;
            <input type="checkbox" name="vaFlag" value="VA"  <% if ("VA".equals(IntakeServlet.getIntake().getVAFlag())) { %>checked<% } %>/>VA&nbsp;&nbsp;
            <input type="checkbox" name="wcFlag" value="Workmans Comp"  <% if ("Workmans Comp".equals(IntakeServlet.getIntake().getWCFlag())) { %>checked<% } %> />Workman's Comp
         </td>
     </tr>
     <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8">Other benefits?&nbsp;&nbsp;
			<input type="text" name="other_benefits" size="20" maxlength="20"  value="<%=IntakeServlet.getIntake().getOtherBenefits()%>" onkeyup="ucase(this)"/>
        </td>	
    </tr>
    
    
    
    
	<tr>
		<td colspan="8">&nbsp;</td>
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
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
    	<td colspan="8">
            <table width="100%">
            <tr>
            <td width="220">Highest Rank&nbsp;&nbsp;
                <input type="text" name="rank" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getRank()%>" <% if (rankErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"/>
            </td>	
            <td >Length Of Service&nbsp;&nbsp;
                <input type="text" name="lengthOfService" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getLengthOfService()%>" <% if (lengthOfServiceErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"/>
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
		<td colspan="8">&nbsp;</td>
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
			<input type="text" name="driversLicenseNumber" size="22" maxlength="22" value="<%=IntakeServlet.getIntake().getDriversLicenseNumber()%>" <% if (driversLicenseNumberErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"/>
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
		<td colspan="8">&nbsp;</td>
	</tr>
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
         </table>
     </td>
     </tr>
     
     <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
     <td colspan="8">
     	<table width="100%">
        <tr>
        <td width="220">Relationship with Mother?&nbsp;&nbsp;<input type="text" name="motherRelationship" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getMotherRelationship()%>" onkeyup="ucase(this)"  />&nbsp;&nbsp;&nbsp;&nbsp;</td>
    	<td>Relationship with Father?&nbsp;&nbsp;<input type="text" name="fatherRelationship" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getFatherRelationship()%>" onkeyup="ucase(this)"  />
        <tr>
        
        </table>
    </td></tr>
    
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
    	<td colspan="8">Number of Brothers&nbsp;&nbsp;<input type="text" name="brothers" size="2" value="<%=IntakeServlet.getIntake().getBrothers()%>" onkeypress="return isNumberKey(event)" />&nbsp;&nbsp;&nbsp;&nbsp;
        				Number of Sisters&nbsp;&nbsp;<input type="text" name="sisters" size="2" value="<%=IntakeServlet.getIntake().getSisters()%>" onkeypress="return isNumberKey(event)" />&nbsp;&nbsp;&nbsp;&nbsp;
        				Number of Children&nbsp;&nbsp;<input type="text" name="children" size="2" value="<%=IntakeServlet.getIntake().getChildren()%>" onkeypress="return isNumberKey(event)" />
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8"><b>Describe your religious/spiritual experiences:</b></td>
	</tr>
    <tr>
    	<td class="fieldError"><%=religiousExperienceErr%></td>
    </tr>
	<tr>
		<td colspan="8"><textarea rows="5" name="religiousExperience" cols="93" <% if (religiousExperienceErr.length()>0) { %>class="areaErr"<% } %> onkeyup="ucase(this)"><%=IntakeServlet.getIntake().getReligiousExperience()%></textarea></td>
	</tr>
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
		<td colspan="11">Religious Background
       <% ddl = (ArrayList)session.getAttribute("dll_religion");
				%>
				<select name="religion" <% if (religionErr.length()>0) { %>class="ddlErr"<% } %>>
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getReligion()))
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
    	<td class="fieldError"><%=religionErr%></td>
    </tr>
    
    
    
    
    
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
     <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	
    
    
    
    
    
    
    
    
    
    
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>Chemical Dependency (Answer all that apply):</b></td>
	</tr>
	<tr>
		<td  valign="top" colspan="4">
			<table border="0" cellpadding="5" cellspacing="5" width="352" height="243" align="left">
				<tr>
					<td width="124">

					Substance</td>
					<td width="102">

					Years Used</td>
					<td>

					Last Used</td>
				</tr>
				<tr>
					<td width="124">

					Alcohol</td>
					<td width="102">

					<input type="text" name="alcoholYearsUsed" value="<%=IntakeServlet.getIntake().getAlcoholYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="alcoholLastUsed" value="<%=IntakeServlet.getIntake().getAlcoholLastUsed()%>"  size="12" maxlength="25" ></td>
				</tr>
				<tr>
					<td width="124">

					Cocaine</td>
					<td width="102">

					<input type="text" name="cocaineYearsUsed" value="<%=IntakeServlet.getIntake().getCocaineYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="cocaineLastUsed" value="<%=IntakeServlet.getIntake().getCocaineLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Marijuana</td>
					<td width="102">

					<input type="text" name="marijuanaYearsUsed" value="<%=IntakeServlet.getIntake().getMarijuanaYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="marijuanaLastUsed" value="<%=IntakeServlet.getIntake().getMarijuanaLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Oxycodone</td>
					<td width="102">

					<input type="text" name="oxycodoneYearsUsed" value="<%=IntakeServlet.getIntake().getOxycodoneYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="oxycodoneLastUsed" value="<%=IntakeServlet.getIntake().getOxycodoneLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Speed</td>
					<td width="102">

					<input type="text" name="speedYearsUsed" value="<%=IntakeServlet.getIntake().getSpeedYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="speedLastUsed" value="<%=IntakeServlet.getIntake().getSpeedLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Heroin</td>
					<td width="102">

					<input type="text" name="heroinYearsUsed" value="<%=IntakeServlet.getIntake().getHeroinYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="heroinLastUsed" value="<%=IntakeServlet.getIntake().getHeroinLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
                <tr>
					<td width="124">

					Xanax</td>
					<td width="102">

					<input type="text" name="xanaxYearsUsed" value="<%=IntakeServlet.getIntake().getXanaxYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="xanaxLastUsed" value="<%=IntakeServlet.getIntake().getXanaxLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Other</td>
					<td width="102">

					<input type="text" name="otherYearsUsed" value="<%=IntakeServlet.getIntake().getOtherYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="otherLastUsed" value="<%=IntakeServlet.getIntake().getOtherLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
			</table>
		</td>
		<td>&nbsp;</td>
        </tr>
        
        <tr>
			<td colspan="8">&nbsp;</td>
	    </tr>
    
        <tr>
			<td valign="top">Longest time sober in past 3 years?&nbsp;<input type="text" name="sober3Years" value="<%=IntakeServlet.getIntake().getSober3Years()%>" size="9" maxlength="15" <% if (sober3YearsErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"></td>
			<td valign="top">in the last year? <input type="text" name="sober1Years" value="<%=IntakeServlet.getIntake().getSober1Years()%>" size="9" maxlength="15" <% if (sober1YearsErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)">
        	</td>
        </tr>
        <tr>
        	<td class="fieldError"><%=sober3YearsErr%></td>
            <td class="fieldError"><%=sober1YearsErr%></td>
        </tr>
        <tr>
			<td colspan="8">&nbsp;</td>
		</tr>
        <tr>
    	<td colspan="8">
        Physical effects of abuse<br><input type="text" name="abusePhysicalEffects" value="<%=IntakeServlet.getIntake().getAbusePhysicalEffects()%>" size="45" onkeyup="ucase(this)"><br><br>
		<b>Any Previous Rehabs?</b>&nbsp;
			<input type="checkbox" name="attendAA" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getAttendAA())) { %>checked <%}%>/>AA or NA&nbsp;&nbsp;
            Number of Years&nbsp;<input type="text" name="yearsAttended" value="<%=IntakeServlet.getIntake().getYearsAttended()%>" size="10" maxlength="10" <% if (yearsAttendedErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"/>&nbsp;<div style="font:11px Arial;color: #b71524;"><b><i><%=yearsAttendedErr%></i></b></div>
         </td>
         
         <tr>
         <td colspan="8">
         	<table width="100%">
            <tr>
            	<td>
                    Ever been to a Faith Farm Before?&nbsp;
                    <% ddl = (ArrayList)session.getAttribute("dll_yesno");
                        %>
                        <select name="previousFaithFarmFlag" <% if (previousFaithFarmFlagErr.length()>0) { %>class="ddlErr"<% } %>>
                        <%
                        if (ddl!=null) {
                          for (int j=0;j<ddl.size();j++) {
                            %>
                            <option 
                                value="<%=ddl.get(j)%>"
                                <%
                                if
                                (ddl.get(j).equals(IntakeServlet.getIntake().getPreviousFaithFarmFlag()))
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
					Year:&nbsp;<input type="text" name="ffYearsAttended" size="12" maxlength="12" value="<%=IntakeServlet.getIntake().getFfYearsAttended()%>" size="10" maxlength="10" <% if (ffYearsAttendedErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"/>
                </td>
                <td>
					Where:&nbsp;
                    <select name="previousFaithFarm" <% if (previousFaithFarmErr.length()>0) { %>class="ddlErr"<%}%>>
                        <option value="BOYNTON BEACH" <% if("BOYNTON BEACH".equals(IntakeServlet.getIntake().getPreviousFaithFarm())) { %>selected<% } %>>BOYNTON BEACH</option>
                        <option value="FT. LAUDERDALE"  <% if("FT. LAUDERDALE".equals(IntakeServlet.getIntake().getPreviousFaithFarm())) { %>selected<% } %>>FT. LAUDERDALE</option>
                        <option value="OKEECHOBEE"  <% if("OKEECHOBEE".equals(IntakeServlet.getIntake().getPreviousFaithFarm())) { %>selected<% } %>>OKEECHOBEE</option>
                        <option value=""></option>
                    </select>
            	</td>
             </tr>
              <tr>
             	<td class="fieldError"><%=previousFaithFarmFlagErr%></td>
                <td class="fieldError"><%=ffYearsAttendedErr%></td>
                <td class="fieldError"><%=previousFaithFarmErr%></td>
             </tr>
             <tr>
             	<td colspan="3">
           		 Other Rehabs<input type="text" name="otherRehabs" value="<%=IntakeServlet.getIntake().getOtherRehabs()%>" size="45" maxlength="45" onkeyup="ucase(this)"/>
                </td>
             </tr>
            
             </table>
		</td>
	</tr>
     <tr>
			<td colspan="8">&nbsp;</td>
		</tr>
        <tr>
        	<td colspan="8" valign="top">
		<b>Pattern of usage:</b><br>
        	<input type="checkbox" name="usagePattern1" value="Constantly" <% if ("Constantly".equals (IntakeServlet.getIntake().getUsagePattern1())) { %>checked<%}%>  />Constantly&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern2" value="Weekends" <% if ("Weekends".equals (IntakeServlet.getIntake().getUsagePattern2())) { %>checked<%}%>/>Weekends&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern3" value="Special Occasions" <% if ("Special Occasions".equals (IntakeServlet.getIntake().getUsagePattern3())) { %>checked<%}%>/>Special Occasions&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern4" value="Whenever available" <% if ("Whenever available".equals (IntakeServlet.getIntake().getUsagePattern4())) { %>checked<%}%>/>Whenever available&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern5" value="When Things Get Tough" <% if ("When Things Get Tough".equals (IntakeServlet.getIntake().getUsagePattern5())) { %>checked<%}%>/>When Things Get Tough&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern6" value="A Week/Off A Week" <% if ("A Week/Off A Week".equals (IntakeServlet.getIntake().getUsagePattern6())) { %>checked<%}%>/>On A Week/Off A Week
        </br></br> 
		<b>Losses due to usage:</b><br>
        	<input type="checkbox" name="usageLosses1" value="Job" <% if ("Job".equals (IntakeServlet.getIntake().getUsageLosses1())) { %>checked<%}%> />Job&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses2" value="Marriage" <% if ("Marriage".equals (IntakeServlet.getIntake().getUsageLosses2())) { %>checked<%}%>/>Marriage&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses3" value="Friends" <% if ("Friends".equals (IntakeServlet.getIntake().getUsageLosses3())) { %>checked<%}%>/>Friends&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses4" value="Possessions" <% if ("Possessions".equals (IntakeServlet.getIntake().getUsageLosses4())) { %>checked<%}%>/>Possessions&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses5" value="Arrests" <% if ("Arrests".equals (IntakeServlet.getIntake().getUsageLosses5())) { %>checked<%}%>/>Arrests&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses6" value="DUIs" <% if ("DUIs".equals (IntakeServlet.getIntake().getUsageLosses6())) { %>checked<%}%>/>DUI's&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses7" value="Heavy Debt" <% if ("Heavy Debt".equals (IntakeServlet.getIntake().getUsageLosses7())) { %>checked<%}%> />Heavy Debt&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses8" value="Health" <% if ("Health".equals (IntakeServlet.getIntake().getUsageLosses8())) { %>checked<%}%>/>Health&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses9" value="Incarceration" <% if ("Incarceration".equals (IntakeServlet.getIntake().getUsageLosses9())) { %>checked<%}%>/>Incarceration
        	</td>
         </tr>
     <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    
          <tr>
        	<td colspan="8" valign="top">
			<b>Quantity Consumed:</b><br>
        		Per week:&nbsp;&nbsp;<input type="textbox" name="qtyConsumed1" value="<%=IntakeServlet.getIntake().getQtyConsumed1() %>" size="25" maxlength="25" />
            	Per week 2 years ago:&nbsp;&nbsp;<input type="textbox" name="qtyConsumed2" value="<%=IntakeServlet.getIntake().getQtyConsumed2() %>" size="25" maxlength="25" />
 			</td>
         </tr>
    
       <tr>
		<td colspan="8">&nbsp;</td>
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
		<td colspan="8">&nbsp;</td>
	</tr>
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
		<td colspan="8">&nbsp;</td>
	</tr>
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
		<td colspan="8">&nbsp;</td>
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
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8"><b>Legal Information:</b></td>
	</tr>
		<tr>
		<td colspan="8">Have you ever been sued?&nbsp;
			<select name="lawsuitFlag">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getLawsuitFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %>
                            </select>&nbsp;&nbsp;&nbsp;If yes, when&nbsp;<input type="text" name="lawsuitDate" size="10" maxlength="10" value="<%=IntakeServlet.getIntake().getLawsuitDate()%>" <% if (lawsuitDateErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)">
		</td>
	</tr>
    <tr><td colspan="8" class="fieldError"><%=lawsuitDateErr%></td></tr>
    <tr>
		<td colspan="8">Details:&nbsp;</td>
    </tr>
    <tr><td colspan="8" class="fieldError"><%=lawsuitDetailsErr%></td></tr>
	<tr>
    	<td colspan="8"><textarea rows="5" name="lawsuitDetails" cols="93" <% if (lawsuitDetailsErr.length()>0) { %>class="areaErr"<%}%> onkeyup="ucase(this)"><%=IntakeServlet.getIntake().getLawsuitDetails()%></textarea></td>
	</tr>
    <tr>
		<td colspan="8">Are you involved in a lawsuit?&nbsp;
			<select name="currentLawsuitFlag" class="dll">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getCurrentLawsuitFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %>
                            </select>&nbsp;&nbsp;&nbsp;If yes, when:<input type="text" name="currentLawsuitDate" size="10" maxlength="10" value="<%=IntakeServlet.getIntake().getCurrentLawsuitDate()%>" <% if (currentLawsuitDateErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"/>
		</td>
	</tr>
    <tr><td colspan="8" class="fieldError"><%=currentLawsuitDateErr%></td></tr>
	<tr>
		<td colspan="8"></td>
	</tr>
	<tr>
		<td colspan="8">Details:</td>
     </tr>
     	<tr><td colspan="8" class="fieldError"><%=currentLawsuitDetailsErr%></td></tr>
     <tr>
     	<td colspan="8"><textarea rows="5" name="currentLawsuitDetails" cols="93" <% if (currentLawsuitDetailsErr.length()>0) { %>class="areaErr"<%}%> onkeyup="ucase(this)"><%=IntakeServlet.getIntake().getCurrentLawsuitDetails()%></textarea></td>
	</tr>
	<tr>
		<td colspan="8">Ever convicted of a felony?&nbsp;
        <select name="felonyFlag"  class="ddl">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getCurrentLawsuitFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %>
                            </select>&nbsp;&nbsp;&nbsp;If yes, how many:<input type="text" name="felonyQty" size="3" maxlength="2" value="<%=IntakeServlet.getIntake().getFelonyQty()%>" <% if (felonyQtyErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)">
        </td>
	</tr>
    <tr><td colspan="8" class="fieldError"><%=felonyQtyErr%></td></tr>
	<tr>
		<td colspan="8">Details:</td>
     </tr>
     <tr><td colspan="8" class="fieldError"><%=felonyDetailsErr%></td></tr>
     <tr>
     	<td colspan="8"><textarea rows="5" name="felonyDetails" cols="93" <% if (felonyDetailsErr.length()>0) { %>class="areaErr"<%}%> onkeyup="ucase(this)"><%=IntakeServlet.getIntake().getFelonyDetails()%></textarea></td>
	</tr>
    <tr>
		<td colspan="8">Ever convicted of a sexual offense?&nbsp;
        <select name="sexualOffenseFlag"   class="ddl">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getSexualOffenseFlag()))
                                            {%>selected<%}%>>
                                          <%=ddl.get(j)%>
                                        </option>
                                        <%
                                      }
                                      %>
                                      <%
                                    }
                                    %>
                            </select>&nbsp;&nbsp;&nbsp;If yes, how many:<input type="text" name="sexualOffenseQty" size="3" maxlength="2" value="<%=IntakeServlet.getIntake().getSexualOffenseQty()%>" <% if (sexualOffenseQtyErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"/>
        </td>
	</tr>
    <tr><td colspan="8" class="fieldError"><%=sexualOffenseQtyErr%></td></tr>
	<tr>
		<td colspan="8">Details:</td>
    </tr>
    <tr><td colspan="8" class="fieldError"><%=sexualOffenseDetailsErr%></td></tr>
    <tr>
    	<td colspan="8"><textarea rows="5" name="sexualOffenseDetails" cols="93" <% if (sexualOffenseDetailsErr.length()>0) { %>class="areaErr"<%}%> onkeyup="ucase(this)"><%=IntakeServlet.getIntake().getSexualOffenseDetails()%></textarea></td>
	</tr>
    <tr>
		<td colspan="8" ></td>
	</tr>
	<tr>
		<td colspan="8">Are you on probation? &nbsp;
			<select name="probationFlag">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getProbationFlag()))
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
	<tr>
		<td colspan="8">What County?&nbsp;<input type="text" name="probationCounty" value="<%=IntakeServlet.getIntake().getProbationCounty()%>" size="20" maxlength="20" <% if (probationCountyErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"></td>
	</tr>
    <tr>
		<td colspan="8" class="fieldError"><%=probationCountyErr%></td>
	</tr>
    <tr>
		<td colspan="8">What State?&nbsp;
        		<%
					ddl=(ArrayList)session.getAttribute("dll_states");
				%>
        		<select name="probationState" <% if (probationStateErr.length()>0) { %>class="ddlErr"<%}%>>
                                    <option value=""></option>
									<%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getProbationState()))
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
    <tr>
		<td colspan="8" class="fieldError"><%=probationStateErr%></td>
	</tr>
	<tr>
		<td colspan="8">Probation Officers Name:&nbsp;<input type="text" name="probationOfficer" value="<%=IntakeServlet.getIntake().getProbationOfficer()%>" size="20" maxlength="20" <% if (probationOfficerErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"></td>
	</tr>
    <tr>
		<td colspan="8" class="fieldError"><%=probationOfficerErr%></td>
	</tr>
	<tr>
		<td colspan="8">Probation Officers Phone #:&nbsp;<input type="text" name="probationOfficerPhone" value="<%=IntakeServlet.getIntake().getProbationOfficerPhone()%>" size="20" maxlength="20" <% if (probationOfficerPhoneErr.length()>0) { %>class="textboxErr"<%}%> onkeypress="return isNumberKey(event)"></td>
	</tr>
    <tr>
		<td colspan="8" class="fieldError"><%=probationOfficerPhoneErr%></td>
	</tr>
	<tr>
		<td colspan="8">Any Court or Probation appointments in the next 30 days?&nbsp;
			<%
					ddl=(ArrayList)session.getAttribute("dll_yesno");
			%>
            <select name="probationAppt"  class="ddl">
                                    <option value="">
                                    <%
                                    if (ddl!=null) {
                                      for (int j=0;j<ddl.size();j++) {
                                        %>
                                        <option 
                                            value="<%=ddl.get(j)%>"
                                            <%
                                            if
                                            (ddl.get(j).equals(IntakeServlet.getIntake().getProbationAppt()))
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
      <tr>
      <td colspan="8">If yes, Dates & Times:<input type="text" name="probationApptDetails" size="45" maxlength="45" value="<%=IntakeServlet.getIntake().getProbationApptDetails()%>" <% if (probationApptDetailsErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)">
		</td>
	</tr>	
     <tr>
		<td colspan="8" class="fieldError"><%=probationApptDetailsErr%></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>	
    
    
    
    
    
    
    
    
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
		<td colspan="8">&nbsp;</td>
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
		<td colspan="11" valign="bottom" align="center" height="45"><input type="submit" name="action" value="Save"  title="Save Application" /></td>
	</tr>

	</table>
    
    <input type="hidden" name="source" value="application"/>
</form>
  </div>

</div>
  
<jsp:include page="footer.jsp" flush="true"/>
    

</body>
</html>
