import animalKingdom.*;
import hardware.*;

public class Week02b {
    public static void main(String[] args) {
        //animals
        Animal bruce = new Wolf();
        //System.out.println("" + bruce.isCarnivorous); does not work
        bruce.speak();
        if (bruce instanceof Wolf) {
            Wolf wolfBruce = (Wolf) bruce;
            int teeth = ((Wolf) bruce).getNumTeeth();
        } 

        // hardware
        QPrinter3000 q = new QPrinter3000();
        q.print("mary had a little lamb");
        System.out.println(q.scan());

        Printer customPrinter = new Printer() {
            public void print(String text) {
                System.out.println("CUSTOMER PRINTER:" + text);
            }
        };
        customPrinter.print("some stuff");
        
    }
}