package academy.devdojo.jiraya.javacore.association.main;

import academy.devdojo.jiraya.javacore.association.models.Player;
import academy.devdojo.jiraya.javacore.association.models.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Cafu");
        Player player2 = new Player("Pele");
        Team team = new Team("Brazil");
        Player[] players = new Player[] {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("--- Players ---");
        player1.print();
        player2.print();

        System.out.println();
        
        System.out.println("--- Teams ---");
        team.print();
    }
}
