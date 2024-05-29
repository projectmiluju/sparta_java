package level3;

import java.util.Arrays;

public class Algo5 {
    public int[] solution(int n, int s) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo5 algo5 = new Algo5();

        int n1 = 2, s1 = 9;
        int[] res1 = {4,5};
        int[] ans1 = algo5.solution(n1, s1);
        System.out.println(Arrays.toString(ans1));
        if (Arrays.equals(res1, ans1)) System.out.println("Y"); else System.out.println("N");

        int n2 = 2, s2 = 1;
        int[] res2 = {-1};
        int[] ans2 = algo5.solution(n2, s2);
        System.out.println(Arrays.toString(ans2));
        if (Arrays.equals(res2, ans2)) System.out.println("Y"); else System.out.println("N");

        int n3 = 2, s3 = 8;
        int[] res3 = {4, 4};
        int[] ans3 = algo5.solution(n3, s3);
        System.out.println(Arrays.toString(ans3));
        if (Arrays.equals(res3, ans3)) System.out.println("Y"); else System.out.println("N");
    }
}
