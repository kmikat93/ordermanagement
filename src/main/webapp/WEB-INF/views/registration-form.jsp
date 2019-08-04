<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pl_PL">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0 shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="description" content="User dashboard for order some stuff and some junk">
    <meta name="keywords" content="documents, order">
    <meta name="author" content="Katarzyna Kmieć Michał Motyka Kamil Janiak">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/new-order-form-look.css" type="text/css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/favicon-96x96.png" type="image/png">
    <title>WSB - registration</title>
</head>
<body>
<header>
    <img src="${pageContext.request.contextPath}/static/wsb.jpg" alt="Logo Wyższej szkoły Bankowej">
</header>
<nav class="navbar navbar-dark bg-primary navbar-expand-md">
    <a class="navbar-brand mr-8" href="plTabUser.html">WSB - kieruj do home-page-logged</a>
    <!--
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main-menu" aria-controls="main-menu" aria-label="Przełącznik nawigacyjny" aria-expanded="false">
        <span class="navbar-toggler-icon"></span>
    </button>
    -->
    <div id="main-menu" class="collapse navbar-collapse">
        <ul class="navbar-nav ml-4 mr-auto">
        </ul>
    </div>
</nav>
<div class="container">
    <main class="row">


        <form action="home-page" method="POST" class="col-md-5 offset-md-3">
            <h1 class="col-md-5 offset-md-3">Registration</h1>
            <div class="form-registration">
                <label for="userName">Username:</label>
                <input type="text" class="form-control" id="userName" name="userName" placeholder="">
            </div>
            <div class="form-registration">
                <label for="password">Password:</label>
                <input type= "password" class="form-control" id="password" name="password" placeholder="">
            </div>
            <div class="form-registration">
                <label for="firstName">First Name:</label>
                <input class="form-control" id="firstName" name="firstName" placeholder="">
            </div>
            <div class="form-registration">
                <label for="lastName">Last Name:</label>
                <input class="form-control" id="lastName" name="lastName" placeholder="">
            </div>
            <div class="form-registration">
                <label for="eMail">e-mail</label>
                <input class="form-control" id="eMail" name="eMail" placeholder="">
            </div>
            <div class="form-registration">
                <!--<style="min-width: 100%"> -->
                <label for="departments">Department:</label>
                <br>
                <select name="departments" id="departments">
                    <c:forEach items="${departments}" var="department">
                          <!--tu będzie gunwo -->
                    </c:forEach>
                </select>
                <div class="form-registration">
                    <!--<style="min-width: 100%"> -->
                    <label for="position">Position:</label>
                    <select name="position" id="position">
                        <option value="Empty"></option>
                        <option value="Tough stuff">Boss of them all</option>
                        <option value="Omfg don't even think bout it">Too tired to get up</option>
                        <option value="Yhm in your dreams mate, i'm a single mom">Yhm in your dreams mate</option>
                        <option value="i'm a single mom">i'm a single mom</option>
                    </select>
                </div>
                <div class="button-property">
                    <button type="submit" class="btn btn-primary button-submit">Sumbit</button>
                    <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
            </div>
            <sec:csrfInput/>
        </form>
    </main>
</div>
<footer>
    <div>
        <p>@Copyrights for authors</p>
    </div>
</footer>

<script defer="" src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script defer="" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script defer="" src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>