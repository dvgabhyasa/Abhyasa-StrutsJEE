<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form method="get" action="/struts2/tutorial/car.action">
        <p>Welcome to Baeldung Struts 2 app</p>
        <p>Which car do you like !!</p>
        <p>Please choose ferrari or bmw</p>
        <select name="carName">
            <option value="Ferrari" label="ferrari" />
            <option value="BMW" label="bmw" />
         </select>
        <input type="submit" value="Enter!" />
    </form>
</body>

</html>