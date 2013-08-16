<jsp:include page="../../includes/header_info.jsp" flush="true"/>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.faithfarm.domain.Intake" %>
<%@ page import="org.faithfarm.util.Validator" %>

<%
	 Validator v8r = new Validator();
	 String message=(String)request.getAttribute("MESSAGE");
	int rows = 0;
	try {
	rows=((Integer)session.getAttribute("rows")).intValue();
	} catch (Exception e) {}
%>

<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/jquery/js/jquery-ui-1.8.1.custom.css" />
<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/jquery/js/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/jquery/js/ui.multiselect.css" />


<script type="text/javascript" src="<%=request.getContextPath()%>/jquery/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/jquery/js/jquery-ui-1.8.2.custom.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery/js/grid.locale-en.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery/js/jquery.jqGrid.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Student Search</title>

<script type="text/javascript"> 

$(document).ready(function() {

	$("#list1").jqGrid({

	    url:'http://localhost:8080/<%=request.getContextPath()%>/grid?type=student',
	    colNames:['Student ID','Lastname','MI','Firstname','SSN','DOB'],
	    colModel:[
	              {name:'intake_id',index:'intake_id', width:100,sortable:true},
	              {name:'lastname',index:'lastname', width:120,sortable:true},
	              {name:'mi',index:'mi', width:60,sortable:true},
	              {name:'firstname',index:'firstname', width:120,sortable:true},
	              {name:'ssn',index:'ssn', width:100},
	              {name:'dob',index:'dob', width:150}],
	    rowNum:20,
	    rowList:[20,10,5],
	    pager: '#pager1',
	    sortname: 'intake_id',
	    datatype: 'xml',
	    viewrecords: true,
	    sortorder: "desc",
	    multiselect: false,	 
	    height: 450,
	    width: 900,
	    caption: "Student Records" });

	   
});	    

function selectRow () {

	//alert( jQuery('#list1').jqGrid('getGridParam','selrow') );
	document.getElementById('key').value=jQuery('#list1').jqGrid('getGridParam','selrow');
}
</script>

     
            <% if (message!=null) { %>
            	<div class="success"><img src="<%=request.getContextPath() %>/img/success.png"/><%=message %></div>	
            <% } %>
            
   <form method="POST" action="<%=request.getContextPath()%>/student">         
           
            <div align="center">

				<table id="list1" class="scroll" cellpadding="0" cellspacing="0"
					width="50%">
				</table>
				
				<div id="pager1" class="scroll" style="text-align: center;"></div>
			 <table>
			 <tr>
            	<td height="23" valign="center" align="left">
            		<input type="submit" name="action" value="Create Student" class="button"/>
            		<input type="submit" name="action" value="View/Edit" class="button" onclick="javascript:selectRow();"/>
            		<input type="hidden" id="key" name="key" value=""/>
            	</td>
            </tr>
           	</table>
           	</div>
           	<a href="javascript:onSelect();">Click</a>
           	
   </form>
   
</body>
</html>