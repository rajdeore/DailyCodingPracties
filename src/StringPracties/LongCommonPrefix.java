package StringPracties;

public class LongCommonPrefix {

    static public int minLenght(String[] givenStringS){
        int minlen = Integer.MAX_VALUE;
        for (String str : givenStringS) {
            if(str.length() < minlen){
                minlen = str.length();
            }
        }
        return minlen;
    }


    // comparing character by character of every one word
    static public String findLongCommonPrefixCharByChar(String[] givenStringS){
        String resultString = "";
        StringBuilder resultStringBuilder = new StringBuilder();
        int minLengthInStrArray = LongCommonPrefix.minLenght(givenStringS);

        for (int i = 0; i < minLengthInStrArray; i++) {
            char charAtIPosotion = givenStringS[0].charAt(i);
            for (String givenString : givenStringS) {
                if (givenString.charAt(i) != charAtIPosotion) {
                    //return resultString;
                    return resultStringBuilder.toString();
                }
            }
            //resultString = resultString +  charAtIPosotion;
            resultStringBuilder.append(charAtIPosotion);
        }
        //return resultString;
        return resultStringBuilder.toString();
    }


    //comparing word by word.
    // at a time two words. compare result and next-Word.
    public static String findLongCommonPrefixCompareWord(String[] givenStringS){
        String resultString = givenStringS[0];

        for (int i = 1; i < givenStringS.length; i++) {
            resultString = findPrefixBetweenTwo(resultString, givenStringS[i]);
        }
        return resultString;
    }

    public static String findPrefixBetweenTwo(String givenStr1, String givenStr2){
        String commanBetweenTow = "";
        for (int i = 0; i < Math.min(givenStr1.length(), givenStr2.length()); i++) {
            if(givenStr1.charAt(i) != givenStr2.charAt(i)){
                return commanBetweenTow;
            }
            commanBetweenTow += givenStr1.charAt(i);
        }
        return commanBetweenTow;
    }


    public static void main(String[] args) {
        String[] stringArray = {"apple", "ape", "april"};
        String[] stringArray2 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] stringArray3 = {"apple", "ape", "boy"};


       // System.out.println(stringArrya[0].charAt(0));

        System.out.println("result using char by char comaprision = " + LongCommonPrefix.findLongCommonPrefixCharByChar(stringArray));
        System.out.println("result using char by char comaprision = " + LongCommonPrefix.findLongCommonPrefixCharByChar(stringArray2));
        System.out.println("result using char by char comaprision = " + LongCommonPrefix.findLongCommonPrefixCharByChar(stringArray3));

        System.out.println("result using word by word comparision = " + findLongCommonPrefixCompareWord(stringArray));
        System.out.println("result using word by word comparision = " + findLongCommonPrefixCompareWord(stringArray2));
        System.out.println("result using word by word comparision = " + findLongCommonPrefixCompareWord(stringArray3));
    }
}
