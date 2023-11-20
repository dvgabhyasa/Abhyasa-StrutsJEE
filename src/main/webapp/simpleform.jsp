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
<s:head />
<body>

<s:form action="simpleformops">
	<s:textfield key="simpleFormBean.txtFirstname" />
	<s:textfield key="simpleFormBean.txtLastname" />
	<s:textfield key="simpleFormBean.txtEmail" />
	<s:textfield key="simpleFormBean.txtAge" />
	
	<s:submit key="simpleFormBean.submit" />
	<s:reset key="simpleFormBean.reset" />
</s:form>

</body>
</html>