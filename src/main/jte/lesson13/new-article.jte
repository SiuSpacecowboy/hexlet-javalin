@import exercise.lesson13.dto.NewArticlePageWithErrors
@param NewArticlePageWithErrors errors

@if(errors.getErrors() != null)
    <ul>
    @for(var values : errors.getErrors().values())
        @for(var value : values)
            <li>${value.getMessage()}</li>
        @endfor
    @endfor
    </ul>
@endif

<form action="/articles" method="post">
    <div>
        <label>
            Name
            <input type="text" name="name" value="${errors.getName()}"/>
        </label>
    </div>
    <div>
        <label>
            Text
            <textarea name="text"> </textarea>
        </label>
    </div>
    <input type="submit" value="Add new Article"/>
</form>
