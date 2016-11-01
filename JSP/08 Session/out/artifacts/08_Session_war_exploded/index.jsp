<%@ page import="java.util.Date" %>

<%
    // Get session creation time.
    Date createTime = new Date(session.getCreationTime());
    // Get last access time of this web page.
    Date lastAccessTime = new Date(session.getLastAccessedTime());
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Session </title>
</head>
<body>
    <h1><%= session.getAttribute("name")%></h1>
    <h2> <%= session.getAttribute("userId") %> </h2>

    <h2> <%= createTime %> </h2>
    <h2> <%= lastAccessTime %> </h2>
    <h2> <% out.print( session.getId()); %> </h2>

</body>
</html>
