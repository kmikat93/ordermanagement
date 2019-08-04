// TODO tu bedzie widok ogloszen wstawionych przez konkretnego uzytkownika
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/user-orders-page-look.css" type="text/css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/favicon-96x96.png" type="image/png">
    <title>WSB - User's document</title>
</head>
<body>
    <header>
        <img src="${pageContext.request.contextPath}/static/wsb.jpg" alt="Logo Wyższej szkoły Bankowej">
    </header>
    <nav class="navbar navbar-dark bg-primary navbar-expand-md">
        <a class="navbar-brand mr-8" href="user-orders-page">WSB</a>
        <div id="main-menu" class="collapse navbar-collapse">
            <ul class="navbar-nav ml-4 mr-auto">
                <li class="nav-item "><a class="nav-link" href="new-order-form"> Dodaj</a></li>
                <li class="nav-item "><a class="nav-link" href="#"> Ogłoszenia mojego działu</a></li>
                <li class="nav-item "><a class="nav-link" href="#"> Moje ogłoszenia</a></li>
            </ul>
            <ul class="navbar-nav">
                <li class="nav-item "><a class="nav-link" href="#"> Zalogowany jest: </a></li>
                <li class="nav-item "><a class="nav-link" href="#"> Wyloguj</a></li>
            </ul>
        </div>
    </nav>
    <div class="container">
        <main class="row">
            <table class="col-md-12 table-striped main-table">
                <thead>
                <tr class="table_rows">
                    <th class="table_heading">Lp.</th>
                    <th class="table_heading">Tytuł</th>
                    <th class="table_heading">Opis zamówienia</th>
                    <th class="table_heading">Status</th>
                    <th class="table_heading">Osoba zamawiająca</th>
                    <th class="table_heading">Data utworzenia</th>
                </tr>
                </thead>
                <tbody>
                <tr class="table_rows">
                    <td class="table_cell">0001</td>
                    <td class="table_cell"><a href="#" class="table_title">Zamówienie z archiwum X</a></td>
                    <td class="table_cell">Ołówki 5 szt., papier 3 ryzy, pióro - stare. Ołówki 5 szt., papier 3 ryzy, pióro - stare. Ołówki 5 szt., papier 3 ryzy, pióro - stare</td>
                    <td class="table_cell">Otwarte</td>
                    <td class="table_cell">Kamil Janiak</td>
                    <td class="table_cell">2/08/2019</td>
                </tr>
                <tr class="table_rows">
                    <td>0002</td>
                    <td>Pilne! Pilne!</td>
                    <td>papier toaletowy - choćby 1 listek</td>
                    <td>Otwarte</td>
                    <td>Kaczor Donald</td>
                    <td>3/08/2019</td>
                </tr>
                <tr class="table_rows">
                    <td>0003</td>
                    <td>Impreza</td>
                    <td>otwieracz do piwa 1 szt., kubki 5 szt., zapoja 1 szt., </td>
                    <td>Aktywne</td>
                    <td>Kasia Kmieć</td>
                    <td>4/08/2019</td>
                </tr>
                <tr class="table_rows">
                    <td>0004</td>
                    <td>Kupię dobrę strone internetową</td>
                    <td>kup dobrą stronę www z springiem, hibernatem i czymś dobrym</td>
                    <td>Zamknięte</td>
                    <td>Haker</td>
                    <td>25/07/2019</td>
                </tr>
                </tbody>
            </table>
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