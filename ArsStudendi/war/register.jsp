<!DOCTYPE html> 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<html> 
<head> 
	<title>ArsStudendi</title> 
	<meta name="viewport" content="width=device-width, initial-scale=1"> 
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css" />
	<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.js"></script>
	
	
	<script type="text/javascript">

	$(document).ready(function() {
  		var name = document.getElementById("studentName").innerHTML;
		var pass = document.getElementById("password").innerHTML;
		var email = document.getElementById("emailAdress").innerHTML;
		emptyFields();
	});
		

		
 	function emptyFields() {
		
	alert("test");
		if(name == "") {
			$('[type="submit"]').button('disable');
			$('[type="submit"]').button('refresh');	
		}
		else {
			$('[type="submit"]').button('enable');
			$('[type="submit"]').button('refresh');	
		}
	}
	
	//String[] courseNames = request.getAttribute("courseNames");
	
	</script>
	
	
</head> 
<body> 

<script>

</script>
<div data-role="page">

	<div data-role="header" data-theme="b">
		<h1>Register</h1>
	</div><!-- /header -->

	<div data-role="content">	
		<p>Sign up for an ArsStudendi account and enjoy the benefits of learning analytics!</p>		
	</div><!-- /content -->

	<div data-role="content">
	
	<form action="/index.html" method="post">
		<div data-role="fieldcontain" class="ui-hide-label">
			<input type="text" name="studentName" id="studentName" value="" placeholder="Username" onchange="emptyFields()"/>
		</div>
		
		<div data-role="fieldcontain">
    		<input type="password" name="password" id="password" value="" placeholder="Password" onchange="emptyFields()"/>
		</div>
		
		<div data-role="fieldcontain" class="ui-hide-label">
			<input type="text" name="emailAdress" id="emailAdress" value="" placeholder="e-mail" onchange="emptyFields()"/>
		</div>
		
		<label for="select-choice-0" class="select">Study Program</label>
			<select name="studyProgram" id="studyProgram">
   			<option value="2 semester ingenieurswetenschappen: algemene richting">2 semester ingenieurswetenschappen: algemene richtlijnen</option>
   			<option value="3e semester ingenieurswetenschappen: algemene richting">3e semester ingenieurswetenschappen: algemene richting</option>
		</select>
		
		<div data-role="controlgroup" class="ui-controlgroup-checkboxes">
			<script>
				//for(int i = 0; i<courseNames.length; i++) {
			</script>
			<input type="checkbox" name="<script>//courseNames.get(i);</script>" id="courses" class="custom" />
			<label for="courses"><script>//courseNames.get(i);</script> </label>
			<script> //} </script>
		</div>
		
		<input type="submit" value="Submit Button"  />	 
		
		
	</form>
	
	
	<div data-role="popup" id="emptyField">
		<p>hello<p>
	</div>
	
	</div>
	
	
	
	
</div><!-- /page -->

</body>
</html>script>
		</div>
		
		<input type="submit" value="Submit Button"  />	 
		
		
	</form>
	
	
	<div data-role="popup" id="emptyField">
		<p>hello<p>
	</div>
	
	</div>
	
	
	
	
</div><!-- /page -->

</body>
</html>
