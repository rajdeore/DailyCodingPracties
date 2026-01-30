package JavaConceptPracties.rough.LRUImplementation;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LRUImp lru = new LRUImp(3);
        lru.addElement(1);
        lru.addElement(2);
        lru.addElement(3);
        lru.addElement(1);
        lru.addElement(5);

        System.out.println(lru.toString());


    }
}
