package JavaConceptPracties.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Arrays.asList(1,3,4);
        System.out.println(list.toString());
        list.set(1, 2);
        System.out.println(list.toString());

        Iterator<Integer> itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

            //itr = itr.next();
        }

        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        for (int num :
             array) {
            System.out.print( num + " ");
        }

        Thread childThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am Child Thread" + i );
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        childThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("I am main thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        childThread.join();

    }
}
