<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>List Task</title>
</head>
	<body>
		<table>
			<tr>
			<th>title</th>
			<th>content</th>
			<th>assignedTo</th>
			<th>assignedBy</th>
			<th>deadline</th>
			<th>assignedDate</th>
			</tr>
			<c:forEach items="${Tasks.Task}" var="task" varStatus="tagStatus">
			  <tr>
			    <td>${Task.title}</td>
			    <td>${Task.content}</td>
			    <td>${Task.assignedTo}</td>
			    <td>${Task.assignedBy}</td>
			    <td>${Task.deadline}</td> 
			    <td>${Task.assignedDate}</td>
			  </tr>
			</c:forEach>
		</table>
	</body>
</html>