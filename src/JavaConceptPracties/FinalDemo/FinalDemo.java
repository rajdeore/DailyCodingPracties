package JavaConceptPracties.FinalDemo;



public class FinalDemo {
   // final void printCar(String str)  ---> final method can not be override
    void printCar(String str){
        System.out.println("car of finalDemo");
    }
}


class ChildFinalDemo extends FinalDemo{
    @Override
    void printCar(String str) {
        System.out.println("car of child class");
    }
}
