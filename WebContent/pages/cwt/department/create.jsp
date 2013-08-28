<%@ page import="org.faithfarm.cwt.CWTServlet" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>

<%
    String message=(String)request.getAttribute("MESSAGE");

	String departmentNameErr = (String)request.getAttribute("departmentNameErr");
	if (departmentNameErr==null) departmentNameErr="";
	String farmBaseErr = (String)request.getAttribute("farmBaseErr");
	if (farmBaseErr==null) farmBaseErr="";
%>
 
<jsp:include page="../../../includes/header.jsp" flush="true"/>





<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - Departments
    </h2>
    
       <br />
       		<% if ((departmentNameErr+farmBaseErr).length()>0) { %>
            <span class="failureNotification">
                <ul>
                	<% if (departmentNameErr.length()>0) { %>
					<li><%=departmentNameErr%></li>
                    <% } if (farmBaseErr.length()>0) { %>
                    <li><%=farmBaseErr%></li>  
                    <% }  %>              
                </ul>
            </span>
            <% } %>
            <% if (message!=null) { %>
            	<div class="success"><img src="<%=request.getContextPath() %>/img/success.png"/><%=message %></div>	
            <% } %>
       <br />
            <div align="left">
            
            Department Title<br /><input type="text" name="title" value="<%=CWTServlet.getDepartment().getTitle() %>" size="30" maxlength="50"/><br />
            Farm Location<br/>
              				<%
                            ArrayList ddl = (ArrayList)session.getAttribute("dllFarm");
                            %>
                            <select name="farmBase">
                            <option value=""></option>
                            <%
                            if (ddl!=null) {
                              for (int i=0;i<ddl.size();i++) {
                            	  String value=(String)ddl.get(i);
                                                             %>
                                <option 
                                    value="<%=value%>"
                                    <%
                                    if
                                    (value==CWTServlet.getDepartment().getFarmBase())
                                    {%>selected<%}%>>
                                  <%=ddl.get(i)%>
                                </option>
                                <%
                              }
                             
                            }
                        %></select>
               <br />
   
            <br /><br />
            <input type="submit" name="action" value="Save Department" class="button"/>&nbsp;
            <input type="reset" name="action" value="Clear" class="button"/>
            	
             </div>
    </div>
    <div class="footer">
        Faith Farm Ministries &copy;2013
    </div>
   
</form>
</body>
</html>
