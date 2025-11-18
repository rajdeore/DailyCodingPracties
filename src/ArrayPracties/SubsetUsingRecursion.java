package ArrayPracties;

public class SubsetUsingRecursion {


    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        printSubsets(arr, 0 , "");

    }
    public static void printSubsets(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println("{" + current + "}");
            return;
        }

        // Include the current element
        printSubsets(arr, index + 1, current + arr[index] + " ");

        // Exclude the current element
        printSubsets(arr, index + 1, current);
    }
}
