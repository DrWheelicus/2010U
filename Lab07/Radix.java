import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Radix {
    public static void radixSort(int[] input) {
        final int RADIX = 2;

        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        // sort
        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;

            // split input between lists
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }

            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }

            System.out.println(Arrays.toString(input));

            // move to next digit
            placement *= RADIX;
        }
    }

    public static void main(String[] args) {
        int[] origNumbers = {0b0011, 0b1001, 0b1000, 0b0111, 0b0101};

        radixSort(origNumbers);
    }
}