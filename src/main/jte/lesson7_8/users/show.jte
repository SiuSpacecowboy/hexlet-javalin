@import exercise.lesson7l8.UserPage
@param UserPage user

@template.lesson7_8.layout.page(
    header = @`
        <header>
            <h1><a href="/">Home page</a></h1>
            <h2><a href="/users">All users</a></h2>
        </header>
    `,
    content = @`
        <h4><p>${user.getUser().getName()}</p> </h4>
         <h4><p>${user.getUser().getId()}</p> </h4>
    `,
    footer = @`
        <footer>
            <h3><a href="https://github.com/SiuSpacecowboy">My github</a></h3>
        </footer>
    `
)

<%--
<html>
<head>
    <title>Hexlet</title>
</head>
<body>
<p>${user.getUser().getName()}</p>
<br/>
<p>${user.getUser().getId()}</p>
</body>
</html>
--%>
