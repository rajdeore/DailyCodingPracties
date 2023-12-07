package ArrayPracties;


public class PlusOne {
    //Increment the large integer by one and return the resulting array of digits.
/*    Input: digits = [1,2,3]
    Output: [1,2,4]
*/

    //way-1 : in space
    static int[] findPlusOne(int[] givenArray){

        int len = givenArray.length;
        for (int i = len-1; i >= 0; i--) {
            if (givenArray[i] < 9){
                givenArray[i] += 1;
                return givenArray;
            }else{
                givenArray[i] = 0;
            }
        }
        int[] resultArray = new int[len+1];
        resultArray[0] = 1;
        return resultArray;
    }

    //way-2 : convert array to number and then number to array
    static int[] findPlusOneWay2(int[] givenArray){
        //convert array to number
        long convertedNumber;
        convertedNumber  = arrayToNumber(givenArray);
        //add 1 to it
        convertedNumber += 1;

        //convert number to array
        int[] resultArray;
        resultArray = intToArray(convertedNumber);
        return resultArray;
    }

    static long arrayToNumber(int[] givenArray){
        int len = givenArray.length;
        long num = 0;

        for(int i=0;i<len;i++){
            num += givenArray[i] * (Math.pow(10, len-1-i));
        }
        return num;
    }
    static int[] intToArray(long givenNumber){
        String str = Long.toString(givenNumber);
        int len = str.length();
        int [] resultArray = new int[len];
        for(int i=0; i<len; i++){
            resultArray[i] = ((int) str.charAt(i)) - 48;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int [] givenArray1 = {1, 2, 3, 9};
        int[] givenArray = {9,8,7,6,5,4,3,2,1,0};
        int[] givenArray2 = {9, 9, 9, 9};

        int[] resultArray;

        //way - 2
        resultArray = findPlusOneWay2(givenArray2);
        for (int j : resultArray) {
            System.out.println(j);
        }

        //way - 1
        resultArray = findPlusOne(givenArray2);
        for (int j : resultArray) {
            System.out.println(j);
        }
    }
}
