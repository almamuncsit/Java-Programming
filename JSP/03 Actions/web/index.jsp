<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

    <jsp:include page="date.jsp" flush="true" />

    <jsp:useBean id="test" class="action.TestBean" />
    <jsp:setProperty name="test" property="message" value="How are you" />

    <h2> Get Message </h2>
    <jsp:getProperty name="test" property="message" />

</body>
</html>
