package StringPracties;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class LetterCombinationsOfPhoneNumber17 {
    //Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

    //global variable
    private static String[] code = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("2", "abc");
        data.put("3", "def");
        data.put("4", "ghi");
        data.put("5", "jkl");
        data.put("6", "mno");
        data.put("7", "pqrs");
        data.put("8", "tuv");
        data.put("9", "wxyz");

/*        for (String str : code) {
            System.out.println(str);
        }*/

        System.out.println("please enter String = ");
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        System.out.println(inputString);

        ArrayList<String> finalRes = new ArrayList<>();
        finalRes =  getPosibleCombination(inputString, 0);
        System.out.println(finalRes);


    }

    private static ArrayList<String> getPosibleCombination(String givenNumber, int position){
        String subStr = givenNumber.substring(position);
        if (subStr.length() == 0){
            ArrayList<String> rRes = new ArrayList<>();
            rRes.add(" ");
            return rRes;
        }

        ArrayList<String> mres = new ArrayList<>();
        ArrayList<String> pRes = getPosibleCombination(givenNumber, position+1);
        int curNumber = Integer.valueOf(givenNumber.charAt(position)) - 48 ;
        System.out.println("curNumber = " + curNumber );
        String codeForDigit = code[curNumber];

        for (int i = 0; i < codeForDigit.length(); i++) {
            char chCode = codeForDigit.charAt(i);
           // mres.add(chCode + getPosibleCombination(givenNumber, position-1));
            for(String pStr : pRes){
                mres.add(chCode + pStr);
            }
        }

        return mres;

    }
}
