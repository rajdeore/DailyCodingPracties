package JavaConceptPracties.ExceptionDemo;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        int x,y;
        Scanner scr = new Scanner(System.in);

        System.out.println("enter x: ");
        x = scr.nextInt();
        System.out.println("enter y: ");
        y = scr.nextInt();

        try{
            System.out.println("start");  //step: 1
            System.out.println(x/y);   //step: 2
            System.out.println("end");  //step: 3
        }catch(ArithmeticException e){
            System.out.println(Arrays.toString(e.getStackTrace()));  //step: 4
        }

        System.out.println("terminating gracefully "); //step: 5
    }

}
