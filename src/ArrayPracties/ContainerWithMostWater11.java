package ArrayPracties;

import java.util.HashSet;

public class ContainerWithMostWater11 {

    public static int findContainerWithMostWater(int[] givenContainer) {
        int maxCapacity = 0;
        int lenGivenContainer = givenContainer.length;

        for (int i = 0; i < lenGivenContainer - 1; i++) {
            for (int j = i + 1; j < lenGivenContainer; j++) {
                int cap = (j - i) * (givenContainer[i] > givenContainer[j] ? givenContainer[j] : givenContainer[i]);
                if (cap > maxCapacity) {
                    maxCapacity = cap;
                }
            }
        }

        return maxCapacity;
    }

    public static int maxArea(int[] height) {

        int start = 0, end = height.length - 1, max = 0;

        while (start < end) {
            int water = (end - start) * (Math.min(height[start], height[end]));

            max = Math.max(water, max);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }


        }

        return max;
    }

    public static void main(String[] arg) {
        int[] givenContainerArray = {3, 1, 2, 4, 5};
        // System.out.println(givenContainerArray[2]);
        int result = findContainerWithMostWater(givenContainerArray);
        System.out.println("result = " + result);

        int resultMaxArea = maxArea(givenContainerArray);
        System.out.println("resultMaxArea = " + resultMaxArea);
    }
}
