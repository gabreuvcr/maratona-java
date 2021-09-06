package academy.devdojo.jiraya.javacore.initializationblock.domain;

public class Anime {
    private String name;    
    private int[] episodes;

    // 0 - Bloco de inicialização estatico é executado quando a JVM carregar classe
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        episodes = new int[108];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
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

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }

    public int[] getEpidodes() {
        return this.episodes;
    }
}
