package searchAndSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {1313, 7, 3333, 10000, 1, 2, 25, 31, 45, 623, 1090, 3, 5};
        System.out.println(Arrays.toString(insertionSort(numbers)));
    }

    /*
    - Comparisons:
        Best case: 1 + 1 + . . . + 1 = n – 1 (sorted)
        Worst case: 1 + 2 + . . . + (n-3) + (n-2) + (n-1) = n (n – 1)/2 = n^2/ 2 (reversed order -> all elements compared to each other)
        Average: n^2 / 4

    - Shifts:
        Best case: 0
        Worst case: n^2/2

     - Sum:
        Comparisons + Shifts = 2 * n^2/4

      --> stable (relative order isn't changing while shifting !!!
     */

    private static int[] insertionSort(int[] numbers) {

        for (int index = 1; index < numbers.length; index++) {
            int comparison = numbers[index];
            while (index > 0 && numbers[index - 1] > comparison) { // left > right --> swap
                numbers[index] = numbers[index - 1];
                index--;
            }
            numbers[index] = comparison; // shifting finished
        }
        return numbers;
    }
}

