package JavaConceptPracties.OOPS.Inheritance;

class ParentDemo {
    public void m1(){
        System.out.println("Hi, i m in parent");
    }
}
class Child extends ParentDemo {
    public void m2(){
        System.out.println("Hi, i m in Child");
    }
}

public class IsARelationDemo {
    public static void main(String[] args) {

/*        File result = new File("src", "abc".replace('.', '/') + "-mbi.xml");
        boolean fileCreated = result.getParentFile().mkdirs();
        System.out.println(result);

        Integer.getInteger();*/

        // creating obj of parent with parent refrence
        ParentDemo parentDemo = new ParentDemo();
        parentDemo.m1();


        //creating obj of child with parent refreence
        ParentDemo parentDemo1 = new Child();
        parentDemo1.m1();
        // parent1.m2();    ----> not possible

        //creating obj of parent with chile refrence
        // Child child = new Parent(); ---> not possible

        //creating obj of Child with chile refrence
        Child child1 = new Child();
        child1.m2();
        child1.m1();

     }
}
