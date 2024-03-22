<%@ page language="java" contentType="text/html; ISO-8859-1; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>HOME</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/> ">
</head>
<header>
    <h1><a href="home" align="center"> HOME </a></h1>
    <br><br>
</header>
<body>

<ul>
    <ul>
<%--        <c:forEach items="" var="items">--%>
            <li>
                <a href="product">
                    <div class="card">
                        <img src="<c:url value="/resources/images/phone.png"/> "  alt="Denim Jeans" style="width:100%">
                        <h1>Iphone</h1>
                        <p class="price">$750</p>
                        <p>The iPhone 15 display has rounded corners that follow a beautiful curved design</p>
                        <p><button>Add to Cart</button></p>
                    </div>
                </a>
            </li>
<%--        </c:forEach>--%>
    </ul>
</ul>

</body>
</html>
