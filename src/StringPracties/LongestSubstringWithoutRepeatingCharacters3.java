package StringPracties;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static int lengthOfLongestSubstring(String s) {

        int result = 0;
        int count = 0;


        s = s.trim();
        int strLn = s.length();

        for (int i = 0; i < strLn; i++) {
            HashSet<Character> record = new HashSet<>();
            for (int j = i; j < strLn; j++) {

                char ch = s.charAt(j);
                /// break point
                if(record.contains(ch)){
/*                    if(count > result)
                        result = count;
                    count = 0;*/
                    break;
                }else {
                    record.add(ch);
                    count += 1;
                }

            }
            if(count > result)
                result = count;
            count = 0;

        }
    return result;
    }


    public static void main(String[] args) {
        String givenStr = new String(" ");
        System.out.println(lengthOfLongestSubstring(givenStr));
    }
}
