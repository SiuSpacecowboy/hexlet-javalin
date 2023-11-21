@import exercise.lesson16.dto.UserEditPageWithErrors
@param UserEditPageWithErrors errors

<!doctype html>
<html>
<form action="/users/${String.valueOf(errors.getId())}" method="post">
    <div>
        <label>
            Name
            <input type="text" required name="firstname" value="${errors.getFirstName()}"/>
        </label>
    </div>
    <div>
        <label>
            Surname
            <input type="text" required name="lastname" value="${errors.getLastName()}"/>
        </label>
    </div>
    <div>
        <label>
            Email
            <input type="email" required name="email" value="${errors.getEmail()}"/>
        </label>
    </div>
    <div>
        <label>
            Password
            <input type="password" required name="password" value="${errors.getPassword()}"/>
        </label>
    </div>
    <div>
        <label>
            ConfirmPass
            <input type="password" required name="confirm"/>
        </label>
    </div>
    <input type="submit" value="Edit" />
</form>
@if(errors.getErrors() != null)
    <ul>
        @for(var values : errors.getErrors().values())
            @for(var value : values)
                <li style="color:red">${value.getMessage()}</li>
            @endfor
        @endfor
    </ul>
@endif

</html>