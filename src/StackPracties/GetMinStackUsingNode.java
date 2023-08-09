package StackPracties;

import java.util.Stack;

public class GetMinStackUsingNode {

    static class Node{
        int val;
        int min;

        public Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }

    Stack<Node> s ;

    GetMinStackUsingNode(){
        s = new Stack<>();
    }

    void minPush(int element){
        //Node node = new Node();
        if(s.isEmpty()){
            Node node = new Node(element, element);
            s.push(node);
        }else{
            if(element < s.peek().min){
                Node node = new Node(element, element);
                s.push(node);
            }else{
                Node node = new Node(element, s.peek().min);
                s.push(node);
            }
        }
    }

    void minPop(){
        if(s.isEmpty()){
            System.out.println("stack is empty");
        }else{
            s.pop();
        }
    }

    void getMin(){
        if(s.isEmpty()){
            System.out.println("stack is empty");
        }else{
            System.out.println(s.peek().min);
        }
    }

    public void printStack(){
        for (int i = s.size()-1; i>=0; i--) {
            System.out.println("element = " + s.elementAt(i).val + " minValue = " + s.elementAt(i).min );
        }
    }

    public static void main(String[] args) {
        GetMinStackUsingNode getMinStackUsingNode = new GetMinStackUsingNode();

        getMinStackUsingNode.minPush(18);
        getMinStackUsingNode.minPush(19);
        getMinStackUsingNode.minPush(29);
        getMinStackUsingNode.minPush(15);
        getMinStackUsingNode.minPush(16);

        getMinStackUsingNode.printStack();

        getMinStackUsingNode.getMin();
        getMinStackUsingNode.minPop();
        getMinStackUsingNode.minPop();
        getMinStackUsingNode.printStack();
        getMinStackUsingNode.getMin();
    }



}
