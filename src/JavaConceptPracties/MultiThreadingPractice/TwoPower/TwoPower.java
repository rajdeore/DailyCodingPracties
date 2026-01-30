package JavaConceptPracties.MultiThreadingPractice.TwoPower;

import java.util.concurrent.Callable;

public class TwoPower implements Callable<Long> {
    private int start;
    private int end;

    public TwoPower(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() {
        long sum = 0;
        for(int i = start; i <= end; i++){
            sum += (long) Math.pow(i, 2);
        }
        return sum;
    }
}
