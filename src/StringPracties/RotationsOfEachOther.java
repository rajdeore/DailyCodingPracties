package StringPracties;

import java.util.LinkedList;
import java.util.Queue;

public class RotationsOfEachOther {

    //solution using Queue
    static boolean IsRotationsOfEachOtherUsingQueue(String givenString1, String givenString2){
        int string1Len = givenString1.length();
        int string2Len = givenString2.length();
        boolean flag = true;

        if(string1Len != string2Len){
            flag = false;
            return false;
        }

        Queue string1Queue = new LinkedList();
        Queue string2Queue = new LinkedList();

        //insert string1 into queue-1
        for(int i=0; i<string1Len; i++ ){
            string1Queue.add(givenString1.charAt(i));
            string2Queue.add(givenString2.charAt(i));
        }
 /*       System.out.println("queue1 = " + string1Queue);
        System.out.println("queue2 = " + string2Queue);
*/
        //to rotare the queue2. with one at a time
        int k = string2Len;

        while(k>0){
            k--;
            if(string1Queue.equals(string2Queue)){
                return flag;
            }
            else{
                char ch = (char) string2Queue.poll();
                string2Queue.add(ch);
            }
        }
        flag = false;
        return flag;
    }

    public static boolean IsRotationsOfEachOther(String givenString1, String givenString2){
        int string1Len = givenString1.length();
        int string2Len = givenString2.length();
        boolean flag = true ;

        if(string1Len != string2Len){
            flag = false;
            return false;
        }

            // find the 1st char of s1 in s2
            for(int i=0; i<string2Len; i++){
                flag = true;
                if(givenString1.charAt(0) == givenString2.charAt(i)){
                    //if found, compare remaining once
                    for(int j=0; j<string1Len; j++){
                        if(givenString1.charAt(j) != givenString2.charAt((i+j)%string1Len)){
                            flag = false;
                            break;
                        }else{
                            if (j == string1Len-1){
                                flag = true;
                                return flag;
                            }
                        }
                    }
                }
            }
            return flag;
    }

    public static void main(String[] args) {

        String str1 = "AAAZA";
        String str2 = "ABCDE";
         //boolean result = IsRotationsOfEachOther(str1, str2);
        boolean result = IsRotationsOfEachOtherUsingQueue(str1, str2);

        System.out.println("result = " + result);
    }
}
