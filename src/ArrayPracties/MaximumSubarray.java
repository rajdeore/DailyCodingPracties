package ArrayPracties;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] givenArray1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] givenArray = {5,4,-1,7,8};
        int[] givenArray2 ={5,4,-1,7,8};
        int[] givenArray3 ={-2, -3, 4, -1, -2, 1, 5, -3};

        int[] givenArray4 ={100, 5, -100, 1, 2, 3};

/*      System.out.println("result of the subarray1 with the largest sum = " + findSumMaxSubArray(givenArray1));
      System.out.println("result of the subarray2 with the largest sum = " + findSumMaxSubArray(givenArray2));
       System.out.println("result of the subarray3 with the largest sum = " + findSumMaxSubArray(givenArray3));*/
       // System.out.println("result of the subarray4 with the largest sum = " + findSumMaxSubArray(givenArray4));
       // System.out.println("result of the subarray4 with the largest sum = " + findSumMaxSubArray(givenArray));



/*        System.out.println("result of the subarray1 with the largest sum using Kaden = " + findSumMaxSubArrayUsingKadaneAlgo(givenArray1));
       System.out.println("result of the subarray2 with the largest sum using Kaden = " + findSumMaxSubArrayUsingKadaneAlgo(givenArray2));
       System.out.println("result of the subarray3 with the largest sum using Kaden = " + findSumMaxSubArrayUsingKadaneAlgo(givenArray3));*/
       // System.out.println("result of the subarray4 with the largest sum using Kaden = " + findSumMaxSubArrayUsingKadaneAlgo(givenArray4));
        System.out.println("result of the subarray4 with the largest sum using Kaden = " + findSumMaxSubArrayUsingKadaneAlgo(givenArray));

    }

    private static int findSumMaxSubArray(int[] givenArray) {
        int maxSumOfSubArray = Integer.MIN_VALUE;
        if(givenArray.length == 1){
            maxSumOfSubArray = givenArray[0];
            return maxSumOfSubArray;
        }else {
            for (int i = 0; i < givenArray.length - 1; i++) {
                int sumOfSubArray = 0;
                for (int j = i; j < givenArray.length; j++) {
                    sumOfSubArray += givenArray[j];
                    if (maxSumOfSubArray < sumOfSubArray) {
                        maxSumOfSubArray = sumOfSubArray;
                    }
                }
            }
        }

        return maxSumOfSubArray;
    }

    private static int findSumMaxSubArrayUsingKadaneAlgo(int[] nums){
        int maxSumOfSubArray = Integer.MIN_VALUE;
        int maxSumNow = 0;

        if(nums.length == 1){
            maxSumOfSubArray = nums[0];
            return maxSumOfSubArray;
        }else{
            for (int num : nums) {
                maxSumNow = maxSumNow + num;
                if (maxSumNow < 0) {
                    if (maxSumNow > maxSumOfSubArray) {
                        maxSumOfSubArray = maxSumNow;
                    }
                    maxSumNow = 0;
                } else {
                    if (maxSumNow > maxSumOfSubArray) {
                        maxSumOfSubArray = maxSumNow;
                    }
                }
            }
        }
        return maxSumOfSubArray;
    }
}
