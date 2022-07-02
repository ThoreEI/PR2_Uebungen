package searchAndSort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] numbers = {10, 7, 41, 3, 6, 9, 6, 30};
        System.out.println(Arrays.toString(quickSort(numbers, 0, numbers.length-1)));
    }

    private static int[] quickSort(int[] numbers, int left, int right) {
        if (left < right) {
            int index = partition(numbers, left, right);
            quickSort(numbers, left, index-1);
            quickSort(numbers, index+1, right);
        }
        return numbers;
    }

    private static int partition(int[] numbers, int left, int right) {
        int index = left;
        for (int pointer = left; pointer < right; pointer++) {
            if (numbers[pointer] <= numbers[right]) {
                swap(numbers, pointer, index);
                index++;
            }
        }
        swap(numbers, index, right);
        return index;
    }


    private static void swap(int[] numbers, int i, int j) {
            int tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
    }

}
