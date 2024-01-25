package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo20 {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};

        for (int i = 0; i<answers.length; i++){
            if (answers[i] == first[i%5]) score[0] ++ ;
            if (answers[i] == second[i%8]) score[1] ++ ;
            if (answers[i] == third[i%10]) score[2] ++ ;
        }

        int max = Math.max(score[0], Math.max(score[1],score[2]));

        List<Integer> answ = new ArrayList<>();
        for (int i = 0; i<score.length; i++){
            if (max == score[i]){
                answ.add(i+1);
            }
        }
        int[] answer = new int[answ.size()];
        for (int i = 0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo20 algo = new Algo20();
        int[] a = {1,3,2,4,2};
        System.out.println(Arrays.toString(algo.solution(a)));
    }
}
