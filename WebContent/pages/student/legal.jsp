<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="../../includes/header_info.jsp" flush="true"/>
 
<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");
   String warning=(String)request.getAttribute("WARNING");
  
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

   ArrayList ddl = new ArrayList(); 
   
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
		<td colspan="8"><b>Legal Information:</b></td>
	</tr>
		<tr>
		<td colspan="8">Have you ever been sued?&nbsp;
			<select name="lawsuitFlag">
                                    <%
									ddl = (ArrayList)session.getAttribute("dll_yesno");
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
                            </select>&nbsp;&nbsp;&nbsp;If yes, when&nbsp;<input type="text" name="lawsuitDate" size="10" maxlength="10" value="<%=IntakeServlet.getIntake().getLawsuitDate()%>" <% if (lawsuitDateErr.length()>0) { %>class="textboxErr"<%}%> onKeyUp="ucase(this)">
		</td>
	</tr>
    <tr><td colspan="8" class="fieldError"><%=lawsuitDateErr%></td></tr>
    <tr>
		<td colspan="8">Details:&nbsp;</td>
    </tr>
    <tr><td colspan="8" class="fieldError"><%=lawsuitDetailsErr%></td></tr>
	<tr>
    	<td colspan="8"><textarea rows="5" name="lawsuitDetails" cols="93" <% if (lawsuitDetailsErr.length()>0) { %>class="areaErr"<%}%> onKeyUp="ucase(this)"><%=IntakeServlet.getIntake().getLawsuitDetails()%></textarea></td>
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
                            </select>&nbsp;&nbsp;&nbsp;If yes, when:<input type="text" name="currentLawsuitDate" size="10" maxlength="10" value="<%=IntakeServlet.getIntake().getCurrentLawsuitDate()%>" <% if (currentLawsuitDateErr.length()>0) { %>class="textboxErr"<%}%> onKeyUp="ucase(this)"/>
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
     	<td colspan="8"><textarea rows="5" name="currentLawsuitDetails" cols="93" <% if (currentLawsuitDetailsErr.length()>0) { %>class="areaErr"<%}%> onKeyUp="ucase(this)"><%=IntakeServlet.getIntake().getCurrentLawsuitDetails()%></textarea></td>
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
                            </select>&nbsp;&nbsp;&nbsp;If yes, how many:<input type="text" name="felonyQty" size="3" maxlength="2" value="<%=IntakeServlet.getIntake().getFelonyQty()%>" <% if (felonyQtyErr.length()>0) { %>class="textboxErr"<%}%> onKeyUp="ucase(this)">
        </td>
	</tr>
    <tr><td colspan="8" class="fieldError"><%=felonyQtyErr%></td></tr>
	<tr>
		<td colspan="8">Details:</td>
     </tr>
     <tr><td colspan="8" class="fieldError"><%=felonyDetailsErr%></td></tr>
     <tr>
     	<td colspan="8"><textarea rows="5" name="felonyDetails" cols="93" <% if (felonyDetailsErr.length()>0) { %>class="areaErr"<%}%> onKeyUp="ucase(this)"><%=IntakeServlet.getIntake().getFelonyDetails()%></textarea></td>
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
                            </select>&nbsp;&nbsp;&nbsp;If yes, how many:<input type="text" name="sexualOffenseQty" size="3" maxlength="2" value="<%=IntakeServlet.getIntake().getSexualOffenseQty()%>" <% if (sexualOffenseQtyErr.length()>0) { %>class="textboxErr"<%}%> onKeyUp="ucase(this)"/>
        </td>
	</tr>
    <tr><td colspan="8" class="fieldError"><%=sexualOffenseQtyErr%></td></tr>
	<tr>
		<td colspan="8">Details:</td>
    </tr>
    <tr><td colspan="8" class="fieldError"><%=sexualOffenseDetailsErr%></td></tr>
    <tr>
    	<td colspan="8"><textarea rows="5" name="sexualOffenseDetails" cols="93" <% if (sexualOffenseDetailsErr.length()>0) { %>class="areaErr"<%}%> onKeyUp="ucase(this)"><%=IntakeServlet.getIntake().getSexualOffenseDetails()%></textarea></td>
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
		<td colspan="8">What County?&nbsp;<input type="text" name="probationCounty" value="<%=IntakeServlet.getIntake().getProbationCounty()%>" size="20" maxlength="20" <% if (probationCountyErr.length()>0) { %>class="textboxErr"<%}%> onKeyUp="ucase(this)"></td>
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
		<td colspan="8">Probation Officers Name:&nbsp;<input type="text" name="probationOfficer" value="<%=IntakeServlet.getIntake().getProbationOfficer()%>" size="20" maxlength="20" <% if (probationOfficerErr.length()>0) { %>class="textboxErr"<%}%> onKeyUp="ucase(this)"></td>
	</tr>
    <tr>
		<td colspan="8" class="fieldError"><%=probationOfficerErr%></td>
	</tr>
	<tr>
		<td colspan="8">Probation Officers Phone #:&nbsp;<input type="text" name="probationOfficerPhone" value="<%=IntakeServlet.getIntake().getProbationOfficerPhone()%>" size="20" maxlength="20" <% if (probationOfficerPhoneErr.length()>0) { %>class="textboxErr"<%}%> onKeyPress="return isNumberKey(event)"></td>
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
      <td colspan="8">If yes, Dates & Times:<input type="text" name="probationApptDetails" size="45" maxlength="45" value="<%=IntakeServlet.getIntake().getProbationApptDetails()%>" <% if (probationApptDetailsErr.length()>0) { %>class="textboxErr"<%}%> onKeyUp="ucase(this)">
		</td>
	</tr>	
     <tr>
		<td colspan="8" class="fieldError"><%=probationApptDetailsErr%></td>
	</tr>
	 <tr>
		<td colspan="8" valign="bottom" align="center" height="45">    <% if ("YES".equals(updateFlag)) { %>
    	<input type="submit" name="action" value="Update" class="imageButtonSave" title="Update Information" />&nbsp;
    <% } else { %>
    	<input type="submit" name="action" value="Save" class="imageButtonSave" title="Save Information" />&nbsp;
    <% } %></td>
	</tr>
    
    </table>




    <div class="footer">
        
    </div>
   <input type="hidden" name="source" value="legal"/>
    <input type="hidden" name="key" value="<%=IntakeServlet.getIntake().getIntakeId()%>"/>
</form>
</body>
</html>