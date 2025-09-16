package com.example.gestionfilmserie

//Si valeur false => Pas vu, true => Déjà vu
val mapFilms = mutableMapOf<String,Boolean>()
fun main() {
    do {
        afficherMenu()
        val sortie = traitementChoix()
    }while (!sortie)
}

fun afficherMenu(){
    println("Choisissez");
    println("1 - Ajouter un film/série déjà vu");
    println("2 - Ajouter un film/série à voir");
    println("3 - Voir toute la liste");
    println("4 - Exit");
}

/**
 * Retourne true si l'utilisateur souhaite quitter le programme sinon false
 */
fun traitementChoix() : Boolean{
    val choixUser = readln();
    when(choixUser){
        "1" -> ajoutFilmSerie(true);
        "2" -> ajoutFilmSerie(false);
        "3" -> listeFilms();
        "4" -> return true;
    }
    return false;
}
fun listeFilms(){
    if(mapFilms.isEmpty()){
        println("Pas encore de film ajouté")
    }
    for(film in mapFilms){
        if(film.value == true)(
            println(film.key +" : Déjà vu")
        ) else{
            println(film.key + " : A voir")
        }
    }
}
fun ajoutFilmSerie(dejaVu : Boolean){
    println("Nom du film")
    val nomDuFilm = readln()
    mapFilms[nomDuFilm] = dejaVu
}