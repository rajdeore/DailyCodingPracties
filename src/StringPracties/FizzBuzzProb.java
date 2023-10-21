package StringPracties;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzProb {
    /*
        Given an integer n, return a string array answer (1-indexed) where:
        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        answer[i] == "Fizz" if i is divisible by 3.
        answer[i] == "Buzz" if i is divisible by 5.
        answer[i] == i (as a string) if none of the above conditions are true.
    */
    static public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (((i) % 3 == 0) && ((i) % 5 == 0)) {
                resultList.add("FizzBuzz");
            } else if ((i) % 3 == 0) {
                resultList.add("Fizz");
            } else if ((i) % 5 == 0) {
                resultList.add("Buzz");
            } else {
                resultList.add(Integer.toString(i));
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        int n = 16;
        List<String> resultList = new ArrayList<>(n);
        resultList = fizzBuzz(n);
        System.out.println(resultList);
    }
}
