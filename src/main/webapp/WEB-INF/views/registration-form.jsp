//TODO wstawić zawartość formularza rejestracji z metodą POST
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Testowa strona główna</title>
</head>
<body>

<form method="post" action="/register">
    Username: <input type="text" name="userName" id="userName"><br>
    //TODO pozniej zmienic tym inputa na password dla maskowania wpisywanych znakow
    Password: <input type="text" name="password" id="password"><br>
    First Name: <input type="text" name="firstName" id="firstName"><br>
    Last Name: <input type="text" name="lastName" id="lastName"><br>
    E-Mail: <input type="text" name="eMail" id="eMail"><br>
    Department: <input type="text" name="department" id="department"><br>
    Position: <input type="text" name="position" id="position"><br>
    <button type="submit">Zarejestruj!</button>
    <sec:csrfInput/>

</form>
</body>
</html>