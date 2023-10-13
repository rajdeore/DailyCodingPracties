package ArrayPracties;

public class ProductExceptSelf {

    static public int[] getProductExceptSelfUsingBF(int[] givenArray) {
        int[] resultArray = new int[givenArray.length];

        for (int j = 0; j < givenArray.length; j++) {
            int tempMult = 1;
            for (int i = 0; i < givenArray.length; i++) {
                if (i != j) {
                    tempMult *= givenArray[i];
                }
            }
            resultArray[j] = tempMult;
        }
        return resultArray;
    }

    static int[] getProductExceptSelfUsingdivid(int[] nums) {

        //to cal multiply of all
        // corner case-1 : givenArray will have zero.
        //case-2 : number of zero more then 1


        

        // O(n) time complexity
        int numsLength = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[numsLength];
        for(int i = 0; i < numsLength; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        for(int i = numsLength-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int tempArr[] = {1, 2, 0, 3, 4};
/*        tempArr = getProductExceptSelfUsingBF(tempArr);
        System.out.println();*/
        for (int a : tempArr) System.out.print(a + " ");
        tempArr = getProductExceptSelfUsingdivid(tempArr);
        System.out.println();
        for (int a : tempArr) {
            System.out.print(a + " ");
        }

    }
}
