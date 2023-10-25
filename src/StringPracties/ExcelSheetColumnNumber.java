package StringPracties;

public class ExcelSheetColumnNumber {
    /*
     Given a string columnTitle that represents the column title as appears in an Excel sheet,
     return its corresponding column number.
        For example:
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28
      */

    /*
    * things learned
    * 1. to print asci value of char = (int) 'A'
    * */

    static int solutionByBruteForce(String givenInput){
        int intValue = 0;
        int sLen = givenInput.length();
        int j = 0;

        for (int i = sLen-1; i >=0 ; i--) {
            //intValue = ((int) givenInput.charAt(i)) - 64;

            intValue += ((int) Math.pow(26,j)) * (((int) givenInput.charAt(i)) - 64) ;
            j++;
        }
        return intValue;
    }

    public static void main(String[] args) {
        String str = "AAA";
        System.out.println(solutionByBruteForce(str));
    }
}
