package academy.devdojo.jiraya.javacore.association.domain;

public class Team {
    private String name;
    private Player[] players;
    
    public Team(String name) {
        this.setName(name);
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.setPlayers(players);
    }

    public void print() {
        System.out.println("Time: " + this.name);
        if (players == null) return;
        System.out.print("Players: ");
        for (Player player: this.players) {
            System.out.print(player.getName() + "; ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
