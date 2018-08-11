package primary_tutorial.array;

import java.util.Scanner;

/**
 * 题目：旋转图像
 */
public class Rotate2DArray {

    private static void rotate(int[][] matrix){
        // 先求转置矩阵，再每行反转
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            for (int j = 0,k=n-1; j < k; j++,k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[][] array = new int[n][n];
            for(int i=0; i<n; i++){
                for (int j = 0; j < n; j++) {
                    array[i][j] = in.nextInt();
                }
            }

        }
    }
}
