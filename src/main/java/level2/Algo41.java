package level2;

import java.util.Arrays;

public class Algo41 {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        return answer;
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
