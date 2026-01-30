package Interview.Old.Accolite.L1;

import java.util.HashMap;

public class findRepeated {
    public static char findRepeatedChar(String givenStr){
        HashMap<Character, Integer> record = new HashMap<>();
        char result = 0;
        //result = '-1';
        for (int i = 0; i < givenStr.length(); i++) {
            record.put(givenStr.charAt(i), record.getOrDefault(givenStr.charAt(i), 0) + 1);
        }
        for (int i = 0; i < givenStr.length(); i++) {
            if(record.get(givenStr.charAt(i)) == 1){
                result = givenStr.charAt(i);
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "swining";

        char result = findRepeatedChar(str);
        System.out.println(result);


    }
}
