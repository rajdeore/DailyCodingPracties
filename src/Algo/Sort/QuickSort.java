package Algo.Sort;

import ArrayPracties.ArrayPrint;

public class QuickSort {
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int partition(int[] nums, int low, int high){
        int pivote = nums[high];
        int i = low-1;

        for (int j = low; j < high ; j++) {
            if(nums[j] < pivote){
                i++;
                swap(nums, i, j);
            }
        }
        i++;
        swap(nums, i, high);
        return i;
    }
    public static void quickSort(int[] nums, int low, int high){
        if(low<high){
            int pi = partition(nums,low, high);

            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }


    }


    public static void main(String[] args) {
        //TC-1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int end1 = nums1.length -1;
        quickSort(nums1, 0, end1);
        ArrayPrint.arrayPrint(nums1);
        System.out.println();
        System.out.println("testcase 2:");

        //TC-2
        int[] nums2 = {6, 5, 4, 3, 2, 1};
        int end2 = nums1.length -1;
        quickSort(nums2, 0, end2);
        ArrayPrint.arrayPrint(nums2);
    }
}
