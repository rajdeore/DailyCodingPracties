package ArrayPracties;

public class RemoveDuplicatesfromSortedArrayII80 {
    public int removeDuplicates(int[] nums) {
        int j = 0, i= 0;
        while( i<nums.length){
            int curNum = nums[i], count = 2;
            while(nums[i] == curNum ){
                if(count > 0){
                    nums[j] = nums[i];
                    j++;
                    count--;
                }
                i++;
                if(i >= nums.length )
                    break;
            }
        }
        return j;
    }

    public int removeDuplicatesTricky(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int k = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[ ] givenArr = {0,0,1,1,1,1,2,3,3};
        RemoveDuplicatesfromSortedArrayII80 temp = new RemoveDuplicatesfromSortedArrayII80();
        int result = temp.removeDuplicatesTricky(givenArr);
        System.out.println(result);
    }
}
