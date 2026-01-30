package JavaConceptPracties.ComparatorPracties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employ> emp = new ArrayList<>();
/*        emp.add(new Employ("abc", 1, 1234));
        emp.add(new Employ("ghi", 3, 910));
        emp.add(new Employ("def", 2, 5678));*/



        emp.add(new Employ("a", 1, 1234));
        emp.add(new Employ("gh", 3, 910));
        emp.add(new Employ("aef", 2, 5678));
        emp.add(new Employ("aef", 2, 567));
        emp.add(new Employ("ae", 2, 56));

        System.out.println(emp);
        Collections.sort(emp, new EmpComparator());

        Comparator<Employ> tryComp = Comparator.comparing(Employ :: getName).thenComparing(Employ :: getPhone);
        Collections.sort(emp, tryComp);
        System.out.println(emp);
        //Collections.sort(emp, new EmpComparatorByLength());
        //System.out.println(emp);
        List<Employ> result = emp.stream()
                .sorted(Comparator.comparing(Employ :: getName)
                        .thenComparing(Employ::getPhone))
                .collect(Collectors.toList());
        //System.out.println(result.toString());
    }
}
