<%@ page contentType="text/html; ISO-8859-1; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>HOME</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/> ">
</head>
<header>
    <h1><a href="home"> HOME </a></h1>
    <br><br>
</header>
<body>

<ul>
<%--        <c:forEach items="${productList}" var="item">--%>
            <li>
                <a href="product">
                    <div class="card">
                        <img src="<c:url value="/resources/images/phone.png"/> " style="width:100%" alt="iphonee">
                        <h1>{item.name}</h1>
                        <p class="price">{product.price}</p>
                        <p>{product.description}</p>
                        <p><button>Add to Cart</button></p>
                    </div>
                </a>
            </li>
<%--        </c:forEach>--%>
</ul>

</body>
</html>
