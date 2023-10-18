package ArrayPracties;

import java.util.HashMap;

public class MajorityElement {
    //The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();

/*        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i)>(nums.length/2)){
                return i;
            }
        }
        return 0;*/

        int i = 0;
        while (i < nums.length){
            if (record.containsKey(nums[i])){
                record.put(nums[i], (record.get(nums[i]) + 1) );
            }else{
                record.put(nums[i], 1 );
            }
            i++;
        }


        for ( int key: record.keySet()) {
           // System.out.println(key + " : " + record.get(key));
            if (record.get(key) > (nums.length/2)){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] givenArray = {3, 2, 3, 1};
        System.out.println(majorityElement(givenArray));
    }
}
