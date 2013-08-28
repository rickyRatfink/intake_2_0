<jsp:include page="../../../includes/header.jsp" flush="true"/>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.faithfarm.domain.Department" %>
<%@ page import="org.faithfarm.util.Validator" %>

<%
	 Validator v8r = new Validator();
	 String message=(String)request.getAttribute("MESSAGE");
	 ArrayList results = (ArrayList) session.getAttribute("department_results");
	 if (results==null)
	 	results=new ArrayList();
%>


<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - Department List
    </h2>
    
             <br />
            <% if (message!=null) { %>
            	<div class="success"><img src="<%=request.getContextPath() %>/img/success.png"/><%=message %></div>	
            <% } %>
            
            <div align="left">
            <table width="80%" cellpadding="0" cellspacing="0" class="searchResults">
            <tr>
            	<td>
                <table width="100%" cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td class="colHeading" width="100">Actions</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="300">Department Title</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="300">Farm Location</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="150">Created By</td>
                    <td class="colSpacer" width="1"></td>
                   <td class="colHeading" width="150">Creation Date</td>
                    <td class="colHeading"></td>
                    
                </tr>
                <% String rowClass="";
				   
				   for (int i=0;i<results.size();i++) { 
					  Department p = (Department)results.get(i);
					  if (i%2==0) 
					  	rowClass="Even"; 
					  else 
					    rowClass="Odd";	  
				%>
                <tr>
                    <td class="searchRow<%=rowClass%>">
                    	 <img src="<%=request.getContextPath()%>/img/Edit.gif" width="20" height="20"/>&nbsp;
                   	<td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=p.getTitle()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=p.getFarmBase()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=p.getCreatedBy()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>"><%=v8r.convertEpoch(new Long(p.getCreationDate()))%></td>
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
            		<input type="submit" name="action" value="Create Department" class="button"/>
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
