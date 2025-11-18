package JavaConceptPracties.StreamPracties.IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctPractice {

    public static void main(String[] args) {
        List<Integer> givenNumber = Arrays.asList(1, 2, 3, 1, 4, 2, 3, 5);

        List<Integer> result = givenNumber.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
