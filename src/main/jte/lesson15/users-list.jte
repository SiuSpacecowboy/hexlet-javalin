@import exercise.lesson15.UsersPage
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
    @if(users.getPage() <= 0)
        <h4><p>Page can't be less than 1</p></h4>
        <h5><p>Showing 1st page:</p></h5>
    @endif
    @if(users.getUsers().isEmpty() && users.isHaveUsers())
        <p>Database doesn't have so many users</p>
        <h3><a href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getPage() - 1)}">One Page back</a></h3>
    @elseif(users.getUsers().isEmpty())
        <p>No courses here yet</p>
        @if(users.getPage() != 1)
            <h3><a href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getPage() - 1)}">One Page back</a></h3>
        @endif
    @else
        @for(var user : users.getUsers())
                <div>
                    <a href="${NameRoutes.oneUserPath(String.valueOf(user.getId()))}">${user.getId()}.${user.getFirstName()} ${user.getLastName()}</a>
                </div>
        @endfor
        @if(users.getPage() != 1)
            <h3><a href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getPage() - 1)}">One Page back</a></h3>
        @endif
        @if(users.getUsers().size() == 5)
            <h3><a href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getPage() + 1)}">One Page forward</a></h3>
        @endif
    <%--@if(users.getUsers().size() == 6)
            <h3><a href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getPage() + 1)}">One Page forward</a></h3>
        @endif--%>
    @endif
`,
footer = @`
    <footer>
        <h3><a href="https://github.com/SiuSpacecowboy">My github</a></h3>
    </footer>
`
)