package StringPracties;

import static StringPracties.RotationsOfEachOther.IsRotationsOfEachOtherUsingQueue;

public class StringMain {
    public static void main(String[] args) {

        String str = "raaj";


        //__________________________START OF FindDuplicate_____________________________//
/*
        FindDuplicate findduplicate = new FindDuplicate();
        findduplicate.findDuplicate("DON JOHN");
*/
        //__________________________END OF FindDuplicate_____________________________//


        //__________________________START OF IsPalindron_____________________________________//
/*
        // Ispalindrome using for-loop
        IsPalindrom ispalindrom = new IsPalindrom();
        int resultPalindrome = ispalindrom.isPalindrome("abcdba");

        String result = (resultPalindrome == 1) ? "yes it is palindrome" : "not a palindrome";
        System.out.println("resultPalindrome = " + result);
*/

/*
        //IsPalindrome using while
        //IsPalindrom ispalindrom = new IsPalindrom();
        resultPalindrome = ispalindrom.isPalindromeUsingWhile("abcdba");

        result = (resultPalindrome == 1) ? "yes it is palindrome" : "not a palindrome";
        System.out.println("resultPalindrome using while loop is  = " + result);
*/

        //____________________________END OF IsPalindron____________________________________//



        //______________________________START OF IsUniqe_________________________________//
/*
        //isUniqe string using hashmap
        IsUnique isunique = new IsUnique();
        @SuppressWarnings("SpellCheckingInspection") boolean resultuniqe = isunique.hashMapIsUnique(str);
        System.out.println(resultuniqe);
*/

/*
        //isUniqe string using bruteforce
        IsUnique isunique = new IsUnique();
        boolean resultuniqe = isunique.bruteForceIsUnique(str);
        if(resultuniqe){
            System.out.println("string is uniqe!! : " + resultuniqe);
        }
        else{
            System.out.println("string is uniqe!! : " + resultuniqe);
        }
*/
        //_________________________________END OF IsUniqe_________________________________//


        //______________________START OF StringReverseUsingPinter______________________//
/*
        // String reverse using str --> charArray --> str
        StringReverseUsingPointer stringreverseusingpointer = new StringReverseUsingPointer();
        str = stringreverseusingpointer.stringReverseUsingPointer(str);
        System.out.println("Revers string = " + str);
*/
        //______________________END OF StringReverseUsingPinter______________________//

        //______________________________


        String str1 = "AAAZA";
        String str2 = "ABCDE";
        RotationsOfEachOther rotationsOfEachOther = new RotationsOfEachOther();
        boolean result = rotationsOfEachOther.IsRotationsOfEachOther(str1, str2);
        boolean result1 = rotationsOfEachOther.IsRotationsOfEachOtherUsingQueue(str1, str2);

        System.out.println("result = " + result);
        System.out.println("result = " + result1);


    }
}
