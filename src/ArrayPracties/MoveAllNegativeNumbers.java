package ArrayPracties;

public class MoveAllNegativeNumbers {
    //int GIVEN_ARRAY[] = {-12, 11, -13, -5, 6, -7};

    public int[] MovingAllNEgativetiveNumber(int [] GivenArray){
        int ArrayLength = GivenArray.length;

        int i=0, j=ArrayLength-1;

        while (i<j){

            if((GivenArray[i] > 0) && (GivenArray[j] < 0)){
                int temp = GivenArray[i];
                GivenArray[i] = GivenArray[j];
                GivenArray[j] = temp;
                i++;
                j--;
            }

            if(GivenArray[i] < 0){
                i++;
            }
            if(GivenArray[j] > 0){
                j--;
            }


        }

        return GivenArray;

    }



    public static void main(String[] args) {
        MoveAllNegativeNumbers moveAllNegativeNumbers = new MoveAllNegativeNumbers();
        //int GIVEN_ARRAY[] = {-12, 11, -13, -5, 6, -7};
        int GIVEN_ARRAY[] = {12, 11, 13, 5, 6, 7};
/*        System.out.println(moveAllNegativeNumbers.GIVEN_ARRAY[1]);*/
        int[]  resultArray = moveAllNegativeNumbers.MovingAllNEgativetiveNumber(GIVEN_ARRAY);

        for(int a : resultArray){
            System.out.print(a + " ");
        }

    }
}
