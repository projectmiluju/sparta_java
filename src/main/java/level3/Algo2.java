package level3;

import java.util.Arrays;

public class Algo2 {

    public int[] solution(String[] operations) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo2 algo = new Algo2();

        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(Arrays.toString(algo.solution(operations)));

        String[] operations2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(algo.solution(operations2)));
    }
}
