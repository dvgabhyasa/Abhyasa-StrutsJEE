<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts FormOps | Simple Form</title>
</head>
<body>


<s:form action="simpleformops">
	<s:textfield name="simpleFormBean.txtFirstname" />
	<s:textfield name="simpleFormBean.txtLastname" />
	<s:textfield name="simpleFormBean.txtEmail" />
	<s:textfield name="simpleFormBean.txtAge" />
	
	<s:submit value="Submit" />
	<s:reset value="Reset" />
</s:form>


</body>
</html>