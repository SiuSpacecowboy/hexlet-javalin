@import main_project.util.NameRoutes

@template.main_project.layout.page-mistake(
    content = @`
    <div class="stroke-black">
        <h1><p  class="mvp first" style="color:rgb(245, 245, 245)"><strong>404</strong></p></h1>
        <h1><p class="mvp second" style="color:rgb(245, 245, 245)">TRY HARDER♂♂♂</p></h1>
        <h3><p class="mvp1 third" style="color:rgb(255, 0, 32)"><strong>There is no such user ╭∩╮( •̀_•́ )╭∩╮</strong></p></h3>
    <h2><a class="mvp1 bottom" href="${NameRoutes.startPath()}">To home page</a></h2>
    </div>
`
)