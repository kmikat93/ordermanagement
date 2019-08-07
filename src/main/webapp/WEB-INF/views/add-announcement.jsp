<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="pl_PL">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0 shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="description" content="User dashboard for order some stuff and some junk">
    <meta name="keywords" content="documents, order">
    <meta name="author" content="Katarzyna Kmieć, Michał Motyka, Kamil Janiak">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/new-order-form-look.css" type="text/css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/favicon-96x96.png" type="image/png">
    <title>WSB - add new announcement</title>
</head>
<body>
<header>
    <a href="/"><img src="${pageContext.request.contextPath}/static/wsb.jpg" alt="Logo Wyższej szkoły bankowej"></a>
</header>
<nav class="navbar navbar-dark bg-primary navbar-expand-md">
    <a class="navbar-brand mr-8" href="/">WSB</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main-menu" aria-controls="main-menu" aria-label="Przełącznik nawigacyjny" aria-expanded="false">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div id="main-menu" class="collapse navbar-collapse">
        <ul class="navbar-nav ml-4 mr-auto">
            <li class="nav-item active"><a class="nav-link" href="/announcement"> Dodaj ogłoszenie</a></li>
            <li class="nav-item"><a class="nav-link" href="/add-order">Dodaj zamówienie</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Moje zamówienia</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Zamówienia mojego działu</a></li>
        </ul>
        <ul class="navbar-nav ">
            <li class="nav-item "><a class="nav-link" href="#"> Zalogowany jest: </a></li>
            <li class="nav-item "><a class="nav-link" href="/logout"> Wyloguj</a></li>
        </ul>
    </div>
</nav>
<div class="container">
    <main class="row">
        <form action="/" method="POST" class="col-md-5 offset-md-3">
            <div class="form-group">
                <label for="title">Tytuł:</label>
                <input type="text" class="form-control" id="title" name="title" placeholder="Tytuł">
            </div>
            <div class="form-group">
                <label for="description">Treść ogłoszenia:</label>
                <textarea class="form-control" id="description" name="description" placeholder="Tutaj możesz dodać swoje ogłoszenie" maxlength="200"></textarea>
            </div>
            <div class="button-property">
                <button type="submit" class="btn btn-primary button-submit">Wyślij</button>
                <button type="reset" class="btn btn-secondary">Wyczyść</button>
            </div>
            <sec:csrfInput/>
        </form>
    </main>
</div>
<footer>
    <div>
        @Copyrights for authors
    </div>
</footer>

<script defer="" src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script defer="" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script defer="" src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>