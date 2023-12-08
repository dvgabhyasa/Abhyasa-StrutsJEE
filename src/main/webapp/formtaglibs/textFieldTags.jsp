<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts 2 | Text Password TextArea field Tag</title>
</head>
<body>

<h1>Struts 2 Text field Tag</h1>

<fieldset>
	<legend>Text Field</legend>
	<p>The label tag is a UI tag, that randers HTML input field of text type.</p>
	<s:textfield label="text Field" name="txtEmpname" size="15" maxlength="10" />	
</fieldset>

<fieldset>
	<legend>Password Field</legend>
	<s:password label="Password Field" name="txtPassword" size="15" maxlength="10" />
	<p>Renders HTML equivalent password</p>
</fieldset>

<fieldset>
	<legend>Textarea Field</legend>
	<s:textarea label="Address" name="txtAddress" rows="5" cols="20" />
	<p>Renders HTML equivalent textarea</p>
	
</fieldset>

<p>
label: renders text field label
</p>



</body>
</html>