package searchAndSort;


public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 7, 25, 31, 45, 623, 1090, 2312, 3333, 10000};
        int searchedValue = 4;
        System.out.println("Found at index: " + binarySearch(searchedValue, numbers));
    }

    /*Best case: O(n) = 1
      Worst case: log2(n)
      Average successful: log2(n)
      Average unsuccessful: log2(n)
     */

    private static int binarySearch(int searchedValue, int[] numbers) {
        int lowerLimit = 0;
        int upperLimit = numbers.length - 1;
        while (lowerLimit <= upperLimit) {
            int middle = (lowerLimit + upperLimit) / 2;
            if (numbers[middle] == searchedValue)
                return middle;

            if (searchedValue < numbers[middle])
                upperLimit = middle - 1;
            else
                lowerLimit = middle + 1;
        }
        return -1;
    }
}
