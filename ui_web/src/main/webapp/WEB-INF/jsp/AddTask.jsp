<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>Add Task</title>
</head>
<body>
    <form:form method="post" modelAttribute="Task" action="/add" id="myDIV">
       <form:label path="tile">Name</form:label>
       <form:input type="text" path="tile" />
       <br/>
       <br/>
       <form:label path="content">Email</form:label>
       <form:input type="text" path="content" />
       <br/>
       <br/>
       <form:label path="deadline">Topic</form:label>
       <form:input type="text" path="deadline" />
       <br/>
       <br/>
       <form:input type="text" path="question" />
       <input type="submit" value="Submit" />
       <br/>
       <br/>
    </form:form>
    
    <button onclick="myFunction()">Try it</button>
</body>
</html>