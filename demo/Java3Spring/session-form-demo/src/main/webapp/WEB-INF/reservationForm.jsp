<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring project</title>
</head>
<body>
	<h1>Reservation Form</h1>
	<form method="post" action="/reservation">
	<p>
		<label> Name </label>
		<input type="text" name="name" />
	</p>
	<p>
		<label> Number of people </label>
		<input type="number" name="numOfPeople" />
	</p>
	<p>
		<label> Date (2022-04-20)</label>
		<input type="date" name="resDate" />
	</p>
	<p>
		<label> Time (18:00)</label>
		<input type="time" name="resTime" />
	</p>
		
	
	
	<button> Reserve! </button>
	</form>
	
	
</body>
</html>