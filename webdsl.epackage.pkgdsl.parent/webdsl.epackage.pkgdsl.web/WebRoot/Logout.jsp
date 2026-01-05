<html>
<head>
</head>
<body>
	<div>
	<img src="/images/Bann.png" alt="Collaborative Software Development" width="100%" height="25%" align="middle" />
	</div>
			<%session.invalidate();%>
			<% HttpSession nsession = request.getSession(false);
			if(nsession!=null) {
			   String data=(String)session.getAttribute( "name" );
			   out.println(data);
			}
			else%>
			  <jsp:forward page="Login.html"/>
	</body>
<html>