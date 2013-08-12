<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<title>Log In</title>
<link href="<%=request.getContextPath()%>/styles/site.css" rel="stylesheet" type="text/css" />
</head>
<body>


<form method="post" action="<%=request.getContextPath()%>/intake" id="ctl01">


 

 <div class="page">
        <div class="header">
            <div class="title">
                <a href="/Default.aspx"> 
                <h1>
                   Faith Farm Student Management
                </h1>
                </a>
            </div>
            <div class="loginDisplay">
                
                        [ <a href="Login.aspx" id="HeadLoginView_HeadLoginStatus">Log In</a> ]
                    
            </div>
             <div class="clear hideSkiplink">
                          
               
                        <a href="#Menu_LoginView1_NavigationMenu_SkipLink"><img alt="Skip Navigation Links" src="/WebResource.axd?d=zk1zGvduTV0eoSSb5DCWURftaYV24wAQqLpXwDcGntw2arIzPp1ASqL39z87Tvthc3VOuCvtlvKYhLAiXQmxPvojXu0E0HB4EhcdKY_dUTU1&amp;t=634932975836264443" width="0" height="0" style="border-width:0px;" /></a><div class="menu" id="Menu_LoginView1_NavigationMenu">
	<ul class="level1">
		<li><a class="level1" href="../Default.aspx">Home</a></li><li><a class="level1" href="../About.aspx">About</a></li>
	</ul>
</div><a id="Menu_LoginView1_NavigationMenu_SkipLink"></a>
                    
          
            
            </div>
        </div>
        <div class="main">
            
    <h2>
        Log In
    </h2>
    <p>
        Please enter your username and password.
        <br />
        If you don't have an account ask to Supervisor for have one.
    </p>
    
            <span class="failureNotification">
                
            </span>
            <div id="MainContent_LoginUser_LoginUserValidationSummary" class="failureNotification" style="display:none;">

</div>
            <div class="accountInfo">
                <fieldset class="login">
                    <legend>Account Information</legend>
                    <p>
                        <label for="MainContent_LoginUser_UserName" id="MainContent_LoginUser_UserNameLabel">Username:</label>
                        <input name="ctl00$MainContent$LoginUser$UserName" type="text" id="MainContent_LoginUser_UserName" class="textEntry" />
                        <span id="MainContent_LoginUser_UserNameRequired" title="User Name is required." class="failureNotification" style="visibility:hidden;">*</span>
                    </p>
                    <p>
                        <label for="MainContent_LoginUser_Password" id="MainContent_LoginUser_PasswordLabel">Password:</label>
                        <input name="ctl00$MainContent$LoginUser$Password" type="password" id="MainContent_LoginUser_Password" class="passwordEntry" />
                        <span id="MainContent_LoginUser_PasswordRequired" title="Password is required." class="failureNotification" style="visibility:hidden;">*</span>
                    </p>
                    <p>
                        <input id="MainContent_LoginUser_RememberMe" type="checkbox" name="ctl00$MainContent$LoginUser$RememberMe" />
                        <label for="MainContent_LoginUser_RememberMe" id="MainContent_LoginUser_RememberMeLabel" class="inline">Keep me logged in</label>
                    </p>
                </fieldset>
                <p>
                    <input type="submit" name="ctl00$MainContent$LoginUser$LoginButton" value="Log In" onclick="javascript:WebForm_DoPostBackWithOptions(new WebForm_PostBackOptions(&quot;ctl00$MainContent$LoginUser$LoginButton&quot;, &quot;&quot;, true, &quot;LoginUserValidationGroup&quot;, &quot;&quot;, false, false))" id="MainContent_LoginUser_LoginButton" class="submitButton" />
                </p>
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
