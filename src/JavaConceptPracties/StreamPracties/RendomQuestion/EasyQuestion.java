package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EasyQuestion {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Abc", "bcd", "Adf");
        //System.out.println(stringList.toString());

        List<Integer> numList = Arrays.asList(1, 2, 2, 2, 2, 4, 5, 6, 7, 12, 3, 11);


        //1. Convert a list of strings to uppercase using Stream API.
        List<String> result = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        //System.out.println(result.toString());

        //2. Filter even numbers from a list of integers.
        List<Integer> evenResult = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        //System.out.println(evenResult.toString());

        //3. Count the number of strings in a list that start with the letter "A".
        long count = stringList.stream().filter(str -> str.charAt(0) == 'A').count();
        //System.out.println(count);

        //4. Find the first element in a stream that is greater than 10
        Optional<Integer> firstNumGreater10 = numList.stream().filter(num -> (num > 10)).findFirst();
        //System.out.println(firstNumGreater10.orElse(-1));

        //5. Sort a list of integers in ascending order using streams.
        List<Integer> sortedList = numList.stream().sorted().collect(Collectors.toList());
        //System.out.println(sortedList.toString());

        //6. Convert a list of strings to a single comma-separated string.
        List<String> fruit = Arrays.asList("apple", "banana", "orange");
        String collect = fruit.stream().collect(Collectors.joining(", "));
        //System.out.println(collect);

        //7. Remove duplicate elements from a list using streams.
        //System.out.println(numList.stream().collect(Collectors.toSet()).toString());
        //System.out.println(numList.stream().distinct().collect(Collectors.toList()));

        // 8. Find the maximum value in a list using Stream API.
        //System.out.println(numList.stream().max(Comparator.naturalOrder()).orElse(-1));
        int maxNum = numList.stream().max(Comparator.naturalOrder()).get();
        //System.out.println(maxNum);




        //9. Find the sum of all elements in an integer list.
        int sum = numList.stream().mapToInt(Integer::intValue).sum();
        //System.out.println(sum);

        //10. Convert a list of integers to a list of their squares.
        List<Integer> squareList = numList.stream().map(num -> num * num ).collect(Collectors.toList());
        //System.out.println(numList.toString() + "square : " + squareList.toString() );

        //11. Check if all elements in a list are positive.
        boolean allPositive = numList.stream().allMatch(num -> num > 0);
        allPositive = numList.stream().noneMatch(n -> n <= 0);
        allPositive = (numList.stream().filter(num -> num < 0).count() == numList.size());

        //12. Check if any element in a list is divisible by 5.
        boolean containsDivisibleBy5 = numList.stream().anyMatch(num -> num % 5 == 0);


    }
}
