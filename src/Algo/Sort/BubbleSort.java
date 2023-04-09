package Algo.Sort;

public class BubbleSort {

    public int[] bubbleSort(int[] arr){
        int arrLength = arr.length;

        for(int i=0; i<arrLength; i++){
            for(int j=0; j<arrLength-(i+1); j++){
                //swap
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;

    }

}
