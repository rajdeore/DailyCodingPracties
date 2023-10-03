package StringPracties;

import java.util.HashMap;
import java.util.Map;

public class ZigZagString {

    //using map
    public static String createZigZagStringUsingMap(String givenString, int zigZagNumber){
        StringBuilder resultStringBuilder = new StringBuilder();

        Map<Integer, StringBuilder> recordMap = new HashMap<>(zigZagNumber);

        for (int i = 0; i < givenString.length(); i++) {
            if(recordMap.containsKey(i % zigZagNumber)){
                recordMap.put(i % zigZagNumber, recordMap.get(i % zigZagNumber).append(givenString.charAt(i)));
            }else{
                StringBuilder Temp = new StringBuilder();
                Temp.append(givenString.charAt(i));
                recordMap.put(i % zigZagNumber, Temp);
            }
        }

        //combine all value into one
        /*
        // way 1
        for (int i = 0; i < zigZagNumber; i++) {
            resultStringBuilder.append(recordMap.get(i));
        }*/

        // way 2: using Value method
        // System.out.println(recordMap.values());
        for (StringBuilder sb: recordMap.values()) {
            resultStringBuilder.append(sb);
        }

        return resultStringBuilder.toString();
    }

    public static void main(String[] args) {
/*        StringBuilder givenStringBuilder = new StringBuilder("RajKumar");
        System.out.println("SB : " + givenStringBuilder.charAt(1));*/
        String givenString = "ABCDEFGH";
        System.out.println("result of zigZag with 2 = " + createZigZagStringUsingMap(givenString, 2));
        System.out.println("result of zigZag with 3= " + createZigZagStringUsingMap(givenString, 3));
    }


}
