package StringPracties;

import java.util.HashMap;

public class FindDuplicate {
    static void findDuplicate(String givenString){
        int givenStringLength = givenString.length();

        HashMap<Character, Integer> occurrenceRecord = new HashMap();

        for(int i=0; i<givenStringLength; i++){
          //  System.out.println(givenString.charAt(i));
            if(occurrenceRecord.containsKey(Character.toLowerCase(givenString.charAt(i)))){
                int value = occurrenceRecord.get(Character.toLowerCase(givenString.charAt(i)));
                occurrenceRecord.put(Character.toLowerCase(givenString.charAt(i)), ++value);
            }else{
                occurrenceRecord.put(Character.toLowerCase(givenString.charAt(i)), 1);
            }
        }
        System.out.println(occurrenceRecord);
    }

    public static void main(String[] args) {
        String inputSting = "Raarrrj";
        findDuplicate(inputSting);

    }
}
