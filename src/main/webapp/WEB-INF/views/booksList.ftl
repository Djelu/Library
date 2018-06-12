<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Books</title>
    <link rel="stylesheet" href="/css/booksList.css">
</head>
<body>
<table >
    <tr>
        <th width="5%">Id</th>
        <th width="20%">Name</th>
        <th width="15%">Author</th>
        <th width="30%">Description</th>
        <th width="15%">Year</th>
        <th width="10%" colspan="2">Actions</th>
    </tr>
<#list books as book>
    <tr>
        <td>${book.id}</td>
        <td>${book.name}</td>
        <td>${book.author}</td>
        <td>${book.description}</td>
        <td>${book.year?substring(0,1)+book.year?substring(2,5)}</td>
        <td><a href="/update/${book.id}"><img src="/images/update.png" width="22" height="22"/></a></td>
        <td><a href="/delete/${book.id}"><img src="/images/delete.png" width="22" height="22"/></a></td>
    </tr>
</#list>
</table>
<a href="/addBook"><img src="/images/create.png" width="44" height="44"/></a>
</body>
</html>