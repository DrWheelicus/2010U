/**
 * MergeSorter is a class that implements the merge sort algorithm.
 * This class is an extension of the Sorter class and all of its methods and variables.
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class MergeSorter extends Sorter {
    private int number;

    private double[] numbers;
    private double[] arr;

    /**
     * A method that sorts a list of doubles using a merge sort based method.
     * 
     * @param list              The list to be sorted.
     */
    public void sort(double[] list) {
        this.numbers = list;
        countOp();
        number = list.length;
        countOp();
        this.arr = new double[number];
        mergeSort(0, number - 1);
    }

    /**
     * A merge sort algorithm that sorts an array in ascending order.
     * This method splits the array into 2 and sorts both sides before combining them.
     * 
     * @param bottom            The lowest index in the array.
     * @param top               The highest index in the array.
     * @see                     Sorter#countOp()
     */
    private void mergeSort(int bottom, int top) {
        // check if array is sorted
        if (bottom < top) {
            countOp();
            int mid = bottom + (top - bottom) / 2;
            // Sort first half
            mergeSort(bottom, mid);
            // Sort second half
            mergeSort(mid + 1, top);
            // Combine
            merge(bottom, mid, top);
        }
    }

    /**
     * Merges two arrays together in place.
     * 
     * @param bottom            The lowest index of an array.
     * @param mid               The middle index of the array.
     * @param top               The length of the array.
     * @see                     Sorter#countOp()
     */
    private void merge(int bottom, int mid, int top) {
        // Copy into array
        for (int i = bottom; i <= top; i++) {
            countOp();
            arr[i] = numbers[i];
        }

        countOp();
        int a = bottom;
        countOp();
        int b = mid + 1;
        countOp();
        int c = bottom;

        // Copy smallest list from left or right
        while (a <= mid && b <= top) {
            if (arr[a] <= arr[b]) {
                countOp();
                numbers[c] = arr[a];
                a++;
            } else {
                countOp();
                numbers[c] = arr[b];
                b++;
            }
            c++;
        }

        // Copy left side
        while (a <= mid) {
            countOp();
            numbers[c] = arr[a];
            c++;
            a++;
        }
    }
}