package JavaConceptPracties.rough;

import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenAdditionUsingThread {
    public static void main(String[] args) {
        int[] givenArray = new int[100];

        for (int i = 0; i < 100; i++) {
            givenArray[i] = i+1;
        }

        AtomicInteger oddAdd = new AtomicInteger();
        AtomicInteger evenAdd = new AtomicInteger();

        Thread oddAddition = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (givenArray[i] % 2 == 0){
                    oddAdd.addAndGet(givenArray[i]);
                }
            }
        });

        Thread evenAddition = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (givenArray[i] % 2 != 0){
                    evenAdd.addAndGet(givenArray[i]);
                }
            }
        });

        oddAddition.start();
        evenAddition.start();


        try {
            oddAddition.join();
            evenAddition.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sum of odd numbers: " + oddAdd.get());
        System.out.println("Sum of even numbers: " + evenAdd.get());

    }
}
