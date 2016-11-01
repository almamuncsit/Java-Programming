<%--
  Created by IntelliJ IDEA.
  User: mamun
  Date: 9/24/16
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> Home </title>
  </head>
  <body>
    <%
      String site = new String("redirect.jsp");
      response.setStatus(response.SC_MOVED_TEMPORARILY);
      response.setHeader("Location", site);
    %>
  </body>
</html>
