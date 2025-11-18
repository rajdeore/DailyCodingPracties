package ArrayPracties;

import java.util.*;

public class FruitIntoBaskets904 {
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> treeRecord = new HashMap<>();

        for (int i = 0; i < fruits.length; i++) {
            if (treeRecord.containsKey(fruits[i])) {
                treeRecord.put(fruits[i], treeRecord.get(fruits[i]) + 1);
            } else {
                treeRecord.put(fruits[i], 1);
            }
        }

        System.out.println(treeRecord.toString());

        //
        TreeSet occurance = new TreeSet<>(treeRecord.values());

        System.out.println(occurance.toString());


        int i = (int) occurance.pollLast() + (int)occurance.pollLast();
        return i;

    }

    public static void main(String[] args) {
        int[] givenArr = {1, 2, 3, 3, 2, 2};
        System.out.println(totalFruit(givenArr));
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return -1;
    }
}
