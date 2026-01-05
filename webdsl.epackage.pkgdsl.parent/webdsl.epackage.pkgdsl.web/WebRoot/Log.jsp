<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Language" content="en-us">
	<title>Natural Language to Z-Notation Transformation</title>
	<link rel="stylesheet" type="text/css" href="xtext/2.25.0/xtext-ace.css"/>
	<link rel="stylesheet" type="text/css" href="style.css"/>
	<script src="webjars/requirejs/2.3.6/require.min.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		
	<script type="text/javascript">
	$( document ).ready(function() {//alert("i am in log file");
	//var url_string = window.location;
	//var url = new URL(url_string);
	//var response = url.searchParams.get("tableRows");
	//alert(sessionStorage.getItem('response'));
	//alert(response);
	//$.each(data, function (key, value) {
		$('#logTable').append('<%=session.getAttribute("tableRows")%>');
	//});
	});
	
	</script> 

</head>
<body>
<div>
<img src="/images/Bann.png" alt="Collaborative Software Development" width="100%" height="25%" align="middle" />
</div>
	<div><h2 align="center" cellpadding="5" cellspacing="5">Runtime Instances Log</h2>
	<table align="center" cellpadding="5" cellspacing="5" border="1">
		                <thead>
		                <tr>
		                    <th>RunTime Instance</th>
		                    <th>Saved by</th>
		                    <th>Saved On</th>
		                </tr>
		                </thead>
						<tbody id="logTable">
						</tbody>
		            </table> 
	
	</div>

</body>
</html>
