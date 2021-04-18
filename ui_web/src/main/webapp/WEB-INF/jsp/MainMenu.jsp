<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>Main menu</title>
	 <link href="${pageContext.request.contextPath}/resources/css/table.css" rel="stylesheet">
</head>
	<body>
		<div>Main menu</div>
		<br/>
		<a href="${pageContext.request.contextPath}/task/list">List of Tasks</a>
		<br/>
		<a href="${pageContext.request.contextPath}/task/add">add Tasks</a>
	</body>
</html>