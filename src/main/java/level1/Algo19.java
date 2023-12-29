package level1;

import java.util.Arrays;

public class Algo19 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length-m; i>=0; i -= m){
            answer += score[i] * m;
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo19 algo = new Algo19();
        int a = 3;
        int b = 4;
        int[] c = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(algo.solution(a,b,c));
    }
}
