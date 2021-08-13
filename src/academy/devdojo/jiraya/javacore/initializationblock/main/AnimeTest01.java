package academy.devdojo.jiraya.javacore.initializationblock.main;

import academy.devdojo.jiraya.javacore.initializationblock.models.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Boku no Hero");
        
        for (int ep: anime.getEpidodes()) {
            System.out.print(ep + " ");
        }
    }
}
