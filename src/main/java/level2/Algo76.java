package level2;

import java.util.Arrays;

public class Algo76 {
    public int[][] solution(int n) {
        int[][] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo76 algo76 = new Algo76();

        int n = 2;
        int[][] result = {{1,2},{1,3},{2,3}};
        int[][] answer = algo76.solution(n);
        System.out.println(Arrays.deepToString(answer));
        if (Arrays.deepEquals(result, answer)) System.out.println("Y"); else System.out.println("N");
    }
}
