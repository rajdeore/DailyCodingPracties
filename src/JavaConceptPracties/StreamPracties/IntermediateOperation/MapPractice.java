package JavaConceptPracties.StreamPracties.IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MapPractice {
    //To convert element from one type to another

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

        //Using map() to square each element of the list
        List<Integer> numStream =  number.stream()
                                        .map(num -> num * num)
                                        .collect(Collectors.toList());


        //to print stream
        Stream<Integer> numPrint = number.stream().map(num -> num-1);
        numPrint.forEach(System.out::println);

        //System.out.println(numStream);


    }
}
