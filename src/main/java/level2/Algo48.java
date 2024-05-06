package level2;

import java.util.Arrays;

public class Algo48 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];

        int len = -1;

        for (int i = 0; i < sequence.length; i++) {
            int sum = 0;
            for (int j = i; j < sequence.length; j++) {
                sum += sequence[j];
                if (k <= sum) {
                    if (k == sum) {

                        if (len == -1){
                            len = j-i;
                            answer[0] = i;
                            answer[1] = j;
                        }else if (j-i < len) {
                            len = j-i;
                            answer[0] = i;
                            answer[1] = j;
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo48 algo48 = new Algo48();

        int[] sequence1 = {1, 2, 3, 4, 5};
        int a = 7;
        int[] res1 = {2, 3};
        int[] ans1 = algo48.solution(sequence1, a);
        System.out.println(Arrays.toString(ans1));
        if (Arrays.equals(res1, ans1)) System.out.println("Y"); else System.out.println("N");

        int[] sequence2 = {1, 1, 1, 2, 3, 4, 5};
        int b = 5;
        int[] res2 = {6, 6};
        int[] ans2 = algo48.solution(sequence2, b);
        System.out.println(Arrays.toString(ans2));
        if (Arrays.equals(res2, ans2)) System.out.println("Y"); else System.out.println("N");

        int[] sequence3 = {2, 2, 2, 2, 2};
        int c = 6;
        int[] res3 = {0, 2};
        int[] ans3 = algo48.solution(sequence3, c);
        System.out.println(Arrays.toString(ans3));
        if (Arrays.equals(res3,ans3)) System.out.println("Y"); else System.out.println("N");

    }
}
