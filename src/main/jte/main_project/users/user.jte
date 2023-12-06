@import main_project.dto.UserPage
@import main_project.util.NameRoutes
@param UserPage page

@template.main_project.layout.page(
header = null,
content = @`
    @if(page.getFlash() != null)
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            <strong>${page.getFlash()} (｡- .•)!</strong>
            <button type="button" class="btn-close" data-dismiss="alert" aria-label="Close">
            </button>
        </div>
    @endif
    <h4><p  style="color:rgb(255, 255, 255)">Id: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getId()}.</span></p></h4>
    <h4><p  style="color:rgb(255, 255, 255)">Name: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getFirstName()}.</span></p></h4>
    <h4><p  style="color:rgb(255, 255, 255)">Surname: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getLastName()}.</span></p></h4>
    <h4><p  style="color:rgb(255, 255, 255)">Email: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getEmail()}.</span></p></h4>
    <h4><p  style="color:rgb(255, 255, 255)">Password: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getPassword()}.</span></p></h4>
    <h4><p  style="color:rgb(255, 255, 255)">Token: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getToken()}.</span></p></h4>
`,
footer = @`
    <footer>
        <h2><a href="${NameRoutes.editUserPath(String.valueOf(page.getUser().getId()))}">Edit user</a></h2>
        <h3><a href="${NameRoutes.startPath()}">Home page</a></h3>
        <h3><a href="${NameRoutes.allUsersPath()}">To All users page</a></h3>
        <br>
        <h2><a style="color:rgb(255, 19, 147)" href="https://github.com/SiuSpacecowboy">My github</a></h2>
    </footer>
`
)