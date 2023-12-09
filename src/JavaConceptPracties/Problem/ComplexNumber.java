package JavaConceptPracties.Problem;

public class ComplexNumber {
     private int real;
     private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    void printNumber(){
        System.out.println(this.real + " + i" + this.imaginary);
    }

    public ComplexNumber Plus(ComplexNumber complexNumber){
        this.setReal(this.getReal() + complexNumber.getReal());
        this.setImaginary(this.imaginary + complexNumber.getImaginary());

        return (this);
    }

    public ComplexNumber Multi(ComplexNumber complexNumber){
        int t1 = this.getReal() * complexNumber.getReal();
        int t2 = this.getReal() * complexNumber.getImaginary();
        int t3 = this.getImaginary() * complexNumber.getReal();
        int t4 = this.getImaginary() * complexNumber.getImaginary();

        this.setReal(t1 - t4);
        this.setImaginary(t2 + t3);

        return this;
    }
}
