@import main_project.dto.UsersPage
@import main_project.util.NameRoutes
@param UsersPage users

@template.main_project.layout.page(
header = @`
    <header>
        <h1><a href="/">Home page</a></h1>
        <h2><p>All users:</p></h2>
    </header>
`,
content = @`
    @if(users.getUsers().isEmpty())
        <p>No courses here yet</p>
    @else
        @for(var user : users.getUsers())
            <div>
                <a href="${NameRoutes.oneUserPath(String.valueOf(user.getId()))}">${user.getId()}.${user.getFirstName()} ${user.getLastName()}</a>
            </div>
        @endfor
    @endif
`,
footer = @`
    <footer>
        <h3><a href="https://github.com/SiuSpacecowboy">My github</a></h3>
    </footer>
`
)

<%--<html>
<head>
    <title>Hexlet</title>
</head>
<body>
<script src="/webjars/bootstrap/4.1.3/js"></script>
    @if(page.getUsers().isEmpty())
        <p>No courses here yet</p>
    @else
        @for(var user : page.getUsers())
        <div>
            <a href="/users/${user.getId()}">${user.getName()}</a>
        </div>
        @endfor
    @endif
</body>
</html>--%>
