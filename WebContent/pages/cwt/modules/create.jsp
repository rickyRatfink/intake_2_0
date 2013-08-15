<%@ page import="org.faithfarm.cwt.CWTServlet" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>

<%
    String message=(String)request.getAttribute("MESSAGE");

	String moduleNameErr = (String)request.getAttribute("moduleNameErr");
	if (moduleNameErr==null) moduleNameErr="";
	String metricErr = (String)request.getAttribute("metricErr");
	if (metricErr==null) metricErr="";
	String statusErr = (String)request.getAttribute("statusErr");
	if (statusErr==null) statusErr="";	
%>

<jsp:include page="../../../includes/header.jsp" flush="true"/>

<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - Create Module 
    </h2>
    
       <br />
       		<% if ((moduleNameErr+metricErr).length()>0) { %>
            <span class="failureNotification">
                <ul>
                	<% if (moduleNameErr.length()>0) { %>
					<li><%=moduleNameErr%></li>
                    <% } if (metricErr.length()>0) { %>
                    <li><%=metricErr%></li>
                    <% } if (statusErr.length()>0) { %>
                    <li><%=statusErr%></li>
                    <% } %>
                </ul>
            </span>
            <% } %>
            <% if (message!=null) { %>
            	<div class="success"><img src="<%=request.getContextPath() %>/img/success.png"/><%=message %></div>	
            <% } %>
       <br />
            <div align="left">
            
            Module Name<br /><input type="text" name="moduleName" value="<%=CWTServlet.getModule().getModuleName()%>" size="30" maxlength="50"/><br /><br />
            Description<br /><textarea name="description" cols="40" rows="5"></textarea><br />
        	<br /><b>Metrics</b><br/>
              				<%
                            Map<Long, String> ddl = (Map)session.getAttribute("metric_map");
                           	Long []keys = new Long[4];
							keys=CWTServlet.getModule().getMetricId();
							int row=0;
							
                            if (ddl!=null) {
                              for (Long key:ddl.keySet()) {
								row++;
                                %>
                                <input type="checkbox" name="metricId<%=key%>" value="<%=key%>"  
                                <%
									for (int i=0;i<keys.length;i++) 
										if (key.equals(keys[i])) { %>checked<% } %>
                                /><%=ddl.get(key)%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             <% } if (row%5==0) { row=0; %> <br/> <% }
                            } %>
            <br /> Status<br/>
              				<%
                            ArrayList dll = (ArrayList)session.getAttribute("dllCWTStatus");
                            %>
                            <select name="status">
                            <option value=""></option>
                            <%
                            if (dll!=null) {
                              for (int i=0;i<dll.size();i++) {
								  String opt = (String)dll.get(i);
                                %>
                                <option 
                                    value="<%=opt%>"
                                    <%
                                    if
                                    (opt.equals(CWTServlet.getModule().getStatus()))
                                    {%>selected<%}%>>
                                  <%=opt%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select>
               <br /><br />
           
            <input type="submit" name="action" value="Save Module" class="button"/>&nbsp;
            <input type="reset" name="action" value="Clear" class="button"/>
            	
             </div>
    </div>
    <div class="footer">
        Faith Farm Ministries &copy;2013
    </div>
   
</form>
</body>
</html>
