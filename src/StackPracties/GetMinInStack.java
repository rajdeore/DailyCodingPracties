package StackPracties;

import java.util.Stack;

public class GetMinInStack {

    static int getMin(Stack stack){
        int pointer = stack.size();
        int minValue = (int) stack.peek();

        for (int i = pointer-1; i >-1 ; i--) {
            if((int) stack.elementAt(i) < minValue){
                minValue = (int) stack.elementAt(i);
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.add(10);
        stack.add(30);
        stack.add(20);
        stack.add(50);
        stack.add(40);
        stack.add(5);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        int minValueResult = GetMinInStack.getMin(stack);
        System.out.println(minValueResult);

    }
}
