import java.util.*;

public class Midtermquestion4 {
    public static boolean searchDivideAndConquer(int target, int[] arr) {
        int length = arr.length;
        int mid = length/2;

        if (length < 2) {
            if (target == arr[0]) {
                return true;
            } else {
                return false;
            }
        }

        int[] firstHalf = Arrays.copyOfRange(arr,0,mid);
        int[] secondHalf = Arrays.copyOfRange(arr,mid,length);

        if (findNum(target, firstHalf)){
            return true;
        } else if (findNum(target, secondHalf)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean findNum(int find, int[] list) {
        boolean hasFound = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == find) {
                hasFound = true;
            }
        }
        return hasFound;
    }

    public static void main(String[] args) {
        int[] list1 = { 1, 6, 3, 4, 14 };
        System.out.println("searchDivideAndConquer(7,[1,6,3,4,14]): " + searchDivideAndConquer(7, list1));
        // false

        int[] list2 = { 32, 6, 11, 17, 2, 12, 30, 8, 27 };
        System.out
                .println("searchDivideAndConquer(12,[32,6,11,17,2,12,30,8,27]): " + searchDivideAndConquer(12, list2));
        // true
    }
    
}