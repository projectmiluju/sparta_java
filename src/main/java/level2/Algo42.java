package level2;

import java.util.Arrays;

public class Algo42 {
    public int[] solution(String msg) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo42 algo42 = new Algo42();

        String msg1 = "KAKAO";
        int[] result1 = {11, 1, 27, 15};
        System.out.println(Arrays.toString(algo42.solution(msg1)));
        if (algo42.solution(msg1) == result1) System.out.println("Y"); else System.out.println("N");

        String msg2 = "TOBEORNOTTOBEORTOBEORNOT";
        int[] result2 = {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34};
        System.out.println(Arrays.toString(algo42.solution(msg2)));
        if (algo42.solution(msg2) == result2) System.out.println("Y"); else System.out.println("N");

        String msg3 = "ABABABABABABABAB";
        int[] result3 = {1, 2, 27, 29, 28, 31, 30};
        System.out.println(Arrays.toString(algo42.solution(msg3)));
        if (algo42.solution(msg3) == result3) System.out.println("Y"); else System.out.println("N");
    }
}
