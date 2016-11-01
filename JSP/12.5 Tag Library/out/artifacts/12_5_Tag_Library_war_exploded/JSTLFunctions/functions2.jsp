<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Using JSTL Functions</title>
</head>
<body>

<c:set var="string1" value="This is first          String."/>

<c:set var="string2" value="${fn:substringAfter(string1, 'is')}" />
<p>Final sub string : ${string2}</p>

<c:set var="string2" value="${fn:substringBefore(string1, 'first')}" />
<p>Final sub string : ${string2}</p>

<c:set var="string2" value="${fn:toLowerCase(string1)}" />
<p>Final string : ${string2}</p>

<c:set var="string2" value="${fn:toUpperCase(string1)}" />
<p>Final string : ${string2}</p>

<p>String (1) Length : ${fn:length(string1)}</p>
<c:set var="string2" value="${fn:trim(string1)}" />
<p>String (2) Length : ${fn:length(string2)}</p>
<p>Final string : ${string2}</p>

</body>
</html>