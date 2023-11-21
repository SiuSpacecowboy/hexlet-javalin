@import main_project.dto.UserPage
@import main_project.util.NameRoutes
@param UserPage user

@template.main_project.layout.page(
header = null,
content = @`
    <h4><p>Id: ${user.getUser().getId()}</p> </h4>
    <h4><p>Name: ${user.getUser().getFirstName()}</p> </h4>
    <h4><p>Surname: ${user.getUser().getLastName()}</p> </h4>
    <h4><p>Email: ${user.getUser().getEmail()}</p> </h4>
    <h4><p>Password: ${user.getUser().getPassword()}</p> </h4>
`,
footer = @`
    <footer>
      <%--  <h2><a href="${user.getUser().getId()}/edit-user">Edit user</a></h2>--%>
        <h2><a href="${NameRoutes.editUserPath(String.valueOf(user.getUser().getId()))}">Edit user</a></h2>
        <h3><a href="/">Home page</a></h3>
        <h3><a href="/users">All users</a></h3>
        <h4><a href="https://github.com/SiuSpacecowboy">My github</a></h4>
    </footer>
`
)