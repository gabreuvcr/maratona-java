package academy.devdojo.jiraya.javacore.overloading.test;

import academy.devdojo.jiraya.javacore.overloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece", "TV", 986, "Action");
        anime.print();
    }
}
