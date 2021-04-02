<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>List Task</title>
	<link href="${pageContext.request.contextPath}/resources/css/table.css" rel="stylesheet">
</head>
	<body>
		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION.message}">
 			<div class="error">
   			 <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
  		</div>
		</c:if>
		 <form method="POST" name='f' action="perform_login" id="myDIV">
		 <div class="loginTable-wrapper" align="center">
		   	<div class="row">
		   		<div class="column_head">
		       		User Name
		       	</div>
		       	<div class="column">
		       		<input type="text" name="username" />
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
    	</form>
	</body>
</html>