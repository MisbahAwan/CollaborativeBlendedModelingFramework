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
	  $( document ).ready(function() {
		//Stops the submit request
		    $("#save-form").submit(function(e){
		           e.preventDefault();
		    });
		  functionToDelayForRenderingPageElements();		  
	    });

    </script> 
	
	<script type="text/javascript">

	var baseUrl = window.location.pathname;
		var xtextEditor1= null;
		var fileIndex = baseUrl.indexOf("home.jsp");
		if (fileIndex > 0)
			baseUrl = baseUrl.slice(0, fileIndex);
		require.config({
			baseUrl: baseUrl,
			paths: {
				"jquery": "webjars/jquery/3.5.1/jquery.min",
				"ace/ext/language_tools": "webjars/ace/1.3.3/src/ext-language_tools",
				"xtext/xtext-ace": "xtext/2.25.0/xtext-ace"
			}
		});
		require(["webjars/ace/1.3.3/src/ace"], function() {
			require(["xtext/xtext-ace"], function(xtext) {
				 this.xtextEditor1 = xtext.createEditor({
					baseUrl: baseUrl,
					syntaxDefinition: "xtext-resources/generated/mode-pkgdsl",
				});
				 this.xtextEditor1.setOptions({
		                fontSize: 14,
		                wrap: true,
		                minLines: 25,
		                maxLines: 25,
		                dragDelay: 0,
		                enableLiveAutocompletion: true
		            });
				 
				 this.xtextEditor2 = xtext.createEditor({
						baseUrl: baseUrl,
						parentClass: "xtext-editora",
						syntaxDefinition: "xtext-resources/generated/mode-pkgdsl",
					});
					 this.xtextEditor2.setOptions({
			                fontSize: 14,
			                wrap: true,
			                minLines: 25,
			                maxLines: 25,
			                dragDelay: 0,
			                enableLiveAutocompletion: true
			            });
				 this.xtextEditor1.setValue('<%=session.getAttribute("TempRuntimeInstance")%>');
				 this.xtextEditor2.setValue('<%=session.getAttribute("merger")%>');
			});
		});
	</script>
	<script type = "text/javascript">  
         function loadRuntimeInstance() 
         {   
	        	 var rti='<%=session.getAttribute("runtimeInstance")%>';
	        	 this.xtextEditor1.setValue(rti); 
         }  
         function refreshMerger()
			{	
					document.getElementById("mergerinstance").value=this.xtextEditor1.getValue();
					document.getElementById("merger-form").submit(); 
			}
		 

		 function submitForm()
			{	
					 $("#save-form").submit(function(e){
				           e.preventDefault();
				    });
			        document.getElementById("instance").value=this.xtextEditor1.getValue();
			        document.getElementById("instanceType").value="permanent";
					$.ajax({
				         type: "GET",
				         url: "/loginservlet",//url,
				         data: $("#save-form").serialize(), // serializes form input
						 dataType: "json",
						 contentType:"json",
						 headers: {Accept : "application/json;charset=utf-8"},
				         success: function(response){
				             	console.log(response);
								alert("Runtime instance saved.")
								
				         },
				         //If there was no resonse from the server
		          error: function(jqXHR, textStatus, errorThrown){
		              alert("Something really bad happened " );
		              alertjqXHR();alert(textStatus);alert(errorThrown);
		         	}
			    });
					//document.getElementById("save-form").submit(); 
			}
		 function showLog()
			{	
					var user = '<%=session.getAttribute("name")%>';
					$.ajax({
				         type: "GET",
				         url: "/loginservlet",//url,
				         data: {user:user, merger:null}, //
						 dataType: "json",
						 contentType:"json",
						 headers: {Accept : "application/json;charset=utf-8"},
				         success: function(response){
				             	console.log(response);
								//alert(response[0].login);
								var i=0;var tableRows="";
								$.each(response, function (key, value) 
										{// alert(response[i].login); 
										//alert(i);
										tableRows=tableRows+"<tr><td>"+response[i].runtimeInstance+"</td><td>"+response[i].login+"</td><td>"+response[i].createdon+"</td></tr>";
										//alert(tableRows);
										i=i+1;
										});
					//alert(tableRows);
								//localStorage.setItem('response', response);
								//$.ajax('api/path').done(function(response){
								//	sessionStorage.setItem('response', response);
							        window.open( 'http://localhost:8080/Log.jsp', "_blank");    
							    //})								
				         },
				         //If there was no resonse from the server
		          error: function(jqXHR, textStatus, errorThrown){
		              alert("Something really bad happened " );
		              alert(jqXHR);alert(textStatus);alert(errorThrown);
		         	}
			    });
					//document.getElementById("save-form").submit(); 
			}
		 
		 function functionToDelayForRenderingPageElements()
			{	
			 setTimeout(function(){//alert("in setTimeout")
				 submitFormOnTimer();
			    },10000); //delay is in milliseconds 
			}
		 function submitFormOnTimer()
		 {	
			//alert("submitFormOnTimer");
			document.getElementById("instance").value=this.xtextEditor1.getValue();
			document.getElementById("instanceType").value="temporary";
			
			$.ajax({
		         type: "GET",
		         url: "/loginservlet",//url,
		         data: $("#save-form").serialize(), // serializes form input
				 dataType: "json",
				 contentType:"json",
				 headers: {Accept : "application/json;charset=utf-8"},
		         success: function(response){
		             	console.log(response);
		             	//out.print(response);
						//alert(response)
						//alert(response.runtimeInstance)
						//this.xtextEditor1.setValue(response.runtimeInstance);
						//$('#ajaxGetUserServletResponse').text(responseText);
		         },
		         //If there was no resonse from the server
          error: function(jqXHR, textStatus, errorThrown){
              alert("Something really bad happened " );
              alert(jqXHR);alert(textStatus);alert(errorThrown);
         	}
	    });//alert("calling new submit function again");
	//..open this 
	   setTimeout(submitFormOnTimer,10000); 
	} 
</script>
</head>

<body>
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
	<div> <h3>Welcome "<%=session.getAttribute("name")%>"" !</h3>
	<div align="right"><a href="Logout.jsp">Logout</a></div>
	</div>
	<div>
	     <button class="button-15" id="load-button" onclick = "loadRuntimeInstance()" >Load Last Saved Instance by User</button>
	     <% if (session.getAttribute("name").equals("admin")){ %>
	     	<button class="button-15" id="show-log" onclick = "showLog()" >Show Log</button> 
	     <% } %>	      
	</div>
	<div class="container">
			<div class="content">
			  <form action="/loginservlet" method="get" id="save-form">
	     		<input type="hidden" name="user" id="user" value=<%=session.getAttribute("name")%>>
	     		<input type="hidden" name="instance" id="instance" value="">
	     		<input type="hidden" name="instanceType" id="instanceType" value="permanent">
	     		<input type="hidden" name="merger" id="merger" value="nomerger">
	            <button  class="button-15" name="savedsl"  onclick= "submitForm()">Save Runtime Instance</button> <br><br>
	          </form>
				<div id="xtext-editor" data-editor-xtext-lang="pkgdsl"></div>	
			</div>
			<div class="content">
					<form action="/loginservlet" method="get" id="merger-form">
			     		<input type="hidden" name="user" value=<%=session.getAttribute("name")%>>
			     		<input type="hidden" name="mergerinstance" id="mergerinstance" value="">
			     		<input type="hidden" name="instanceType" id="instanceType" value="permanent">
			     		<input type="hidden" name="merger" id="merger" value="merger">
			            <button class="button-15" name="refresh-button" onclick = "refreshMerger()" >Show Merger DSL</button>
			     	</form>
						<div id="mydivid" class="xtext-editora" data-editor-xtext-lang="pkgdsl"></div>		
			</div>
			
	</div>	
<%}%> 
</body>
</html>
