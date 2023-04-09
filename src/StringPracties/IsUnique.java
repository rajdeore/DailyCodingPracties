package StringPracties;

import java.util.HashMap;
import java.util.Locale;
import java.util.HashSet;

public class IsUnique {

    public boolean bruteForceIsUnique(String str){
        int strLenght = str.length();

        for(int i=0; i<strLenght-2; i++){
            for(int j=i+1; j<strLenght-1; j++){
                if (str.charAt(i) == str.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hashMapIsUnique(String str){
        //Map<> hashMap = new Map();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        //char ch = (str.charAt(1).toUpperCase()); // toUpper work on string only.
        String tempStr = str.toLowerCase();
        for( int i=0; i<str.length(); i++){
            //hashMap.computeIfAbsent(tempStr.charAt(i), k -> 1);

            if(hashMap.containsKey(tempStr.charAt(i))){
                return false;
            }
            else {
                hashMap.put(tempStr.charAt(i), 1);
            }
        }
        return true;
    }

    public boolean hashSetIsUniqe(String str){
        HashSet<Character> hashSet = new HashSet<>();

        String tempStr = str.toLowerCase();

        for(int i=0; i< str.length(); i++){
            if(hashSet.contains(tempStr.charAt(i))){
                return false;
            }
            else {
                hashSet.add(tempStr.charAt(i));
            }
        }
        return true;
    }
}
