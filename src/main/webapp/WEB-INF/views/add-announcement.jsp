//TODO zrobic prosty form dodawania ogloszenia

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Testowa strona główna</title>
</head>
<body>

<form method="post" action="/announcement">
    Wpisz tytul ogloszenia: <input type="text" name="title" id="title"><br>
    Wpisz treść ogloszenia: <input type="text" name="description" id="description"><br>

    <button type="submit">Zapisz ogłoszenie</button> <button type="reset">Wyczyść</button>
    <sec:csrfInput/>

</form>

</body>
</html>