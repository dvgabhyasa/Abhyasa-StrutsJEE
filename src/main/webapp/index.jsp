<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts FormOps | Index</title>
</head>

<body>
<h1>Form Operations</h1>

This demonstrates Struts 2 form tags mimic normal HTML form element.
<p>This demonstrate similar execution operation for html form and struts form to understand behavioural difference between them.</p>
<!-- <p>Objective : This demonstrates various form operations scenarios like design, develop, processing, pdf generation, mail 📧 & security 🔐.</p> -->


 
	<!-- HTML Form -->
	<fieldset>
		<legend>HTML Forms</legend>
		<p>This is simple html form elements.</p>
		<a href="simpleform.html" target="_blank">HTML Simple Form</a>
	</fieldset>
	
	<!-- Struts Form -->
	<fieldset>
		<legend>Struts Forms</legend>
		<p>This performs struts taglib based form operations.</p>
		<a href="simpleform.jsp" target="_blank">Struts Simple Form</a>
		
		<p>Introducing properties, enable labels coming from respective properties file, 
		the display of view page must be the result of executing a Struts 2 Action class.
		
		Using Struts 2 Tag to create a link for action (simpleformops, defined in struts.xml file)
		Here, form action is mapped with url action attribute & creating a variable to be used for href attribute.
		</p>
		
		<s:url action="simpleformInput" var="simpleformInputLink" />
		<s:a href="%{simpleformInputLink}" target="_blank">Struts Simple Form with property</s:a>
	</fieldset>

</body>
</html>