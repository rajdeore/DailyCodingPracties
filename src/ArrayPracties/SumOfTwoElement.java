package ArrayPracties;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoElement {
    // find the position if elements of Array whose sum is given number
    // input : 1. Int Array 2. int number
    // o/p : Int Array of position of elements

    static int[] findElementOfSumBrute(int[] givenArray, int givenNumber){
        int[] locationOfElements = new int[2];
        for (int i = 0; i < givenArray.length-1; i++) {
            for (int j = i+1; j < givenArray.length; j++) {
                if(givenArray[i] + givenArray[j] == givenNumber){
                    locationOfElements[0] = i;
                    locationOfElements[1] = j;
                    return locationOfElements;
                }
            }
        }
        return locationOfElements;
    }

    //Using HashMap
    static int[] findElementOfSumUsingMap(int[] givenArray, int givenNumber){
       // int[] locationOfElements = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < givenArray.length; i++) {
            int complimentary = givenNumber - givenArray[i];

            if(numMap.containsKey(complimentary)){
                return new int[]{numMap.get(complimentary), i};
            }
            numMap.put(givenArray[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] givenArray = {2,11,15,7};
        int number = 9;

       // int [] result = findElementOfSumBrute(givenArray, number);
        int [] result = findElementOfSumUsingMap(givenArray, number);

        System.out.println(result[0]+1 + ", " +  (result[1]+1));
/*        for (int E: result) {
            System.out.print(E+1 + ", ");
        }*/
    }
}
