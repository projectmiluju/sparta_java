package level2;

import java.util.Arrays;

public class Algo56 {
    public int[] solution(int[][] arr) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo56 algo56 = new Algo56();

        int[][] arr1 = {{1,1,0,0}, {1,0,0,0}, {1,0,0,1}, {1,1,1,1}};
        int[] res1 = {4, 9};
        int[] ans1 = algo56.solution(arr1);
        System.out.println(Arrays.toString(ans1));
        if (Arrays.equals(res1, ans1)) System.out.println("Y"); else System.out.println("N");

        int[][] arr2 = {{1,1,1,1,1,1,1,1}, {0,1,1,1,1,1,1,1}, {0,0,0,0,1,1,1,1}, {0,1,0,0,1,1,1,1}, {0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1}, {0,0,0,0,1,0,0,1}, {0,0,0,0,1,1,1,1}};
        int[] res2 = {4, 9};
        int[] ans2 = algo56.solution(arr2);
        System.out.println(Arrays.toString(ans2));
        if (Arrays.equals(res2, ans2)) System.out.println("Y"); else System.out.println("N");
    }
}
