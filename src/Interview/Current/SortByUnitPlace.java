package Interview.Current;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByUnitPlace {
    public static void main(String[] args) {
        List<Integer> givenList = Arrays.asList(92, 65, 81,39, 47, 14, 73);

        givenList.sort(new MyComparator());

        System.out.println(givenList);  //81, 92, 73, 14, 65, 47, 39


    }
}

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        int unit1 = i1 % 10;
        int unit2 = i2 % 10;


        return unit1 - unit2;
    }
}
