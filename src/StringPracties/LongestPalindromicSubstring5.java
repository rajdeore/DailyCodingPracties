package StringPracties;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring5 {
    public static boolean isPalindrome(String givenStr){
        int ln = givenStr.length();

        //using two pointer
        int start = 0, end = ln-1;
        while(start < end){
            if(givenStr.charAt(start) != givenStr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String givenStr = "bab";
        int ln = givenStr.length();
       // System.out.println(LongestPalindromicSubstring5.isPalindrome(givenStr));

        //brute force
        String resultStr = "";
        int maxLn = 0;

        //List<String> tempList = new ArrayList<>();

        for (int i = 0; i < ln ; i++) {
            for (int j = i; j < ln; j++) {
                //tempList.add(givenStr.substring(i, j+1));
                String temp = givenStr.substring(i, j+1);
                if(LongestPalindromicSubstring5.isPalindrome(temp)){
                    if(temp.length() > maxLn){
                        resultStr = temp;
                        maxLn = temp.length();
                    }
                }
            }
        }

        System.out.println(resultStr);
        //System.out.println(tempList);

    }
}
