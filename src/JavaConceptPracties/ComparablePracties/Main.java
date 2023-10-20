package JavaConceptPracties.ComparablePracties;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employ> emp = new ArrayList<>();
        emp.add(new Employ("abc", 1, 1234));
        emp.add(new Employ("ghi", 3, 910));
        emp.add(new Employ("def", 2, 5678));


        System.out.println(emp);

        Collections.sort(emp);
        System.out.println(emp);


    }
}
