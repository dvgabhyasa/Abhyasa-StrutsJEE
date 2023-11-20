<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts FormOps | Index</title>
</head>
<body>

<h1>Result Page</h1>
<p>This is result page demonstrating result data.</p>

<p>Your detail info</p>
<s:property value="simpleFormBean"/>

<p>	<s:text name="simpleFormBean.thankyou"></s:text>	</p>


</body>
</html>