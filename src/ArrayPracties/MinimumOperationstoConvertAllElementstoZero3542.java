package ArrayPracties;

import java.util.Stack;

public class MinimumOperationstoConvertAllElementstoZero3542 {
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int operations = 0;

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() > num) {
                stack.pop();
            }
            if (num == 0){
                continue;
            }

            if (stack.isEmpty() || stack.peek() < num) {
                stack.push(num);
                operations++;
            }
        }

        return operations;
    }
}
