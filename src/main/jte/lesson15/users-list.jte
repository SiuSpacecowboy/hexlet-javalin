@import exercise.lesson15_crud.UsersPage
@import main_project.util.NameRoutes
@param UsersPage users

@template.main_project.layout.page(
header = @`
    <header>
        <div class="stroke-black">
        <h1><a href="/">Home page</a></h1>
        <h1><p style="color:white">All users:</p></h1>
        </div>
    </header>
`,
content = @`
    @if(users.getPage() <= 0)
        <h2><p style="color:rgb(254, 111, 94)">Page can't be less than 1.</p></h2>
        <h2><p style="color:rgb(254, 111, 94)">To the 1st page:</p></h2>
        <h1><a style="color:rgb(199, 21, 133)" href="${NameRoutes.allUsersPath()}?page=${1}">First page</a></h1>
    @else
    @if(users.getUsers().isEmpty() && users.isHaveUsers())
        <h2><p style="color:rgb(254, 111, 94)">Database doesn't have so many users.</p></h2>
        <h2><a style="color:rgb(199, 21, 133)" href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getFinalPage())}">Last page</a></h2>
    @elseif(users.getUsers().isEmpty())
        <h2><p style="color:rgb(225, 149, 243)">There are no users in the database.</p></h2>
        <h2><a style="color:rgb(0, 191, 255)" href="${NameRoutes.buildUserPath()}">Create new User</a></h2>
        @if(users.getPage() != 1)
            <h1><a style="color:rgb(199, 21, 133)" href="${NameRoutes.allUsersPath()}?page=${1}">First page</a></h1>
        @endif
    @else
        @for(var user : users.getUsers())
                    <h3><a style="color:rgb(225, 149, 243)" href="${NameRoutes.oneUserPath(String.valueOf(user.getId()))}"><strong>${user.getId()}.${user.getFirstName()} ${user.getLastName()}</strong></a></h3>
                    <br>
        @endfor
        @if(users.getPage() != 1)
            <h2><a style="color:rgb(199, 21, 133)" href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getPage() - 1)}">One Page back</a></h2>
        @endif
        @if(users.getUsers().size() == 5)
            <h1><a style="color:rgb(199, 21, 133)" href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getPage() + 1)}">One Page forward</a></h1>
        @endif
    <%--@if(users.getUsers().size() == 6)
            <h3><a href="${NameRoutes.allUsersPath()}?page=${String.valueOf(users.getPage() + 1)}">One Page forward</a></h3>
        @endif--%>
    @endif
    @endif
`,
footer = @`
    <footer>
        <br>
        <div class="stroke-black">
        <h1><a style="color:rgb(127, 255, 212)" href="https://github.com/SiuSpacecowboy">My github</a></h1>
        </div>
    </footer>
`
)