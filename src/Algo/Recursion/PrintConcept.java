package Algo.Recursion;

public class PrintConcept {

    public static void main(String[] args) {
        int num = 5;
        printNumTo1(num);
        print1ToNum(num);
        printBothSide(num);
    }

    private static void printNumTo1(int num) {
        if(num ==0){
            return;
        }

        //printing element when we are putting function call  in stack
        System.out.println(num);
        printNumTo1(num-1);
    }

    private static void print1ToNum(int num) {
        if(num ==0){
            return;
        }

        //printing element when removing function call  from stack
        //Imp concept..
        printNumTo1(num-1);
        System.out.println(num);
    }

    private static void printBothSide(int num) {
        if(num ==0){
            return;
        }

        System.out.println(num);
        printNumTo1(num-1);
        System.out.println(num);
    }


}
