<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container mt-5">
   		<h1> Send some gifts!</h1>
		<form:form action="/gifts/new" method="post" modelAttribute="gift">
		<form:hidden path="sender" value="${userId }" />
		<div class="form-group">
			<form:label path="giftName">Gift Name:</form:label>
			<form:input path="giftName" class="form-control" />
			<form:errors path="giftName" class="text-danger" />
		</div>	
		<div class="form-group">
			<form:label path="quantity"> Quantity:</form:label>
			<form:input path="quantity" class="form-control" />
			<form:errors path="quantity" class="text-danger" />
		</div>			
		<button class="btn btn-primary"> Send a gift</button>	
		</form:form>
   
   </div>
</body>
</html>