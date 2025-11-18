package Algo.Recursion;

public class SumOfDigit {

    public static void main(String[] args) {
        int num = 1234;
        int result = sumOfDigit(num);
        System.out.println(result);
    }

    private static int sumOfDigit(int num) {
        if(num%10 == 0){
            return num;
        }

        return (num % 10) + sumOfDigit(num / 10);
    }
}
