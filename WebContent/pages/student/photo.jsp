<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.domain.StudentHistory" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="../../includes/header_info.jsp" flush="true"/>
 
<%
	String updateFlag = (String)request.getAttribute("updateFlag");
if (updateFlag==null) updateFlag = request.getParameter("updateFlag");
%>

<form action="<%=request.getContextPath() %>/student?action=Upload" method="POST" enctype="multipart/form-data">
 
<table width="750">
	<tr>
		<td ><b>Upload Photo: </b></td>
	</tr>
	<tr>
    	<td >
           	<img src="<%=request.getContextPath()%>/photos/person.jpg" width="200" height="150"/>
           	<br/><br/>
        </td>
    </tr>
    <tr>
		<td valign="bottom" align="left" height="45">
        	<input type="file" name="file" id="file" class="imageButtonSave"/>&nbsp;Then&nbsp;
        	<input type="submit" name="action" value="Upload" class="imageButtonSave">
        	<input type="hidden" name="destination" value="/tmp"/>
    	</td>
	</tr>

	</table>
     <input type="hidden" name="source" value="personal"/>
      <input type="hidden" name="key" value="<%=IntakeServlet.getIntake().getIntakeId()%>"/>
</form>
  </div>

 
</div>
    
</table>

</form>				