package JavaConceptPracties.OOPS.Inheritance;

class parent{
    parent(int num){
        System.out.println("Parent class parameterize constructor : " + num);
    }

    public parent() {

    }
}

class ChildDemo extends parent{

    ChildDemo(){
        super();
        System.out.println("Chile class constructor without argument");
    }
    public static void m1(){
        System.out.println("ChildDemo m1");
        //m1();
    }
}

public class ConstructorFlowImpl {
    public static void main(String[] args) {
        ChildDemo.m1();
    }
}
