<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- BEGIN -->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Users</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
            crossorigin="anonymous">
        <style>
        table, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        button {
            margin-top: 30px;
        }
        </style>
    </head>
    <body>
    <table>
        <c:forEach var="entry" items="${user}">
                    <tr>
                        <td>${entry.key}</td>
                        <td>${entry.value}</td>
                    </tr>
        </c:forEach>
    </table>
    <a href="/users/delete?id=${user.get("id")}">Delete user</a>
    </body>
</html>
<!-- END -->
