<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html; ISO-8859-1; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="/resources/style/style.css"/> ">
    <title>Product Page</title>
</head>
<body>

<header>
    <h1>${product.name} Details</h1>
    <a href="home" class="home-btn">Home</a>
</header>

<main class="product-details">
    <div class="product-image">
        <img src="<c:url value="/resources/images/phone.png"/> " alt="Product Image">
    </div>
    <div class="product-info">
        <h2>${product.name}</h2>
        <p class="price">Price: $${product.price}</p>
        <p class="description">${product.description}</p>
        <p>Additional details...</p>
    </div>
</main>

</body>
</html>