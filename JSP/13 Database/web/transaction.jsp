<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
    <head>
        <title>SELECT Operation</title>
    </head>
    <body>

        <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/hello_db"
                           user="root"  password="root"/>



        <sql:transaction dataSource="${snapshot}">
            <sql:update var="count">
                UPDATE users SET name = 'Ali' WHERE Id = 14
            </sql:update>
            <sql:update var="count">
                UPDATE users SET name = 'Shah' WHERE Id = 15
            </sql:update>
            <sql:update var="count">
                INSERT INTO users 
                VALUES (null,'Nuha', 'Ali@lfm.com', '2546545');
            </sql:update>
        </sql:transaction>



        <sql:query dataSource="${snapshot}" var="result">
            SELECT * from users;
        </sql:query>

        <table border="1" width="100%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.id}"/></td>
                    <td><c:out value="${row.name}"/></td>
                    <td><c:out value="${row.email}"/></td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>