import java.util.Random;

/**
 * Player is an abstract class that represents a single player of the JRPG.
 * Contains methods to check whether or not
 * the player is alive and the speed of the player.
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public abstract class Player {
    protected Monster monster;

    public abstract int chooseMove();

    /**
     * Gets the Monster Object associated with the Player.
     *
     * @see             Monster
     * @return          The players monster.
     */
    public Monster getMonster() {
        return this.monster;
    }

    /**
     * Determines the HP value of the monster associated with the player.
     * If the monster has no HP or negative HP then
     * the method will return true, meaning they are dead.
     *
     * @return          <code>true</code> if the HP value is zero or negative;
     *                  <code>false</code> otherwise.
     * @see             Monster#getHP()
     */
    public boolean hasLost() {
        return monster.getHP() <= 0;
    }

    /**
     * Determines the speeds of two different monsters
     * and checks to see which value is greater.
     *
     * @param enemy     the player being attacked
     * @return          <code>true</code> if the Speed value of the current player is greater;
     *                  <code>false</code> otherwise.
     * @see             Monster#getSpeed()
     * @see             #getMonster()
     */
    public boolean isFasterThan(Player enemy) {
        return monster.getSpeed() > enemy.getMonster().getSpeed();
    }

    /**
     * Deals damage to the other player by calculating damage to be dealt
     * and subtracting it from the other players HP.
     *
     * @param target    the player to be attacked
     * @param moveChoice the move that the player is using.
     *                   Can only be numbers 1 to 4.
     * @see             #getMonster()
     * @see             Monster#getAttack()
     * @see             Monster#getMove(int)
     * @see             Move#getPower()
     * @see             Monster#getDefense()
     * @see             Monster#getHP()
     * @see             Monster#setHP(int)
     * @see             Monster#getEffect()
     */
    public int attack(Player target, int moveChoice) {
        // Calculate the damage to be dealt
        Random rand = new Random();
        Float randFloat = rand.nextFloat();
        float multiplier = 1;

        // Get multiplier
        for (int i = 0; i < target.getMonster().getEffect()[0].length; i++) {
          if (this.getMonster().getMove(moveChoice).getType() == target.getMonster().getEffect()[0][i]) {
            multiplier = 2;
            System.out.printf("It's super effective!\n");
          }
        }

        for (int i = 0; i < this.getMonster().getEffect()[1].length; i++) {
          if (this.getMonster().getMove(moveChoice).getType() == target.getMonster().getEffect()[1][i]) {
            multiplier = 0.5f;
            System.out.printf("It's not very effective...\n");
          }
        }

        // If target is missed than no damage is done
        if(randFloat.compareTo(this.getMonster().getMove(moveChoice).getAccuracy()) == 1){
            System.out.printf("%s's attack missed the target!",this.getMonster().getName());
            return 0;
        };

        float damage = ((this.getMonster().getAttack() + this.getMonster().getMove(moveChoice).getPower())
                - target.getMonster().getDefense()) * multiplier;

        int damage2 = (int)(damage);

        int hpLeft = target.getMonster().getHP() - damage2;

        // Sets new HP
        target.getMonster().setHP(hpLeft);

        return damage2;
    }
}
