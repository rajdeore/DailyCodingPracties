package JavaConceptPracties.StreamPracties.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAvgAge {
    //Find the average age of a list of person object using stream

    public static void main(String[] args) {
        List<Person> group = new ArrayList<>();
        Person p1 = new Person("Ab", 22);
        Person p2 = new Person("Bc", 24);
        group.add(p1);
        group.add(p2);

        group.forEach(System.out::println);

        Optional<Integer> avgAge;
        //not able to ue average() method of stream
        Optional<Integer> allAgeSum = group.stream().map(Person::getAge).reduce((x, y) -> x + y);
        System.out.println(allAgeSum.orElse(0) / group.size());
        // allAge.forEach(System.out::println);
    }
}
