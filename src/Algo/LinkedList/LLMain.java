package Algo.LinkedList;

public class LLMain {
    public static void main(String[] args) {
        LL newLL = new LL();

        newLL.insertForFront(10);
        newLL.insertForFront(20);
        newLL.insertForFront(30);
        newLL.insertForFront(40);
        newLL.insertForFront(50);
        newLL.displayList();

        newLL.insertByPosition(7, 100);
       // newLL.insertByPosition(4, 35);
        newLL.displayList();

    }
}
