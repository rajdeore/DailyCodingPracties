package Algo.Searching;

public class BinarySearch {

    public int binarySearch(int[] arr, int number,int low, int high){

        int mid = (low+high)/2;
        //main logic
        if (arr[mid] == number){
            return mid;
        } else if (arr[mid] < number) {
            binarySearch(arr, number, mid+1, high);
        }
        else {
            binarySearch(arr, number, low, mid-1);
        }

        return -1;
    }
}
