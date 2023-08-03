<%--
  Created by IntelliJ IDEA.
  User: tiepd
  Date: 03/08/2023
  Time: 10:33 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<style>
    img {
        width: 100px;
    }

    table {
        margin-left: 35%;
    }
</style>
<body style="text-align: center">
<h1><%= "Danh sach khách hàng" %>
</h1>
<br/>
<table border="1" cellspacing="1" cellpadding="1">
    <thead>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listPro}" var="pro">
        <tr>
            <td>${pro.customerName}</td>
            <td>${pro.birthDay}</td>
            <td>${pro.address}</td>
            <td><img
                    src="${pro.image}">
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
