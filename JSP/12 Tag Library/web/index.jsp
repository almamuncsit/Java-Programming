<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> Standard Library </title>
  </head>
  <body>

  <%--<c:redirect url="http://www.photofuntoos.com"/>--%>

    <c:out value="${'<tag> , &'}"/>

    <c:set var="salary" scope="session" value="${2000*2}"/>
    <c:out value="${salary}"/>

    <c:if test="${salary > 2000}">
        <p>My salary is: <c:out value="${salary}"/><p>
    </c:if>

    <p>
    <c:choose>
      <c:when test="${salary <= 0}">
        Salary is very low to survive.
      </c:when>
      <c:when test="${salary > 1000}">
        Salary is very good.
      </c:when>
      <c:otherwise>
        No comment sir...
      </c:otherwise>
    </c:choose>
    </p>
    <c:remove var="salary"/>
    <p>After Remove Value: <c:out value="${salary}"/></p>


    <c:catch var ="catchException">
      <% int x = 5/0;%>
    </c:catch>

    <c:if test = "${catchException != null}">
      <p>The exception is : ${catchException} <br />
        There is an exception: ${catchException.message}</p>
    </c:if>

    <% int a = 5; %>


    <c:forEach var="i" begin="1" end="5">
        Item <c:out value="${i}"/><p>
    </c:forEach>

    <c:forTokens items="Zara,nuha,roshy" delims="," var="name">
        <c:out value="${name}"/><p>
    </c:forTokens>
        <br>

        <a href="<c:url value="/jsp/index.htm"/>">TEST</a>

    <%--<c:url value="/inport.jsp" var="myURL">--%>
        <%--<c:param name="trackingId" value="1234"/>--%>
        <%--<c:param name="reportType" value="summary"/>--%>
    <%--</c:url>--%>

    <%--<c:import url="${myURL}"/>--%>


    <c:import var="data" url="http://www.tutorialspoint.com"/>
    <%--<c:out value="${data}"/>--%>


  </body>
</html>
