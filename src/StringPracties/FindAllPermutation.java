package StringPracties;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutation {

        public static List<String> permutations(String string) {
            List<String> perms = new ArrayList<>();

            // Base case: if the string has only one character, return it as a single-element list
            if (string.length() == 1) {
                perms.add(string);
                return perms;
            }

            // Recursive case: generate permutations by selecting each character as the first one and permuting the rest
            for (int i = 0; i < string.length(); i++) {
                char firstChar = string.charAt(i);
                String remainingChars = string.substring(0, i) + string.substring(i + 1);
                List<String> subperms = permutations(remainingChars);
                for (String subperm : subperms) {
                    perms.add(firstChar + subperm);
                }
            }

            return perms;
        }

        public static void main(String[] args) {
            String inputString = "abc";
            List<String> perms = permutations(inputString);
            System.out.println(perms);
        }
}
