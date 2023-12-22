package Algo.Sort;

public class InsertionSort {
    public int[] insertionSort(int[] arr){
        int arrLength = arr.length;

/*        for (int i=1; i<arrLength; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                else{
                    break;
                }
            }
        }*/
        for (int i=0; i<arrLength-1; i++){
            for(int j=i; j<arrLength-(i+1); j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                else{
                    break;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {

    }
}
