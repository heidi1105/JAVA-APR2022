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
	<h1>Review page</h1>
	<form action="/processReview" method="post">
		<p>
			<label> Reviewer </label> <input type="text" name="reviewer" />
		</p>
		<p>
			<label> Product </label> <input type="text" name="product" />
		</p>
		<p>
			<label> Comment </label> <textarea name="comment"></textarea>
		</p>
		<p>
			<label> Rating </label> <input type="number" name="rating" />
		</p>
		<button> Submit your review!</button>
	</form>
</body>
</html>