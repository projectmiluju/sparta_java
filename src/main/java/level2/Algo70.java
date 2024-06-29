package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo70 {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];

        List<Integer> people = new ArrayList<>();
        long factorial = 1;
        int index = 0;

        for(int i=1; i<=n; i++) {
            factorial *= i;
            people.add(i);
        }

        k--;
        while(n > 0) {
            factorial /= n;
            int value = (int) (k / factorial);
            answer[index++] = people.get(value);
            people.remove(value);

            k %= factorial;
            n--;
        }

        return answer;
    }
    public static void main(String[] args) {
        Algo70 algo70 = new Algo70();

        int n = 3;
        long k = 5;
        int[] result = {3, 1, 2};
        int[] answer = algo70.solution(n, k);
        System.out.println(Arrays.toString(answer));
        if (Arrays.equals(result, answer)) System.out.println("Y"); else System.out.println("N");
    }
}
