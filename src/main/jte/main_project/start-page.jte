@import main_project.util.NameRoutes
@import main_project.dto.UserPage
@param UserPage page
@template.main_project.layout.page(

header = null,
content = @`
    @if(page.getFlash() != null)
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            <strong>${page.getFlash()}!💦💦💦</strong>
            <button type="button" class="btn-close" data-dismiss="alert" aria-label="Close">
            </button>
        </div>
    @endif
    @if(page.getUser() != null)
        <div class="stroke-black">
        <h1><p style="color:rgb(255, 69, 0)">WELCOME TO THE CLUB, ${page.getUser().getFirstName().toUpperCase()}♂♂♂</p></h1>
        <h2><p style="color:rgb(240, 230, 140)">To Unlogin, please delete cookie JSESSIONID from browser | This cookie response for all sessions.</p></h2>
        <h3><form action="/sessions/delete" method="post">
                <input type="submit" value="Another Unlogin">
            </form></h3>
        <br>
        </div>
    @else
        <div class="stroke-black">
        <h1><p style="color:rgb(255, 69, 0)">WELCOME TO THE CLUB, Please Cum In♂♂♂</p></h1>
        <h2><a style="color:rgb(240, 230, 140)" href="/sessions/build">Cum In</a></h2>
        </div>
    @endif
  <%--  <h1><p>WELCOME TO THE CLUB, BUDDY♂♂♂</p></h1>--%>
`,
footer = @`
    <div class="stroke-black">
    <h2><a style="color:rgb(0, 191, 255)" href="${NameRoutes.allUsersPath()}">To All users page</a></h2>
    <h2><a style="color:rgb(0, 191, 255)" href="${NameRoutes.buildUserPath()}">Create new User</a></h2>
    <br>
    <h2><a style="color:rgb(127, 255, 212)" href="https://github.com/SiuSpacecowboy">My github</a></h2>
    </div>
    <%--FindByTerm--%>
    <%--FindById--%>
`
)