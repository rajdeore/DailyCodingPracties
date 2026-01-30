package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Set3Date1412 {
    public static void main(String[] args) {
        //1 Tp print the count of each character in the string

        String inputStr = "aabcdd";

        System.out.println(inputStr.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .toString());

        //2 given the list of Integers, find the 1st odd number of the list using Stream function
        List<Integer> givenList = Arrays.asList(2, 4, 6, 8, 3, 5);

        //my
        givenList.stream().filter(x -> x%2 != 0).findFirst().ifPresent(System.out::println);

        // 3. find the Combine of two lists using stream
        List<Integer> givenList2 = Arrays.asList(1,7,9,2);

        List<Integer> result = Stream.concat(givenList.stream(), givenList2.stream()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        result.stream().forEach(System.out::println);

        //// 4. find the intersection of two lists using stream
        givenList2.stream().filter(ele -> givenList.contains(ele)).collect(Collectors.toList()).forEach(System.out::print);


    }
}
