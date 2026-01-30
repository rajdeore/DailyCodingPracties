package JavaConceptPracties.ExceptionDemo.CustomizeException;

public class CustomizeExceptionDemo {
    public static void main(String[] args) {
        int x = 10;

        try {
            if(x == 10){
                throw new CustomizeException("The number is 10");
            }
        } catch (CustomizeException e) {
            System.out.println("Should not be 10");
        }
        System.out.println("end of the program");

    }
}
