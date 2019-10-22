import java.lang.Math;

/**
 * Main class that runs a Pok&eacute;mon-based JRPG.
 * Here, the programmer can specify various Pok&eacute;mon
 * along with their attributes and assign them to a player.
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class GameDriver {
    public static void main(String[] args) {
        Move move1 = new Move("Vine Whip", "Grass", 45, 1.0f);
        Move move2 = new Move("Tackle", "Normal", 50, 1.0f);
        Move move3 = new Move("Take Down", "Normal", 90, 0.85f);
        Move move4 = new Move("Razor Leaf", "Grass", 55, 0.95f);
        Monster monster = new Monster("Bulbasaur", "Grass", 240, 45, 49, 49, move1, move2, move3, move4);
        Player player = new HumanPlayer(monster);

        move1 = new Move("Scratch", "Normal", 40, 1.0f);
        move2 = new Move("Ember", "Fire", 40, 1.0f);
        move3 = new Move("Peck", "Flying", 35, 1.0f);
        move4 = new Move("Fire Spin", "Fire", 35, 0.85f);
        monster = new Monster("Torchic", "Fire", 240, 45, 60, 40, move1, move2, move3, move4);

        Player enemy = new CPUPlayer(monster);
        while ((!player.hasLost()) && (!enemy.hasLost())) {

            double pHP = (double)(player.getMonster().getHP());
            double pMHP = (double)(player.getMonster().getMaxHP());
            double eHP = (double)(enemy.getMonster().getHP());
            double eMHP = (double)(enemy.getMonster().getMaxHP());

            // print both monsters' HP
            System.out.println("\n");
            System.out.printf("%s has %d HP ", player.getMonster().getName(), (int)(pHP));

            System.out.printf("["); // player health graphic
            for (int i = 0; i < (Math.round((pHP / pMHP) * 10)); i++) { System.out.printf("x"); }
            for (int i = 0; i < 10 - (Math.round((pHP / pMHP) * 10)); i++) { System.out.printf("-"); }
            System.out.printf("]\n");

            System.out.printf("%s has %d HP ", enemy.getMonster().getName(), (int)(eHP));

            System.out.printf("["); // enemy health graphic
            for (int i = 0; i < (Math.round((eHP / eMHP) * 10)); i++) { System.out.printf("x"); }
            for (int i = 0; i < 10 - (Math.round((eHP / eMHP) * 10)); i++) { System.out.printf("-"); }
            System.out.printf("]\n");

            // decide the next move
            int playerMove = 0;
            do{
                playerMove = player.chooseMove();
                if (playerMove == 0) {
                    for (int i = 1; i < 5; i++) { System.out.printf("[%s] ", player.getMonster().getMove(i).getName()); }
                    System.out.printf("\n");
                }
            } while(playerMove == 0);
            int enemyMove = enemy.chooseMove();

            // execute the next move
            if (player.isFasterThan(enemy)) {
                System.out.printf("%s used %s (%s damage)\n", player.getMonster().getName(),
                        player.getMonster().getMove(playerMove).getName(),
                        (player.getMonster().getAttack() + player.getMonster().getMove(playerMove).getPower()) - enemy.getMonster().getDefense());
                player.attack(enemy, playerMove);
                if (!enemy.hasLost()) {
                    System.out.printf("%s used %s (%s damage)\n", enemy.getMonster().getName(),
                            enemy.getMonster().getMove(enemyMove).getName(),
                            (enemy.getMonster().getAttack() + enemy.getMonster().getMove(enemyMove).getPower()) - player.getMonster().getDefense());
                    enemy.attack(player, enemyMove);
                }
            } else {
                System.out.printf("%s used %s (%s damage)\n", enemy.getMonster().getName(),
                        enemy.getMonster().getMove(enemyMove).getName(),
                        (enemy.getMonster().getAttack() + enemy.getMonster().getMove(enemyMove).getPower()) - player.getMonster().getDefense());
                enemy.attack(player, enemyMove);
                if (!player.hasLost()) {
                    System.out.printf("%s used %s (%s damage)\n", player.getMonster().getName(),
                            player.getMonster().getMove(playerMove).getName(),
                            (player.getMonster().getAttack() + player.getMonster().getMove(playerMove).getPower()) - enemy.getMonster().getDefense());
                    player.attack(enemy, playerMove);
                }
            }
        }

        if (player.hasLost()) {
            System.out.printf("You and %s have lost the battle.\n", player.getMonster().getName());
        } else {
            System.out.printf("You and %s are victorious!\n", player.getMonster().getName());
        }
    }
}
