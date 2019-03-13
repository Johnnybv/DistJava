
<%@ page import="java.util.List" %>
<%@ page import="edu.wctc.simple.Model.Products" %>
<%--
  Created by IntelliJ IDEA.
  User: John Erickson
  Date: 3/13/2019
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Supreme LineUp!</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="CSS/Site.css">

</head>
<body>
<header>
    <h1>Supreme LineUp!</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="productList.jsp">Clothing Line</a></li>
            <li><a href="about.jsp">About Us</a></li>
            <li class="cart"><a href="cart.go"><i class="fas fa-cart-arrow-down"></i></a></li>
        </ul>

    </nav>
</header>
<main>
    <hr />
    <h2>Clothing Line</h2>
    <form action="cartplace.go">
    <div class="container">
        <div class="row">
            <%
                List<Products> productList = (List<Products>) request.getAttribute("productList");
                for (Products product : productList) {
            %>
            <div class="card col-lg-4 col-m-3 col-sm-4">
                <div class="card-body">
                    <h5 class="card-title"><%= product.getpName() %> Price - $ <%= product.getPrice() %></h5>
                    <h6 class="card-subtitle mb-2 text-muted">ID - <%= product.getpID() %></h6>
                    <p class="card-text">Discription - <%= product.getDisc() %></p>
                    <a href="#" class="card-link">Add to Cart</a>
                </div>
            </div>
            <%
                }
            %>
        </div>
        <input type="submit" value="Purchase">
    </form>
</main>
<footer>

</footer>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script type="text/javascript" src="JS/Site.js"></script>

</body>
</html>