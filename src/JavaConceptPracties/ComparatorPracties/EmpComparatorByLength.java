package JavaConceptPracties.ComparatorPracties;

import java.util.Comparator;

public class EmpComparatorByLength implements Comparator<Employ> {

    @Override
    public int compare(Employ o1, Employ o2) {
        int o1NameLength = o1.getName().length();
        int o2NameLength = o2.getName().length();

        if(o1NameLength < o2NameLength){
            return -1;
        } else if (o1NameLength > o2NameLength) {
            return 1;
        }else{
            return(o1.getName().compareTo(o2.getName()));
        }
    }
}
