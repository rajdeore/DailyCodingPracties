package JavaConceptPracties.StreamPracties.IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPractice {

    public static void main(String[] args) {
        List<Integer> givenNumber = Arrays.asList(1, 2, 3, 4, 5, 6);

        //find even
        List<Integer> resultList = givenNumber.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
