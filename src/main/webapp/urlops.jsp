<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts Web Ops | URL</title>
</head>
<body>

<h1>URL Operations</h1>
Similar like href Creates hyperlink in jsp pages using struts 2 taglib 

<h2>Simple link</h2>
<p>Scenario : User can click the link to tell struts2 framework to run the execute() from action class & render view from hello.jsp </p>
Action URL for Hello :  <a href="<s:url action='hello' />">Hello World!</a>

<h2>URL with Query String</h2>
<p>Scenario : Processing a url containing a query string. On hover link shows query string</p>
<!-- 
<p>
Rather than putting struts url tag inside html ancher tag href attribute, 
Here we have separated out the s:url into its own code block.
- Inside struts url tag is nested param tag
- param tag allow to specify query string parameter name (queryName) and a value of that parameter (Bruce Wayne)
- if multiple param tag represents multiple query string separated by ampersand (&) symbol
- query string parameters are properly URL-encodied(Bruce+Wayne)
var attribute is a reference, to create a url with query string
- To provide html href value 
</p>
 -->
<s:url action="urlquery" var="urlQueryString">
	<s:param name="queryName">Bruce Wayne</s:param>
	<s:param name="queryCity">Gotham</s:param>
</s:url>
🦇 <a href="${urlQueryString}">Bruce Wayne</a> 



</body>
</html>