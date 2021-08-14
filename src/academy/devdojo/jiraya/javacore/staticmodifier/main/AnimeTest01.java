package academy.devdojo.jiraya.javacore.staticmodifier.main;

import academy.devdojo.jiraya.javacore.staticmodifier.models.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("One Piece");
        Anime anime2 = new Anime("Boku no Hero");
        Anime anime3 = new Anime("Naruto");
        
        System.out.println(anime1.getName());
        System.out.println(anime2.getName());
        System.out.println(anime3.getName());
    }
}
