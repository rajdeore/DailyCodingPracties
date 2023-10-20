package JavaConceptPracties.ComparatorPracties;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employ> {
    @Override
    public int compare(Employ o1, Employ o2) {
       // return o1.getName().compareTo(o2.getName());
        return o1.getPhone() - o2.getPhone();
    }
}
