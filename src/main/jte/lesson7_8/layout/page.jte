<%--@import exercise.lesson7l8.UsersPage
@import exercise.lesson7l8.UserPage--%>
@import gg.jte.Content

@param Content header
@param Content content
@param Content footer

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Hello Hexlet!</title>
    </head>
    <body>
    @if(header != null)
        ${header}
    @endif
        <div>
            ${content}
        </div>
    @if(footer != null)
        ${footer}
    @endif
    </body>
</html>
