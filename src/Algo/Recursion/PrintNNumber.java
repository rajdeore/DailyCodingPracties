package Algo.Recursion;

public class PrintNNumber {
    //Given number n. print 1 to n, using recursion

    static int count = 1;
    public static void printNumberUsingRecurssion(int num){

        if(count == num){
            System.out.println(count);
            return;
        }else{
            System.out.println(count);
            count++;
            printNumberUsingRecurssion(num);
        }
    }

    public static void main(String[] args) {

        int i = 10;
        //printNumberUsingRecurssion(i);

        print5(5);
    }

    private static void print5(int i) {
        if(i==0)return;
        System.out.println(i);
        i--;
        print5(i);
        System.out.println(i);
    }
}
