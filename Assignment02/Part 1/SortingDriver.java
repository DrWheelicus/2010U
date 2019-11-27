public class SortingDriver {
    public static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100.0;
        }

        return array;
    }

    public static void main(String[] args) {
        double[] array1 = generateRandomArray(100000);
        double[] array2 = array1.clone();

        // algorithm #1
        Sorter iSorter = new InsertionSorter();
        iSorter.sort(array1);
        System.out.println("Operations: " + iSorter.getOpCount());

        // algorithm #2
        Sorter mSorter = new MergeSorter();
        mSorter.sort(array2);
        System.out.println("Operations: " + mSorter.getOpCount());
    }
}
