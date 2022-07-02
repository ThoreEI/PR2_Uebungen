package searchAndSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {1313, 7, 3333, 10000, 1133, 1, 2, 3};
        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }

    /*
    - Complexity (O-Notation):
        Best case: 1 + 1 + . . . + 1 = n – 1 (sorted -> no swaps)
        Worst case: 2 × ((n-1) + (n-2) + (n-3) + . . . + 2 + 1) = n (n – 1) = n^2 (reversed order -> all elements compared & swapped)
        Average: n^2 / 2


      --> stable (relative order isn't changing) !!!
     */

    private static int[] bubbleSort(int[] numbers) {

        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                    swapped = true;
                }
            }
        }
        return numbers;
    }

    private static void swap (int[] numbers, int indexCurrentMax, int indexPivot){
        int tmp = numbers[indexCurrentMax];
        numbers[indexCurrentMax] = numbers[indexPivot];
        numbers[indexPivot] = tmp;
    }

}
