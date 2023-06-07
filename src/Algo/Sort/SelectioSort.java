package Algo.Sort;

public class SelectioSort {

    void selectionSortMethod(int [] GivenArray){
        int GivenArrayLen = GivenArray.length;

        for(int i=0; i < GivenArrayLen-1; i++ ) {
            int min_ind = i;
            int temp;

            for (int j=i; j < GivenArrayLen; j++){
                if(GivenArray[j] < GivenArray[min_ind]){
                    min_ind = j;
                }
             //swap the ith element with founded min_ind elemen
            temp = GivenArray[min_ind];
            GivenArray[min_ind]  = GivenArray[i];
            GivenArray[i] = temp;
            }
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        SelectioSort selectioSort = new SelectioSort();
        int arr1[] = {64,25,12,22,11};
        selectioSort.printArray(arr1);
        selectioSort.selectionSortMethod(arr1);
        System.out.println("Sorted array");
        selectioSort.printArray(arr1);
    }

}
