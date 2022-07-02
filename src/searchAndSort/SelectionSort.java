package searchAndSort;

import java.net.StandardSocketOptions;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {1313, 7, 3333, 10000, 1, 2, 25, 31, 45, 623, 1090, 3, 5};
        System.out.println(Arrays.toString(selectionSort(numbers)));

    }

    /*
        - Comparisons: (n-1) + (n-2) + (n-3) + . . . + 3 + 2 + 1 = n (n – 1)/2 = n^2 / 2

        - Swaps
            Best case: 0 (sorted)
            Worst case: n-1 (pivot = largest element & list is sorted)
            Average: n^2 / 2

       --> Not stable because of swaps -> relative order gets changed !!!
    */

    private static int[] selectionSort(int[] numbers) {
        int indexPivot = numbers.length - 1;
        while (indexPivot > 0) {
            for (int indexComparison = 0; indexComparison <= indexPivot; indexComparison++)
                if (numbers[indexComparison] > numbers[indexPivot])
                    swap(numbers, indexComparison, indexPivot);
            indexPivot--;
        }
        return numbers;
    }

    private static void swap (int[] numbers, int indexCurrentMax, int indexPivot){
        int tmp = numbers[indexCurrentMax];
        numbers[indexCurrentMax] = numbers[indexPivot];
        numbers[indexPivot] = tmp;
    }

}
