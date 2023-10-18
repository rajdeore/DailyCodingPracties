package StringPracties;


import java.util.HashSet;
import java.util.LinkedHashMap;

//Given a string s, find the first non-repeating character in it and return its index.
// If it does not exist, return -1.
public class FirstUniqChar {

    //using Map

    public static int firstUniqCharUsingMap(String s) {
        // Using LinkedHashMap : it will preserve the order
        LinkedHashMap<Character, Integer> record = new LinkedHashMap<>();
        int sLen = s.length();

        if (sLen == 1) {
            return 0;
        }

        for (int i = 0; i < sLen; i++) {
            if (record.containsKey(s.charAt(i))) {
                record.put(s.charAt(i), (record.get(s.charAt(i))) + 1);
            } else {
                record.put(s.charAt(i), 1);
            }
        }

        //find the 1st key with value as 1
        for (int i = 0; i < sLen; i++) {
            if (record.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }


    //time com :  O(n^2)
    // way brute force
    public static int firstUniqCharUsingButeF(String s) {
        HashSet<Character> visitedChar = new HashSet<>();

        int sLength = s.length();
        if (sLength == 1) {
            return 0;
        }
        for (int i = 0; i < sLength - 1; i++) {
            for (int j = i + 1; j < sLength; j++) {
                if (!visitedChar.contains(s.charAt(i))) {
                    if (s.charAt(i) == s.charAt(j)) {
                        visitedChar.add(s.charAt(i));
                        break;
                    } else if (j == sLength - 1) {
                        return i;
                    }
                } else {
                    break;
                }
            }
            if (i == sLength - 2) {
                if (!visitedChar.contains(s.charAt(i + 1))) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    //brute force optimization
    public int firstUniqCharUsingBruteFrceOptimization(String s) {
        boolean flag = false;
        for(int i = 0;i<s.length(); i++){
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j) && i!=j){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                return i;
            }else flag = false;
        }
        return -1;
    }

    public static void main(String[] args) {
        String givenString = "bbaj";
        System.out.println(firstUniqCharUsingButeF(givenString));

        String givenString2 = "lalaj";
        System.out.println(firstUniqCharUsingMap(givenString2));
    }

}
