package JavaConceptPracties.StreamPracties.TerminalOperation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectPractice {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry");

        //Collect the elements into list
        List<String> collectedList = stream.collect(Collectors.toList());

        //collect stream elements into set
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
        Set<Integer> collectedSet = intStream.collect(Collectors.toSet());

        Stream<String> fruitStream = Stream.of("apple", "banana", "cherry");

        // Collected the elements into map using the length of the string as the key

        Map<Integer, Set<String>> lengthToStringsMap = fruitStream
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()
                ));

        System.out.println(lengthToStringsMap);


    }
}
