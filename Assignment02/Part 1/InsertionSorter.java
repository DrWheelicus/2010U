/**
 * InsertionSorter is a class that implements the insertion sort algorithm.
 * This class is an extension of the Sorter class and all of its methods and variables.
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class InsertionSorter extends Sorter {
    /**
     * A method that uses insertion sort to sort a list of doubles.
     * This method sorts in ascending order.
     * 
     * @param list              The list to be sorted
     * @see                     Sorter#countOp()
     */
    public void sort(double[] list){
        countOp();
        int length = list.length; 

        // Sort until you reach the end of the list
        for (int i = 1; i < length; i++) { 
            countOp();
            double index = list[i]; 

            countOp();
            int number = i - 1; 

            // Swap values until all are sorted
            while (number >= 0 && list[number] > index) { 
                countOp();
                list[number + 1] = list[number]; 
                countOp();
                number = number - 1; 
            }

            countOp();
            list[number + 1] = index;
        }
    }
}