<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>JSTL fmt:dateNumber Tag</title>
</head>
<body>
<h3>Number Format:</h3>
<c:set var="now" value="<%=new java.util.Date()%>" />

<p>Formatted Date (1): <fmt:formatDate type="time"
                                       value="${now}" /></p>
<p>Formatted Date (2): <fmt:formatDate type="date"
                                       value="${now}" /></p>
<p>Formatted Date (3): <fmt:formatDate type="both"
                                       value="${now}" /></p>
<p>Formatted Date (4): <fmt:formatDate type="both"
                                       dateStyle="short" timeStyle="short"
                                       value="${now}" /></p>
<p>Formatted Date (5): <fmt:formatDate type="both"
                                       dateStyle="medium" timeStyle="medium"
                                       value="${now}" /></p>
<p>Formatted Date (6): <fmt:formatDate type="both"
                                       dateStyle="long" timeStyle="long"
                                       value="${now}" /></p>
<p>Formatted Date (7): <fmt:formatDate pattern="yyyy-MM-dd"
                                       value="${now}" /></p>


<c:set var="now" value="20-10-2010" />

<fmt:parseDate value="${now}" var="parsedEmpDate"
               pattern="dd-MM-yyyy" />
<p>Parsed Date: <c:out value="${parsedEmpDate}" /></p>

</body>
</html>