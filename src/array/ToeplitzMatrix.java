package array;

import java.util.Scanner;

/**
 * 托普利茨矩阵：
 *  如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，
 *  那么这个矩阵是托普利茨矩阵。
 *  给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 *
 * 示例1：
 *  输入: matrix = 1,2,3,4
 *                5,1,2,3
 *                9,5,1,2
 *  输出: True
 */
public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] matrix){

        int M = matrix.length;
        int N = matrix[0].length;
        if(M==1 || N==1)
            return true;
        // 上三角
        int i = 0;
        while(i < N-1){
            int j = i;
            int temp = 0;
            int num = matrix[temp][i];
            while(temp < M && j < N){
                if(num != matrix[temp++][j++])
                    return false;
            }
            i++;
        }

        // 下三角
        i = 1;
        while(i < M-1){
            int j = i;
            int temp = 0;
            int num = matrix[i][temp];
            while(temp < N && j< M){
                if(num != matrix[j++][temp++])
                    return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int M = in.nextInt();
            int N = in.nextInt();
            int[][] matrix = new int[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }
            if(isToeplitzMatrix(matrix))
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
        }
    }
}
