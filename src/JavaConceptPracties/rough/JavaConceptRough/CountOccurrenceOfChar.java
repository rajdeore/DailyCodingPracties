package JavaConceptPracties.rough.JavaConceptRough;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfChar {

    public static void main(String[] args) {
        String givenStr = "java#javaTemp";

        Map<Character, Integer> result = countChar(givenStr);
        System.out.println(result.toString());
    }

    private static Map<Character, Integer> countChar(String givenStr) {
        Map<Character, Integer> record = new HashMap<>();

        for (int i = 0; i < givenStr.length(); i++) {
/*            if (record.containsKey(givenStr.charAt(i))) {
                record.put(givenStr.charAt(i), record.get(givenStr.charAt(i)) + 1);
            } else {
                record.put(givenStr.charAt(i), 1);
            }*/
           
            record.put(givenStr.charAt(i), record.getOrDefault(givenStr.charAt(i), 0) + 1);

            //record.computeIfAbsent(givenStr.charAt(i), record.)
        }

        return record;
    }

}
