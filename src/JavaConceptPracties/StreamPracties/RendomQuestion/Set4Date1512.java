package JavaConceptPracties.StreamPracties.RendomQuestion;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employ{
    private String name;
    private int age;
    private  String dept;

    public Employ(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employ(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", dept=" + dept +
                '}';
    }
}

public class Set4Date1512 {
    public static void main(String[] args) {

        //1 group employ by age.
        List<Employ> employs = Arrays.asList(new Employ("Raj", 30),
                new Employ("Ram", 30),
                new Employ("sham", 29));
        Map<Integer, List<Employ>> agetoEmp = employs.stream().
                collect(Collectors.groupingBy(employ -> employ.getAge()));
        agetoEmp.forEach((age, list) -> System.out.println(age + " employ " + list));

        //increase age of each emp by 10
       List<Employ> addedAge = employs.stream().peek(emp -> emp.setAge(emp.getAge() + 10)).collect(Collectors.toList());

        //2 find avg age.
        employs.stream()
                .mapToInt(Employ::getAge)
                .average()
                .ifPresent(System.out::println);

        System.out.println( employs.stream()
                .collect(Collectors.averagingInt(Employ::getAge)));

        //3 how to partition list of number into even and odd groups
        List<Integer> givenList = Arrays.asList(1,2,3,4,5,6,7,8);
        //Map<Integer, List<Integer>> oddEvenList = givenList.stream().collect(Collectors.groupingBy())
        List<Integer> even = givenList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = givenList.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        even.forEach(System.out::print);
        System.out.println();
        odd.forEach(System.out::print);

        //4 sort by multiple feild
        List<Employ> result = employs.stream()
                .sorted(Comparator.comparing(Employ::getAge)
                        .thenComparing(Employ::getName).reversed())
                .collect(Collectors.toList());
        result.stream().forEach(System.out::println);

        //5 count each elemnts in arrayList
        List<String> fruits = Arrays.asList("apple", "appleeeee", "banan", "appleee");
        Map<String, Long> record = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));
        record.forEach((s, aLong) -> System.out.println(s + " comes " + aLong + "time "));


        //6 find the longet string the given list
        fruits.stream()
                .reduce((s, s2) -> s.length() > s2.length() ? s : s2)
                .ifPresent(System.out::println);

        fruits.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
    }


}
