import java.util.Arrays;

public class SearchAndSort {
    public static void main(String[] args) {
        int[] arr = {31, 10, 03, 20, 23, 50, 54};
        int key = 50;

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        // Bubble sort
        long startTime = System.nanoTime();
        bubbleSort(arr);
        long endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Binary search
        startTime = System.nanoTime();
        int binaryIndex = binarySearch(arr, key);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        if (binaryIndex == -1) {
            System.out.println("Element " + key + " not found");
        } else {
            System.out.println("Element " + key + " found at index: " + binaryIndex);
        }

        // Linear search
        startTime = System.nanoTime();
        int linearIndex = linearSearch(arr, key);
        endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;

        if (linearIndex == -1) {
            System.out.println("Element " + key + " not found");
        } else {
            System.out.println("Element " + key + " found at index: " + linearIndex);
        }

        System.out.println("Bubble Sort Time: " + bubbleSortTime + " nanoseconds");
        System.out.println("Binary Search Time: " + binarySearchTime + " nanoseconds");
        System.out.println("Linear Search Time: " + linearSearchTime + " nanoseconds");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}