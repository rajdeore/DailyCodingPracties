package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Set9Date0101 {
    public static void main(String[] args) {
        //1. Remove duplicate from the string and return in the same order
        String givenStr = "dabcadefg";
        givenStr.chars().mapToObj(ch -> (char) ch).distinct().forEach(System.out::print);
        System.out.println();
        Arrays.stream(givenStr.split("")).distinct().forEach(System.out::print);

        System.out.println();
        System.out.println("******************************************");

        //2 givne a sentence, find the word that has the Nth highest length
        String givenSent = "I hshdhd am learning streams API in java java";
        Optional<String> first = Arrays.stream(givenSent.split(" ")).sorted((s1, s2) -> -s1.length() + s2.length()).skip(1).limit(1).findFirst();
        System.out.println(first.get());

        System.out.println();
        System.out.println("******************************************");

        //3 given a sentence , find the occurrence of the each word

        Map<String, Long> collect =
                Arrays.stream(givenSent.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        collect.entrySet()
                .stream()
                .filter(e -> e.getValue() > 0)
                .forEach(System.out::print);
    }
}