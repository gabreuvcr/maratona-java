package academy.devdojo.jiraya.javacore.staticmodifier.domain;

public class Anime {
    private String name;    
    private static int[] episodes;

    // 0 - Bloco de inicialização estatico é executado quando a JVM carregar classe
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Inside the initiaization block 1");
        Anime.episodes = new int[108];
        for (int i = 0; i < Anime.episodes.length; i++) {
            Anime.episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside the initiaization block 2");
    }
    
    public Anime() {

    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpidodes() {
        return Anime.episodes;
    }
}
