package level2;

import java.util.Arrays;

public class Algo41 {

    int[][] matrix;

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        this.matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i*columns + j +1;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotate(queries[i]);
        }

        return answer;
    }

    public int rotate(int[] query){
        int r1 = query[0]-1;
        int c1 = query[1]-1;
        int r2 = query[2]-1;
        int c2 = query[3]-1;

        int temp = this.matrix[r1][c1];
        int min = temp;

        for(int i = r1; i < r2; i++){
            this.matrix[i][c1] = this.matrix[i+1][c1];
            if(min > this.matrix[i][c1]) min = this.matrix[i][c1];
        }
        for(int i = c1; i < c2; i++){
            this.matrix[r2][i] = this.matrix[r2][i+1];
            if(min > this.matrix[r2][i]) min = this.matrix[r2][i];
        }
        for(int i = r2; i > r1; i--){
            this.matrix[i][c2] = this.matrix[i-1][c2];
            if(min > this.matrix[i][c2]) min = this.matrix[i][c2];
        }
        for(int i = c2; i > c1; i--){
            this.matrix[r1][i] = this.matrix[r1][i-1];
            if(min > this.matrix[r1][i]) min = this.matrix[r1][i];
        }
        this.matrix[r1][c1+1] = temp;

        return min;
    }


    public static void main(String[] args) {
        Algo41 algo41 = new Algo41();

        int row1 = 6, column1 = 6;
        int[][] queries1 = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
        int[] result1 = {8, 10, 25};
        System.out.println(Arrays.toString(algo41.solution(row1, column1, queries1)));
        if (Arrays.equals(algo41.solution(row1, column1, queries1),result1)) System.out.println("Y"); else System.out.println("N");

        int row2 = 3, column2 = 3;
        int[][] queries2 = {{1, 1, 2, 2},{1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}};
        int[] result2 = {1, 1, 5, 3};
        System.out.println(Arrays.toString(algo41.solution(row2, column2, queries2)));
        if (Arrays.equals(algo41.solution(row2, column2, queries2),result2)) System.out.println("Y"); else System.out.println("N");

        int row3 = 100, column3 = 97;
        int[][] queries3 = {{1, 1, 100, 97}};
        int[] result3 = {1};
        System.out.println(Arrays.toString(algo41.solution(row3, column3, queries3)));
        if (Arrays.equals(algo41.solution(row3, column3, queries3),result3)) System.out.println("Y"); else System.out.println("N");
    }
}
