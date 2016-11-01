<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Using JSTL Functions</title>
</head>
<body>

    <c:set var="theString" value="I am a test String 123"/>

    <c:if test="${fn:contains(theString, 'test')}">
        <p>Found test string<p>
    </c:if>

    <c:if test="${fn:contains(theString, 'TEST')}">
        <p>Found TEST string<p>
    </c:if>

    <c:if test="${fn:containsIgnoreCase(theString, 'test')}">
        <p>Found test string<p>
    </c:if>

    <c:if test="${fn:containsIgnoreCase(theString, 'TEST')}">
        <p>Found TEST string<p>
    </c:if>

    <c:if test="${fn:endsWith(theString, '123')}">
        <p>String ends with 123<p>
    </c:if>

    <c:if test="${fn:startsWith(theString, 'I am')}">
        <p>String starts with First</p>
    </c:if>

</body>
</html>