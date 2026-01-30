package ArrayPracties;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class CountCoveredBuilding3531 {
    public static int countCoveredBuilding(int n, int[][] buildings){
        int count = 0;

        Map<Integer, TreeSet<Integer> > rowToCol = new HashMap<>();
        Map<Integer, TreeSet<Integer>> colToRow = new HashMap<>();

        for(int[] building  : buildings){
            Integer x = building[0], y = building[1];
            rowToCol.computeIfAbsent(x, k -> new TreeSet<>()).add(y);
            colToRow.computeIfAbsent(y, k -> new TreeSet<>()).add(x);
        }

        for (int[] building : buildings){
            int x = building[0], y = building[1];
            Integer left = rowToCol.get(x).lower(y);
            Integer rigth = rowToCol.get(x).higher(y);
            Integer up = colToRow.get(y).higher(x);
            Integer down = colToRow.get(y).lower(x);

            if(left != null && rigth != null && up != null && down != null){
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        int[][] buildings = {{1,3},{3,2},{3,3},{3,5},{5,3}};
        int n = 5;
        System.out.println(countCoveredBuilding(n, buildings));

    }
}
