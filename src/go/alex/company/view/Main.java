package go.alex.company.view;

import go.alex.company.game.Team;
import go.alex.company.utils.IO;

public class Main
{

    public static void main(String[] args) {
        Team team = new Team();
        boolean isExit = false;
        do {
            System.out.println("Press '1' - to add a player to the team");
            System.out.println("Press '2' - to print details of all players");
            System.out.println("Press '3' - for team throw from 3 points area");
            System.out.println("Press '4' - to exit");

            int option = IO.getInt("Enter your option: ", 1, 4);
            switch (option) {
                case 1:
                    AddPlayersToTeamMenu.run(team);
                    break;
                case 2:
                    team.printAllPlayers();
                    break;
                case 3:
                    team.throwAllTeamFromThreePointsArea();
                    break;
                case 4:
                    isExit = true;
                    break;
                default:
                    break;
            }
        } while (!isExit);
    }
}
