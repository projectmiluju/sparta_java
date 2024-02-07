package level1;

import java.util.Objects;
import java.util.SortedMap;

public class Algo31 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Algo31 algo = new Algo31();
        int[] n1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        String result1 = "LRLLLRLLRRL";
        System.out.println(algo.solution(n1,hand1));
        if (Objects.equals(algo.solution(n1, hand1), result1)) System.out.println("Y"); else System.out.println("N");

        int[] n2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        String result2 = "LRLLRRLLLRR";
        System.out.println(algo.solution(n2,hand2));
        if (Objects.equals(algo.solution(n2, hand2), result2)) System.out.println("Y"); else System.out.println("N");

        int[] n3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";
        String result3 = "LLRLLRLLRL";
        System.out.println(algo.solution(n3,hand3));
        if (Objects.equals(algo.solution(n3, hand3), result3)) System.out.println("Y"); else System.out.println("N");
    }
}
