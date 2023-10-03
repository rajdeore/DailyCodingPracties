package GraphPracties;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bfs {

    public static void bfsImplementation(int source, int dest, ArrayList<ArrayList<Integer>> arrayList, int[] visited, int[] distance) {

        LinkedList<Integer> queue = new LinkedList();
        visited[source] = 1;
        queue.add(source);
        distance[source] = 0;

        while (!queue.isEmpty()) {
            int cur = queue.remove();
            for (int i = 0; i < arrayList.get(cur).size(); i++) {
                if (visited[arrayList.get(cur).get(i)] == 0) {
                    queue.add(arrayList.get(cur).get(i));
                    visited[arrayList.get(cur).get(i)] = 1;
                    distance[arrayList.get(cur).get(i)] = distance[cur] + 1;
                }
            }
        }
    }
}
