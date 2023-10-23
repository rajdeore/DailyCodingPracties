package StringPracties;

public class FindIndexOfFirstOccurrenceInString {
    /*
        Given two strings needle and haystack,
        return the index of the first occurrence of needle in haystack,
        or -1 if needle is not part of haystack.
    */

    static int SolutionBruteForce(String haystack, String needle){
        int str1len = haystack.length();
        int str2len = needle.length();
        boolean flag = true;

        for (int i = 0; i <= str1len-str2len; i++) {
        /*
            flag = true;
            for (int j = 0,k = i; j < str2len && k < i + str2len; j++, k++) {
                if(!(haystack.charAt(k) == needle.charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i+1;
            }
         */
            //optimized j-loop
            for (int j = 0; j < str2len; j++) {
                if (!(haystack.charAt(j+i) == needle.charAt(j))){
                    break;
                }
                if(j == str2len-1){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "osutsadxy";
        String str2 = "sad";
        System.out.println(SolutionBruteForce(str1, str2));
    }
}
