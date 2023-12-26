package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algo16 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < score.length; i++){
            rank.add(score[i]);

            if (rank.size() > k){
                rank.remove(Collections.min(rank));
            }

            answer[i] = Collections.min(rank);
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo16 algo = new Algo16();
        int a = 3;
        int[] b = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(algo.solution(a, b)));
    }
}
