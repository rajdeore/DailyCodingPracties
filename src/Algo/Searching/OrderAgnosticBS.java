package Algo.Searching;

public class OrderAgnosticBS {
    //Given array is not know.
    // check: is it in ascending or descending order?
    public static void main(String[] args) {
        int ascArr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int desArr[] = {8, 7, 6, 5, 4, 3, 2, 1};


        int result = orderAgnosticBS(ascArr, 4);
        int desResult = orderAgnosticBS(desArr, 2);
        System.out.println(result);
        System.out.println(desResult);
    }

    private static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        boolean isAsc = arr[start] <= arr[end - 1];

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }


}
