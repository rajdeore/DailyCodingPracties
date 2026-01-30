package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Set1Date1212 {
    public static void main(String[] args) {
        int[] givenArr = {1, 2, 3, 4, 5, 6};

        //1Get the highest element of an array
        //my
        Optional result = Arrays.stream(givenArr).boxed().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(result.get());

        //revise Predicate
        Predicate<Integer> isEven = (num) -> {
            if ((num % 2) == 0) {
                return true;
            }
            return false;
        };
        Arrays.stream(givenArr).boxed().filter(isEven).collect(Collectors.toList());

        //2 Given a list of string, join the string with '[' as prefix, ']' as suffix and ',' as delimiter
        List<String> givenStr = Arrays.asList("banan", "Apple", "Orange");

        //my
        Optional<String> collect = givenStr.stream().reduce((s1, s2) -> s1 + "," + s2);
        System.out.println("[" + collect.get() + "]");
        //optimal sol
        System.out.println(givenStr.stream().collect(Collectors.joining(",", "[", "]"))); //[banan,Apple,Orange]
        System.out.println(givenStr.stream().map(word -> "[" + word + "]").collect(Collectors.joining(","))); //[banan],[Apple],[Orange]


        //3 Find the sum of the first two numbers in the given list
        //my
        List<Integer> givenList = Arrays.asList(1, 4, 3, 4, 5, 6);
        System.out.println(givenList.stream().limit(2).reduce(Integer::sum).get());

        //4 find the sum of unique number in a given list
        //my
        Optional<Integer> setUniqueSum = new HashSet<>(givenList).stream()
                .reduce((a, b) -> a + b);
        System.out.println(setUniqueSum.get());

        //other
        int uniqeSum = givenList.stream()
                .distinct()
                .mapToInt(Integer::intValue).sum();
        System.out.println(uniqeSum);

        //Find the words with k vowels in a given sentence
        String sentance = "I have an orange and apple on the table";
        int k = 2;

        List<String> word = Arrays.asList(sentance.split(" "));
        word.stream().filter(words -> countVowel(words) == k).forEach(System.out::println);


        //Arrays.stream();


    }
    public static int countVowel(String word){
        return (int) word.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                .count();
    }
}
