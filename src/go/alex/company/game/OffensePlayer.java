package go.alex.company.game;

import go.alex.company.utils.IO;

import java.time.LocalDateTime;

/**
 * Created by Alex on 04-Mar-17.
 */
public class OffensePlayer extends Player
{
    private int attackFoulsAverageNumberPerGame;
/*
    public OffensePlayer(String firstName, String lastName, LocalDateTime birthDate, int height, int shirtNumber,
                         double freeThrowLineTargetShootingPersents, double fieldAreaTargetShootingPersents,
                         double threePointsAreaTargetShootingPersents, int attackFoulsAverageNumberPerGame)
    {
        super(firstName, lastName, birthDate, height, shirtNumber, freeThrowLineTargetShootingPersents,
              fieldAreaTargetShootingPersents, threePointsAreaTargetShootingPersents);
        this.attackFoulsAverageNumberPerGame = attackFoulsAverageNumberPerGame;
    }
*/
    public OffensePlayer()
    {
        super();
        this.attackFoulsAverageNumberPerGame = IO.getInt("Enter Attack Fouls Average Number Per Game", 0, 5);

    }

    @Override
    public String toString() {
        return "Offense Player:\n" + super.toString() + "\nAttack Fouls Average Number Per Game: " + attackFoulsAverageNumberPerGame;
    }
}
