<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StrutsHelloOps | Index</title>
</head>
<body>

<h1>Hello Ops</h1>


<!-- User can click the link to tell struts2 framework to run the execute() from action class & render view from hello.jsp  -->
Action URL for Hello : 
<p><a href="<s:url action='hello' />">Hello World!</a></p>



</body>
</html>