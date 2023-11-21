@import exercise.lesson13.dto.NewArticlePage
@param NewArticlePage page

@if(!page.getAllArticles().isEmpty())
    @for(String val : page.getAllArticles().keySet())
        <a href="/article">${val}</a>
        <br>
    @endfor
@endif
