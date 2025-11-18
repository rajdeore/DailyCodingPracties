package ArrayPracties;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs70 {


    //    ************************************* Using Static variable and recurssion *******************************************
    static int count1 = 0;

    public static int climbStairsStatic(int n) {
        findStep(n);
        return count1;

    }

    public static void findStep(int n) {
        if (n <= 0) {
            if (n == 0) {
                count1 += 1;
            }
            return;
        }
        System.out.println("N ; " + n);
        System.out.println("Count  ; " + count1);
/*        if(n == 0){
            count1 += 1;
        }*/
        findStep(n - 1);
        findStep(n - 2);
    }


//    ************************************* Using Static variable and recursion *******************************************

    //    *************************************  recursion *******************************************
    public int climbStairsRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairsRecursion(n - 1) + climbStairsRecursion(n - 2);
    }


//    *************************************  recursion *******************************************


    //    *************************************  Memoization *******************************************
    public int climbStairsMemoization(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairsMemoization(n, memo);
    }

    private int climbStairsMemoization(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairsMemoization(n - 1, memo) + climbStairsMemoization(n - 2, memo));
        }
        return memo.get(n);
    }

//    *************************************  Memoization *******************************************

    //    *************************************  Tabulation *******************************************
    public int climbStairsTabulation(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


//    *************************************  Tabulation *******************************************

//    *************************************  Space Optimization *******************************************
    public int climbStairsSpaceOptimization(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

//    *************************************  Space Optimization *******************************************

    public static void main(String[] args) {

        //solution by four way
        //revise
        //recursion, memoization, tabulation, or space optimization
        int result = climbStairsStatic(3);
        System.out.println("Result : " + result);
    }
}

