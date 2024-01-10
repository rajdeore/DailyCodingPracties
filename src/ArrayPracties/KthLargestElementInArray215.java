package ArrayPracties;

import Algo.Sort.BubbleSort;

import java.util.Arrays;

public class KthLargestElementInArray215 {
    //using internal Arrays.sorting
    public int findKthLargestUsingSort(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    // using bubbleSort (in src/Algo/Sort/BubbleSort
    public int findKthLargestUsingBubbleSort(int[] nums, int k) {
        BubbleSort.bubbleSort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest(int[] nums, int k) {

        int numsLen = nums.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < numsLen-1-i; j++) {
                if (nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        KthLargestElementInArray215 kthLargestElementInArray215 = new KthLargestElementInArray215();
        //TC-1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        //TC-2
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;

        //findKthLargestUsingSort
/*        System.out.println("findKthLargestUsingSort");
        System.out.println(kthLargestElementInArray215.findKthLargestUsingSort(nums1, k1));
        System.out.println(kthLargestElementInArray215.findKthLargestUsingSort(nums2, k2));
        //findKthLargestUsingBubbleSort
        System.out.println("findKthLargestUsingBubbleSort");
        System.out.println(kthLargestElementInArray215.findKthLargestUsingBubbleSort(nums1, k1));
        System.out.println(kthLargestElementInArray215.findKthLargestUsingBubbleSort(nums2, k2));*/
        //findKthLargest
        System.out.println("findKthLargest");
        System.out.println(kthLargestElementInArray215.findKthLargest(nums1, k1));
        System.out.println(kthLargestElementInArray215.findKthLargest(nums2, k2));
    }
}
