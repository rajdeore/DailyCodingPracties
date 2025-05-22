package StringPracties;

public class StringToInteger8 {
    public static int stringToInteger(String GivenStringNumber) {
        int intResult = 0;
        int lenGivenStringNumber = GivenStringNumber.length();
        System.out.println("Value:" + Integer.parseInt(GivenStringNumber));
        for (int i = 0; i < lenGivenStringNumber; i++) {
            int charInt = (((int) GivenStringNumber.charAt(lenGivenStringNumber - i - 1)) - 48);

            // number * 10^place_value
            intResult += (charInt * Math.pow(10, i));
        }
        return intResult;
    }

    public static int myAtoi(String s) {

        //things to remember
        // 1. remove white space
        //  2. run till 1st non-digit (imp)
        // 3. include sign
        // 4. take care of outbound

        s = s.trim();
        int ln = s.length();
        //flag for sign
        int sign = 1, i = 0;
        int res = 0;

        if (ln == 0)
            return 0;


        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        }
        if (s.charAt(0) == '+') {
            sign = 1;
            i++;
        }

        while (i < ln) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }
            res = res * 10 + (ch - '0');

            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;

        }
        return sign * res;


    }

    public static void main(String[] args) {
/*        char ch = '1';
        int i = (int) ch;
        System.out.println(ch + " & " + i );*/


        String s = "+000012raj";
        System.out.println(myAtoi(s));


    }
}
