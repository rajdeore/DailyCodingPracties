package ArrayPracties;

public class ArrayReverse {
    public int[] arrayReverseUsingBigO_N(int[] arr){
        int arrLength = arr.length;

        // left--->midle--->right

        for (int left=0,right= arrLength-1; left<arrLength/2 && right>arrLength/2 ; left++,right--){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
        return arr;
    }


    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int tempArr[] = {1, 8, 2, 3, 7, 4, 5};

        ArrayReverse obj = new ArrayReverse();
        tempArr = obj.arrayReverseUsingBigO_N(tempArr);
        printArray(tempArr);
    }
}
