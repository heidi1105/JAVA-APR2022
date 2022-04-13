<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring project</title>
</head>
<body>
	<h1>Edit a movie</h1>
	<form:form action="/movies/${movie.id }/edit" method="post" modelAttribute="movie">
    <input type="hidden" name="_method" value="put">    
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
    <button> Edit a movie!</button>
	
	</form:form>
</body>
</html>