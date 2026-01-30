package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuestionSet2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 3, 3,  2, 3, 4, 4, 5));
        List<Integer> l2 = Arrays.asList(11,21,31,41,51);

        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        //System.out.println(result);


        //find number start with 1
        List<Integer> reult = list.stream().filter(x -> Integer.toString(x).startsWith("1")).collect(Collectors.toList());
        //System.out.println(reult);

        //join two stream
        List<Integer> mergeTwo = Stream.concat(list.stream(),l2.stream()).sorted().collect(Collectors.toList());

        //find prime number


        Predicate<Integer> isPrime = (num) -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        List<Integer> primeNumber = list.stream().peek(num -> System.out.println("Number : " + num)).filter(isPrime).collect(Collectors.toList());

        List<String> givenStr = Arrays.asList("1ab", "raj", "3bc", "wer");

        Predicate<String> isStartWith = (str) -> {
           // int i = Integer.parseInt(str.charAt(0));
            int i = (int) str.charAt(0);
            if(i >= 48 && i<= 57){
                return true;
            }
            return false;
        };

        List<String> result1 =  givenStr.stream().filter(isStartWith).collect(Collectors.toList());
        result1.stream().forEach(System.out::println);

      /*  char ch = '0';
        System.out.println((int) ch);*/
        List<String> result2 =  givenStr.stream().filter(str -> Character.isDigit(str.charAt(0))).collect(Collectors.toList());
        result2.stream().forEach(System.out::println);


        List<Double> decimalNum = Arrays.asList(2.1, 3.14, 4.3, 1.1, 2.54 );
        int n = 2;
        decimalNum.stream().sorted(Comparator.reverseOrder()).skip(n).limit(1).forEach(System.out :: println);

        int[] arr = {2,4,1,3,5,7,9,6};
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().ifPresent(System.out :: println);









    }

}
