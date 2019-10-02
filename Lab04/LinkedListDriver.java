public class LinkedListDriver extends SortedDoublyLinkedList<Warrior> {
    public static void main(String[] args) {
        LinkedList<Warrior> list = new SortedDoublyLinkedList<Warrior>();
    
        Warrior krogg = new Warrior("Krogg", 30, 50, 200);
        list.insert(krogg);
    
        Warrior gurkh = new Warrior("Gurkh", 40, 45, 180);
        list.insert(gurkh);
    
        Warrior brynn = new Warrior("Brynn", 45, 40, 190);
        list.insert(brynn);
    
        Warrior dolf = new Warrior("Dolf", 20, 65, 210);
        list.insert(dolf);
    
        Warrior zuni = new Warrior("Zuni", 50, 35, 170);
        list.insert(zuni);
    
        System.out.println(list);
    }
}