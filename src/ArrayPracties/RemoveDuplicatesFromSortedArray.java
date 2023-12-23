package ArrayPracties;

public class RemoveDuplicatesFromSortedArray {
    /*
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     * Then return the number of unique elements in nums.
     */

    static int solByTwoPointer(int[] nums) {
        int j = 0;
        int i = 0;
        while (j < nums.length) {
            if (nums[i] >= nums[j]) {
                j++;
            } else {
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }

        for (int temp : nums
        ) {
            System.out.print(temp + " ");
        }

        return i;
    }

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int locationHolder = 0;
        int finder = 0;
        while (finder < len) {

            if (nums[locationHolder] == nums[finder]) {
                finder++;
            } else {
                int temp = nums[locationHolder + 1];
                nums[locationHolder + 1] = nums[finder];
                nums[finder] = temp;

                finder++;
                locationHolder++;
            }
        }
        return locationHolder + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] givenArray = {0, 0, 1, 1, 1, 3, 3, 3};
        int[] givenArray1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(obj.removeDuplicates(givenArray1));

        int[] nums = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        System.out.println(solByTwoPointer(nums));
    }
}
