package JavaConceptPracties.MultiThreadingPractice.CallableDemo;

import java.util.concurrent.*;

public class demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> task = () -> {
            System.out.println("Hi, i am in other thread");
            Thread.sleep(100);
            System.out.println("Hi, i am in other thread");
            return 10;
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> result = executor.submit(task);
        System.out.println("Hi, i am in main  thread");
        System.out.println(result.get());
        executor.shutdown();
    }
}
