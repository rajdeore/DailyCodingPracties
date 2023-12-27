package JavaConceptPracties.StringClassPracties;

import java.util.Objects;

public class EqualsAndDoubleEquals {

    public static void main(String[] args) {


        String s1 = new String("modi");
        String s2 = new String("modi");
        String s3 = "modi";
        String s4 = "modi";

        System.out.println( "s1 == s2 " +  s1 == s2);
        System.out.println( "s1 == s3 " + (s1 == s3));
        System.out.println(  "s3 == s4 " + (s3 == s4));


        System.out.println( "first : " +  (s1 == s2));
        System.out.println( "second :" + (s1 == s3));
        System.out.println(  "3rd : " + (s3 == s4));


        System.out.println( "s1 equals s2" +  s1.equals(s2));
        System.out.println( "s1 equals s3" +  s1.equals(s3));
        System.out.println( "s3 equals s4" +  s3.equals(s4));
    }
}
