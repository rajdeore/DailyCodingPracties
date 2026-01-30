package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Set6Date1712 {
    public static void main(String[] args) {
        //1. list all even number
        List<Integer> givenList = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> filterEven = givenList.stream().filter(ele -> ele % 2 == 0).collect(Collectors.toList());
        filterEven.forEach(ele -> System.out.print(ele + " "));
    }
}
