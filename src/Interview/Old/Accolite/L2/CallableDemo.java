package Interview.Old.Accolite.L2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LRUCache {
    public Set<Integer> cache;
    public int curCap;


    public LRUCache(int capacity) {
        cache = new LinkedHashSet<>(capacity);

    }

    public int get(int key) {
       // int val = cache.getOrDefault(key, -1);
/*        if(val != -1) {
            remove(key);
        }
        put(key, val);
        return val;*/
        return 0;
    }

    private void remove(int key) {
            cache.remove(key);
    }

    public void put(int key, int value) {/*
        if(cache.size() > curCap){
            cache;
        }else{
            remove();
        }*/
    }
}

class Demo implements Callable{

    @Override
    public Object call() throws Exception {
        Integer result = 0;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        return result;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> demo = () -> {
            return 10;
        };

        Callable demo2 = new Demo();




        ExecutorService t1 = Executors.newSingleThreadExecutor();
        System.out.println(t1.submit(demo).get());
        t1.shutdown();

        ExecutorService t2 = Executors.newSingleThreadExecutor();
        System.out.println(t2.submit(demo2).get());
        t2.shutdown();





    }
}
