package JavaConceptPracties.rough;

import JavaConceptPracties.FinalDemo.Parent;

public class ChildClass extends Parent {
    int childData;
    static int staticChildData;
    public void dispaly(){
        // to show demo: how default and protected works.
        // Parent class in another package.
        // the data member "protData" is available in child class.
        //"defaultData" data member is not available in child class.

        // System.out.println(defaultData);   ---->  error
        System.out.println(childData);
        System.out.println(protData);

        //static member can be access form non-static(instance) area
        System.out.println(staticChildData);
    }
    public static void dipaly2(){
        //to demo: only static members can be access from static area
        System.out.println(staticChildData);

        // non-static member not allowed
        // System.out.println(childData);  ------>  error
    }


    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.childData = 10;
        childClass.protData = 21;

        childClass.dispaly();
    }
}
