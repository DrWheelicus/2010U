/**
 * Move is a class that represents a single move of a monster in the JRPG.
 * Contains methods to get certain attributes from the move.
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class Move {
    private String name;
    private String type;
    private int power;
    private float accuracy;

    /**
     * Class constructor
     *
     * @param name  the name of the move
     * @param type  the type of move
     * @param power the move power
     * @param accuracy  the move accuracy
     */
    public Move(String name, String type, int power, float accuracy) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
    }

    /**
     * Gets the name associated with the Move.
     *
     * @return          the moves name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the type associated with the Move.
     *
     * @return          the moves type.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the power associated with the Move.
     *
     * @return          the moves power.
     */
    public int getPower() {
        return this.power;
    }

    /**
     * Gets the accuracy associated with the Move.
     *
     * @return          the moves accuracy.
     */
    public float getAccuracy() {
        return this.accuracy;
    }

    @Override
    public String toString() {
        return this.name + "   " + this.type + "\t" + this.power + "\t" + this.accuracy;
    }

}