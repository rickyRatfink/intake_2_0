<%@ page import="org.faithfarm.cwt.CWTServlet" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>

<%
    String message=(String)request.getAttribute("MESSAGE");

	String jobNameErr = (String)request.getAttribute("jobNameErr");
	if (jobNameErr==null) jobNameErr="";
	String departmentErr = (String)request.getAttribute("departmentErr");
	if (departmentErr==null) departmentErr="";
%>
 
<jsp:include page="../../../includes/header.jsp" flush="true"/>





<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - Job
    </h2>
    
       <br />
       		<% if ((jobNameErr+departmentErr).length()>0) { %>
            <span class="failureNotification">
                <ul>
               		<% if (jobNameErr.length()>0) { %>
					<li><%=jobNameErr%></li>
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
            
            Job Title<br /><input type="text" name="title" value="<%=CWTServlet.getJob().getTitle() %>" size="30" maxlength="50"/><br />
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
                                    (key==CWTServlet.getJob().getDepartmentId())
                                    {%>selected<%}%>>
                                  <%=ddl.get(key)%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select>
               <br /><br /><b>Metrics</b><br/>
              				<%
                            Map<Long, String> dll = (Map)session.getAttribute("metric_map");
                           	Long []keys = new Long[4];
							keys=CWTServlet.getModule().getMetricId();
							int row=0;
							
                            if (dll!=null) {
                              for (Long key:dll.keySet()) {
								row++;
                                %>
                                <input type="checkbox" name="metricId<%=key%>" value="<%=key%>"  
                                <%
									for (int i=0;i<keys.length;i++) 
										if (key.equals(keys[i])) { %>checked<% } %>
                                /><%=dll.get(key)%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             <% } if (row%5==0) { row=0; %> <br/> <% }
                            } %>
            <br /><br />
            <input type="submit" name="action" value="Save Job" class="button"/>&nbsp;
            <input type="reset" name="action" value="Clear" class="button"/>
            	
             </div>
    </div>
    <div class="footer">
        Faith Farm Ministries &copy;2013
    </div>
   
</form>
</body>
</html>
