package ArrayPracties;

public class RemoveElement {
    /*
    * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    * The order of the elements may be changed.
    *  Then return the number of elements in nums which are not equal to val.
    *
    * */

    //way 1: find the "val, and take it at the jth position
    // i while search for "val" and j will have 1st poistion of the last Non-val element.
    static public int removeElement(int[] nums, int val){
        int len = nums.length;
        int i=0;
        int j=len-1;

        while(nums[j] == val){
            if(j == 0){
                return 0;
            }
            j--;

        }

        while(i<j){
            if(nums[i] == val){
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
                while(nums[j] == val){
                    j--;
                }
            }else{
                i++;
            }
        }

        return j+1;
    }


    /*
    * way 2 : find the first non-val element and place it at "index" position
    * i-pointer will find next non-val element
    * index : placing position
    *  */
    static public int removeElementWay2(int[] nums, int val) {
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }
    public static void main(String[] args) {
        int[] givenArray = {3, 2, 2, 3};
        int[] givenArray1 = {0,1,2,2,3,0,4,2};
        int[] givenArray2 = {2, 2, 2, 2, 2};
        int[] givenArray3 = {4, 5};

        System.out.println(removeElement(givenArray, 3));
        System.out.println(removeElement(givenArray1, 2));
        System.out.println(removeElement(givenArray2, 2));
        System.out.println(removeElement(givenArray3, 4));


        System.out.println(removeElementWay2(givenArray, 3));
        System.out.println(removeElementWay2(givenArray1, 2));
        System.out.println(removeElementWay2(givenArray2, 2));
        System.out.println(removeElementWay2(givenArray3, 4));
    }
}
