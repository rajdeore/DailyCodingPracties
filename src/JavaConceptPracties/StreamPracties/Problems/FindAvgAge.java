package JavaConceptPracties.StreamPracties.Problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAvgAge {
    //Find the average age of a list of person object using stream

    public static void main(String[] args) {
        List<Person> group = new ArrayList<>();
        Person p1 = new Person("Ab", 22 , 30000);
        Person p2 = new Person("Bc", 24, 40000);
        Person p3 = new Person("Cd", 26, 50000);
        group.add(p1);
        group.add(p2);
        group.add(p3);

        group.forEach(System.out::println);

        Optional<Integer> avgAge;
        //not able to ue average() method of stream
        Optional<Integer> allAgeSum = group.stream().map(Person::getAge).reduce((x, y) -> x + y);
        System.out.println(allAgeSum.orElse(0) / group.size());
        // allAge.forEach(System.out::println);

        //Find 2nd lowest salry of the employ
        Optional<Person> secondLastSalary = group.stream().sorted(
                Comparator.comparingLong(Person::getSalary)
        ).skip(1).findFirst();
        System.out.println("Person = " +  secondLastSalary.get().getSalary());
    }
}
