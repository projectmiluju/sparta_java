package level3;

import java.util.Arrays;

public class Algo8 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo8 algo8 = new Algo8();

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] result = {4, 1, 3, 0};
        int[] answer = algo8.solution(genres, plays);
        System.out.println(Arrays.toString(answer));
        if (Arrays.equals(result, answer)) System.out.println("Y"); else System.out.println("N");
    }
}
