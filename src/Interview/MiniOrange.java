package Interview;


import Interview.MS.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MiniOrange {

    public static void main(String[] args) {
        ArrayList<Employee> record = new ArrayList<>();
        Employee emp1 = new Employee("Ab1", "Male", 100);
        Employee emp2 = new Employee("Ab2", "Female", 100);
        Employee emp3 = new Employee("Ab3", "Male", 100);
        Employee emp4 = new Employee("Ab4", "Female", 100);

        record.add(emp1);
        record.add(emp2);
        record.add(emp3);
        record.add(emp4);

        //Collect name of all emp
        // try 1 - fail - List<String> collectedName = record.stream().collect(Employee::getName);

        //Find the number of female employ count

        //try-1
        List<String> collectedName = record.stream().map(Employee::getGender).collect(Collectors.toList());
        System.out.println(collectedName);

        int femaleCount = (int) record.stream().map(Employee::getGender).filter(s -> s == "Female").count();
        //System.out.println("femaleCount = " + femaleCount);

        int femaleC = (int) record.stream().filter(emp -> Objects.equals(emp.getGender(), "Female")).count();
        System.out.println("female counr = " + femaleC);
        // try1 passed


        // try 2 - using groupingBy()
        Map<String, List<Employee>> employeeMap = record.stream()
                                                        .collect(Collectors.groupingBy(Employee::getGender));
        //System.out.println("employeeMap = " +  employeeMap);

       // System.out.println("femaleCount = "  + employeeMap.get("Female").size());


    }
}
