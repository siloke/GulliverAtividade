<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, br.com.gulliver.model.Hotel" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gulliver</title>
</head>
<body>
	<ul>
	<c:forEach var="hotel" items="${hoteis}">
		<li>
		<c:out value="${hotel.nome}"></c:out>
		<c:out value="${hotel.cidade}"></c:out>
		<c:out value="${hotel.endereco}"></c:out>
		<c:out value="${hotel.regiao}"></c:out>
		</li>
	</c:forEach>
	</ul>
</body>
</html>