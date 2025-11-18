package Algo.Recursion;

public class ReversNumber {
    static int res = 0;

    public static void main(String[] args) {
        int num = 1234;
        int cNum = 0;
        //findRev(num, cNum);
        int result = fR(num);
        System.out.println(result);


        //System.out.println(res);
    }

    private static int fR(int num) {
        if(num / 10 == 0)
            return num;

        return ((num%10) ) + (fR(num /10) * 10);
    }

    private static void findRev(int num, int cNum) {
        if (num / 10 == 0) {
            res = cNum * 10 + num % 10;
            return;
        }
        int digit = num % 10;
        num = num / 10;
        cNum = cNum * 10 + digit;
        findRev(num, cNum);
    }
}
