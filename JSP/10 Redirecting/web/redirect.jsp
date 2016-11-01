<%--
  Created by IntelliJ IDEA.
  User: mamun
  Date: 9/24/16
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Redirect Page</title>
</head>
<body>
<h1> Redirect Page </h1>

<%
    response.setIntHeader("Refresh", 5);

    Integer hitsCount =
            (Integer) application.getAttribute("hitCounter");
    if (hitsCount == null || hitsCount == 0) {
       /* First visit */
        out.println("Welcome to my website!");
        hitsCount = 1;
    } else {
       /* return visit */
        out.println("Welcome back to my website!");
        hitsCount += 1;
    }
    application.setAttribute("hitCounter", hitsCount);
%>
<center>
    <p>Total number of visits: <%= hitsCount%>
    </p>
</center>

</body>
</html>

