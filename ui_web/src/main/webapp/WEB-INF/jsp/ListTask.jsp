<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>List Task</title>
	  <link href="${pageContext.request.contextPath}/resources/css/table.css" rel="stylesheet">
</head>
	<body>
			<div class="listTable-wrapper">
				<div class="row">
					<div class="column_head">title</div>
					<div class="column_head">content</div>
					<div class="column_head">assignedTo</div>
					<div class="column_head">assignedBy</div>
					<div class="column_head">deadline</div>
					<div class="column_head">assignedDate</div>
				</div>
				<c:forEach items="${Tasks}" var="task" varStatus="tagStatus">
				  <div class="row">
				    <div class="column">${task.title}</div>
				    <div class="column">${task.content}</div>
				   	<div class="column">${task.assignedTo}</div>
				    <div class="column">${task.assignedBy}</div>
				    <div class="column">${task.deadline}</div>
				    <div class="column">${task.assignedDate}</div>
				  </div>
				</c:forEach>
			</div>
	</body>
</html>