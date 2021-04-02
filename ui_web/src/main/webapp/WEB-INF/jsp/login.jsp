<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Login page</title>
		<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet">
		<script>
			function field_focus(field, Username)
			  {
			    if(field.value == Username)
			    {
			      field.value = '';
			    }
			  }
	
			  function field_blur(field, Username)
			  {
			    if(field.value == '')
			    {
			      field.value = Username;
			    }
			  }

		</script>
	</head>
	<body>
		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION.message}">
 			<div class="error">
   			 <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
  		</div>
		</c:if>
		 <form method="POST" name='f' action="perform_login" id="myDIV">
		 <div class="box" align="center">
		 	<h1>Login</h1>
		 	<input type="text" name="username" class="username" value="Username" 
		 		onFocus="field_focus(this, 'Username');" onblur="field_blur(this, 'Username');" />
		 	<input type="password" name="password" class="password"
		 		onFocus="field_focus(this, 'Username');" onblur="field_blur(this, 'Username');" />
		 	<input type="submit" value="Submit" class="btn" />
		 	<!--  <input value="clear" id="btn2"/>-->
		 </div>
    	</form>
	</body>
</html>