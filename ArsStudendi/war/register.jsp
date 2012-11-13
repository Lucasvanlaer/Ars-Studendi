<!DOCTYPE html> 
<html> 
<head> 
	<title>ArsStudendi</title> 
	<meta name="viewport" content="width=device-width, initial-scale=1"> 
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css" />
	<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.js"></script>
</head> 
<body> 

<div data-role="page">

	<div data-role="header">
		<h1>Register</h1>
	</div><!-- /header -->

	<div data-role="content">	
		<p>Sign up for an ArsStudendi account and enjoy the benefits of learning analytics!</p>		
	</div><!-- /content -->

	<form action="/register" method="post">
		<div data-role="fieldcontain" class="ui-hide-label">
			<label for="username">Username:</label>
			<input type="text" name="username" id="username" value="" placeholder="Username"/>
		</div>
		
		
		
		<input type="submit" value="Submit Button" />	 
	
	</form>
</div><!-- /page -->

</body>
</html>
