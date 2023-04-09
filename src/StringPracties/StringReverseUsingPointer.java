package StringPracties;

public class StringReverseUsingPointer {

    public String stringReverseUsingPointer (String str){
        String resultStr = "";
        char [] charStr = new char[str.length()];

        charStr = str.toCharArray();
        int arrLength = charStr.length;

        for (int left=0,right= arrLength-1; left<arrLength/2 && right>arrLength/2 ; left++,right--){
            char temp = charStr[right];
            charStr[right] = charStr[left];
            charStr[left] = temp;
        }

        for(int i=0; i<charStr.length; i++) {
            resultStr += charStr[i];
        }
        //System.out.println("str : " + resultStr);
        return resultStr;
    }

}
