package JavaConceptPracties.rough.JavaConceptRough;

import java.util.*;

public class ComparatorUsingComparatorClass {
    static Comparator<Integer> integerComparator = Comparator.naturalOrder();

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,4,2,5,3,8);
        Collections.sort(list, integerComparator);
        System.out.println(list.toString());

    }


}
