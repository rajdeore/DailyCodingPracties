package ArrayPracties;

public class RemoveDuplicatesfromSortedArray {
    /*
    * Given an integer array nums sorted in non-decreasing order,
    * remove the duplicates in-place such that each unique element appears only once.
    * The relative order of the elements should be kept the same.
    * Then return the number of unique elements in nums.
    */

    static int solByTwoPointer(int[] nums){
        int j = 0;
        int i = 0;
        while(j< nums.length){
            if( nums[i] >= nums[j] ){
                j++;
            }else{
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] =  temp;
                i++;
                j++;
            }
        }

        for (int temp : nums
             ) {
            System.out.print( temp + " ");
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3,3,3};
        System.out.println(solByTwoPointer(nums));
    }
}
