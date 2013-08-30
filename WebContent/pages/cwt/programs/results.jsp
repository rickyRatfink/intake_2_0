<jsp:include page="../../../includes/header.jsp" flush="true"/>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.faithfarm.domain.Program" %>
<%@ page import="org.faithfarm.util.Validator" %>

<%
	 Validator v8r = new Validator();
	 String message=(String)request.getAttribute("MESSAGE");
	 ArrayList results = (ArrayList) session.getAttribute("program_results");
	 if (results==null)
	 	results=new ArrayList();
%>




<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - UBIT Search Results
    </h2>
    
             <br/>
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
                    <td class="colHeading" width="300">UBIT Name</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="300">Status</td>
                    <td class="colSpacer" width="1"></td>
                    <td class="colHeading" width="150">Creation Date</td>
                    <td class="colHeading"></td>
                </tr>
                
                <% String rowClass="";
				   
				   for (int i=0;i<results.size();i++) { 
					  Program program = (Program)results.get(i); 
					  if (i%2==0) 
					  	rowClass="Even"; 
					  else 
					    rowClass="Odd";	  
				%>
                <tr>
                    <td class="searchRow<%=rowClass%>">
                    	 <img src="<%=request.getContextPath()%>/img/Edit.gif" width="20" height="20"/>&nbsp;
                   		 <img src="<%=request.getContextPath()%>/img/Report.gif" width="20" height="20"/></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=program.getProgramName()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>" ><%=program.getStatus()%></td>
                    <td class="searchRowSpcr<%=rowClass%>"></td>
                    <td class="searchRow<%=rowClass%>"><%=v8r.convertEpoch(new Long(program.getCreationDate()))%></td>
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
            		<input type="submit" name="action" value="Create Program" class="button"/>
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
