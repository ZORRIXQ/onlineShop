<%@ page contentType="text/html; ISO-8859-1; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="/resources/style/style.css"/> ">
    <title>HOME</title>
</head>
<body>
        <header>
            <h1>Online Shop</h1>
            <a href="home" class="home-btn">Home</a>
        </header>
        <main>
            <c:forEach items="${allProducts}" var="item">
                <form:form action="product${item.id}" method="POST">
                    <div class="product-card">
                        <a href="product${item.id}">
                            <img src="${item.bytesToimage()}" alt="Product 1">
                            <h2>${item.name}</h2>
                            <p class="price">${item.price}</p>
                            <p class="description">${item.description}   Lorem ipsum dolor sit amet, conwqfwqfqwfsectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                        </a>
                    </div>
                </form:form>
            </c:forEach>
        </main>

</body>
</html>
