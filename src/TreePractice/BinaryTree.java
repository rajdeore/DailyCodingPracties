package TreePractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node {
        int data;
        Node left;
        Node right;
        int height;

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }

        public Node(Node left, int data, Node right, int height) {
            this.left = left;
            this.data = data;
            this.right = right;
            this.height = height;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;


    //*********************display**********************************

    public void display() {
        if (this.root == null) {
            System.out.println("empty");
        }
        display(this.root, " ");
    }

    private static void display(Node root, String indent) {
        if (root == null) {
            return;
        }
        System.out.println(indent + root.data);
        display(root.left, indent + "\t");
        display(root.right, indent + "\t");
    }


    //**********************Insertion****************

    //Will work for binary search tree only.

    private Node insertIntoTree(Node head, int value) {
        //Node newNode = new Node(value);

        if (head.left == null) {
            head.left = new Node(value);
            return head;
        }
        if (head.right == null) {
            head.right = new Node(value);
            return head;
        }

        insertIntoTree(head.left, value);
        insertIntoTree(head.right, value);


        return head;

    }


    //************************Populate the tree*********************

    //Will ask for every node.
    // if you want to fill on left of node
    // and then for right of node

    private void populate(Scanner scanner){
        System.out.println("Enter the root Node : " );
        int value = scanner.nextInt();
        //Node root = new Node(value);
        this.root = new Node(value);
        populate(scanner, root);


    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to add left-node to " + node.data);
        boolean left = scanner.nextBoolean();

        if(left){
            System.out.println("Enter the value for left-Node : " );
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);

        }

        System.out.println("Do you want to add right-node to " + node.data);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value for right-Node : " );
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }


    //******************************find Node**********************************

    public static Node findNode(Node root, int target) {
        if (root == null) {
            return null;
        }

        if (root.data == target) {
            return root;
        }

        //go to left
        Node leftResult = findNode(root.left, target);
        if (leftResult != null)
            return leftResult;

        return findNode(root.right, target);
    }


    public static boolean hasPathSum(Node root, int targetSum){

        int sum = 0;
        Queue<Node> visited  = new LinkedList<>();

        boolean result = helper(root, targetSum, sum, visited);
        return  result;

    }

    private static boolean helper(Node root, int targetSum, int sum, Queue<Node> visited) {
        if(root.left == null && root.right == null && sum % targetSum == 0 ){
            return  true;
        }
        if(root.left !=  null){
            visited.add(root.left);
        }
        if(root.right != null){
            visited.add(root.right);
        }
        if(!visited.isEmpty()) {
            sum += root.data;
            root = visited.remove();
        }
        return helper(root, targetSum, sum, visited);
    }


    //**************************************Main*************************************
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        binaryTree.populate(scanner);
        binaryTree.display();


    }

}
