@import main_project.util.NameRoutes

@template.main_project.layout.page(

header = null,
content = @`
    <h1><p>TRY HARDER</p></h1>
    <h3><p>There is no such user</p></h3>
`,
footer = @`
<h5><a href="${NameRoutes.startPath()}">To home page</a></h5>
`
)