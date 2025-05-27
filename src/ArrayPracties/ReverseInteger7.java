package ArrayPracties;

public class ReverseInteger7 {
    public static int reverse(int x) {

        int res = 0;
        int sign = 1;
        int lastDigit = 0;

        while (x != 0) {
            lastDigit = x % 10;
            x = x / 10;

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0; // Overflow if positive

            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0; // Overflow if negative

            res = (res * 10) + lastDigit;


        }

        return sign * res;

    }


    public static void main(String[] args) {
        int givenNumber = -2147483412;

        int result = reverse(givenNumber);
        System.out.println(result);
    }

}
