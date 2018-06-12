<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
    <link rel="stylesheet" href="../css/createBook.css">
</head>
<body>

<form class="form" name="user" action="/addBook" method="post">
    <p>Name</p>
    <input class="fild" title="Name" type="text" name="name">
    <p>Author</p>
    <input class="fild" title="Place storage" type="text" name="author">
    <p>Description</p>
    <input class="fild" title="Description" type="text" name="description">
    <p>Year</p>
    <input class="fild" title="Year" type="number" name="year" pattern="^\d{4}$">
    <br/>
    <br/>
    <br/>
    <input class="button buttonOk" type="submit" value="OK">
    <a href="/"><input class="button buttonCancel" type="button" value="Cancel"></a>
</form>

</body>
</html>