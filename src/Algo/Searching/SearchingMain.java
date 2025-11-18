package Algo.Searching;

import java.util.Arrays;

public class SearchingMain {
    public static void main(String[] args) {

        int tempArr[] = {1, 8, 2, 3, 7, 4, 5};
        int ascArr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int desArr[] = {8, 7, 6, 5, 4, 3, 2, 1};


        //________________START of BinarySearch____________________________//

        BinarySearch binarysearch = new BinarySearch();

        // int matchFoundResult = binarysearch.binarySearch(ascArr, 4 );

        int matchFoundResult = BinarySearch.binarySearchUsingIteration(ascArr, 4);
        if(matchFoundResult == -1){
            System.out.println("Number is not in array");
        }else{
            System.out.println("Number is present at : " + (matchFoundResult+1) );
        }

        //________________END of BinarySearch____________________________//




        //___________________START of LinearSearch____________________________//
/*
        LinerSearch linersearch  = new LinerSearch();
        int matchFoundResult = linersearch.linerSearch(tempArr, 4);
        if(matchFoundResult == -1){
            System.out.println("Number is not in array");
        }else{
            System.out.println("Number is present at : " + matchFoundResult );
        }
*/

        //___________________END of LinearSearch____________________________//

        //___________________START of SearchIn2DArray____________________________//
 /*
        int[][] given2D = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int[] result = SearchIn2DArray.searchIn2DArray(given2D, 34);

        System.out.println(Arrays.toString(result));
*/
        //___________________END of SearchIn2DArray____________________________//
    }
}
