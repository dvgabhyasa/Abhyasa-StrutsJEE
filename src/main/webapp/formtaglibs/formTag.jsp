<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts 2 Tag | Form Submit Reset Image</title>
</head>
<body>

<h1>Struts 2 Form Tag</h1>

	<fieldset>
		<legend>Label Field Tag</legend>
		
		<s:label name="txtRegister" label="Register" />
		<s:label name="txtForgotPasswor" label="Forgot Password" />
		<!--
		<hr />
		 <p>
		[Renders] The label tag is a UI tag, that randers HTML label.
		[Format] This allows us the output label:value type of combination. This has same format treatment as the rest of UI controls.
		[Observation] There is no line break for each of label
		</p> 
		-->
	</fieldset>


	<fieldset>
	<legend>Struts Form Tag</legend>
	
	<s:form>
		<s:textfield name="txtEmail" label="Email" />
		<s:textfield name="txtUsername" label="Username" />
		<s:password name="txtPassword" label="Password" />
	</s:form>
	<!-- <hr />	
	<p>The form tag is a UI tag, that renders HTML form.
	
	</p>
	-->
	</fieldset> <!-- Ends Form tag -->
	
	<fieldset>
		<legend>Submit Submit and Input</legend>
		<s:submit type="submit" />
		<s:submit type="input" />
		<!-- <hr />
		<p>
		Render: Submit tag is a UI tag, that is used to render a submit button.
		Async Form Submission: The submit tag used with form tag to provide asynchronous form submissions.
		value attribute : specifies the value of input element.
		type attribute : specifies the type of submit. Valid values are input, submit, image
		</p>  -->
	</fieldset>	
		
	<fieldset>
		<legend>Submit type Image</legend>
		<s:submit type="image" src="ThumbsUp.png" align="center" />
		
		<!-- 
		<hr />		
		<p>
		Image type:
		src attribute : specifies source location for supporting image, no effect on type input and button.
		- path is taken from relative to current jsp file
		align attribute : specifies HTML align attribute.				
		</p>
		-->
	</fieldset>	<!-- Ends image -->
		
	<fieldset>
		<legend>Submit type Reset : Reset form fields</legend>
		<s:reset value="Reset Button" />
		
		<!-- 
		<hr />
		The reset tag is a UI tag that  is used with the form tag to provide form resetting.
		
		Renders - a reset button
		
		Two types of rendering
		<input type="reset" ...>
		<button type="reset"...> : button type has advantages as it adds the possibility to separate the submitted value from the text shown on the button face.
		renders a reset button which provides the form resetting.  
		-->
	</fieldset> <!-- Ends reset  -->
	


</body>
</html>