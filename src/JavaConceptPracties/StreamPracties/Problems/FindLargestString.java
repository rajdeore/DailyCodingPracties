package JavaConceptPracties.StreamPracties.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindLargestString {

    public static void main(String[] args) {
        List<String> givenString = Arrays.asList("Apple", "Banana", "Mango");

        //Stream<Integer> sizeStream = givenString.stream().map(String::length);
        //sizeStream.forEach(System.out:: println);
        Optional<Integer> maxSize = givenString.stream().map(String::length).max(Comparator.naturalOrder());
        System.out.println(maxSize.orElse(0));

        Optional<String> longestString = givenString.stream().max(Comparator.comparingInt(s -> s.length()));
        System.out.println("Longest String = " + longestString.orElse(" "));
    }
}
