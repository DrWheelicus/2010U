import java.util.*;
/**
 * CPUPlayer is a class that represents 
 * a single computer-controlled player of the JRPG.
 * Contains a method to allow the computer to select an attack.
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class CPUPlayer extends Player {
    /**
     * Class constructor
     *
     * @param monster the monster to be used by the computer
     * @see         Monster
     */
    public CPUPlayer(Monster monster) {
        this.monster = monster;
    }

    /**
     * Uses a random number between 1 and 4 to choose an attack
     *
     * @return      the move to use when attacking 
     */
    public int chooseMove() {
        return (int)(Math.random() * 4 + 1);
    }
}