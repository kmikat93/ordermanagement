//TODO dodawanie statusów

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Testowa strona główna</title>
</head>
<body>
//TODO lista ze wszystkimi statusami pobranymi z bazy
<form method="post" action="/status">
    Wpisz nazwe statusu: <input type="text" name="name" id="name"><br>

    <button type="submit">Zarejestruj!</button>
    <sec:csrfInput/>

</form>
</body>
</html>