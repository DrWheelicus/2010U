public class HanoiDriver {
    static void solveHanoi(int n, int rod1, int rod2, int rod3) { 
        if (n == 1) { 
            System.out.println("Move disk 1 from rod " +  rod1 + " to rod " + rod2); 
            return; 
        }

        solveHanoi(n-1, rod1, rod3, rod2); 
        System.out.println("Move disk " + n + " from rod " +  rod1 + " to rod " + rod2); 
        solveHanoi(n-1, rod3, rod2, rod1); 
    }

    public static void main(String[] args) {
        System.out.println("Towers of Hanoi:");
        solveHanoi(4, 3, 2, 4);
    }
}