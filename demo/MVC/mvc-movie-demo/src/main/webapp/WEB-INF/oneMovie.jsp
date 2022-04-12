<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring project</title>
</head>
<body>
<h1> One movie</h1>
<p> Movie ID: ${movie.id } </p>
<p>Movie title: <c:out value ="${movie.title }"></c:out></p>
<p> Movie Description: <c:out value ="${movie.description }"></c:out></p>

</body>
</html>