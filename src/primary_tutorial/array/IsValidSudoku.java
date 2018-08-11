package primary_tutorial.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 题目：有效的数独
 *
 53..7....
 6..195...
 .98....6.
 8...6...3
 4..8.3..1
 7...2...6
 .6....28.
 ...419..5
 ....8..79


 */
public class IsValidSudoku {

    private static boolean isValidSuduku(char[][] board){
//        boolean[][] row = new boolean[9][10];
//        boolean[][] col = new boolean[9][10];
//        boolean[][] rect = new boolean[9][10];
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                char c = board[i][j];
//                if(c == '.')
//                    continue;
//                int v = c - '0';
//                if(row[i][v]) return false;
//                if(col[j][v]) return false;
//
//                int n = i/3 * 3 + j/3;
//                if(rect[n][v]) return false;
//
//                row[i][v] = true;
//                col[j][v] = true;
//                rect[n][v] = true;
//
//            }
//        }
//        return true;
        int[][] signs = new int[3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                int n = 1 << (board[i][j] - '1');
                int cubeIndex = i / 3 * 3 + j / 3;
                if ((signs[0][i] & n) != 0 || (signs[1][j] & n) != 0 || (signs[2][cubeIndex] & n) != 0)
                    return false;
                signs[0][i] |= n;

                signs[1][j] |= n;
                signs[2][cubeIndex] |= n;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            char[][] board = new char[9][9];
            String row;
            for (int i = 0; i < 9; i++) {
                row = in.nextLine();
                board[i] = row.toCharArray();
            }
            for (int i = 0; i < 9; i++) {

                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            if(isValidSuduku(board)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
