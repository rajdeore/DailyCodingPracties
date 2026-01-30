package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Set10Date1501 {
    public static void main(String[] args) {
        List<Integer> givenList = Arrays.asList(1,2,3,1,2,4, 5,55, 64);
        givenList.stream().findFirst().ifPresent(System.out::println);
        List<Integer> result = givenList.stream().filter(num -> num.toString().startsWith("5")).collect(Collectors.toList());
        result.stream().forEach(System.out::print);
        Optional<Integer> max = givenList.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);
    }
}
