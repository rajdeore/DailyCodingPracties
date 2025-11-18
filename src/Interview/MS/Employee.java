package Interview.MS;

import java.util.*;

public class Employee  {
    private String name;
    private String gender;
    private Integer salary;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee() {
    }

    public Employee(String name, String gender, Integer salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }


    public static void main(String[] args) {
        ArrayList<Employee> listEmp = new ArrayList<>();
        Employee e1 = new Employee("abc", "Female", 15000);
        Employee e2 = new Employee("def", "Male", 10000);
        Employee e3 = new Employee("bcd", "Male", 15000);
        Employee e4 = new Employee("abc", "Male", 10000);
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);
        listEmp.add(e4);

        System.out.println(listEmp.toString());

        Collections.sort(listEmp, new CustomComparator());

        System.out.println("After sorting");
        System.out.println(listEmp.toString());

        listEmp.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).thenComparing(Employee::getGender));


        //MyComparator for user define sorting
       // listEmp.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));

/*        for (Employee emp : listEmp){
            System.out.println(emp);
        }*/

       // listEmp.forEach(System.out::println);

    }


}

class CustomComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        String empName1 = o1.getName();
        String empName2 = o2.getName();
        int emp1Sal = o1.getSalary();
        int emp2Sal = o2.getSalary();

        if(empName1.equals(empName2)){
            return emp1Sal-emp2Sal;
        }else{
            return empName1.compareTo(empName2);
        }
    }

}

