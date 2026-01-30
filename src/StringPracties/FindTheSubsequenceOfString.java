package StringPracties;


import java.util.ArrayList;
import java.util.List;

public class FindTheSubsequenceOfString {

    public static void main(String[] args) {
        String input = "aabca";
        System.out.println("Subsequences of \"" + input + "\":");
        List<String> palindrome = new ArrayList<>();
        findSubsequences(input, "" , palindrome);
        System.out.println("Palindromic Subsequences: " + palindrome);

        int count = (int) palindrome.stream().filter(s -> s.length() == 3).count();
        System.out.println("Count of palindromic subsequences of length 3: " + count);
    }

    // Recursive method to find all subsequences
    public static void findSubsequences(String input, String output, List<String> palindrome) {
        if (input.isEmpty()) {
            //System.out.println(output);

            if(isPalindrome(output)) {
                palindrome.add(output);
            }
            return;
        }

        // Include the first character
        findSubsequences(input.substring(1), output + input.charAt(0), palindrome);

        // Exclude the first character
        findSubsequences(input.substring(1), output, palindrome);
    }

    private static boolean isPalindrome(String output) {
        int left = 0;
        int right = output.length() - 1;

        while (left < right) {
            if (output.charAt(left) != output.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

