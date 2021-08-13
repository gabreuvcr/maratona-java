package academy.devdojo.jiraya.javacore.initializationblock.models;

public class Anime {
    private String name;    
    private int[] episodes;

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
