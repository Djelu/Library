<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
    <link rel="stylesheet" href="../css/editBook.css">
</head>
<body>

    <form class="form" id="userForm" name="user" action="/updateBook" method="post">
        <p>Id</p>
        <input class="fild" title="Id" type="text" name="id" value="${book.id}" readonly>
        <p>Book name</p>
        <input class="fild" title="Name" type="text" name="name" value="${book.name}">
        <p>Author</p>
        <input class="fild" title="Author" type="text" name="author" value="${book.author}">
        <p>Description</p>
        <textarea rows="4" cols="50" class="fild" title="Description" name="description">${book.description}</textarea>
        <p>Year</p>
        <input class="fild" title="year" type="text" name="year" value="${book.year?substring(0,1)+book.year?substring(2,5)}" pattern="^\d{4}$">
        <br/>
        <br/>
        <br/>
        <br/>
        <input class="button button1" type="submit" value="OK">
        <a href="/"><input class="button buttonCancel" type="button" value="Cancel"></a>
    </form>

</body>
</html>