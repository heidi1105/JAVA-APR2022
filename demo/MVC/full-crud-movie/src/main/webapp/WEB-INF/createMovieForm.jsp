<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring project</title>
</head>
<body>
	<h1>Create a new movie</h1>
	<form:form action="/movies/new" method="post" modelAttribute="movie">
    <p>
        <form:label path="title">Title</form:label>
        <form:input type="text" path="title"/>
        <form:errors path="title"/>
    </p>	
    
     <p>
        <form:label path="description">Description</form:label>
        <form:textarea path="description"/>
        <form:errors path="description"/>
    </p>
    
     <p>
        <form:label path="rating">Rating</form:label>
        <form:input type="number" path="rating"/>
        <form:errors path="rating"/>     
    </p> 
    <button> Create a new movie!</button>
	
	</form:form>
</body>
</html>