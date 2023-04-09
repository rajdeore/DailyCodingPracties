package ArrayPracties;

public class ArrayReverse {
    public int[] arrayReverse(int[] arr){
        int arrLength = arr.length;

        // left--->midle--->right

        for (int left=0,right= arrLength-1; left<arrLength/2 && right>arrLength/2 ; left++,right--){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
        return arr;
    }
}
