package ArrayPracties;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GreatestSumDivisiblebyThree1262 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int result = maxSumDivThree(nums);
        System.out.println("result = " + result);

    }

    public static int maxSumDivThree(int[] nums) {
        List<Integer> sumList = new ArrayList<>();
        int index = 0;
        int sum = 0;

        helper(nums, index, sum, sumList);
        //int result = sumList.stream().max(Comparator.naturalOrder()).get();
        int result = (int) sumList.stream().filter(x -> x % 3 == 0).max(Comparator.naturalOrder()).get();
        System.out.println("result = " + sumList);
        return result;
    }


    private static void helper(int[] nums, int index, int sum, List<Integer> sumList) {
        if (index == nums.length) {
            sumList.add(sum);
            return;
        }
        helper(nums, index + 1, sum, sumList);
        sum += nums[index];
        helper(nums, index + 1, sum, sumList);
    }
}
