//TODO forma dodawanie departamentu

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Testowa strona główna</title>
</head>
<body>
//TODO lista ze wszystkimi departamentami pobranymi z bazy
<form method="post" action="/department">
    Wpisz nazwe departamentu: <input type="text" name="name" id="name"><br>

    <button type="submit">Zarejestruj!</button>
    <sec:csrfInput/>

</form>
</body>
</html>