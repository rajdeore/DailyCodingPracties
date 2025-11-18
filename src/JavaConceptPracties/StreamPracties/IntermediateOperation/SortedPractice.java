package JavaConceptPracties.StreamPracties.IntermediateOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedPractice {
    public static void main(String[] args) {
        List<Integer> givenNumber = Arrays.asList(2, 1, 4, 7, 2, 5);

        //Using Stream.sorted()
        Stream result = givenNumber.stream().sorted(new ReverseComparator());
        //System.out.println(result);
        result.forEach(System.out :: println);
    }
}
//Comparator
class ReverseComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int num1 = (int) o1;
        int num2 = (int) o2;
        //return -1;
        if(num1 > num2){
            return -1;
        } else if (num1 == num2) {
            return 0;
        }else {
            return 1;
        }

    }
}