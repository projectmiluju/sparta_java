package level2;

import java.util.Arrays;

public class Algo52 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i]<numbers[j]) {
                    answer[i] = numbers[j];
                    break;
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        answer[numbers.length-1] = -1;
        return answer;
    }

    public static void main(String[] args) {
        Algo52 algo52 = new Algo52();

        int[] num1 = {2, 3, 3, 5};
        int[] res1 = {3, 5, 5, -1};
        int[] ans1 = algo52.solution(num1);
        System.out.println(Arrays.toString(ans1));
        if (Arrays.equals(res1, ans1)) System.out.println("Y"); else System.out.println("N");

        int[] num2 = {9, 1, 5, 3, 6, 2};
        int[] res2 = {-1, 5, 6, 6, -1, -1};
        int[] ans2 = algo52.solution(num2);
        System.out.println(Arrays.toString(ans2));
        if (Arrays.equals(res2, ans2)) System.out.println("Y"); else System.out.println("N");
    }
}
