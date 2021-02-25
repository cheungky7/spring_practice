<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Enquiry</title>
<script>
function myFunction() {
  var x = document.getElementById("myDIV");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}
</script>
</head>
<body>
    <form:form method="post" modelAttribute="Enquiry" action="/enquiry" id="myDIV">
       <form:label path="name">Name</form:label>
       <form:input type="text" path="name" />
       <br/>
       <br/>
       <form:label path="email">Email</form:label>
       <form:input type="text" path="email" />
        <br/>
        <br/>
        <form:label path="topic">Topic</form:label>
       <form:input type="text" path="topic" />
       <br/>
       <br/>
       <form:label path="question">Question</form:label>
       <form:input type="text" path="question" />
       <input type="submit" value="Submit" />
       <br/>
       <br/>
    </form:form>
    
    <button onclick="myFunction()">Try it</button>
</body>
</html>