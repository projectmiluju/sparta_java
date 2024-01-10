package level2;

import java.util.Arrays;

public class Algo3 {
    public int solution(int []A, int []B) {
        int answer = 0;
        for (int i = 0; i<A.length; i++){
            Arrays.sort(A);
            Arrays.sort(B);
            answer = answer + (A[i]*B[A.length-i-1]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo3 algo = new Algo3();
        int []A = {1, 4, 2};
        int []B = {5, 4, 4};
        System.out.println(algo.solution(A,B));
    }
}
