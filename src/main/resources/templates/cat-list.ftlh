
<!DOCTYPE html>
<html lang = "en">

    <head>
        <title> Animal Gallery </title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/base-min.css">
        <link rel="stylesheet" href="style.css">
        <h1> Animal Gallery</h1> 
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
        </nav>
        <div class = "pure-menu pure-menu-horizontal">
            <ul class = "pure-menu-list">
                <li class = "pure-menu-item">
                    <a href = "index.html" class = "pure-menu-link">Home</a>
                </li>
                <li class = "pure-menu-item">
                    <a href = "details.html" class = "pure-menu-link">Details</a>
                </li>
                <li class = "pure-menu-item">
                    <a href = "about.html" class = "pure-menu-link">About</a>
                </li>
                <li class = "pure-menu-item">
                    <a href = "new-animal-form.html" class = "pure-menu-link">New Animal Form</a>
                </li>
            </ul>
        </div>
    </head>
    <body>

        <h2> Welcome to the Animal Gallery. The hub for all things animal! <br>
            You can add your favorite animal to the gallery or take a look <br>
            at the animals already posted.
        </h2>



        <button class = "pure-button pure-button-active">Search</button>
        <input type = "text" placeholder = "Search for an animal...">

        <section id = "gallery" class = "grid">
            <article class = "box" data-type = "Mammal" data-species = "Maine Coon">
                <img src = "Cat.jpeg">
                <div class = "box-body">
                    <h3>Maine Coon</h3>
                    <p class="specs"> Type: Mammal -- Species: Maine Coon </p>
                    <p> The largest of the domesticated cats with playful natures, they're known as gentle giants.</p>
                    <a class ="btn" href = "details.html">View Details</a>
                </div>
            </article>

            <article class = "box" data-type = "Mammal" data-species = "Raccoon">
                <img src = "rac.jpeg">
                <div class = "box-body">
                    <h3>Northern Raccoon</h3>
                    <p class="specs"> Type: Mammal -- Species: Raccoon </p>
                    <p> Native to North American, these little creatures have a robust coat.</p>
                    <a class ="btn" href = "details.html">View Details</a>
                </div>
            </article>

            <article class = "box" data-type = "Mammal" data-species = "Lion">
                <img src = "image.png">
                <div class = "box-body">
                    <h3>Lion</h3>
                    <p class="specs"> Type: Mammal -- Species: Lion </p>
                    <p> Huge mane, the king of the jungle, and fierce looks..this is the Lion..</p>
                    <a class ="btn" href = "details.html">View Details</a>
                </div>
            </article>

             <article class = "box" data-type = "Reptile" data-species = "Newborn Timber Rattlesnake">
                <img src = "image-1.png">
                <div class = "box-body">
                    <h3>Newborn Timber Rattlesnake</h3>
                    <p class="specs"> Type: Reptile -- Species: Newborn Timber Rattlesnake </p>
                    <p> With camofluage and venom laced fangs, the rattlesnake can <br>
                        protect itself against any predator</p>
                    <a class ="btn" href = "details.html">View Details</a>
                </div>
            </article>
            
             <article class = "box" data-type = "Avians" data-species = "Eagle">
                <img src = "image-2.png">
                <div class = "box-body">
                    <h3>Bald Eagle</h3>
                    <p class="specs"> Type: Avians -- Species: Eagle </p>
                    <p> The representative of America with a bold yellow beak, the eagle.</p>
                    <a class ="btn" href = "details.html">View Details</a>
                </div>
            </article>
        </section>


    </body>
</html>
