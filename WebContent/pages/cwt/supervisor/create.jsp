<%@ page import="org.faithfarm.cwt.CWTServlet" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>

<%
    String message=(String)request.getAttribute("MESSAGE");

String firstnameErr = (String)request.getAttribute("firstnameErr");
if (firstnameErr==null) firstnameErr="";

String lastnameErr = (String)request.getAttribute("lastnameErr");
if (lastnameErr==null) lastnameErr="";

	String jobErr = (String)request.getAttribute("jobErr");
	if (jobErr==null) jobErr="";
	String departmentErr = (String)request.getAttribute("departmentErr");
	if (departmentErr==null) departmentErr="";
%>
 
<jsp:include page="../../../includes/header.jsp" flush="true"/>





<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - Supervisor
    </h2>
    
       <br />
       		<% if ((jobErr+departmentErr+firstnameErr+lastnameErr).length()>0) { %>
            <span class="failureNotification">
                <ul>
                    <% if (firstnameErr.length()>0) { %>
					<li><%=firstnameErr%></li>
                    <% }  %> 
                    <% if (lastnameErr.length()>0) { %>
					<li><%=lastnameErr%></li>
                    <% }  %> 
               		<% if (jobErr.length()>0) { %>
					<li><%=jobErr%></li>
                    <% }  %>  
                	<% if (departmentErr.length()>0) { %>
					<li><%=departmentErr%></li>
                    <% }  %>              
                </ul>
            </span>
            <% } %>
            <% if (message!=null) { %>
            	<div class="success"><img src="<%=request.getContextPath() %>/img/success.png"/><%=message %></div>	
            <% } %>
       <br />
            <div align="left">
            First Name<br/><input type="text" name="firstname" size="20" maxlength="20" value="<%=CWTServlet.getSupervisor().getFirstname()%>"/> 
            <br/> <br/>
            Last Name<br/><input type="text" name="lastname" size="30" maxlength="30" value="<%=CWTServlet.getSupervisor().getLastname()%>"/>
            <br/> <br/>
            Job Title<br />
                      		<%
                            Map<Long, String> ddl1 = (Map)session.getAttribute("job_map");
                            %>
                            <select name="jobId">
                            <option value="0"></option>
                            <%
                            if (ddl1!=null) {
                              for (Long key:ddl1.keySet()) {
                                %>
                                <option 
                                    value="<%=key%>"
                                    <%
                                    if
                                    (key==CWTServlet.getSupervisor().getJobId())
                                    {%>selected<%}%>>
                                  <%=ddl1.get(key)%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select>
            <br />
            <br />Department<br/>
              				<%
                            Map<Long, String> ddl = (Map)session.getAttribute("department_map");
                            %>
                            <select name="departmentId">
                            <option value="0"></option>
                            <%
                            if (ddl!=null) {
                              for (Long key:ddl.keySet()) {
                                %>
                                <option 
                                    value="<%=key%>"
                                    <%
                                    if
                                    (key==CWTServlet.getSupervisor().getDepartmentId())
                                    {%>selected<%}%>>
                                  <%=ddl.get(key)%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select>
             
            <br /><br />
            <input type="submit" name="action" value="Save Supervisor" class="button"/>&nbsp;
            <input type="reset" name="action" value="Clear" class="button"/>
            	
             </div>
    </div>
    <div class="footer">
        Faith Farm Ministries &copy;2013
    </div>
   
</form>
</body>
</html>
