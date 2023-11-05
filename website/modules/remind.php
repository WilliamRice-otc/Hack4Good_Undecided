<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
    <script>
        let dropdowns = document.querySelectorAll('.dropdown-toggle')
        dropdowns.forEach((dd) => {
            dd.addEventListener('click', function (e) {
                var el = this.nextElementSibling
                el.style.display = el.style.display === 'block' ? 'none' : 'block'
            })
        })
    </script>

<div class="row">
        <div class="col-lg-4 p-5">
            <div class="card">
                <h5 class="card-header bg-card-header card-header-font p-3">Remind</h5>
                <div class="card-body">
                    <h5 class="card-title card-text-font text-underline">Send quiz</h5>
                    <p class="card-text"></p>
                    <div class="row">
                        <div class="col-4"> 
                            <div class="dropdown">
                                <a class="btn btn-secondary dropdown-toggle bg-card-btn" href="#" role="button" id="dropdownMenuLink"
                                    data-bs-toggle="dropdown" aria-expanded="false"> Menu </a>
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                    <li class="dropdown dropend">
                                        <a class="dropdown-item dropdown-toggle" href="#" id="multilevelDropdownMenu1"
                                            data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Class A</a>
                                        <ul class="dropdown-menu" aria-labelledby="multilevelDropdownMenu1">
                                            <li><a class="dropdown-item" href="#">Quiz 1.1</a></li>
                                            <li><a class="dropdown-item" href="#">Quiz 1.2</a></li>
                                        </ul>
                                    </li>
                                    <a class="dropdown-item dropdown-toggle" href="#" id="multilevelDropdownMenu2"
                                        data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Class B</a>
                                    <ul class="dropdown-menu" aria-labelledby="multilevelDropdownMenu2">
                                        <li><a class="dropdown-item" href="#">Quiz 1.1</a></li>
                                        <li><a class="dropdown-item" href="#">Quiz 1.2</a></li>
                                    </ul>
                                </ul>
                            </div>
                        </div>
                        <div class="col-4"> 
                            <button class="btn btn-secondary bg-card-btn">Send</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>