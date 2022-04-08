<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<div class="container mt-5">
	<h1> JSTL DEMO</h1>
	
	<h1> Displaying variables</h1>
	<p> <c:out value="${jspAge }"></c:out></p>
	<p> ${jspName} </p>
	
	<h1> If-statement</h1>
	<c:if test = "${jspAlive ==true }">
		<p> ${jspName} is Alive!!! </p>
	</c:if>
	
	<h1> If-else statement</h1>
	<c:choose>
		<c:when test="${jspHungry == true }">
			<p> ${jspName } is Hungry!</p>
		</c:when>
		<c:otherwise>
			<p> ${jspName } is not hungry! </p>
		</c:otherwise>
	</c:choose>
	
	<h1> for each</h1>
	<ul>
	<c:forEach var="pet" items="${jspPets }">
		<li> <c:out value="${pet }"></c:out></li>
	</c:forEach>
	</ul>
	<button class="btn btn-primary"> Testing Bootstrap </button>
	
</div>
</body>
</html>