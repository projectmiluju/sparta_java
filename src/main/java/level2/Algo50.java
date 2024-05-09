package level2;

import java.util.Arrays;

public class Algo50 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2[0].length ; j++){
                for(int k = 0 ; k < arr1[0].length ; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo50 algo50 = new Algo50();

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] res1 = {{15, 15}, {15, 15}, {15, 15}};
        int[][] ans1 = algo50.solution(arr1, arr2);
        System.out.println(Arrays.deepToString(ans1));
        if (Arrays.deepEquals(res1, ans1)) System.out.println("Y"); else System.out.println("N");

        int[][] brr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] brr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] res2 = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
        int[][] ans2 = algo50.solution(brr1, brr2);
        System.out.println(Arrays.deepToString(ans2));
        if (Arrays.deepEquals(res2, ans2)) System.out.println("Y"); else System.out.println("N");
    }
}
