/**
 * Monster is a class that represents a single monster in the JRPG.
 * Contains methods to get certain attributes from the monster.
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class Monster {
    private String name;
    private String type;
    private int maxhp;
    private int hp;
    private int speed;
    private int attack;
    private int defense;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;

    /**
     * Class constructor
     *
     * @param name  name of the monster
     * @param type  type of the monster
     * @param hp    health of the monster
     * @param speed speed of the monster
     * @param attack attack of the monster
     * @param defense defense of the monster
     * @param move1 first attack of the monster
     * @param move2 second attack of the monster
     * @param move3 third attack of the monster
     * @param move4 fourth attack of the monster
     */
    public Monster(String name, String type, int hp, int speed, int attack, int defense, Move move1, Move move2, Move move3, Move move4) {
        this.name = name;
        this.type = type;
        this.maxhp = hp;
        this.hp = hp;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    /**
     * Gets the name associated with the Monster.
     *
     * @return          the monster name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the type associated with the Monster.
     *
     * @return          the monster type.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the HP associated with the Monster.
     *
     * @return          the monster HP.
     */
    public int getHP() {
        return this.hp;
    }

    /**
     * Gets the max HP associated with the Monster.
     *
     * @return          the monster max HP.
     */
    public int getMaxHP() {
        return this.maxhp;
    }

    /**
     * Sets the HP associated with the Monster.
     *
     * @param hp        the HP to be set
     */
    public void setHP(int hp) {
        this.hp = hp;
    }

    /**
     * Gets the speed associated with the Monster.
     *
     * @return          the monster speed.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Gets the attack associated with the Monster.
     *
     * @return          the monster attack.
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * Gets the defense associated with the Monster.
     *
     * @return          the monster defense.
     */
    public int getDefense() {
        return this.defense;
    }

    /**
     * Gets one of the moves associated with the Monster.
     *
     * @param move      the desired move number
     * @return          the selected move.
     */
    public Move getMove(int move) {
        Move moveNum = null;

        // Chooses the appropriate move based on the argument given
        switch (move) {
            case 1:
                moveNum = move1;
                break;
            case 2:
                moveNum = move2;
                break;
            case 3:
                moveNum = move3;
                break;
            case 4:
                moveNum = move4;
                break;
        }

        return moveNum;
    }
}
