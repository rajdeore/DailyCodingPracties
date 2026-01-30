package JavaConceptPracties.EqualsDemo;

import java.util.Objects;

class Student{
    public int roll;
    public String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getRoll() == student.getRoll() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoll());
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "durga");
        Student s2 = new Student(102, "pavan");
        Student s3 = new Student(101, "durga");
        Student s4 = s1;
                                            //if equals method is not override
        System.out.println(s1.equals(s2));  // false
        System.out.println(s1.equals(s3));  //false
        System.out.println(s1.equals(s4));  //true
    }

}
