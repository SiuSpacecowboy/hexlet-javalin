@import gg.jte.Content

@param Content content

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
.first {
    top       : 24%;
    left      : 47%;
    position  : absolute;
    transform : translate(-50%, -50%);
    }
    .second {
    top       : 32%;
    left      : 23%;
    position  : absolute;
    }
.third {
    top       : 53%;
    left      : 16%;
    position  : absolute;
    }
.bottom {
    top       : 80%;
    left      : 33%;
    position  : absolute;
    }
.mvp {
    font-size : 128px;
 }
.mvp1 {
    font-size : 85px;
 }
.stroke-black {
    text-shadow: black 3px 3px 0, black -3px -3px 0,
    black -3px 3px 0, black 3px -3px 0;
  }
  .stroke-white {
    text-shadow: white 1px 1px 0, white -1px -1px 0,
    white -1px 1px 0, white 1px -1px 0;
  }
    </style>
</head>
<div class="bg-image"
     style="
    background-image: url('https://img10.joyreactor.cc/pics/post/full/%D0%BE%D0%B1%D0%BE%D0%B8-%D0%BD%D0%B0-%D1%80%D0%B0%D0%B1%D0%BE%D1%87%D0%B8%D0%B9-%D1%81%D1%82%D0%BE%D0%BB-gachimuchi-Billy-Herrington-Van-Darkholme-6043575.jpeg');
    height: 99.1vh;
  "
>
${content}
</div>
</html>