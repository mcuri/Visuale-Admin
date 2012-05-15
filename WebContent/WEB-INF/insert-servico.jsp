<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>
</head>
<body>
	<h2>Project Form</h2>
	<form action="insertProject" method="post">
		Project: <br /><textarea name="project.name" rows="1" cols="50"></textarea><br />
		<s:fielderror fieldName="project.name"/>
		
		Type: <br /><textarea name="project.type" rows="1" cols="50"></textarea><br />
		
		Description: <br /><textarea name="project.description" rows="4" cols="50"></textarea><br />
		<s:fielderror fieldName="project.description"/>
		
		Owner: <br /><textarea name="project.owner" rows="1" cols="50"></textarea><br />
		
		Team: <br /><textarea name="project.team" rows="1" cols="50"></textarea><br />
		
		Status: <br /><textarea name="project.status" rows="1" cols="50"></textarea><br />
		<input type="submit" value="Insert">
	</form>


</body>
</html>