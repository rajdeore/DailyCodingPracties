package ArrayPracties;

import java.util.Arrays;

public class MissingNumber268 {
    static int missingNumberUsingSorting(int[] nums){

        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    static int missingNumberUsingSum(int[] nums){
        int numsLength = nums.length;
        int actualSum = (numsLength * (numsLength + 1))/2;
        int givenArraySum= 0 ;
        for (int num : nums) {
            givenArraySum += num;
        }

        return actualSum-givenArraySum;

    }

    public static void main(String[] args) {
        int[] givenArray = {9,6,4,2,3,5,7,0,1};
        int[] givenArray1 = {0,1};
        System.out.println(missingNumberUsingSorting(givenArray));
        System.out.println(missingNumberUsingSum(givenArray));

        System.out.println(missingNumberUsingSorting(givenArray1));
        System.out.println(missingNumberUsingSum(givenArray1));
    }
}
