package ArrayPracties;

import java.util.*;
import java.util.stream.Collectors;

public class PrintHighestLowest {
    public static void main(String[] args) {
        List<Integer> givenList = Arrays.asList(1,2,3,4,5,6);
        //1,6,2,5,3,4
        List<Integer> sortedList = givenList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        int i =0, j = sortedList.size()-1;
        while(i<=j){
            resultList.add(sortedList.get(i));
            resultList.add(sortedList.get(j));
            i++;
            j--;
        }
        resultList.stream().forEach(ele -> System.out.println(ele + " "));


    }
}
