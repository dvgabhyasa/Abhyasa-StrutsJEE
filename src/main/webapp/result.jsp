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

<p>
	<s:url action="index" var="indexLink" />
	<s:a href="%{indexLink}">Return to Home page</s:a>
</p>

<hr />
<p> Package Level Property Content : <s:text name="greetingPackageLevelProperty" /> </p>
<p> Global Level Property Content : <s:text name="contact"></s:text> </p>

</body>
</html>