package ArrayPracties;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum15 {

    public static List<List<Integer>> treeSum(int[] nums){
        List<List<Integer>> resultList = new ArrayList<>();

        int numsLen = nums.length;

        for (int i = 0; i <= numsLen-3 ; i++) {
            for (int j = i+1; j <= numsLen-2; j++) {
                for (int k = j+1; k <= numsLen-1 ; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> foundTripulet = new ArrayList<Integer>();
                        foundTripulet.add(nums[i]);
                        foundTripulet.add(nums[j]);
                        foundTripulet.add(nums[k]);
                        resultList.add(foundTripulet);
                    }
                }
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0 };

        System.out.println(treeSum(arr));

    }
}
