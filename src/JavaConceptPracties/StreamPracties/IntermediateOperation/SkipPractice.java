package JavaConceptPracties.StreamPracties.IntermediateOperation;

import java.util.Arrays;
import java.util.List;

public class SkipPractice {
    public static void main(String[] args) {
        List<Integer> givenNuber = Arrays.asList(1, 2, 3, 4, 5);

        //print elements after 3rd position.
        //using limit() -->  method is used to Skip a specified number of elements from the beginning of the stream.
        givenNuber.stream().skip(3).forEach(System.out :: println);
    }
}
