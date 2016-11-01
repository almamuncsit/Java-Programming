<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Using GET Method to Read Form Data</h1>
    <ul>
        <li><p><b>First Name:</b>
            <%= request.getParameter("first_name")%>
        </p></li>
        <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name") %>
        </p></li>
        <li><p><b>Maths Flag:</b>
            <%= request.getParameter("maths")%>
        </p></li>
        <li><p><b>Physics Flag:</b>
            <%= request.getParameter("physics")%>
        </p></li>
        <li><p><b>Chemistry Flag:</b>
            <%= request.getParameter("chemistry")%>
        </p></li>


        <h1> Get All Elements </h1>
        <table width="100%" border="1" align="center">
            <tr bgcolor="#949494">
                <th>Param Name</th><th>Param Value(s)</th>
            </tr>
            <%
                Enumeration paramNames = request.getParameterNames();

                while(paramNames.hasMoreElements()) {
                    String paramName = (String)paramNames.nextElement();
                    out.print("<tr><td>" + paramName + "</td>\n");
                    String paramValue = request.getParameter(paramName);
                    out.println("<td> " + paramValue + "</td></tr>\n");
                }

            %>
        </table>

    </ul>
</body>
</html>
