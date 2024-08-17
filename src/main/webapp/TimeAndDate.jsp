<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Current Date and Time</title>
	<!--	<meta http-equiv="refresh" content="1">-->
</head>
<body>
<h1>Current Date and Time</h1>

<p>Date: <%= new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %></p>
<p>Time: <%= new SimpleDateFormat("hh:mm:ss a").format(new Date()) %></p>
</body>
</html>
