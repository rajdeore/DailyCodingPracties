package Interview.Old.Accolite.L2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,2,3,3, 4,4,4,5);

        List<Integer> collect = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .flatMap(e -> Collections.nCopies(e.getValue().intValue(), e.getKey()).stream())
                .collect(Collectors.toList());

        collect.forEach(ele -> System.out.print(ele + " "));

        Map<Integer, Integer> freq = new HashMap<>();

        for(int ele : list){
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }
        //freq.entrySet().forEach(System.out::println);

        list.sort((a,b) -> {
            int freqComp = freq.get(a) - freq.get(b);
            return freqComp !=0 ? freqComp : a - b;
        });
        list.forEach(ele -> System.out.println(ele + " "));
        //Stream<Map.Entry<Integer, Long>> sorted = collect.entrySet().stream().sorted(Map.Entry.comparingByValue());





    }
}
