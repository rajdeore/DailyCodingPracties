package ArrayPracties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ArrayReverse344 {
    public int[] arrayReverseUsingBigO_N(int[] arr) {
        int arrLength = arr.length;
/*
        // left--->midle--->right
        for (int left = 0, right = arrLength - 1; left < arrLength / 2 && right >= arrLength / 2; left++, right--) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
*/

        for (int i = 0; i < arrLength / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arrLength - i - 1];
            arr[arrLength - i - 1] = temp;
        }
        return arr;
    }

    //Using Stack
    public static int[] arrayReverseUsingStack(int arr[]) {
        int arrLenght = arr.length;
        int[] tempArray = new int[arrLenght];

        Stack<Integer> stack = new Stack<Integer>();
        //1st push all arr element into stack
        for (int i = 0; i < arrLenght; i++) {
            stack.push(arr[i]);
        }
        //2nd pop element and to new array
        for (int i = 0; i < arrLenght; i++) {
            tempArray[i] = stack.pop();
        }
        return tempArray;
    }

    //Array list
    public static void listReverseUsingCollectionsReverse(ArrayList<Integer> Al) {
        System.out.println("Before reverse : " + Al);
        Collections.reverse(Al);
        System.out.println("After reverse : " + Al);
    }

    public static void main(String[] args) {
        int[] tempArr = {1, 8, 2, 3, 7, 4, 5};

        ArrayReverse344 obj = new ArrayReverse344();
        System.out.print("before reverse : ");
        ArrayPrint.arrayPrint(tempArr);
        tempArr = obj.arrayReverseUsingBigO_N(tempArr);
        System.out.print("After reverse : ");
        ArrayPrint.arrayPrint(tempArr);


        //case 2
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(4);
        Al.add(1);
        Al.add(9);
        Al.add(6);
        Al.add(2);
        Al.add(3, 10);
        listReverseUsingCollectionsReverse(Al);
    }
}
