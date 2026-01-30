package JavaConceptPracties.ObjectClassDemo;
class Test implements Cloneable{
    String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Test clone() {
        try {
            Test clone = (Test) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class CloneDemo {
    public static void main(String[] args) {
        Test t1 = new Test("Rajni");
        Test t2 = t1;
        Test t3 = t1.clone();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        t3.name = "Raj";
        System.out.println(t1.name);
        System.out.println(t2.name);
        System.out.println(t3.name);
    }

}
