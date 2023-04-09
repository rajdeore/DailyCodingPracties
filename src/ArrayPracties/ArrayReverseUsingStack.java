package ArrayPracties;

import java.util.Stack;

public class ArrayReverseUsingStack {
    public int[] arrayReverseUsingStack(int arr[]){
        int arrLenght = arr.length;
        int [] tempArray = new int[arrLenght];

        Stack<Integer> stack = new Stack<Integer>();
        //1st push all arr element into stack
        for(int i=0; i<arrLenght; i++){
            stack.push(arr[i]);
        }
        //2nd pop element and to new array
        for(int i=0; i<arrLenght; i++){
            tempArray[i] = stack.pop();
        }

        return tempArray;


    }
}
