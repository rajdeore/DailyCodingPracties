package JavaConceptPracties.StreamPracties.IntermediateOperation;

import java.util.Arrays;
import java.util.List;

public class LimitPractice {
    public static void main(String[] args) {
        List<Integer> givenNuber = Arrays.asList(1, 2, 3, 4, 5);

        //print only first 3 elements
        //using limit() -->  method is used to restrict the number of elements in a stream
        givenNuber.stream().limit(3).forEach(System.out :: println);
    }
}
