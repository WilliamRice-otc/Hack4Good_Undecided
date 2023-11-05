<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
    <link rel="stylesheets" type="text/css" href="styles.css">
    <link rel="stylesheets" type="text/css" href="styles2.css">
    <link rel="x-css.css" href="stylesheets/x-css.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid bg-card-header">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
            <a class="navbar-brand" href="#">Admin</a>
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Things</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Stuff</a>
                </li>

            </ul>
        </div>
    </div>
</nav>
<div class="group1">
    <div ID="group5">
    <?php include 'moduals/pie.php'; ?>
    </div>
    <div class="group2">
<?php include 'modules/quickadd.php' ?>
</div>
    <div class="group3">
    <?php include 'modules/Quizadd.php' ?>
</div>
    <div class="group4">
    <?php include 'modules/userlookup.php' ?>
</div>

</div>
</body>
</html>
