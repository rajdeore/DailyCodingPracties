package JavaConceptPracties.rough;

import java.io.IOException;

class Parent {
    //Constructor
    Parent() throws Exception{

    }

    public void m1() {
        System.out.println("Parent method");
    }

    public void m2() throws IOException {
        System.out.println();
    }

    public static void m3() {
        System.out.println("Static method of parent");
    }
}

class Child extends Parent {
    Child() throws Exception {
        super();
    }

    @Override
    public void m1() {
        try {
            System.out.println("M1 in Child chalss");
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            //throw new RuntimeException("/ by zero");
            System.out.println("do nothing");
        }

    }


    public void m2() {
        System.out.println("Child method");
    }

    public static void m3() {
        System.out.println("Static method of Child");
    }

    public void m4() {
        System.out.println("Static m4 method of Child");
    }

}

public class InheritanceRefDemo {
    public static void main(String[] args) throws Exception {
        Parent parent = new Child();
        parent.m1();
        parent.m3();

        //parent.m2();

        Parent p = new Parent();
        p.m1();

        Child child = new Child();
        child.m2();
        child.m1();
        child.m3();

        //Not allowed Child ref and parent obj
        //Child child1 = new Parent();

    }
}
