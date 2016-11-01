<%--
  Created by IntelliJ IDEA.
  User: mamun
  Date: 9/22/16
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie cookie = null;
        Cookie cookies[] = null;

        cookies = request.getCookies();

        if(cookies != null) {
            out.println("<h2>Found Cookies name and value</h2>");
            for (int i=0; i < cookies.length; i++) {
                cookie = cookies[i];

                if((cookie.getName( )).compareTo("first_name") == 0 ){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    out.print("Deleted cookie: " +
                            cookie.getName( ) + "<br/>");
                }

                out.println(cookie.getName() + ": " +cookie.getValue());
                out.println("<br/>");
            }
        }
    %>
</body>
</html>
