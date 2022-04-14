<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<form:form action="/users/new" method="post" modelAttribute="user" class="form-control">
			<div>
				<form:label path="username" class="form-label"> Username </form:label>
				<form:input path= "username" class="form-control" />
				<form:errors path="username" class="text-danger" />
			</div>
			<button class="btn btn-primary"> Create a new user</button>
		</form:form>
   
   </div>
</body>
</html>