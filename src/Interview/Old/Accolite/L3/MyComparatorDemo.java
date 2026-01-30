package Interview.Old.Accolite.L3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(21,33,42,64,46,95);
        Collections.sort(list, new MyComparator());
        list.forEach(ele -> System.out.print(ele + " "));
        System.out.println();

        list.sort((a,b) -> {
            int unit1 = a % 10;
            int unit2 = b % 10;
            return unit1 - unit2;
        });
        list.forEach(ele -> System.out.print(ele + " "));


        demo d = new demo();
        double result = d.simpleInterest(10,8,2);

        SimpleInterest simple = (p, r, t) -> {
            return (double) (p * r * t) / 100;
        };

        System.out.println(simple.simpleInterest(100, 8, 2));
    }
}
