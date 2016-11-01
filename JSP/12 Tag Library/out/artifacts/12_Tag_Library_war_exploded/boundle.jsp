<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>JSTL fmt:bundle Tag</title>
</head>
<body>

<fmt:bundle basename="com.tutorialspoint.Example_En" prefix="count.">
    <fmt:message key="one"/><br/>
    <fmt:message key="two"/><br/>
    <fmt:message key="three"/><br/>
</fmt:bundle>

<br/>

<!-- Change the Locale -->
<fmt:setLocale value="es_ES"/>
<fmt:bundle basename="com.tutorialspoint.Example">
    <fmt:message key="count.one"/><br/>
    <fmt:message key="count.two"/><br/>
    <fmt:message key="count.three"/><br/>
</fmt:bundle>


<br>

<fmt:requestEncoding value="UTF-8" />
<fmt:setLocale value="En"/>
<fmt:setBundle basename="com.tutorialspoint.Example_En" var="lang"/>

<fmt:message key="count.one" bundle="${lang}"/><br/>
<fmt:message key="count.two" bundle="${lang}"/><br/>
<fmt:message key="count.three" bundle="${lang}"/><br/>

</body>
</html>
