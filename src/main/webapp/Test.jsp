<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="org.antwalk.HelloServlet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Message form Test</h1>
<form action="HelloServlet" method="post">
	Principle<input type="number" id="pric" name="princ"><br>
	Rate<input type="number" id="rate" name="rate"><br>
	Time<input type="number" id="Time" name="Time"><br>
	<input type="submit" value="Submit">
</form>

</body>
</html>