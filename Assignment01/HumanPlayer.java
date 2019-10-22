import java.util.Scanner;
/**
 * HumanPlayer is a class that represents 
 * a single user-controlled player of the JRPG.
 * Contains a method to allow the user to choose an attack.
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class HumanPlayer extends Player {
    /**
     * Class constructor
     *
     * @param monster the monster to be used by the user
     * @see         Monster
     */
    public HumanPlayer(Monster monster) {
        this.monster = monster;
    }

    /**
     * Allows the user to choose what attack to use through user input.
     *
     * @return      the desired move
     */
    public int chooseMove() {
        // Prompt the user for a choice 
        Scanner move = new Scanner(System.in);
        System.out.println("Choose what move you would like to use (1-4):");

        int selection;

        // Check if the input is an integer (i.e. not "one")
        if (move.hasNextInt()) {
            selection = move.nextInt();
        } else {
            // Output an error message 
            throw new IllegalArgumentException("Choice must be an integer from 1 to 4!");
        }

        return selection;
    }
}