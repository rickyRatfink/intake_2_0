<%@ page import="org.faithfarm.domain.Intake" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head><title>
	Class List Report
</title>

	<link href="<%=request.getContextPath()%>/styles/report.css" rel="stylesheet" type="text/css" />
	
		
  	<script language="javascript">
	function printPage()
	{
	window.print();
	}
	</script>
	
</head>

<%
	 Validator v8r = new Validator();
	 String farm=request.getParameter("farm");
	 java.util.Date sDate = new java.util.Date();
	 String runDate = v8r.convertDate(sDate.toString());
%>
<body onload="javascript:printPage();">


<div align="center">
<table width="900">
	<tr>
		<td><h1>Class List</h1></td>
	</tr>
	<tr>
		<td><b><%=farm %> on <%=runDate %></b></td>
	</tr>
</table>
<table width="900" class="report">
	<% 
	
	
	String title="";
	
	for (int c=0;c<11;c++) {
		 ArrayList results = (ArrayList) session.getAttribute("classlist_"+c);
		 if (results==null)
		 	results=new ArrayList();
    if (c==0) title="Orientation";
    else if (c==7) title="Fresh Start";
    else if (c==8) title="Interns";
    else if (c==9) title="SLS";
    else if (c==10) title="Student Teacher";
    else title="0"+c;
	%>
	<tr>
		<td colspan="12" class="reportHeader"><b>Class:&nbsp;<%=title %></b></td>
	</tr>
	<%
	
	try { 
	
		
	if (results.size()==0) { %>
		<tr>
			<td class="reportRow">No students enrolled.</td>
	    </tr>
	<%
	} else
	
	for (int i=0;i<results.size();i+=4) { 
		Intake intake1 = (Intake)results.get(i);
		Intake intake2 = (Intake)results.get(i+1);
		Intake intake3 = (Intake)results.get(i+2);
		Intake intake4 = (Intake)results.get(i+3);
	%>
	<tr>
    	<td width="100" class="reportRow"><%=intake1.getFirstName().toLowerCase() %>&nbsp;<%=intake1.getLastName().toLowerCase() %></td>
    	<td width="70" class="reportRow"><%=v8r.convertDate(intake1.getEntryDate()) %></td>
    	<td width="20" class="reportRow"></td>
    	
    	<td width="100" class="reportRow"><%=intake2.getFirstName().toLowerCase() %>&nbsp;<%=intake2.getLastName().toLowerCase() %></td>
    	<td width="70" class="reportRow"><%=v8r.convertDate(intake2.getEntryDate()) %></td>
    	<td width="20" class="reportRow"></td>
    	
    	<td width="100" class="reportRow"><%=intake3.getFirstName().toLowerCase() %>&nbsp;<%=intake3.getLastName().toLowerCase() %></td>
    	<td width="70" class="reportRow"><%=v8r.convertDate(intake3.getEntryDate()) %></td>
    	<td width="20" class="reportRow"></td>
    	
    	
    	<td width="100" class="reportRow"><%=intake4.getFirstName().toLowerCase() %>&nbsp;<%=intake4.getLastName().toLowerCase() %></td>
    	<td width="70" class="reportRow"><%=v8r.convertDate(intake4.getEntryDate()) %></td>
    	<td width="20" class="reportRow"></td>
    	
    </tr>
    <% } 
	} catch (Exception e) {}
	
	} //end of class loop
    %>
 
</table>

</div>

</body>
</html>
			