<%@ page import="java.util.Date" %>

<%
    session.setAttribute("name", "Mamun");
    session.setAttribute("userId", "151-15-502454");

    // Get session creation time.
    Date createTime = new Date(session.getCreationTime());
    // Get last access time of this web page.
    Date lastAccessTime = new Date(session.getLastAccessedTime());
%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2> <%= createTime %> </h2>
    <h2> <%= lastAccessTime %> </h2>

    <h2> <% out.print( session.getId()); %> </h2>
</body>
</html>
