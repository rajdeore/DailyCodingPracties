package ArrayPracties;

import java.util.Arrays;

public class LongestFreeTime {


    public static void main(String[] args) {
        int[] start = new int[] { 0,2,9};
        int[] end = new int[] {1,4,10};
        int total = 5;

        //System.out.println(Arrays.toString(start));
        int result = findLargestFreTime(start, end, total);
        System.out.println(result);
    }

    private static int findLargestFreTime(int[] start, int[] end, int total) {

        int max = start[0];
        for (int i = 1; i < start.length; i++) {
            max = Math.max(max, start[i] - end[i-1] );
        }

        return max;
    }
}
