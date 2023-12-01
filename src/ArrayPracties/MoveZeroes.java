package ArrayPracties;

import java.util.Arrays;

public class MoveZeroes {

    public static int[] moveZeroesUsingExtraArray(int[] givenArray) {
        int[] resultArray = new int[givenArray.length];
        int i = 0;
        for (int element :
                givenArray) {
            if (element != 0) {
                resultArray[i] = element;
                i++;
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] givenArray = {0, 1, 0, 3, 12, 0};
        System.out.println(Arrays.toString((moveZeroesUsingExtraArray(givenArray))));
    }
}
