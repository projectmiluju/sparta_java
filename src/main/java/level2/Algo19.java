package level2;

import java.util.Arrays;

public class Algo19 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo19 algo = new Algo19();

        int[] progresses = {93, 30, 55};
        int[] speeds = {93, 30, 55};
        int[] result = {2, 1};
        System.out.println(Arrays.toString(algo.solution(progresses, speeds)));
        if (algo.solution(progresses,speeds) == result) System.out.println("Y"); else System.out.println("N");

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        int[] result2 = {1, 3, 2};
        System.out.println(Arrays.toString(algo.solution(progresses2, speeds2)));
        if (algo.solution(progresses2,speeds2) == result2) System.out.println("Y"); else System.out.println("N");
    }
}
