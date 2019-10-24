public class HanoiDriver {
    static void solveHanoi(int n, int startRod, int targetRod, int rod3) { 
        if (n == 1) { 
            System.out.printf("Move top ring from %d to %d.\n", startRod, targetRod);
            return; 
        }

        solveHanoi(n-1, startRod, rod3, targetRod); 
        System.out.printf("Move ring " + n + " from %d to %d.\n", startRod, targetRod);
        solveHanoi(n-1, rod3, targetRod, startRod); 
    }

    public static void main(String[] args) {
        System.out.println("Towers of Hanoi:");
        solveHanoi(1, 3, 2, 4);
    }
}