<jsp:include page="../../includes/header.jsp" flush="true"/>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.faithfarm.domain.Intake" %>
<%@ page import="org.faithfarm.util.Validator" %>

<%
	 Validator v8r = new Validator();
	 String message=(String)request.getAttribute("MESSAGE");
	 ArrayList results = (ArrayList) session.getAttribute("student_results");
	 if (results==null)
	 	results=new ArrayList();
%>




<form method="POST" action="<%=request.getContextPath()%>/student">
    <h2>
        Student Search Results
    </h2>
    
           
            <% if (message!=null) { %>
            	<div class="success"><img src="<%=request.getContextPath() %>/img/success.png"/><%=message %></div>	
            <% } %>
            
            <div align="left">
            <table width="100%" cellpadding="0" cellspacing="0" class="searchResults">
            <tr>
            	<td>
                <table width="100%" cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td class="colHeading" width="100">Actions</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="300">First Name</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="300">MI</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="300">Last Name</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="300">SSN</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="300">DOB</td>
                    <td class="colSpacer" width="1"></td>
                 </tr>
                 <tr>
                    <td colspan="2" class="colFilter"></td>
                    <td class="colFilter" >
                    	<input type="text" name="filter1" value="" size="7" maxlength="20" class="filterTxt"/>
                        <input type="submit" name="action" value="Filter" class="imageButtonFilter" title="Filter By Program Name" />
                    </td>
                    <td class="colFilter"></td>
                     <td class="colFilter" >
                    	<input type="text" name="filter1" value="" size="7" maxlength="1" class="filterTxt"/>
                        <input type="submit" name="action" value="Filter" class="imageButtonFilter" title="Filter By Program Name" />
                    </td>
                    <td class="colFilter"></td>
                     <td class="colFilter" >
                    	<input type="text" name="filter1" value="" size="7" maxlength="20" class="filterTxt"/>
                        <input type="submit" name="action" value="Filter" class="imageButtonFilter" title="Filter By Program Name" />
                    </td>
                    <td class="colFilter"></td>
                     <td class="colFilter" >
                    	<input type="text" name="filter1" value="" size="7" maxlength="20" class="filterTxt"/>
                        <input type="submit" name="action" value="Filter" class="imageButtonFilter" title="Filter By Program Name" />
                    </td>
                    <td class="colFilter"></td>
                     <td class="colFilter" >
                    	<input type="text" name="filter1" value="" size="7" maxlength="20" class="filterTxt"/>
                        <input type="submit" name="action" value="Filter" class="imageButtonFilter" title="Filter By Program Name" />
                    </td>
                    <td class="colFilter"></td>
                    
                </tr> 
                <% String rowClass="";
				   
				   for (int i=0;i<results.size();i++) { 
					  Intake intake = (Intake)results.get(i); 
					  if (i%2==0) 
					  	rowClass="Even"; 
					  else 
					    rowClass="Odd";	  
				%>
                <tr>
                    <td class="searchRow<%=rowClass%>">
                    	 <a href="<%=request.getContextPath()%>/student?action=edit&key=<%=intake.getIntakeId()%>" style="text-decoration:none"><img src="<%=request.getContextPath()%>/img/Edit.gif" width="20" height="20"/>&nbsp;</a>
                   		 <img src="<%=request.getContextPath()%>/img/Report.gif" width="20" height="20"/></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=intake.getFirstName()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=intake.getMiddleInitial()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=intake.getLastName()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=intake.getSsn()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=intake.getDateOfBirth()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                </tr> 
                <% } %>
               

                </table>
                </td>
            </tr>
            </table>
            
            <table width="100%" cellpadding="0" cellspacing="0">
            <tr>
            	<td height="23" valign="center" align="left">
            		<input type="submit" name="action" value="Create Student" class="button"/>
            	</td>
            </tr>
           	</table>
        	</div>

        </div>
        <div class="clear">
        </div>
    </div>
    <div class="footer">
        
    </div>
   
</form>
</body>
</html>
