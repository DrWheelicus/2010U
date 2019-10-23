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

        // Display menu
        System.out.println("\nChoose one of the following moves:\n");
        System.out.printf("          Name        Type   Power    Accuracy");
        System.out.println("\nOption 1: " + this.getMonster().getMove1().toString());
        System.out.println("Option 2: " + this.getMonster().getMove2().toString());
        System.out.println("Option 3: " + this.getMonster().getMove3().toString());
        System.out.println("Option 4: " + this.getMonster().getMove4().toString() + "\n");

        System.out.printf("Option #(1-4): ");
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