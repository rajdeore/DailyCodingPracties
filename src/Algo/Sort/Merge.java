package Algo.Sort;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 7, 4, 20, 21, 3, 1};

        //using extra space.
       // int[] result = mergeSort(arr);
        //System.out.println(Arrays.toString(result));

        int[] arr2 = new int[]{8, 2, 7, 4, 20, 21, 3, 1};
        mergeSortInPlace(arr2, 0, arr.length);
        System.out.println(Arrays.toString(arr2));


        //working
/*        int[] conquerTry = conquer(new int[] {1,3,5,7}, new int[]{2,4,6,8,9,10});
        System.out.println(Arrays.toString(conquerTry));*/
    }

    //******************************************  Without extra space   *************************************

    private static void mergeSortInPlace(int[] arr2, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (start + end)  / 2;

        mergeSortInPlace(arr2, start, mid);
        mergeSortInPlace(arr2, mid, end);
        mergeInPlace(arr2, start, mid, end);
    }

    private static void mergeInPlace(int[] arr2, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {
            if (arr2[i] < arr2[j]) {
                mix[k] = arr2[i];
                i++;
                k++;
            } else {
                mix[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < mid) {
            mix[k] = arr2[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr2[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr2[start + l] = mix[l];
        }

    }


    //******************************************  Using extra space  *************************************

    private static int[] mergeSort(int[] arr) {
        return divide(arr);
    }

    private static int[] divide(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return conquer(left, right);
    }

    private static int[] conquer(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] mix = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
                k++;
            } else {
                mix[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
    //*************************************** Using extra space ***********************************************************
}
