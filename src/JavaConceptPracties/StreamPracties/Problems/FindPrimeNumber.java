package JavaConceptPracties.StreamPracties.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPrimeNumber {
    public static void main(String[] args) {
        List<Integer> givenNumber = Arrays.asList(1,34,78,107, 17);

        List<Integer> result = givenNumber.stream().filter(FindPrimeNumber::isPrime).collect(Collectors.toList());

        System.out.println(result);
    }
    

    private static boolean isPrime(Integer num) {
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }

        }
        return true;
    }
}
