package academy.devdojo.jiraya.javacore.constructors.test;

import academy.devdojo.jiraya.javacore.constructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 986, "Action");
        anime.print();
    }
}
