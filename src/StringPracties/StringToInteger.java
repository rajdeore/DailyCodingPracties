package StringPracties;

public class StringToInteger {
    public static int stringToInteger(String GivenStringNumber){
        int intResult = 0;
        int lenGivenStringNumber = GivenStringNumber.length();
       System.out.println("Value:"+Integer.parseInt(GivenStringNumber));
        for(int i=0; i<lenGivenStringNumber; i++){
            int charInt = (((int) GivenStringNumber.charAt(lenGivenStringNumber-i-1)) - 48);

            // number * 10^place_value
            intResult += (charInt * Math.pow(10, i));
        }
        return intResult;
    }

    public static void main(String[] args) {
/*        char ch = '1';
        int i = (int) ch;
        System.out.println(ch + " & " + i );*/

        int result = StringToInteger.stringToInteger("847");
        System.out.println(result);
        System.out.println();
    }
}
