package level2;

public class Algo66 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        return answer;
    }

    public static void main(String[] args) {
        Algo66 algo66 = new Algo66();

        int[] queue1_A = {3, 2, 7, 2};
        int[] queue1_B = {4, 6, 5, 1};
        int res1 = 2;
        int ans1 = algo66.solution(queue1_A, queue1_B);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] queue2_A = {1, 2, 1, 2};
        int[] queue2_B = {1, 10, 1, 2};
        int res2 = 7;
        int ans2 = algo66.solution(queue2_A, queue2_B);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");

        int[] queue3_A = {1, 1};
        int[] queue3_B = {1, 5};
        int res3 = -1;
        int ans3 = algo66.solution(queue3_A, queue3_B);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");
    }
}
