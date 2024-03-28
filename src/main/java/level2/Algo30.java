package level2;

import java.util.Arrays;

public class Algo30 {

    public int[] solution(String[][] places) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo30 algo30 = new Algo30();
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        int[] result = {1, 0, 1, 1, 1};
        System.out.println(Arrays.toString(algo30.solution(places)));
        if (Arrays.equals(result, algo30.solution(places))) {
            System.out.println("Y");
        }else System.out.println("N");

    }
}
