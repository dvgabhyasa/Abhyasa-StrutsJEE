<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>		<!-- Struts 2 Tags in JSP -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	
	<!-- Login Form using Struts 2 Tags -->
	<s:form action="loginController">
		<s:textfield name="txtUsername" label="User Name"></s:textfield>
		<s:textfield name="txtPassword" label="Password"></s:textfield>
		<s:submit value="login"></s:submit>
	</s:form>

</body>
</html>