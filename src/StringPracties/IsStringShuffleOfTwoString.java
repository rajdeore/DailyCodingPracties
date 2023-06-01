package StringPracties;

import java.util.LinkedList;

public class IsStringShuffleOfTwoString {

    public static boolean IsStringShuffleOfTwoStringUsingLL(String givenS1, String givenS2, String shuffleGivenS3){

        int shuffleGivenS3Length = shuffleGivenS3.length();
        //create Linked list to store ShuffleGIvenS3
        LinkedList<Character> shuffleStringLinkedList = new LinkedList<Character>();

        for(int i=0; i<shuffleGivenS3Length; i++ ){
            shuffleStringLinkedList.add(shuffleGivenS3.charAt(i));
        }

        System.out.println("rajjj : " +  shuffleStringLinkedList);

        for(int i=0; i<givenS1.length(); i++){
            //if chsar of string1 is present in shuffle string remove it from LL
            if(shuffleStringLinkedList.contains(givenS1.charAt(i))){
                System.out.println("rajjj : " +  shuffleStringLinkedList);
                char ch = givenS1.charAt(i);
                shuffleStringLinkedList.remove(new Character(ch));
            } else{
                return false;
            }
        }

        //2nd string
        for(int i=0; i<givenS2.length(); i++){
            //if char of string1 is present in shuffle string remove it from LL
            if(shuffleStringLinkedList.contains(givenS2.charAt(i))){
                System.out.println("rajjj : " +  shuffleStringLinkedList);
                shuffleStringLinkedList.remove(new Character((givenS2.charAt(i))));
            } else{
                return false;
            }
        }

        System.out.println("rajjj : " +  shuffleStringLinkedList);
        if(shuffleStringLinkedList.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }


    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "Test";
        String s3 = "Guset";
        String s4 = "TestTest";
        String s5 = "TestTet";
        String s6 = "TestGuest";

       System.out.println("case 1 = " + IsStringShuffleOfTwoStringUsingLL(s1, s2, s4));
        System.out.println("case 1 = " + IsStringShuffleOfTwoStringUsingLL(s1, s2, s5));
    }
}
