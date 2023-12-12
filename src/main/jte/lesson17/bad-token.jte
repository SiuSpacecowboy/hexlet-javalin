@import main_project.util.NameRoutes

<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
          crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <title>Wrong!</title>
    <style>
    table {
    border-collapse: separate;
    border-spacing: 90px;
    }
.first {
    top       : 19%;
    left      : 23%;
    position  : absolute;
    }
.second {
    top       : 39%;
    left      : 12%;
    position  : absolute;
    }
.bottom {
    top       : 70%;
    left      : 1%;
    position  : absolute;
    }
.mvp {
    font-size : 128px;
 }
.mvp1 {
    font-size : 85px;
 }
 .mvp2 {
    font-size : 53px;
 }
.stroke-black {
    text-shadow: black 3px 3px 0, black -3px -3px 0,
    black -3px 3px 0, black 3px -3px 0;
  }
    </style>
</head>
<div class="bg-image"
     style="
    background-image: url('https://img10.joyreactor.cc/pics/post/full/%D0%BE%D0%B1%D0%BE%D0%B8-%D0%BD%D0%B0-%D1%80%D0%B0%D0%B1%D0%BE%D1%87%D0%B8%D0%B9-%D1%81%D1%82%D0%BE%D0%BB-gachimuchi-Billy-Herrington-Van-Darkholme-6043575.jpeg');
    height: 99.1vh;
  "
>
    <div class="stroke-black">
        <h1><p class="mvp first" style="color:rgb(245, 245, 245)">TRY HARDER♂♂♂</p></h1>
        <h5><p class="mvp1 second" style="color:rgb(255, 0, 32)">Invalid token, enter correct one (๑•̀ᗝ•́)૭</p></h5>
    </div>
    <table border="0">
        <tr class="bottom stroke-black">
            <th><a class="mvp2 col" style="color:rgb(240, 230, 140)" href="${NameRoutes.buildSessionsPath()}">Login In</a></th>
            <th><a class="mvp2 col" style="color:rgb(0, 191, 255)" href="${NameRoutes.allUsersPath()}">To All users page</a></th>
            <th><a class="mvp2 col" style="color:rgb(0, 191, 255)" href="${NameRoutes.buildUserPath()}">Create new User</a></th>
            <th><a class="mvp2 col" href="${NameRoutes.startPath()}">To home page</a></th>
        </tr>
    </table>
</div>
</html>

