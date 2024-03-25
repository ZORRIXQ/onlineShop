<%@ page contentType="text/html; ISO-8859-1; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="/resources/style/style2.css"/> ">
    <title>HOME</title>
</head>
<body>
        <header>
            <h1>Online Shop</h1>
            <a href="home" class="home-btn">Home</a>
        </header>
        <main>
            <c:forEach items="${allProducts}" var="item">
                <div class="product-card">
                    <form:form action="product${item.id}" method="POST">
                            <a href="product${item.id}">
                                <img src="${item.imagePath}" alt="Product 1">
                                <h2 class="itemName">${item.name}</h2>
                                <H1 class="price">${item.price} $</H1>
<%--                                <p class="description">${item.description}</p>--%>
                            </a>
                    </form:form>
                </div>
            </c:forEach>
        </main>

</body>
</html>
