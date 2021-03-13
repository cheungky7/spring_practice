<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>Add Task</title>
</head>
<body>
    <form:form method="post" modelAttribute="Task" action="add" id="myDIV">
       <form:label path="title">Title</form:label>
       <form:input type="text" path="title" />
       <br/>
       <br/>
       <form:label path="content">Content</form:label>
       <form:input type="text" path="content" />
       <br/>
       <br/>
       <form:label path="deadline">Deadline</form:label>
       <form:input type="datetime-local" path="deadline" />
       <br/>
       <br/>
       <input type="submit" value="Submit" />
    </form:form>
</body>
</html>