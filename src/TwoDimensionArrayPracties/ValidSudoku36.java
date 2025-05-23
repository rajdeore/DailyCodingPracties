package TwoDimensionArrayPracties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku36 {

    //Using Array of hashSet
    public static boolean isValidSudokuUsingHashSet(char[][] board){

        HashSet<Character>[] rowRecord = new  HashSet[9];
        HashSet<Character>[] columRecord = new  HashSet[9];
        HashSet<Character>[] boxRecord = new  HashSet[9];

        //initialise hashSet
        for (int i = 0; i < 9; i++) {
            rowRecord[i] = new HashSet<>();
            columRecord[i] = new HashSet<>();
            boxRecord[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                char element = board[i][j];

                if(element == '.'){
                    continue;
                }

                //row checking
                if(rowRecord[i].contains(element)){
                    return false;
                }else{
                    rowRecord[i].add(element);
                }

                //colum checking
                if(columRecord[j].contains(element)){
                    return false;
                }else{
                    columRecord[j].add(element);
                }

                //box checking
                int boxNumber = (i/3) * 3 + j/3;
                if (boxRecord[boxNumber].contains(element)){
                    return false;
                }else{
                    boxRecord[boxNumber].add(element);
                }

            }

        }


        return true;
    }









    public static boolean isValidSudoku(char[][] board) {

        //size is 9*9
        //check row colum and cube
        // using hash map of typr: <Integer, ArrayList : rowRecord, columRecord, cubeRecord

        HashMap<Integer, ArrayList> rowRecord = new HashMap<>();
        HashMap<Integer, ArrayList> columRecord = new HashMap<>();
        HashMap<Integer, ArrayList> boxRecord = new HashMap<>();


        //add keys to rcords
        for (int i = 0; i < 9; i++) {
            rowRecord.put(i, new ArrayList<>());
            columRecord.put(i, new ArrayList<>());
            boxRecord.put(i, new ArrayList<>());

        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                } else {

                    if (rowRecord.get(i).contains(board[i][j])) {
                        return false;
                    } else {
                        //rowRecord.get(i).add(board[i][j]);
                        ArrayList temp = rowRecord.get(i);
                        temp.add(board[i][j]);
                        rowRecord.put(i, temp);
                    }

                    if (columRecord.get(j).contains(board[i][j])) {
                        return false;
                    } else {
                        //rowRecord.get(j).add(board[i][j]);
                        ArrayList temp2 = columRecord.get(j);
                        temp2.add(board[i][j]);
                        columRecord.put(j, temp2);
                    }

                    //box
                    int idx = (i/3) * 3 + j/3;
                    if (boxRecord.get(idx).contains(board[i][j])) {
                        return false;
                    } else {
                        //rowRecord.get(j).add(board[i][j]);
                        ArrayList temp3 = boxRecord.get(idx);
                        temp3.add(board[i][j]);
                        boxRecord.put(idx, temp3);
                    }
                }

            }
        }

        System.out.println();
        return true;
    }

    public static void main(String[] args) {
        char[][] givenSudoku = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        //System.out.println(Arrays.deepToString(givenSudoku));
        System.out.println(isValidSudoku(givenSudoku));

        System.out.println(isValidSudokuUsingHashSet(givenSudoku));




    }
}
