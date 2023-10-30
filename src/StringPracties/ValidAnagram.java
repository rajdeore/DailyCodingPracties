package StringPracties;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
    */
    static String sortString(String s) {
        char[] charTemp = s.toCharArray();
        Arrays.sort(charTemp);
        return (new String(charTemp));
    }

    static boolean solBySorting(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String sTemp = sortString(s);
        String tTemp = sortString(t);
        for (int i = 0; i < sTemp.length(); i++) {
            if (sTemp.charAt(i) != tTemp.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // using hashmap
    static boolean solByHashing(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> record = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (record.containsKey(s.charAt(i))) {
                record.put(s.charAt(i), (record.get(s.charAt(i)) + 1));
            } else {
                record.put(s.charAt(i), 1);
            }
        }
        System.out.println(record);

        //check other
        for (int i = 0; i < t.length(); i++) {
            if (!record.containsKey(t.charAt(i))) {
                return false;
            } else {
                if (record.get(t.charAt(i)) > 1) {
                    record.put(t.charAt(i), (record.get(t.charAt(i)) - 1));
                } else {
                    record.remove(t.charAt(i));
                }
            }
        }
/*        if (!record.isEmpty()) {
            return false;
        }*/
        System.out.println(record);

        return true;
    }


    //hashing using Array-list
    //we already know all the key and they are having pattern like All alphabet
    static boolean solByArrayHashing(String s, String t){
        int[] record = new int[26];
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            int stemp = (int) s.charAt(i) - 65;
            int ttemp = (int) t.charAt(i) - 65;
            (record[stemp])++;
            (record[ttemp])--;
        }

        for (int count : record
        ) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        String s1 = "raj";
        String s2 = "arj";

        String s3 = "RAJ";
        String s4 = "ARJ";

        System.out.println(solBySorting(s1, s2));
        System.out.println(solByHashing(s1, s2));
        System.out.println(solByArrayHashing(s3, s4));
    }
}
