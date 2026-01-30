package JavaConceptPracties.MultiThreadingPractice.TwoPower;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<TwoPower> task = Arrays.asList(new TwoPower(1, 3),
                new TwoPower(4, 6),
                new TwoPower(7, 9)
        );


        List<Future<Long>> results = executor.invokeAll(task);

        Long finalSum = 0L;
        for(Future<Long> result : results){
            finalSum += result.get();
        }
        System.out.println("finalSum : " +  finalSum);

        executor.shutdown();


    }





}
