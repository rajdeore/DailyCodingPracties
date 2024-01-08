package Algo.Sort;
import ArrayPracties.ArrayPrint;
public class BubbleSort {
    static public void bubbleSort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength - (i + 1); j++) {
                //swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //TC-1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        bubbleSort(nums1);
        ArrayPrint.arrayPrint(nums1);

    }
}
