package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Set8Date2212 {
    public static void main(String[] args) {
        //1 given a sentence, find the word that has the highest length
        String sentance = "I am leaning Stream API in java ";
        List<String> sentToList = Arrays.asList(sentance.split(" "));
        System.out.println(sentToList.toString());

        sentToList.stream().reduce((s1,s2) -> s1.length() > s2.length() ? s1 : s2 ).ifPresent(System.out::println);

        Arrays.stream(sentance.split(" ")).max(Comparator.comparing(String::length)).ifPresent(System.out::println);

        //2 remove duplicates from the string and return in the same order
        String str = "bcadanb";
        //Arrays.stream(str.toChar)

    }
}
