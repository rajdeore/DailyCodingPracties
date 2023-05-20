package StringPracties;

public class IsPalindrom {
    public int isPalindrome(String S) {
        int ln = S.length();

  /*      if(ln <=2 ){
            return 1;
        }*/
        //   else{
        for(int i=0, j=ln-1; i<=ln/2 && j>=ln/2; i++,j--){
            //System.out.println(S.charAt(i));
            if(S.charAt(i) != S.charAt(j)){
                return 0;
            }
        }
        return 1;
        //    }
    }

    //using while loop
    public int isPalindromeUsingWhile(String S) {
        //right--------left
        int right=0,left=S.length()-1;
        int isPalindromeResult = 1;

        while(right<left){
            if(S.charAt(right) != S.charAt(left)){
                isPalindromeResult = 0;
                break;
            }
            right++;
            left--;
        }
        return(isPalindromeResult);
    }
}
