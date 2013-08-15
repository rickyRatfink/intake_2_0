<%@ page import="org.faithfarm.cwt.CWTServlet" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>

<%
    String message=(String)request.getAttribute("MESSAGE");

	String metricNameErr = (String)request.getAttribute("metricNameErr");
	if (metricNameErr==null) metricNameErr="";
	String programErr = (String)request.getAttribute("programErr");
	if (programErr==null) programErr="";
	String statusErr = (String)request.getAttribute("statusErr");
	if (statusErr==null) statusErr="";
%>
 
<jsp:include page="../../../includes/header.jsp" flush="true"/>





<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - Create Metric
    </h2>
    
       <br />
       		<% if ((metricNameErr+programErr).length()>0) { %>
            <span class="failureNotification">
                <ul>
                	<% if (metricNameErr.length()>0) { %>
					<li><%=metricNameErr%></li>
                    <% } if (programErr.length()>0) { %>
                    <li><%=programErr%></li>
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
            
            Metric Name<br /><input type="text" name="metricName" value="<%=CWTServlet.getMetric().getMetricName() %>" size="30" maxlength="50"/><br />
            Program<br/>
              				<%
                            Map<Long, String> ddl = (Map)session.getAttribute("program_map");
                            %>
                            <select name="programId">
                            <option value="0"></option>
                            <%
                            if (ddl!=null) {
                              for (Long key:ddl.keySet()) {
                                %>
                                <option 
                                    value="<%=key%>"
                                    <%
                                    if
                                    (key==CWTServlet.getMetric().getProgramId())
                                    {%>selected<%}%>>
                                  <%=ddl.get(key)%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select>
               <br />
            Description<br /><textarea name="description" cols="40" rows="5"></textarea><br />
        	
            Status<br/>
              				<%
                            ArrayList dll = (ArrayList)session.getAttribute("dllCWTStatus");
                            %>
                            <select name="status">
                            <option value=""></option>
                            <%
                            if (ddl!=null) {
                              for (int i=0;i<ddl.size();i++) {
								  String opt = (String)dll.get(i);
                                %>
                                <option 
                                    value="<%=opt%>"
                                    <%
                                    if
                                    (opt.equals(CWTServlet.getMetric().getStatus()))
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
            <input type="submit" name="action" value="Save Metric" class="button"/>&nbsp;
            <input type="reset" name="action" value="Clear" class="button"/>
            	
             </div>
    </div>
    <div class="footer">
        Faith Farm Ministries &copy;2013
    </div>
   
</form>
</body>
</html>
