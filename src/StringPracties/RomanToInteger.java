package StringPracties;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    /*
        Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
            Symbol       Value
            I             1
            V             5
            X             10
            L             50
            C             100
            D             500
            M             1000
            For example, 2 is written as II in Roman numeral, just two ones added together.
            12 is written as XII, which is simply X + II.
            The number 27 is written as XXVII, which is XX + V + II.

            Roman numerals are usually written largest to smallest from left to right.
            However, the numeral for four is not IIII.
            Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
            The same principle applies to the number nine, which is written as IX.
            There are six instances where subtraction is used:
                I can be placed before V (5) and X (10) to make 4 and 9.
                X can be placed before L (50) and C (100) to make 40 and 90.
                C can be placed before D (500) and M (1000) to make 400 and 900.
    */
    public static int romanToIntLeftToRight(String s) {
        Map<Character, Integer> romanMapping = new HashMap<>();
        romanMapping.put('I', 1);
        romanMapping.put('V', 5);
        romanMapping.put('X', 10);
        romanMapping.put('L', 50);
        romanMapping.put('C', 100);
        romanMapping.put('D', 500);
        romanMapping.put('M', 1000);

        int result = 0;
        int i = 0;
        int strLength = s.length();
        while (i < strLength) {

            if (i < strLength - 1) {
                if (romanMapping.get(s.charAt(i)) >= romanMapping.get(s.charAt(i + 1))) {
                    result = result + romanMapping.get(s.charAt(i));
                    i++;
                } else {
                    int temp = romanMapping.get(s.charAt(i + 1)) - romanMapping.get(s.charAt(i));
                    result = result + temp;
                    i += 2;
                }
            }

            if (i == strLength - 1) {
                result = result + romanMapping.get(s.charAt(i));
                i++;
            }
        }
        return result;
    }


    static int romanToIntUsingRightToLeft(String s) {
        int result = 0, num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            num = switch (s.charAt(i)) {
                case 'M' -> 1000;
                case 'D' -> 500;
                case 'C' -> 100;
                case 'L' -> 50;
                case 'X' -> 10;
                case 'V' -> 5;
                case 'I' -> 1;
                default -> num;
            };
            if (4 * num < result) result -= num;
            else result += num;
        }

        return result;
    }

    static public int romanToIntRightToLeftWithoutLogic(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            if (i < s.length() - 1 && currValue < romanValues.get(s.charAt(i + 1))) {
                result -= currValue;
            } else {
                result += currValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String givenRoman = "IX";
        System.out.println(romanToIntLeftToRight(givenRoman));
        System.out.println(romanToIntUsingRightToLeft(givenRoman));
        System.out.println(romanToIntRightToLeftWithoutLogic(givenRoman));

    }
}
