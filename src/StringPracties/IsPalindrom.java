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
}
