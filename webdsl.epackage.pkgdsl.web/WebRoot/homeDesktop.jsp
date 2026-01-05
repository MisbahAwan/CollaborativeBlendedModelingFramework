<%
    String userid = (String) session.getAttribute("name");
    String eatopURL = "eatop://open/?user=" + userid;
%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Language" content="en-us">
	<title>Collaborative Modelling Environment - Desktop User</title>
	<link rel="stylesheet" type="text/css" href="xtext/2.25.0/xtext-ace.css"/>
	<link rel="stylesheet" type="text/css" href="style.css"/>
	<script src="webjars/requirejs/2.3.6/require.min.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	
	<script type="text/javascript">
        function launchDesktopApp() {
            // Try to launch the app using the custom protocol
            window.location.href = "<%= eatopURL %>";

            // Optional fallback/help message
            setTimeout(function () {
                document.getElementById("fallback").style.display = "block";
            }, 3000);
        }
    </script>
	
</head>

<body onload="launchDesktopApp()">
	<div>
	<img src="/images/Bann.png" alt="Collaborative Software Development" width="100%" height="25%" align="middle" />
	</div>
	<%
	String uid = (String)session.getAttribute("name");
	if (uid == null)
	{
		%><!-- NOT A VALID USER, IF THE USER TRIES TO EXECUTE LOGGED IN PAGE DIRECTLY, ACCESS IS RESTRICTED -->
					 <jsp:forward page="Login.html"/>
		<%	
	}
	else
	{%>
	<div> <h3>Welcome "<%=session.getAttribute("name")%>"! </h3> You are redirected to Desktop Application.
	<div align="right"><a href="Logout.jsp">Logout</a></div>
	</div>
	<%}%> 
</body>
</html>
