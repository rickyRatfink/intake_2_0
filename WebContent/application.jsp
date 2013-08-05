<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="student_header.jsp" flush="true"/>

<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");

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


String Err = (String)request.getAttribute("Err");
   if (Err==null) Err="";

	
   String required = "<img src='images/required.png'/>";
%>

<style type="text/css">

BODY {
font-family:Tahoma, Geneva, Helvetica; 
	font-size:.7em; 
	margin:0 auto; 
	color:#3F1910; 
	text-align:left;
}

</style>


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
<h5><img src="images/success.png"/><%=message %></h5>	
<% } %>
    <table>
	<tr>
		<td colspan="8"><h1><b>Online Student Application for Faith Farm Programs</b></h1></td>
	</tr>
	<tr>
		<td colspan="8"><b>Campus: Boynton Beach </b></td>
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
		<td colspan="8" valign="bottom" align="center" height="45"><input type="submit" name="action" value="Save Application" class="imageButtonSave" title="Save Application" /></td>
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
                <td><input id="referred" type="text" name="referredBy" value="<%=IntakeServlet.getIntake().getReferredBy()%>" size="28"></td>
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
                <input type="text" name="referral_phone"  value="<%=IntakeServlet.getIntake().getReferralPhone()%>" size="20" maxlength="13" <% if (referralPhoneErr.length()>0) { %>class="textboxErr"<% } %>></td>
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
				<option value="">
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
				<option value="">
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
				<option value="">
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
			<input type="text" name="incomeSource" value="<%=IntakeServlet.getIntake().getIncomeSource() %>" size="40" maxlength="15" onkeyup="ucase(this)" />
        </td>	
    </tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
		<td colspan="8"><b>Do you receive government benefits?</b>&nbsp;&nbsp;
			<input type="checkbox" name="ssFlag" value="YES"  <% if ("YES".equals(IntakeServlet.getIntake().getSSFlag())) { %>checked<% } %> />Social Security&nbsp;&nbsp;
            <input type="checkbox" name="vaFlag" value="YES"  <% if ("YES".equals(IntakeServlet.getIntake().getVAFlag())) { %>checked<% } %>/>VA&nbsp;&nbsp;
            <input type="checkbox" name="wcFlag" value="YES"  <% if ("YES".equals(IntakeServlet.getIntake().getWCFlag())) { %>checked<% } %> />Workman's Comp
         </td>
     </tr>
     <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8">Other benefits?&nbsp;&nbsp;
			<input type="text" name="other_benefits" size="20" maxlength="20"  value="<%=IntakeServlet.getIntake().getOtherBenefits()%>" />
        </td>	
    </tr>
    
    
    
    
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
     <td colspan="8">
     	<table width="100%">
        <tr>
        <td width="220">
        <b>Are you a US Veteran?</b> &nbsp;
				<%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="veteranFlag" <% if (veteranFlagErr.length()>0) { %>class="ddlErr"<% } %> >
				<option value="">
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
			%>
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
			%>
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
                <input type="text" name="rank" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getRank()%>" <% if (rankErr.length()>0) { %>class="textboxErr"<% } %> />
            </td>	
            <td >Length Of Service&nbsp;&nbsp;
                <input type="text" name="lengthOfService" size="20" maxlength="20" value="<%=IntakeServlet.getIntake().getLengthOfService()%>" <% if (lengthOfServiceErr.length()>0) { %>class="textboxErr"<% } %> />
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
    	<td colspan="4"><b>Have a Valid Driver's License</b>&nbsp;&nbsp;
        <%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="health" class="dll">
				<option value="">
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
			%>
        </td>
        <td>
        	DL State
			<%
				ddl = (ArrayList)session.getAttribute("dll_states");
				%>
				<select name="health" class="dll">
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
			%>
        </td>	
        <td>DL#:&nbsp;&nbsp;
			<input type="text" name="driversLicenseNumber" size="20" value="<%=IntakeServlet.getIntake().getLengthOfService()%>" />
        </td>	
       
    </tr>
    
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
    	<td colspan="4"><b>Your Family:</b>&nbsp;&nbsp;Is your Mother living?
        <%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="health" class="dll">
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getMotherLiving()))
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
           	<td colspan="4">Is your Father living?
        <%
				ddl = (ArrayList)session.getAttribute("dll_yesno");
				%>
				<select name="health" class="dll">
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getFatherLiving()))
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
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
    	<td colspan="8">Relationship with Mother?&nbsp;&nbsp;<input type="text" name="motherRelationship" size="20" value="<%=IntakeServlet.getIntake().getMotherRelationship()%>" />&nbsp;&nbsp;&nbsp;&nbsp;
    					Relationship with Father?&nbsp;&nbsp;<input type="text" name="fatherRelationship" size="20" value="<%=IntakeServlet.getIntake().getFatherRelationship()%>" />
    <tr>
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
    	<td colspan="8">Number of Brothers&nbsp;&nbsp;<input type="text" name="brothers" size="2" value="<%=IntakeServlet.getIntake().getBrothers()%>" />&nbsp;&nbsp;&nbsp;&nbsp;
        				Number of Sisters&nbsp;&nbsp;<input type="text" name="sisters" size="2" value="<%=IntakeServlet.getIntake().getSisters()%>" />&nbsp;&nbsp;&nbsp;&nbsp;
        				Number of Children&nbsp;&nbsp;<input type="text" name="children" size="2" value="<%=IntakeServlet.getIntake().getChildren()%>" />
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>Describe your religious/spiritual experiences:</b></td>
	</tr>
	<tr>
		<td colspan="11"><textarea rows="5" name="Describe_your_religious_experiences" cols="93"></textarea></td>
	</tr>
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
		<td colspan="11">Religious Background
       <% ddl = (ArrayList)session.getAttribute("dll_religion");
				%>
				<select name="health" class="dll">
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
			%>
        </td>
	</tr>
    
    
    
    
    
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    <tr>
		<td colspan="11"><b>Homelessness Documentation:</b><br /></td>
	</tr>
    
     <tr>
		<td colspan="8"><br />How long have you been homeless?<br /></td>
      </tr>
      <tr>
      	<td colspan="8">
			<input type="checkbox" name="homelessTime" value="YES" />&nbsp;Less than 2 weeks&nbsp;&nbsp;
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;2 weeks to 1 month&nbsp;&nbsp;
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;1 to 3 months&nbsp;&nbsp;
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;3 months to 1 year&nbsp;&nbsp;
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;more than 1 year
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
			<input type="checkbox" name="homelessTime" value="YES" />&nbsp;Never&nbsp;&nbsp;
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;1 to 2 times&nbsp;&nbsp;
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;more than 2 times in 2 years&nbsp;&nbsp;
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;Long term
        </td>
     </tr>
     <tr>
		<td colspan="8"><br />Reason for homelessness:<br /></td>
      </tr>
      <tr>
      	<td colspan="8">
			<input type="checkbox" name="homelessTime" value="YES" />&nbsp;Lack of a fixed, regular and adequate night time residence.<br />
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;Primary night time residence is a shelter designed to provide temporary living accomodations (including welfar hotels, congregate shelters, and transitional housing for the mentally ill).<br />
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;Primary night time residence is an institution that provides a temporary residence for individuals intended to be institutionalized.<br />
            <input type="checkbox" name="homelessTime" value="YES" />&nbsp;Primary night time residence is a public or private place not designated for, or ordinarily used as a regular sleeping accomodation for human beings.
        </td>
     </tr>
     <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8">Source(s)?&nbsp;&nbsp;
			<input type="text" name="incomeSource" size="40" />
        </td>	
    </tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    
    
    
    
    
    
    
    
    
    
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>Chemical Dependency (Check and Answer all that apply):</b></td>
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

					Hallucinogens</td>
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

					<input type="text" name="otherYearsUsed" value="<%=IntakeServlet.getIntake().getXanaxYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="otherLastUsed" value="<%=IntakeServlet.getIntake().getXanaxLastUsed()%>" size="12" maxlength="25"></td>
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
			<td colspan="8" valign="top">Longest time sober in past 3 years?&nbsp;<input type="text" name="sober3Years" value="<%=IntakeServlet.getIntake().getSober3Years()%>" size="8">
			&nbsp;&nbsp;in the last year? <input type="text" name="sober1Years" <%=IntakeServlet.getIntake().getSober1Years()%> size="9">
        	</td>
        </tr>
        <tr>
			<td colspan="8">&nbsp;</td>
		</tr>
        <tr>
    	<td colspan="8">
        Physical effects of abuse<br><input type="text" name="abusePhysicalEffects" <%=IntakeServlet.getIntake().getAbusePhysicalEffects()%> size="45"><br><br>
		<b>Any Previous Rehabs?</b>&nbsp;
			<input type="checkbox" name="attendAA" value="YES" />AA or NA&nbsp;&nbsp;
            Number of Years<input type="text" name="yearsAttended" value="<%=IntakeServlet.getIntake().getYearsAttended()%>" />
         <br /><br />  
		Ever been to a Faith Farm Before?&nbsp;
			<select size="1" name="Ever_been_to_a_Faith_Farm_Before">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
			</select><br><br>
		Year:&nbsp;<input type="text" name="ffYearsAttended" size="6">&nbsp;
		Where:&nbsp;
			<select size="1" name="previousFaithFarm">
				<option value="Boynton Beach">Boynton Beach</option>
				<option value="Ft. Lauderdale">Ft. Lauderdale</option>
				<option value="Okeechobee">Okeechobee</option>
				<option selected value="">Select One</option>
			</select><br>
            <br />
            Other Rehabs<input type="text" name="otherRehabs" value="<%=IntakeServlet.getIntake().getOtherRehabs()%>" size="45" maxlength="45"/>
		</td>
	</tr>
     <tr>
			<td colspan="8">&nbsp;</td>
		</tr>
        <tr>
        	<td colspan="8" valign="top">
		<b>Pattern of usage:</b><br>
        	<input type="checkbox" name="usagePattern1" value="YES" />Constantly&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern2" value="YES" />Weekends&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern3" value="YES" />Special Occasions&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern4" value="YES" />Whenever available&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern5" value="YES" />When Things Get Tough&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern6" value="YES" />On A Week/Off A Week
        </br></br> 
		<b>Losses due to usage:</b><br>
        	<input type="checkbox" name="usageLosses1" value="YES" />Job&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses2" value="YES" />Marriage&nbsp;&nbsp;>
            <input type="checkbox" name="usageLosses3" value="YES" />Friends&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses4" value="YES" />Possessions&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses5" value="YES" />Arrests&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses6" value="YES" />DUI's&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses7" value="YES" />Heavy Debt&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses8" value="YES" />Health&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses9" value="YES" />Incarceration
        	</td>
         </tr>
     <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    
        <% ArrayList questions = (ArrayList)session.getAttribute("questions");
		   for (int i=0;i<questions.size();i++) { 
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
				<select name="question<%=i+1%>" class="dll">
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getQuestion1()))
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
				<select name="question<%=i+1%>" class="dll">
				<option value="">
				<%
				if (ddl!=null) {
				  for (int j=0;j<ddl.size();j++) {
					%>
					<option 
						value="<%=ddl.get(j)%>"
						<%
						if
						(ddl.get(j).equals(IntakeServlet.getIntake().getQuestion1()))
						{%>selected<%}%>>
					  <%=ddl.get(j)%>
					</option>
					<%
				  }
				  %>
				  
				<%}%>
                </select>
		&nbsp;&nbsp;How Long Ago?<input type="text" name="<%=question%><%=i%>Dates" size="10" maxlength="10" /></td>
        </tr>
        <tr>
        	<td colspan="8">Please describe:&nbsp;<input type="text" name="<%=question%><%=i%>Details" size="40" maxlength="45"/></td>
        </tr>
        <%}%>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>Physical Health:</b></td>
	</tr>
	<tr>
		<td colspan="11">
		Describe your current health?&nbsp;
		<%
                                    ddl = (ArrayList)session.getAttribute("dll_health");
                                    %>
                                	<select name="health" class="dll">
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
                                    %><br><br> 
		Are you currently taking medications?&nbsp;
									<%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="currentMedicationFlag" class="dll">
                                    <option value="">
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
                                    %><br><br> 
		Are you in need of medication?&nbsp;
									<%
									 ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="needMedicationFlag" class="dll">
                                    <option value="">
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
                                    %><br><br> 
        Do you have enough for 30 days?&nbsp;
									<% 
									ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="medicationSupplyFlag" class="dll">
                                    <option value="">
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
                                    %><br><br> 
		Do you have any doctor appointments in the next 30 days?&nbsp;
		 							<%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="doctorsAppointment" class="dll">
                                    <option value="">
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
                                    </select><br />If yes, when?&nbsp;<input type="text" name="doctorsAppointmentDetails" size="25" maxlength="25"/><br /><br />
		
        
         <%
		   for (int i=21;i<26;i++) { 
		   	String question = (String)questions.get(i);
		 %>
         <%=question%>&nbsp;&nbsp;
         <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="question<%=i%>" class="dll">
                                    <option value="">
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
                                    %></select><br />
                                    If yes, give diagnosis&nbsp;<input type="text" name="question<%=i%>Details" size="45" maxlength="45"/>
		<br><br>
        <% } %>
		Do you wear glasses or contact lens?&nbsp;
		 <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="eyewearFlag" class="dll">
                                    <option value="">
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
		
		How Often?&nbsp;
		 <%
                                    ddl = (ArrayList)session.getAttribute("dll_eyewear");
                                    %>
                                	<select name="eyewearUsage" class="dll">
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
                                    %></select><br /><br /><br />
		
	</td>
	</tr>
    
    <tr>
		<td colspan="11"><b>Mental Health:</b></td>
	</tr>
	<tr>
		<td colspan="11">
        <%
		   for (int i=26;i<32;i++) { 
		   	String question = (String)questions.get(i);
		 %>
         <%=question%>&nbsp;&nbsp;
         <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="question<%=i%>" class="dll">
                                    <option value="">
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
                                    %></select><br />
                                    If yes, when&nbsp;<input type="text" name="question<%=i%>Date" size="15" maxlength="15"/>
                                    &nbsp;&nbsp;Details:&nbsp;<input type="text" name="question<%=i%>Details" size="40" maxlength="45"/>
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
                                    <option value="">
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
       <td colspan="8">
                                    If yes, when&nbsp;<input type="text" name="industrialInjuryDate" size="15" maxlength="15"/>
                                    &nbsp;&nbsp;Reason:&nbsp;<input type="text" name="industrialInjuryReason" size="25" maxlength="45"/>
       </td>
       </tr>
       <td colspan="8">
                                    Location&nbsp;<input type="text" name="industrialInjuryLocation" size="30" maxlength="30"/>
                                    &nbsp;&nbsp;Employer:&nbsp;<input type="text" name="industrialInjuryEmployter" size="30" maxlength="30"/>
        </td>
	</tr>
    
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
    
    <tr>
		<td colspan="8">
        Do you have any current physical disability?&nbsp;&nbsp;
         <%
                                    ddl = (ArrayList)session.getAttribute("dll_yesno");
                                    %>
                                	<select name="disabilityFlag" class="dll">
                                    <option value="">
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
       <td colspan="8">
                                    If yes, date of last examination&nbsp;<input type="text" name="examinationDate" value="<%=IntakeServlet.getIntake().getExaminationDate()%>" size="15" maxlength="15"/>
                                    &nbsp;&nbsp;Physician's Name&nbsp;<input type="text" name="physician" value="<%=IntakeServlet.getIntake().getPhysician()%>" size="25" maxlength="45"/>
       </td>
       </tr>
       <td colspan="8">
                                   Address&nbsp;<input type="text" name="physicianAddress" value="<%=IntakeServlet.getIntake().getPhysicianAddress()%>" size="45" maxlength="45"/>
        </td>
	</tr>
    <tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>Have you ever had any of the following:</b></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8">
			<table>
            <% ArrayList medicalConditions = (ArrayList)session.getAttribute("medicalCondition");
				for (int i=0;i<medicalConditions.size()-1;i+=2) {
					String medicalCondition = (String)medicalConditions.get(i);
			%>
				<tr>
					<td>
						<select name="medicalConditionFlag<%=i%>" class="dll">
                                    <option value="">
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
                                    %>
                            </select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td><%=medicalCondition%></td>								
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>			
						<select name="medicalConditionFlag<%=i+1%>" class="dll">
                                    <option value="">
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
						<select size="1" name="herniaSide">
							<option value="Left">LEFT</option>
							<option value="Right">RIGHT</option>
							<option value="" selected>Select</option>
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
				<tr>
					<td>			
						<select name="herniaOperationFlag" class="dll">
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
					<td colspan="5">Date: <input type="text" name="Date" size="8">&nbsp;&nbsp;Physician: <input type="text" name="herniaDetails" value="<%=IntakeServlet.getIntake().getHerniaDetails()%>" size="30" maxlength="30"></td>
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
		<td colspan="11"><b>Legal Information:</b></td>
	</tr>
		<tr>
		<td colspan="8">Have you ever been sued?&nbsp;
			<select name="lawsuitFlag" class="dll">
                                    <option value="">
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
                            </select>&nbsp;&nbsp;&nbsp;If yes, when&nbsp;<input type="text" name="lawsuitDate" size="10">
		</td>
	</tr>
    <tr>
		<td colspan="11">Details:<br><textarea rows="5" name="lawsuitDetails" cols="93"></textarea></td>
	</tr>
	<tr>
		<td colspan="11">Are you involved in a lawsuit?&nbsp;
			<select name="currentLawsuitFlag" class="dll">
                                    <option value="">
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
                            </select>&nbsp;&nbsp;&nbsp;If yes, when:<input type="text" name="currentLawsuitDate" size="10">
		</td>
	</tr>
	<tr>
		<td colspan="8"></td>
	</tr>
	<tr>
		<td colspan="11">Details:<br><textarea rows="5" name="currentLawsuitDetails" cols="93"></textarea></td>
	</tr>
	<tr>
		<td colspan="8">Ever convicted of a felony?&nbsp;
        <select name="felonyFlag"  class="ddl">
                                    <option value="">
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
                            </select>&nbsp;&nbsp;&nbsp;If yes, how many:<input type="text" name="felonyQty" size="3" maxlength="3">
        </td>
	</tr>
	<tr>
		<td colspan="11">Details:<br><textarea rows="5" name="felonyDetails" cols="93"></textarea></td>
	</tr>
    <tr>
		<td colspan="8">Ever convicted of a sexual offense?&nbsp;
        <select name="sexualOffenseFlag"   class="ddl">
                                    <option value="">
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
                            </select>&nbsp;&nbsp;&nbsp;If yes, how many:<input type="text" name="sexualOffenseQty" size="3" maxlength="3">
        </td>
	</tr>
	<tr>
		<td colspan="11">Details:<br><textarea rows="5" name="sexualOffenseDetails" cols="93"></textarea></td>
	</tr>
	<tr>
		<td colspan="8">Are you on probation? &nbsp;
			<select size="1" name="probation">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
			</select>		
		</td>
	</tr>
	<tr>
		<td colspan="8">What County?&nbsp;<input type="text" name="County" size="20"></td>
	</tr>
	<tr>
		<td colspan="8">Probation Officers Name:&nbsp;<input type="text" name="Probation_Officer" size="20"></td>
	</tr>
	<tr>
		<td colspan="8">Probation Officers Phone #:&nbsp;<input type="text" name="Phone" size="20"></td>
	</tr>
	<tr>
		<td colspan="8">Any Court or Probation appointments in the next 30 days?&nbsp;
			<select size="1" name="Probation_appointments">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="8">Dates &amp; Times&nbsp;<input type="text" name="Dates_Times" size="67"></td>
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
			 ArrayList jobSkills = (ArrayList)session.getAttribute("jobSkill");
				for (int i=0;i<jobSkills.size()-3;i+=4) {
			%>
            
            <tr>
            	<td>
                	<% jobSkill = (String)jobSkills.get(i); %>
                     <input type="checkbox" name="jobskill<%=i%>"/>&nbsp;<%=jobSkill%>
                </td>
                <td>
                	<% jobSkill = (String)jobSkills.get(i+1); %>
                     <input type="checkbox" name="jobskill<%=i+1%>"/>&nbsp;<%=jobSkill%>
                </td>
                <td>
                	<% jobSkill = (String)jobSkills.get(i+2); %>
                     <input type="checkbox" name="jobskill<%=i+2%>"/>&nbsp;<%=jobSkill%>
                </td>
                <td>
                	<% jobSkill = (String)jobSkills.get(i+3); %>
                     <input type="checkbox" name="jobskill<%=i+3%>"/>&nbsp;<%=jobSkill%>
                </td>
                
             </tr>
             <% } %>
             <tr>
             	<td colspan="4" align="right"><input type="checkbox" name="jobskillOther"/>&nbsp;Other&nbsp;<input type="text" name="jobskillOtherDesc" size="20" maxlength="30"/>
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
                <% for (int i=0;i<4;i++) { %>
                <tr>
                	<td><input type="text" name="employer1" value="" size="30" maxlength="30"/></td>
                    <td><input type="text" name="employerContact1" value="" size="25" maxlength="30"/></td>
                    <td><input type="text" name="employerPhone1" value="" size="15" maxlength="15"/></td>
                    <td><input type="text" name="employerDates1" value="" size="20" maxlength="35"/></td>
                </tr>
                <% } %>
             </tr>
            
             </table>
         </td>
    </tr>
	<tr>
		<td colspan="11" valign="bottom" align="center" height="45"><input type="submit" name="action" value="Save Application" class="imageButtonSave" title="Save Application" /></td>
	</tr>

	</table>
</form>
  </div>

</div>
  
<jsp:include page="footer.jsp" flush="true"/>
    

</body>
</html>
