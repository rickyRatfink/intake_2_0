<%@ page import="java.util.ArrayList" %>

<%
	ArrayList errors = (ArrayList)request.getAttribute("ERRORS_"+session.getId());
	if (errors==null) errors=new ArrayList();
%>

<jsp:include page="../includes/header.jsp" flush="true"/>
            
    <h2>
        Log In
    </h2>
    <p>
        Please enter your username and password.
        <br />
        If you don't have an account ask to Supervisor for have one.
    </p>
    
            <span class="failureNotification">
                <ul>
				<% for (int i=0;i<errors.size();i++) { 
				System.out.println(i);
					String error = (String)errors.get(i);
				%><li><%=error%></li><%}%>
                </ul>
            </span>
           
	<form method="POST" action="<%=request.getContextPath()%>/login">
            <div class="accountInfo">
                <fieldset class="login">
                    <legend>Account Information</legend>
                   
                    <p>
                        Username:<br />
                        <input name="username" type="text" id="username" class="textEntry" />
                     </p>
                    <p>
                        Password:<br />
                        <input name="password" type="password" id="password" class="passwordEntry" />
                    </p>
                 </fieldset>
                <p>
                    <input type="submit" name="action" value="Log In" class="submitButton" />
                </p>
            </div>
        </form>

        </div>
        <div class="clear">
        </div>
    </div>
    <div class="footer">
        
    </div>
    

</form>
</body>
</html>
