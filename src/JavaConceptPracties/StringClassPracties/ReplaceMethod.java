package JavaConceptPracties.StringClassPracties;

public class ReplaceMethod {

    public static void main(String[] args) {
        String str1;

        String str = "A man, a plan, a canal: Panama";
        System.out.println( "str : " +  str);
        String strToLower = str.toLowerCase();
        System.out.println("strToLower : " +  strToLower);
        String strWithoutWhiteSpace = strToLower;//= strToLower.replace(" ", "");
        System.out.println("strWithoutWhiteSpace : " + strWithoutWhiteSpace);

        for(int i=0; i< strWithoutWhiteSpace.length(); i++){
            if(strWithoutWhiteSpace.charAt(i) < 97 || strWithoutWhiteSpace.charAt(i) > 122){

                strWithoutWhiteSpace = strWithoutWhiteSpace.replace(String.valueOf(strWithoutWhiteSpace.charAt(i)), "");
            }
        }
        System.out.println("strWithoutWhiteSpace : " + strWithoutWhiteSpace);

        System.out.println(strWithoutWhiteSpace.charAt(strWithoutWhiteSpace.length()-1) == 122? true: false );
    }
}
