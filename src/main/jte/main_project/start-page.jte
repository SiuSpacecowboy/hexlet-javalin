@import main_project.util.NameRoutes

@template.main_project.layout.page(

header = null,
content = @`
    <h1><p>WELCOME TO THE CLUB BUDDY♂♂♂</p></h1>
`,
footer = @`
    <h4><a href="${NameRoutes.allUsersPath()}">To All users page</a></h4>
    <h4><a href="${NameRoutes.buildUserPath()}">Create new User</a></h4>
    <%--FindByTerm--%>
    <%--FindById--%>
`
)