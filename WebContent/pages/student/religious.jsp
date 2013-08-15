<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="../../includes/header_info.jsp" flush="true"/>
 
<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");

   String religiousExperienceErr = (String)request.getAttribute("religiousExperienceErr");
   if (religiousExperienceErr==null) religiousExperienceErr="";

    String religionErr = (String)request.getAttribute("religionErr");
   if (religionErr==null) religionErr="";
%>

<form method="POST" action="<%=request.getContextPath()%>/intake">
    <table width="750">
	<tr>
		<td colspan="8"><b>Spiritual Information: </b><br /><br /></td>
	</tr>

    

	<tr>
    	<td colspan="8">
                <table width="100%" border="0">
	<tr>
		<td colspan="8">Describe your religious/spiritual experiences:</td>
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
		<td colspan="8">Religious Background
       <% ArrayList ddl = (ArrayList)session.getAttribute("dll_religion");
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
		<td colspan="8" valign="bottom" align="center" height="45"><input type="submit" name="action" value="Update" class="imageButtonSave" title="Update Information" /></td>
	</tr>
    </table>
</form>

    <div class="footer">
        
    </div>
   
</body>
</html>