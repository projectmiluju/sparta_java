import java.util.Arrays;

public class Length {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }

        return answer;
    }
    public static void main(String[] args){
        long a = 2;
        int b = 5;
        Length solution = new Length();
        System.out.println(Arrays.toString(solution.solution(a,b)));
    }
}
