
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> POST </title>
</head>
<body>
<form action="confirm.jsp" method="post">
    First Name: <input type="text" name="first_name" />
    <br />
    Last Name: <input type="text" name="last_name" /> <br>

    Subject : <br/>
    <input type="checkbox" name="maths" checked="checked" /> Maths
    <input type="checkbox" name="physics"  /> Physics
    <input type="checkbox" name="chemistry" checked="checked" /> Chemistry
    <br>

    <input type="submit" value="Submit" />
</form>
</body>
</html>
