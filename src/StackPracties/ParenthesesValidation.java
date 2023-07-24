package StackPracties;

import java.util.Stack;

public class ParenthesesValidation {
    static boolean isOpenParenthese(char ch){
        if(ch=='(' || ch=='{' || ch=='['){
            return true;
        }
        return false;
    }
    static void parenthesesValidationUsingStack(String givenString){
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < givenString.length(); i++) {
            char charAtGivenString = givenString.charAt(i);
            if(stack.isEmpty()){
                if (isOpenParenthese(charAtGivenString)){
                    stack.push(charAtGivenString);
                }
                else{
                   // System.out.println("not-valid");
                    break;
                }

            }else{
                if(isOpenParenthese(charAtGivenString)){
                    stack.push(charAtGivenString);
                }
                else{
                    switch (charAtGivenString){
                        case ')':
                            charAtGivenString = '(';
                            break;
                        case ']':
                            charAtGivenString = '[';
                            break;
                        case '}':
                            charAtGivenString = '{';
                            break;
                        default:
                          //  System.out.println("not-valid");
                            break;
                    }

                    if(stack.peek() == charAtGivenString){
                        stack.pop();
                    }
                    else {
                       // System.out.println("Not-valid");
                        break;
                    }
                }


            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        }else {
            System.out.println("Not valid");
        }
    }

    public static void main(String[] args) {
       // ParenthesesValidation parenthesesValidation = new ParenthesesValidation();
        String inputString =  "([)]";
        parenthesesValidationUsingStack(inputString);
    }

}
