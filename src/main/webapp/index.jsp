<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, br.com.gulliver.model.Hotel" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="hotel" items="${hoteis}">
		<p>
		<c:out value="${hotel.nome}"></c:out>
		</p>
	</c:forEach>
</body>
</html>