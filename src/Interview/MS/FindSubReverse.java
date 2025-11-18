package Interview.MS;

import java.util.Arrays;

public class FindSubReverse {
    public static int[] findSubArrRevers(int[] givenArr, int part) {

        for (int i = 0; i < givenArr.length - 1; i = i + part) {
            reversArray(givenArr, i, i + part - 1);
        }

        return givenArr;
    }

    //method to revers array
    public static void reversArray(int[] givenArr, int start, int end) {

        while (start <= end) {
            int temp = givenArr[start];
            givenArr[start] = givenArr[end];
            givenArr[end] = temp;

            start++;
            end--;
        }


        //return givenArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8, 9};
        int k = 4;

        int[] result = findSubArrRevers(arr, k);
        System.out.println(Arrays.toString(result));

/*        for (int i = 0; i < ; i++) {
            System.out.println(result);
        }*/


    }

}
