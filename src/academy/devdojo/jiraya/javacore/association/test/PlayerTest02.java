package academy.devdojo.jiraya.javacore.association.test;

import academy.devdojo.jiraya.javacore.association.domain.Player;
import academy.devdojo.jiraya.javacore.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pele");
        Team team = new Team("Brazil");

        player1.setTeam(team);

        player1.print();
    }
}
