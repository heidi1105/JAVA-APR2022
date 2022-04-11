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
	<h1>Reservation Result</h1>
	<p>Name : ${name }</p>
	<p>Number of people : ${numOfPeople }</p>
	<p> Reservation Date: ${resDate }</p>
	<p> Format Date: 
	<fmt:formatDate value="${resDate }"/></p>
	<p> Reservation Time:
	<fmt:formatDate type="time" value="${resTime }" pattern="h:mm a"/>
	</p>
	

</body>
</html>