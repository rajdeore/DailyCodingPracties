package TreePractice;

public class BST {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        //constructor

        public Node(int value) {
            this.value = value;
        }

        //getter

        public int getValue() {
            return value;
        }

        public int getHeight() {
            return height;
        }
    }
    private Node root;

    public boolean isEmpty(Node root){
        if(root == null)
            return true;
        return false;
    }

    public int height(Node node){
        if(node == null)
            return -1;
        return node.getHeight();
    }

    public void display(){
        if(root == null){
            System.out.println("Empty tree");
            return;
        }
        display(root , "Root Node : ");
    }

    private void display(Node root, String details ) {
        if(root == null){
            return;
        }


        System.out.println(details + root.getValue());
        display(root.left, " left node of node : " + root.getValue() + " : ");
        display(root.right, " right node of node : " + root.getValue() + " : ");
    }

    public void insert(int data){
        root = insert(root, data);
    }

    public Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(node.getValue() >= data){
            node.left = insert(node.left, data);
        }else{
            node.right = insert(node.right, data);
        }
        node.height = Math.max(height(node.left), height( node.right)) + 1;

        return node;
    }

    public void populate(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }


    //   ***************************Traversing***********************************************
    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) {
        if(node == null){
            return;
        }
        System.out.println(node.getValue());
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node == null){
            return;
        }
        System.out.println(node.getValue());
        inOrder(node.left);
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node) {
        if(node == null){
            return;
        }
        System.out.println(node.getValue());
        postOrder(node.left);
        postOrder(node.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.display();

        tree.populate(new int[] {15, 10, 20, 5, 12, 6, 16});

/*        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(12);
        tree.insert(6);*/
        tree.display();

        tree.preOrder();
    }
}
