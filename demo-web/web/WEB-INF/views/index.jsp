<%--
  Created by IntelliJ IDEA.
  User: wzl
  Date: 2019/11/25
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>id</td>
            <td>名称</td>
            <td>性别</td>
            <td>工资</td>
            <td>部门</td>
        </tr>
        <c:forEach var="s" items="${pageInfo.list}">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.sex}</td>
                <td>${s.wages}</td>
                <td>${s.department.name}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
