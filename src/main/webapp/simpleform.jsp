<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts FormOps | Simple Form</title>
</head>
<!-- 
To provide styling using CSS for error messages

Returns a chunk of HEAD
Just before the end of head tag
 -->
<s:head/>
<body>

<s:form action="simpleformops">
	<s:textfield name="simpleFormBean.txtFirstname" label="First Name" />
	<s:textfield name="simpleFormBean.txtLastname" label="Last Name" />
	<s:textfield name="simpleFormBean.txtEmail" label="Email" />
	<s:textfield name="simpleFormBean.txtAge" label="Age" />
	
	<s:submit value="Submit" />
	<s:reset value="Reset" />
</s:form>

</body>
</html>