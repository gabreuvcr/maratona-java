package academy.devdojo.jiraya.javacore.association.models;

public class Player {
    private String name;
    private Team team;

    public Player(String name) {
        this.setName(name);
    }
    
    public void print() {
        if (this.team != null) {
            System.out.print(this.name + " - ");
            System.out.print(this.team.getName() + "\n");
            return;
        }
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
