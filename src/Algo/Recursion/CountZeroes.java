package Algo.Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        int num = 10302040;
        int result = countZero(num);
        System.out.println(result);
    }

    private static int countZero(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int i) {
        if(num /10 == 0){
            return i;
        }
        int digit = num % 10;
        if(digit == 0){
            return helper(num/10 , i+1);
        }else{
            return helper(num /10 , i);
        }
    }
}
