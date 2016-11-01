<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
    <title>JSTL x:out Tags</title>
</head>
<body>
<h3>Books Info:</h3>

<c:set var="xmltext">
    <books>
        <book>
            <name>Padam History</name>
            <author>ZARA</author>
            <price>100</price>
        </book>
        <book>
            <name>Great Mistry</name>
            <author>NUHA</author>
            <price>2000</price>
        </book>
    </books>
</c:set>

    <x:parse xml="${xmltext}" var="output"/>
    <b>The title of the first book is</b>:
    <x:out select="$output/books/book[1]/name" />
    <br>
    <b>The price of the second book</b>:
    <x:out select="$output/books/book[2]/price" />

    <p>
        <x:if select="$output//book">
        Document has at least one <book> element.
        </x:if>
        <br />
        <x:if select="$output/books[1]/book/price > 100">
        Book prices are very high
        </x:if>
    </p>

    <h3>Books Info:</h3>
    <c:import var="bookInfo" url="books.xml"/>

    <x:parse xml="${bookInfo}" var="output"/>
    <b>The title of the first book is</b>:
    <x:out select="$output/books/book[1]/name" />
    <br>
    <b>The price of the second book</b>:
    <x:out select="$output/books/book[2]/price" />


<ul class="list">
    <x:forEach select="$output/books/book/name" var="item">
        <li>Book Name: <x:out select="$item" /></li>
    </x:forEach>
</ul>


<x:choose>
    <x:when select="$output//book/author = 'ZARA'">
        Book is written by ZARA
    </x:when>
    <x:when select="$output//book/author = 'NUHA'">
        Book is written by NUHA
    </x:when>
    <x:otherwise>
        Unknown author.
    </x:otherwise>
</x:choose>

</body>
</html>