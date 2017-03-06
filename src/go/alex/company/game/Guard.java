package go.alex.company.game;

import go.alex.company.utils.IO;

import java.time.LocalDateTime;

/**
 * Created by Alex on 04-Mar-17.
 */
public class Guard extends Player
{
    private int blocksAverageNumberPerGame;
/*
    public Guard(String firstName, String lastName, LocalDateTime birthDate, int height, int shirtNumber,
                 double freeThrowLineTargetShootingPersents, double fieldAreaTargetShootingPersents,
                 double threePointsAreaTargetShootingPersents, int averageBlocksNumberPerGame) {
        super(firstName, lastName, birthDate, height, shirtNumber, freeThrowLineTargetShootingPersents, fieldAreaTargetShootingPersents, threePointsAreaTargetShootingPersents);
        this.blocksAverageNumberPerGame = blocksAverageNumberPerGame;
    }
*/
    public Guard()
    {
        super();
        this.blocksAverageNumberPerGame = IO.getInt("Enter Blocks Average Number Per Game", 0, 20);
    }

    @Override
    public String toString()
    {
        return "Guard:\n" + super.toString() + "\nBlocks Average Number Per Game: " + blocksAverageNumberPerGame;
    }

}
