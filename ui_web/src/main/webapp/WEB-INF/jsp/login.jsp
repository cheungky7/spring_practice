<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>List Task</title>
	<link href="${pageContext.request.contextPath}/resources/css/table.css" rel="stylesheet">
</head>
	<body>
		 <form:form method="post"  action="login" id="myDIV">
		 <div class="listTable-wrapper">
		   	<div class="row">
		   		<div class="column_head">
		       		User Name
		       	</div>
		       	<div class="column">
		       		<input type="text" name="userName" />
		       	</div>
		   	</div>
		   	<div class="row">
		   		<div class="column_head">
		       		Password
		       	</div>
		       	<div class="column">
		       	  <input type="text" name="password" />
		       </div>
		     </div>
		     <div class="row">
		     	<div class="column">
		         <input type="submit" value="Submit" />
		        </div>
		        <div class="column">
		        </div>
		    </div>
		 </div>
    	</form:form>
	</body>
</html>