package ArrayPracties;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    //way 3: list of array
    //working
    static int[][] mergeUsingALOfArray(int[][] arr){
        Arrays.sort(arr, (a, b)->a[0]-b[0]);
        print2DArray(arr);
        System.out.println();
        ArrayList<int[]> list=new ArrayList<>();
        int s=0;
        int m=0;
        int e=1;
        while(e<arr.length) {
            if(arr[m][1]>=arr[e][0]) {
                if(arr[m][1]>=arr[e][1]){
                    e++;
                }else {
                    e++;
                    m=e-1;
                }
            }else {
                list.add(new int[]{arr[s][0],arr[m][1]});
                e++;
                m=e-1;
                s=m;
            }
        }
        list.add(new int[]{arr[s][0],arr[m][1]});

        return list.toArray(new int[list.size()][]);

    }


    //way 2: list of list
    static public ArrayList mergeUsingAL(int[][] intervals) {
        int numberOfIntervals = intervals.length;
        //resultIntervals using list of list
        ArrayList<ArrayList<Integer>> resultIntervalAL = new ArrayList<>();

        int k = 0;
        for (int i = 0; i < numberOfIntervals - 1; i++) {
            if (intervals[i][0] <= intervals[i + 1][0] && intervals[i + 1][0] <= intervals[i][1]) {
                //merge them
                //case1: (1,3) (2,4) --> (1,4)
                //resultIntervals[k][0] = intervals[i][0];
                resultIntervalAL.get(k).add(0, intervals[i][0]);
                if (intervals[i][1] <= intervals[i + 1][1]) {
                    //resultIntervals[k][1] = intervals[i + 1][1];
                    resultIntervalAL.get(k).add(1, intervals[i + 1][1]);
                    k++;
                } else { //case2: (1,5) (2,4) --> (1,5)

                    //resultIntervals[k][1] = intervals[i + 1][1];
                    resultIntervalAL.get(k).add(1, intervals[i][1]);
                    k++;
                }
                i++;
            } else { // add non-overlapping into resultIntervals
                // resultIntervals[k][0] = intervals[i][0];
                resultIntervalAL.get(k).add(0, intervals[i][0]);
                //resultIntervals[k][1] = intervals[i][1];
                resultIntervalAL.get(k).add(1, intervals[i][1]);
                k++;
            }
        }
        //for last pair
        //case 1 : last and 2nd last is overlapping---> nothing to do
        //case 2 : not overlapping --> add last pair into resultIntervals
        if (intervals[numberOfIntervals - 2][0] <= intervals[numberOfIntervals - 1][0] && intervals[numberOfIntervals - 1][0] >= intervals[numberOfIntervals - 2][1]) {
            //   resultIntervals[k][0] = intervals[(numberOfIntervals - 1)][0];
            resultIntervalAL.get(k).add(0, intervals[(numberOfIntervals - 1)][0]);
            //  resultIntervals[k][1] = intervals[(numberOfIntervals - 1)][1];
            resultIntervalAL.get(k).add(1, intervals[(numberOfIntervals - 1)][1]);
            k++;
        }

        return resultIntervalAL;
    }


    static public int[][] merge(int[][] intervals) {

        int numberOfIntervals = intervals.length;
        // resultIntervals using array
        int[][] resultIntervals = new int[3][2];
        //issue is you dont now the size of this array

        int k = 0;
        for (int i = 0; i < numberOfIntervals - 1; i++) {
            if (intervals[i][0] <= intervals[i + 1][0] && intervals[i + 1][0] <= intervals[i][1]) {
                //merge them
                //case1: (1,3) (2,4) --> (1,4)
                resultIntervals[k][0] = intervals[i][0];
                if (intervals[i][1] <= intervals[i + 1][1]) {
                    resultIntervals[k][1] = intervals[i + 1][1];
                    k++;
                } else { //case2: (1,5) (2,4) --> (1,5)

                    resultIntervals[k][1] = intervals[i][1];
                    k++;
                }
                i++;
            } else { // add non-overlapping into resultIntervals
                resultIntervals[k][0] = intervals[i][0];
                resultIntervals[k][1] = intervals[i][1];
                k++;
            }
        }
        //for last pair
        //case 1 : last and 2nd last is overlapping---> nothing to do
        //case 2 : not overlapping --> add last pair into resultIntervals
        if (intervals[numberOfIntervals - 2][0] <= intervals[numberOfIntervals - 1][0] && intervals[numberOfIntervals - 1][0] >= intervals[numberOfIntervals - 2][1]) {
            resultIntervals[k][0] = intervals[(numberOfIntervals - 1)][0];
            resultIntervals[k][1] = intervals[(numberOfIntervals - 1)][1];
            k++;
        }
        return resultIntervals;
    }

    static void print2DArray(int[][] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            System.out.print("(");
            for (int j = 0; j < givenArray[i].length; j++) {
                System.out.print(" " + givenArray[i][j] + " ");
            }
            System.out.print("), ");
        }
    }

    static void print2DArrayList(ArrayList<ArrayList<Integer>> givenArrayList) {
        for (int i = 0; i < givenArrayList.size(); i++) {
            System.out.print("(");
            for (int j = 0; j < givenArrayList.get(i).size(); j++) {
                System.out.print(" " + givenArrayList.get(i).get(j) + " ");
            }
            System.out.print("), ");
        }
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 12}, {9, 10}, {14, 15}};

        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 12}, {9, 10}, {1, 15}};
        print2DArray(intervals);
        System.out.println();
        print2DArray(mergeUsingALOfArray(intervals1));
        //print2DArrayList(mergeUsingAL(intervals));
        //print2DArray(merge(intervals1));
    }
}
