/**
* Lab01
*
* We'll create a class, called Battle. Battle will have a main method, which will simulate a simply battle
* between two RPG game characters: Krogg and Boss. The battle will alternate between Krogg attacking
* Boss, and Boss attacking Krogg. 
*
* @author Hayden MacIntyre
* @date September 9, 2019
*/
public class Battle {
    public static void main(String[] args) {
        float kroggAttack = 38.5f;
        float kroggDefense = 20.0f;

        float kroggHP = 200f;

        float bossAttack = 25f;
        float bossDefense = 12.5f;
        float bossHP = 200f;

        int round = 1;

        // damage = attacker's attack – defender's defense
        float kroggDamage = kroggAttack - bossDefense;
        float bossDamage = bossAttack - kroggDefense;

        while ((kroggHP > 0) && (bossHP > 0)) {
            kroggHP = kroggHP - bossDamage; // boss attacks krogg
            bossHP = bossHP - kroggDamage; // krogg attacks krogg

            // results are outputted
            System.out.println("Round " + round);
            System.out.println("Krogg does " + kroggDamage + " points of damage to Boss");
            System.out.println("Boss does " + bossDamage + " points of damage to Krogg");
            System.out.println("Boss: " + bossHP);
            System.out.println("Krogg: " + kroggHP + '\n');

            // check who has won 
            if (bossHP <= 0) {
                System.out.println("Krogg has won. You are victorious!");
            } else if (kroggHP <= 0) {
                System.out.println("Boss has won. You have failed!");
            }

            round++; // next round 
        }
    }
}