package JavaConceptPracties.Problem;

public class ComplexNumberMain {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(4, 5);
        ComplexNumber complexNumber2 = new ComplexNumber(1, 2);



        System.out.println("for addition number are :");
        complexNumber1.printNumber();
        complexNumber2.printNumber();

        complexNumber1.Plus(complexNumber2);
        System.out.println("after addition number are :");
        complexNumber1.printNumber();
        complexNumber2.printNumber();

        ComplexNumber complexNumber3 = new ComplexNumber(4, 5);
        ComplexNumber complexNumber4 = new ComplexNumber(1, 2);

        System.out.println("for multiplication number are :");
        complexNumber3.printNumber();
        complexNumber4.printNumber();
        // System.out.println(complexNumber1.getImaginary());

        complexNumber3.Multi(complexNumber4);

        System.out.println("after multiplication number are :");
        complexNumber3.printNumber();
        complexNumber4.printNumber();



    }
}
