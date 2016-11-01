<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Using JSTL Functions</title>
</head>
<body>

<c:set var="string1" value="This is first String."/>
<c:set var="string2" value="This <abc>is second String.</abc>"/>

<p>With escapeXml() Function:</p>
<p>string (1) : ${fn:escapeXml(string1)}</p>
<p>string (2) : ${fn:escapeXml(string2)}</p>

<p>Without escapeXml() Function:</p>
<p>string (1) : ${string1}</p>
<p>string (2) : ${string2}</p>

<p>Index (1) : ${fn:indexOf(string1, "first")}</p>
<p>Index (2) : ${fn:indexOf(string2, "second")}</p>

<c:set var="string3" value="${fn:split(string1, ' ')}" />
<p>Final String : ${string3[3]}</p>
<c:set var="string4" value="${fn:join(string3, '-')}" />

<p>Final String : ${string4}</p>
<p>Length of String (1) : ${fn:length(string1)}</p>

<c:set var="string5" value="${fn:replace(string1, 'first', 'second')}" />
<p>Final String : ${string5}</p>

<c:set var="string8" value="${fn:substring(string1, 5, 18)}" />

<p>Final sub string : ${string8}</p>

</body>
</html>