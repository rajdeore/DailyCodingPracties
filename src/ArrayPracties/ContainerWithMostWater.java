package ArrayPracties;

import java.util.HashSet;

public class ContainerWithMostWater {

    public static int findContainerWithMostWater(int[] givenContainer){
        int maxCapacity = 0;
        int lenGivenContainer = givenContainer.length;

        for (int i = 0; i < lenGivenContainer-1; i++) {
            for (int j = i+1; j < lenGivenContainer; j++) {
                int cap  = (j - i) * (givenContainer[i] > givenContainer[j] ? givenContainer[j] : givenContainer[i]);
                if (cap > maxCapacity){
                    maxCapacity = cap;
                }
            }
        }

        return maxCapacity;
    }

    public static void main(String[] arg){
        int[] givenContainerArray = {3, 1, 2, 4, 5};
       // System.out.println(givenContainerArray[2]);
        int result = findContainerWithMostWater(givenContainerArray);
        System.out.println("result = " + result);

        HashSet hashSet = new HashSet();

    }
}
