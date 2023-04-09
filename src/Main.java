import ArrayPracties.Sort012Element;

public class Main {
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
        String str = "raaj";


        //sort 0, 1, 2 element in ascending order
        Sort012Element sort012Element = new Sort012Element();
        printArray(element012sorting);
        element012sorting = sort012Element.sortUsingCount(element012sorting);
        System.out.println("result after sorting");
        printArray(element012sorting);


        //Instertion sort
/*        InsertionSort insertionsort = new InsertionSort();
        printArray(ascArr);
        ascArr = insertionsort.insertionSort(ascArr);
        System.out.println("resutl after sorting");
        printArray(ascArr);*/



        //isUniqe string using hashmap
/*        IsUnique isunique = new IsUnique();
        @SuppressWarnings("SpellCheckingInspection") boolean resultuniqe = isunique.hashMapIsUnique(str);
        System.out.println(resultuniqe);*/

        //isUniqe string using bruteforce
/*        IsUnique isunique = new IsUnique();
        boolean resultuniqe = isunique.bruteForceIsUnique(str);
        if(resultuniqe){
            System.out.println("string is uniqe!! : " + resultuniqe);
        }
        else{
            System.out.println("string is uniqe!! : " + resultuniqe);
        }*/

        //binary Search
/*        BinarySearch binarysearch = new BinarySearch();
        int low = 0;
        int high = tempArr.length -1;
        int matchFoundResult = binarysearch.binarySearch(ascArr, 4, low, high );
        if(matchFoundResult == -1){
            System.out.println("Number is not in array");
        }else{
            System.out.println("Number is present at : " + matchFoundResult );
        }*/
     //Linear Search
/*        LinerSearch linersearch  = new LinerSearch();
        int matchFoundResult = linersearch.linerSearch(tempArr, 4);
        if(matchFoundResult == -1){
            System.out.println("Number is not in array");
        }else{
            System.out.println("Number is present at : " + matchFoundResult );
        }*/

    // Array reverse using 2 pointer
/*    ArrayReverse obj = new ArrayReverse();
    tempArr = obj.arrayReverse(tempArr);
    printArray(tempArr);*/


    // Array reveres using stack
/*        ArrayReverseUsingStack arrayreverseusingstack = new ArrayReverseUsingStack();
        tempArr = arrayreverseusingstack.arrayReverseUsingStack(tempArr);
        printArray(tempArr);*/

    // String reverse using str --> charArray --> str
/*        StringReverseUsingPointer stringreverseusingpointer = new StringReverseUsingPointer();
        str = stringreverseusingpointer.stringReverseUsingPointer(str);
        System.out.println("Revers string = " + str);*/

    // Ispalindrome
/*        IsPalindrom ispalindrom = new IsPalindrom();
        int resultPalindrome = ispalindrom.isPalindrome("abba");

        String result = (resultPalindrome == 1) ? "yes it is palindrome" : "not a palindrome";
        System.out.println("resultPalindrome = " + result);*/

      //bubbleSort
/*        int resultArr[] = new int[tempArr.length];
        BubbleSort bubblesort = new BubbleSort();
        System.out.println("tempArr before sorting : " );
        printArray(tempArr);
        resultArr = bubblesort.bubbleSort(tempArr);
        System.out.println("tempArr after sorting : " );
        printArray(resultArr);*/

    }
}