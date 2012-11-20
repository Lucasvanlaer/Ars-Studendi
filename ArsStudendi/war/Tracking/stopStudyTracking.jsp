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
</head> 
<body> 

<div data-role="page">

	<div data-role="header" data-theme="b">
		<h1>Stop Tracking</h1>
		 <a href="../index.html" data-role="button" data-icon="home" data-iconpos="notext">Home</a> 
	</div>
	
	<form action="/stopTracking" method="post">
	
		<label for="efficiency">Enter your efficiency:</label>
		<input type="range" name="efficiency" id="efficiency" value="50" min="0" max="100" data-highlight="true"/>
		
		
		
		<fieldset data-role="controlgroup">
			<legend>Choose a study type:</legend>
     		<input type="radio" name="studyType" id="lecture" value="lecture" checked="checked" />
     		<label for="lecture">Lecture</label>

     		<input type="radio" name="studyType" id="teamwork" value="teamwork"  />
     		<label for="teamwork">Teamwork</label>

     		<input type="radio" name="studyType" id="practice" value="practice"  />
     		<label for="practice">Practice</label>
	
     		<input type="radio" name="studyType" id="selfteaching" value="selfteaching"  />
     		<label for="selfteaching">Selfteaching</label>
		</fieldset>
		
		
		
	</form>
	
	

</div>

</body>
</html>