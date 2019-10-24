public class FibonacciDriver {
    static int callCount = 0;

    static int fibonacciRec(int n) {
        if (n <= 1){
            return n;
        }

        callCount++;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    static int fibonacciIter(int n) {
		if (n <= 1) {
			return n;
        }
        
		int fib = 1;
		int prev = 1;
		
		for (int i = 2; i < n; i++) {
			int temp = fib;
			fib += prev;
            prev = temp;
            callCount++;
        }
        
		return fib;
	}
    
    static void resetCallCount() {
        callCount = 0;
    }

    static int getCallCount() {
        return callCount;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci:");
        int n = 15;

        resetCallCount();
        int recursiveResult = fibonacciRec(n);
        int recursiveCalls = getCallCount();
        System.out.printf("Recursive result: %d (%d recursive calls)\n", recursiveResult, recursiveCalls);

        resetCallCount();
        int iterativeResult = fibonacciIter(n);
        int iterations = getCallCount();
        System.out.printf("Iterative result: %d (%d iterations)\n", iterativeResult, iterations);
    }

}