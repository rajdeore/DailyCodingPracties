package JavaConceptPracties.OptionalClass;

public class OptionalDemo {
    public static void main(String[] args) {

/*        String str1 = null;
        try {
            System.out.println(str1.length());
        } catch (NullPointerException e) {
            System.out.println("String is null " + e.getMessage());

            //e.printStackTrace();
        }
        */
        String str = null;

        if (str != null) {
            System.out.println(str.length());
        }else{
            System.out.println(" string is null ");
            // throw new NullPointerException();
        }
    }
}
