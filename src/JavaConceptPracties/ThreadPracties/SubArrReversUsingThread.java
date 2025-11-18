package JavaConceptPracties.ThreadPracties;

import java.util.Arrays;

public class SubArrReversUsingThread{
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8, 9};
        int k = 4;
        int n = arr.length;
        int numOfWorker = arr.length / k;
        Thread[] worker = new Thread[numOfWorker];

        for (int i = 0; i < arr.length - 1; i = i + k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1); // handle last chunk

            Thread thread = new Thread(() -> reverse(arr, start, end));
            thread.start();

            worker[i / k] = thread;
        }

        for (Thread t : worker) {
            if (t != null) t.join();
        }

        //int[] result = findSubArrRevers(arr, k);
        //System.out.println(Arrays.toString(result));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
