package Algo.Sort;

public class CountSort {
    static int[] countSort(int arrayToSort[], int range){
        int arrayLength = arrayToSort.length;

        //to record occurrence
        int [] occurrenceRecord = new int[range];

        for(int elementOfArrayToSort : arrayToSort){
            if(occurrenceRecord[elementOfArrayToSort] == 0) {
                occurrenceRecord[elementOfArrayToSort] += 1;
            }else {
                occurrenceRecord[elementOfArrayToSort]++;
            }
        }
   //   printArray(occurrenceRecord);

        int flag = 0;
        int occurrence;
        //for(int occurrence : occurrenceRecord){
          for(int i=0; i<range; i++){
              occurrence = occurrenceRecord[i];
            for(int j=flag; j<flag+occurrence;j++){
                arrayToSort[j] = i;
            }
            flag = flag + occurrence;
        }

        return arrayToSort;
    }

    static void printArray(int [] Array){
        for(int elements : Array){
            System.out.print(elements + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int givenRange = 6;
        int[] givenArray = {5, 1, 2, 4, 2, 1, 3};
        printArray(givenArray);
        givenArray = countSort(givenArray,givenRange);
        printArray(givenArray);


    }
}
