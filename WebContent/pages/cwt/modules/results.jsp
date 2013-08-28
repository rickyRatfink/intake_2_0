<jsp:include page="../../../includes/header.jsp" flush="true"/>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.faithfarm.domain.Module" %>
<%@ page import="org.faithfarm.util.Validator" %>

<%
	 Validator v8r = new Validator();
	 String message=(String)request.getAttribute("MESSAGE");
	 ArrayList results = (ArrayList) session.getAttribute("module_results");
	 if (results==null)
	 	results=new ArrayList();
%>




<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - Modules Search Results
    </h2>
    
            <p>
                Now you can manage programs, metrics, modules, exams, and certifications for Faith Farm students enrolled in the CWT Module.
                <br />
            </p>
            <% if (message!=null) { %>
            	<div class="success"><img src="<%=request.getContextPath() %>/img/success.png"/><%=message %></div>	
            <% } %>
            
            <div align="left">
            <table width="90%" cellpadding="0" cellspacing="0" class="searchResults">
            <tr>
            	<td>
                <table width="100%" cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td class="colHeading" width="100">Actions</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="150">Module Name</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="100">Meeting Days</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="100">Meeting Times</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="100">Location</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="100">Instructor</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="150">Creation Date</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="100">Status</td>
                    <td class="colHeading" width="1"></td>
                    
                </tr>
               
                <% String rowClass="";
				   
				   for (int i=0;i<results.size();i++) { 
					  Module module = (Module)results.get(i); 
					  if (i%2==0) 
					  	rowClass="Even"; 
					  else 
					    rowClass="Odd";	  
				%>
                <tr>
                    <td class="searchRow<%=rowClass%>">
                    	 <img src="<%=request.getContextPath()%>/img/Edit.gif" width="20" height="20"/>&nbsp;
                   		 <a href="<%=request.getContextPath()%>/cwt?action=Roster&id=<%=module.getModuleId()%>"><img src="<%=request.getContextPath()%>/img/enroll.png" width="20" height="20" title="Enroll Students"/></a></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=module.getModuleName()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                     <td class="searchRow<%=rowClass%>" ><%=module.getMeetingDays()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                     <td class="searchRow<%=rowClass%>" ><%=module.getMeetingTimes()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=module.getMeetingLocation()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td> 
                    <td class="searchRow<%=rowClass%>" ><%=module.getInstructorName()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>"><%=v8r.convertEpoch(new Long(module.getCreationDate()))%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>"><%=module.getStatus()%></td>
                    <td class="searchRow<%=rowClass%>"></td>
                    
                </tr> 
                <% } %>
               

                </table>
                </td>
            </tr>
            </table>
            
            <table width="100%" cellpadding="0" cellspacing="0">
            <tr>
            	<td height="23" valign="center" align="left">
            		<input type="submit" name="action" value="Create Module" class="button"/>
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
