package level2;

import java.util.Arrays;

public class Algo65 {
    public long[] solution(long[] numbers) {
        long[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo65 algo = new Algo65();

        long[] numbers = {2, 7};
        long[] result = {3, 11};
        long[] answer = algo.solution(numbers);
        System.out.println(Arrays.toString(answer));
        if (Arrays.equals(result, answer)) System.out.println("Y"); else System.out.println("N");
    }

}
