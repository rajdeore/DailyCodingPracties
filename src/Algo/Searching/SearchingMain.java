package Algo.Searching;

public class SearchingMain {
    public static void main(String[] args) {

        int tempArr[] = {1, 8, 2, 3, 7, 4, 5};
        int ascArr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int desArr[] = {8, 7, 6, 5, 4, 3, 2, 1};


        //________________START of BinarySearch____________________________//
/*        BinarySearch binarysearch = new BinarySearch();
        int low = 0;
        int high = tempArr.length -1;
        int matchFoundResult = binarysearch.binarySearch(ascArr, 4, low, high );
        if(matchFoundResult == -1){
            System.out.println("Number is not in array");
        }else{
            System.out.println("Number is present at : " + (matchFoundResult+1) );
        }
 */
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
    }
}
