<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StrutsOps | Hello</title>
</head>
<body>

<s:property value="helloMessageModel.helloMessage"/>
<!-- 
An important feature of this struts property tag is that 
it will automatically convert the most common data types (int, double, boolean) to their String equivalent.
 -->
 
 <p>Hello is said <s:property value="count" /> times! </p>

</body>
</html>