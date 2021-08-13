package academy.devdojo.jiraya.javacore.overloading.main;

import academy.devdojo.jiraya.javacore.overloading.models.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece", "TV", 986, "Action");
        anime.print();
    }
}
