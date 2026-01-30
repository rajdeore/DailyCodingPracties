package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Set7Date1912 {
    public static void main(String[] args) {
        //1 Convert array to list using stream
        int[] givenArr = {1,2,3,4,5,1};
        Map<Object, Long> result = Arrays.stream(givenArr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));


    }
}
