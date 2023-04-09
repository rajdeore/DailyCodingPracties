package ArrayPracties;

public class Sort012Element {

    public int[] sortUsingCount(int[] arr){
        int arrLength = arr.length;
        //count occurrence of 0, 1, 2

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for(int i=0; i<arrLength; i++){
            switch (arr[i]){
                case 0:
                    zeroCount++;
                    break;
                case 1:
                    oneCount++;
                    break;
                case 2:
                    twoCount++;
                    break;
            }
        }

        // now create array using occurrence
        int [] tempArr = new int[arrLength];
        for(int i=0; i<zeroCount; i++){
            tempArr[i] = 0;
        }
        for (int i=zeroCount; i< zeroCount+oneCount; i++){
            tempArr[i] = 1;
        }

        for (int i=zeroCount+oneCount; i<arrLength; i++){
            tempArr[i] = 2;
        }

        return tempArr;
    }
}
