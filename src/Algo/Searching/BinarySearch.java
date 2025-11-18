package Algo.Searching;

public class BinarySearch {

    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        return binarySearch(arr, target, low, high);
    }

    public int binarySearch(int[] arr, int number, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        //main logic
        if (arr[mid] == number) {
            return mid;
        } else if (number < arr[mid]) {
            return binarySearch(arr, number, start, mid - 1);
        } else {
            return binarySearch(arr, number, mid + 1, end);
        }
    }

    public static int binarySearchUsingIteration(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
