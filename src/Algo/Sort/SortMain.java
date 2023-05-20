package Algo.Sort;

public class SortMain {

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {

        int tempArr[] = {1, 8, 2, 3, 7, 4, 5};
        int ascArr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int desArr[] = {8, 7, 6, 5, 4, 3, 2, 1};

        //________________START of BubbleSort____________________//
/*
        int resultArr[] = new int[tempArr.length];
        BubbleSort bubblesort = new BubbleSort();
        System.out.println("tempArr before sorting : " );
        printArray(tempArr);
        resultArr = bubblesort.bubbleSort(tempArr);
        System.out.println("tempArr after sorting : " );
        printArray(resultArr);
*/
        //________________END of BubbleSort____________________//




        //_________________START of CountSort______________________//
/*
        int givenRange = 6;
        int[] givenArray = {5, 1, 2, 4, 2, 1, 3};
        printArray(givenArray);

        CountSort countsort = new CountSort();
        givenArray = countsort.countSort(givenArray,givenRange);
        System.out.println();
        printArray(givenArray);
*/
        //_________________END of CountSort______________________//



        //__________________START of InsertionSort__________________//
/*
        InsertionSort insertionsort = new InsertionSort();
        printArray(ascArr);
        ascArr = insertionsort.insertionSort(ascArr);
        System.out.println("resutl after sorting");
        printArray(ascArr);
*/
        //__________________END of InsertionSort__________________//

    }
}
