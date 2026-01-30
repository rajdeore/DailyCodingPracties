package JavaConceptPracties.StreamPracties.IntermediateOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterPractice {

    public static void main(String[] args) {
        List<Integer> givenNumber = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> sortList = givenNumber.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(sortList);
        Predicate<Integer> findEven = (ele) -> {
          if(ele % 2 == 0)
              return true;
          return false;
        };


        //find even
        List<Integer> resultList = givenNumber.stream()
                .filter(findEven)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
