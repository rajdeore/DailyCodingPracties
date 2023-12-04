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

    public static int[] moveZeroesUsingTwoPointer(int[] givenArray){
        if(givenArray.length == 1){
            return givenArray;
        }
        int i = 0, j=1;
        int len = givenArray.length;

        while(i<len-1 && j<len){
            if(givenArray[i] == 0 && givenArray[j] == 0){
                j++;
            } else if (givenArray[i] != 0 && givenArray[j] == 0) {
                i++;
            } else if (givenArray[i] == 0 && givenArray[j] != 0) {
                int temp = givenArray[i];
                givenArray[i] = givenArray[j];
                givenArray[j] = temp;
                i++;
                j++;
            }else{
                i++;
                j++;
            }

        }
        return givenArray;
    }

    public static void main(String[] args) {
        int[] givenArray = {0, 1, 0, 3, 12, 0};
        //System.out.println(Arrays.toString((moveZeroesUsingExtraArray(givenArray))));
        System.out.println(Arrays.toString(moveZeroesUsingTwoPointer(givenArray)));
    }
}
