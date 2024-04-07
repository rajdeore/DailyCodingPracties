package ArrayPracties;

import ArrayPracties.Sort012Element;

public class ArrayPractiesMain {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {

        int tempArr[] = {1, 8, 2, 3, 7, 4, 5};
        int ascArr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int desArr[] = {8, 7, 6, 5, 4, 3, 2, 1};
        int element012sorting[] = {0, 0, 1, 0, 0 };//{0, 1, 1, 2, 0, 2};



        //_______________________________START of ArrayReverse______________________//
        // Array reverse using 2 pointer
/*
        ArrayReverse344 obj = new ArrayReverse344();
        tempArr = obj.arrayReverse(tempArr);
        printArray(tempArr);
 */

        //_______________________________END of ArrayReverse______________________//




        //_______________________________START of ArrayReverseUsingStack______________________//
        // Array reveres using stack
/*
        ArrayReverseUsingStack arrayreverseusingstack = new ArrayReverseUsingStack();
        tempArr = arrayreverseusingstack.arrayReverseUsingStack(tempArr);
        printArray(tempArr);
*/

        //_______________________________END of ArrayReverseUsingStack______________________//




        //__________________________START of Sort012Elements______________________________//
        //sort 0, 1, 2 element in ascending order

        Sort012Element sort012Element = new Sort012Element();
        printArray(element012sorting);
        element012sorting = sort012Element.sortUsingCount(element012sorting);
        System.out.println("result after sorting");
        printArray(element012sorting);

        //__________________________END of Sort012Elements______________________________//

    }
}