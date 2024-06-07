package level2;

import java.util.Arrays;

public class Algo68 {
    public int[] solution(String[] maps) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo68 algo68 = new Algo68();

        String[] map1 = {"X591X","X1X5X","X231X", "1XXX1"};
        int[] res1 = {1, 1, 27};
        int[] ans1 = algo68.solution(map1);
        System.out.println(Arrays.toString(ans1));
        if (Arrays.equals(res1, ans1)) System.out.println("Y"); else System.out.println("N");

        String[] map2 = {"XXX", "XXX", "XXX"};
        int[] res2 = {-1};
        int[] ans2 = algo68.solution(map2);
        System.out.println(Arrays.toString(ans2));
        if (Arrays.equals(res2, ans2)) System.out.println("Y"); else System.out.println("N");
    }
}
