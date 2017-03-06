package go.alex.company.view;

import go.alex.company.game.Center;
import go.alex.company.game.Guard;
import go.alex.company.game.OffensePlayer;
import go.alex.company.game.Team;
import go.alex.company.utils.IO;

/**
 * Created by Alex on 05-Mar-17.
 */
public class AddPlayersToTeamMenu
{
    public static void run(Team team)
    {
        boolean isExit = false;
        do {
            System.out.println("Press '1' - to add a Guard to the team");
            System.out.println("Press '2' - to add a Offense Player to the team");
            System.out.println("Press '3' - to add a Center to the team");
            System.out.println("Press '4' - to back to the main menu");

            int option = IO.getInt("Enter your option: ", 1, 4);
            switch (option) {
                case 1:
                    Guard guard = new Guard();
                    team.addPlayer(guard);
                    break;
                case 2:
                    OffensePlayer offensePlayer = new OffensePlayer();
                    team.addPlayer(offensePlayer);
                    break;
                case 3:
                    Center center = new Center();
                    team.addPlayer(center);
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
