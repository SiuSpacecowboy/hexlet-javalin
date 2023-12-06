@import main_project.dto.UserPageWithErrors
@param UserPageWithErrors errors

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
          crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <title>Create User♂</title>
    <style>
   .message {
    left: 95%;
    top: 104.5%;
    margin-left: -25%;
    position: absolute;
    margin-top: -25%;
}
form {
    left      : 50%;
    top       : 50%;
    position  : absolute;
    transform : translate(-50%, -50%);
}
   .stroke {
    text-shadow: white 1px 1px 0, white -1px -1px 0,
                 white -1px 1px 0, white 1px -1px 0;
   }
  </style>
</head>
<!-- Background image -->
<div class="bg-image"
     style="
    background-image: url('http://cdn-st2.rtr-vesti.ru/vh/pictures/hd/352/132/1.jpg');
    height: 100vh;
  ">
    @if(errors.getFlash() != null)
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
            <strong>${errors.getFlash()}</strong>♂♂♂
            <button type="button" class="btn-close" data-dismiss="alert" aria-label="Close">
            </button>
        </div>
    @endif
    <form id="form_login" action="/users" method="post">
            <div class="row">
                <div class="col">
                    <label class="form-label">
                        <p class="stroke"><strong>Name</strong></p>
                        <input type="text" class="form-control" required name="firstname" value="${errors.getFirstName()}"/>
                    </label>
                </div>
                <div class="col">
                    <label class="form-label">
                        <p class="stroke"><strong>Surname</strong></p>
                        <input type="text" class="form-control" required name="lastname" value="${errors.getLastName()}"/>
                    </label>
                </div>
                <div class="col">
                    <label class="form-label">
                        <p class="stroke"><strong>Email</strong></p>
                        <input type="email" class="form-control" required name="email" value="${errors.getEmail()}"/>
                    </label>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <label class="form-label">
                        <p class="stroke"><strong>Password</strong></p>
                        <input type="password" class="form-control" required name="password"/>
                    </label>
                </div>
                <div class="col-4">
                    <label class="form-label">
                        <p class="stroke"><strong>ConfirmPass</strong></p>
                        <input type="password" class="form-control" required name="confirm"/>
                    </label>
                </div>
                <input type="submit" class="btn btn-primary" value="Register" />
            </div>
    </form>
    @if(errors.getErrors() != null)
        <div class="message">
            @for(var values : errors.getErrors().values())
                @for(var value : values)
                    <li style="color:red">${value.getMessage()}</li>
                @endfor
            @endfor
        </div>
    @endif
</div>
<!-- Background image -->
</html>