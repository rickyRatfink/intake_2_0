<%@ page import="org.faithfarm.cwt.CWTServlet" %>
<%@ page import="java.util.ArrayList" %>

<%
    String message=(String)request.getAttribute("MESSAGE");

	String programNameErr = (String)request.getAttribute("programNameErr");
	if (programNameErr==null) programNameErr="";
%>

<jsp:include page="../../../includes/header.jsp" flush="true"/>





<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Course Work Therapy - Create Program
    </h2>
    
       <br />
       		<% if (programNameErr.length()>0) { %>
            <span class="failureNotification">
                <ul>
					<li><%=programNameErr%></li>
                </ul>
            </span>
            <% } %>
            <% if (message!=null) { %>
            	<div class="success"><img src="<%=request.getContextPath() %>/img/success.png"/><%=message %></div>	
            <% } %>
       <br />
            <div align="left">
            
            Program Name<br /><input type="text" name="programName" value="" size="30" maxlength="50"/><br /><br />
            Description<br /><textarea name="description" cols="40" rows="5"></textarea><br />
        	<br />
            <input type="submit" name="action" value="Save Program" class="button"/>&nbsp;
            <input type="reset" name="action" value="Clear" class="button"/>
            	
             </div>
    </div>
    <div class="footer">
        Faith Farm Ministries &copy;2013
    </div>
   
</form>
</body>
</html>
