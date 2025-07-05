package ArrayPracties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

                        //better way
                        //List<Integer> foundTripulet1 = Arrays.asList(nums[i], nums[j], nums[k]);
                        foundTripulet.add(nums[i]);
                        foundTripulet.add(nums[j]);
                        foundTripulet.add(nums[k]);

                        Collections.sort(foundTripulet);

                        if(!resultList.contains(foundTripulet)){
                            resultList.add(foundTripulet);
                        }

                    }
                }
            }
        }

        return resultList;
    }

    public static List<List<Integer>> twoPointer(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1, k = nums.length -1;
            int sum = 0;

            while(j<k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{

                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j-1]){
                        j++;
                    }
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4 };

        //System.out.println(treeSum(arr));
        System.out.println(twoPointer(arr));

    }
}
