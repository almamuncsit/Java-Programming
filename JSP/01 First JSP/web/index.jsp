
<%@page import="javafx.scene.shape.Circle"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title> Hello word </title>
    </head>

    <h1> How are you </h1>

    <%
        out.println("Your IP address is " + request.getRemoteAddr());
    %>
    <br/>


    <%-- This is JSP comment --%>

    <jsp:scriptlet>
        out.println("how are you");
    </jsp:scriptlet>

    <%-- This is JSP comment --%>

    <p>
        Today's date: <%= (new java.util.Date()).toLocaleString()%>
    </p>
    
    <h1> Condition and loop </h1>
    
    <%
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0)
                out.println(i);
        }
    %>
    

</html>
