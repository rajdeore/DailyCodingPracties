package ArrayPracties;

import java.util.*;

public class CouponCodeValidator3606 {

    public static void main(String[] args) {
        String[] code ={"SAVE20","","PHARMA5","SAVE@20"};
        String[] businessLine = { "restaurant","grocery","pharmacy","restaurant"};
        boolean[] isActive = {true,true,true,true};

        System.out.println(isCodeValid(code[0]));
        System.out.println(isCodeValid(code[2]));
        System.out.println(isCodeValid(code[3]));


       // String[] result = couponCodeValidator(code, businessLine, isActive);
    }

    private static String[] couponCodeValidator(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> resultList = new ArrayList<>();
        Set<String > allowedBusiness = new HashSet<>();
        allowedBusiness.add("electronics");
        allowedBusiness.add("grocery");
        allowedBusiness.add("pharmacy");
        allowedBusiness.add("restaurant");

       // Map<String, >

        for (int i = 0; i <code.length ; i++) {
            if(isActive[i]){
                if(isCodeValid(code[i])){
                    if (allowedBusiness.contains(businessLine[i])){

                    }
                }
            }

        }


        return (String[]) resultList.toArray();
    }

    private static boolean isCodeValid(String s) {
        int i = 0;
        while(i < s.length()){
            char ch =  s.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != '_'){
                return false;
            }
            i++;
        }
        return true;

    }
}
