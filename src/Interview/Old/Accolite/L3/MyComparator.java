package Interview.Old.Accolite.L3;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        int unit1 = i1 % 10;
        int unit2 = i2 % 10;
        return unit1- unit2;
    }
}


