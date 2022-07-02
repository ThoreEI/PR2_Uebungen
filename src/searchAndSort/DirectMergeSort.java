package searchAndSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DirectMergeSort {
    private static ArrayList<Integer> firstTape = new ArrayList<>();
    private static ArrayList<Integer> secondTape = new ArrayList<>();

    public static void main(String[] args) {
        int[] mainTape = {1313, 7, 3333, 10000, 1, 2, 25, 31, 45, 623, 1090, 3, 5};

        System.out.println(Arrays.toString(mergeSort(mainTape)));
    }


    private static int[] mergeSort(int[] mainTape) {
        int blockSize = 1;
        do {
            split(mainTape, blockSize);
            merge(blockSize);
            blockSize *= 2;
        } while (mainTape.length >= blockSize);

        return mainTape;
    }



    private static void split(int[] mainTape, int blockSize) {
        boolean isFirstTapeCurrentTape = true;
        for (int i = 0; i < mainTape.length; i++) {
            for (int j = 0; j < blockSize; j++) {
                if (isFirstTapeCurrentTape)
                    firstTape.add(mainTape[i]);
                else
                    secondTape.add(mainTape[i]);
            }
            isFirstTapeCurrentTape = !isFirstTapeCurrentTape;
        }
    }

    private static void merge(int blockSize) {
    }
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


