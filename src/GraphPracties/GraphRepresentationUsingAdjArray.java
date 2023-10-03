package GraphPracties;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphRepresentationUsingAdjArray {
    //two-way to save or represent graph.
    // 1. Array of linked list
    // 2. Adjustment matrix

/*    private int vertex;

    private LinkedList<LinkedList> adjdg ;

    //constructor
    GraphRepresentationUsingAdjArray(int vertex){
        vertex = this.vertex;

        for (int i = 0; i < adj.size(); i++) {
            adj.add(new LinkedList());
        }
    }

    void addEdge(int v, int w){
        adj.get(v).add(w);
    }*/


    static void addEdgeToArrayList(int source, int dest, ArrayList<ArrayList<Integer>> arrayList) {
        arrayList.get(source).add(dest);
        arrayList.get(dest).add(source);
    }

    //to delete edge
    static void deleteEdgeToArrayList(int source, int dest, ArrayList<ArrayList<Integer>> arrayList) {
        arrayList.get(source).remove(dest);
        arrayList.get(dest).remove(source);
    }

    // To Print
    static void toPrint(ArrayList<ArrayList<Integer>> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                System.out.print(arrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertex = 4;
        //  int edge = 10;

        //using Arraylist of LinkedList
        ArrayList<ArrayList<Integer>> listRepresentation = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            // listRepresentation.add(i);
            listRepresentation.add(new ArrayList<Integer>());
        }

        addEdgeToArrayList(0, 1, listRepresentation);
        addEdgeToArrayList(1, 2, listRepresentation);
        addEdgeToArrayList(0, 2, listRepresentation);
        addEdgeToArrayList(2, 3, listRepresentation);
        // addEdgeToArrayList(1,3, listRepresentation);

        toPrint(listRepresentation);

        int[] visited = new int[listRepresentation.size()];
        System.out.println("Before BFS");
        System.out.print("  Visited array : ");
        for (int a : visited
        ) {
            System.out.print(a);
        }
        System.out.println();

        //distance array
        int[] distance = new int[listRepresentation.size()];
        System.out.print("  Distance array : ");
        for (int a : visited
        ) {
            System.out.print(a);
        }
        System.out.println();

        Bfs bfs = new Bfs();
        bfs.bfsImplementation(0, 3, listRepresentation, visited, distance);

        System.out.println("After BFS");
        System.out.print("  Visited array : ");
        for (int a : visited
        ) {
            System.out.print(a);
        }
        System.out.println();

        System.out.print("  Distance array : ");
        for (int a : distance
        ) {
            System.out.print(a);
        }
    }
}
