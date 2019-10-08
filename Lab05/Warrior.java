public class Warrior implements Comparable<Warrior> {
    private String name;
    private int speed;
    private int strength;
    private int hp;

    public Warrior(String name, int speed, int str, int hp) {
        this.name = name;
        this.speed = speed;
        this.strength = str;
        this.hp = hp;
    }
    
    public String getName() { return this.name; }
    public int getSpeed() { return this.speed; }
    public int getStrength() { return this.strength; }
    public int getHp() { return this.hp; }
       
    public String toString() { return this.name + "(" +
                                      this.speed + ")"; }

    
    public int compareTo(Warrior that) {
        if (!(that instanceof Warrior)) {
            throw new IllegalArgumentException("compareTo() not valid! Cannot compile!");
        }

        int result = 0;

        if (result == 0) {
            result = (Integer.valueOf(that.getSpeed()).compareTo(Integer.valueOf(getSpeed())));
        }

        return result;
    }
    
}