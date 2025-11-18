package JavaConceptPracties.StreamPracties.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//terminal operation
//performs a reduction on the elements of the stream. it combines the elements of the stream into a single result using a binary operator.
// usefull for sum, finding the max, min or performing custom aggregations
public class ReducePractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Calculate the sum of all elements using reduce()
        Optional<Integer> sum = numbers.stream().reduce((x,y) -> x+y);
        System.out.println("sum of all elements = " + sum.orElse(0));

        //find max of all elements using reduce()
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("sum of all elements = " + max.orElse(0));

        //Concatenate all string in a list using reduce()
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        Optional<String> mixJuice = fruits.stream().reduce((x , y) -> x + " " + y);
        System.out.println("Cocatenate string = " +  mixJuice.orElse(" "));

    }
}
