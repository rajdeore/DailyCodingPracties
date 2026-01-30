package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Set5Date1612 {
    public static void main(String[] args) {
        //1 return all non null value
        List<Integer> givenList = Arrays.asList(1, null, 2,3,4, null,6,7 );
        List<Integer> result = givenList.stream().filter(Objects::nonNull).collect(Collectors.toList());
        result.stream().forEach(System.out::println);

        //2 find the avg of the list
        result.stream().mapToInt(ele -> ele).average().ifPresent(System.out::println);

        //3 filter the string with length 5
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "abcde");
        List<String> fiveLenFruit = fruits.stream().filter(fruit -> fruit.length() == 5).collect(Collectors.toList());
        fiveLenFruit.stream().forEach(System.out::println);

        // 4 group a list emp by deparment
        List<Employ> employees = Arrays.asList(new Employ("ShamIt1", 30, "IT"),
                new Employ("ShamIt2", 30, "IT"),
                new Employ("ShamHR1", 30, "HR"),
                new Employ("ShamHR2", 30, "HR"));
        Map<String, List<Employ>> mapByDept = employees.stream().collect(Collectors.groupingBy(Employ::getDept));
        mapByDept.forEach((s, list) -> {
            System.out.println(s + " " +   list.size());
        });
        //5 count the number of emp in each dept
        mapByDept.forEach((s, list) -> {
            System.out.println(s + " " +   list);
        });
    }
}
