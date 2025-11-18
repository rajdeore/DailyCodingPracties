package Algo.Recursion;

import java.util.Scanner;

public class FibonacciRecursion {

    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : " );
        int num = scanner.nextInt();*/
        int num = 6;

        System.out.println(findFibonacci(num));
    }

    private static int findFibonacci(int num) {
        /*if (num <= 0) return 0;
        if (num == 1) return 1;*/

        if(num < 2)
            return num;

        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }
}
