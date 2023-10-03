package GraphPracties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class GraphRepresentationUsingMatrix {
    //two-way to save or represent graph.
    // 1. Array of linked list
    // 2. Adjustment matrix

    public static void convertToString(int arr[][]) {

        for (int n = 0; n < arr.length; n++)
            System.out.println(Arrays.toString(arr[n]));
    }

    static void addEdgeToAdjMatrix(int adjMatrix[][], int source, int dest) {
        adjMatrix[source - 1][dest - 1] = 1;
        adjMatrix[dest - 1][source - 1] = 1;
    }

    public static void main(String[] args) {
        int vertex = 4;
        int edge = 10;

        // using adj matrix
        int adjMatrix[][] = new int[vertex][vertex];
        convertToString(adjMatrix);
        addEdgeToAdjMatrix(adjMatrix, 1, 2);
        addEdgeToAdjMatrix(adjMatrix, 2, 3);
        convertToString(adjMatrix);

    }
}
