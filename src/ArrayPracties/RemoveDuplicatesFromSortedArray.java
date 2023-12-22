package ArrayPracties;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int locationHolder=0;
        int finder = 0;

        while (finder < len){

            if(nums[locationHolder] == nums[finder]){
                finder++;
            } else{
                int temp = nums[locationHolder + 1];
                nums[locationHolder + 1] = nums[finder];
                nums[finder] = temp;

                finder++;
                locationHolder++;
            }
        }
       return locationHolder +1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] givenArray = {0, 0, 1, 1, 1, 3, 3, 3};
        int[] givenArray1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(obj.removeDuplicates(givenArray1));
    }
}
