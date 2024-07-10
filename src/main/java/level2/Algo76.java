package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo76 {
    private static final List<int[]> arr = new ArrayList<>();

    public int[][] solution(int n) {
        move(n, 1, 2, 3);
        return arr.toArray(int[][]::new);
    }

    private static void move(int cnt, int start, int mid, int end) {
        if (cnt == 0) return;
        move(cnt - 1, start, end, mid);
        arr.add(new int[]{start, end});
        move(cnt - 1, mid, start, end);
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
