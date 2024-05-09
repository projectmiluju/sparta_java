package level2;

public class Algo51 {
    public long solution(int n) {
        long[] dp = new long[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Algo51 algo51 = new Algo51();

        int a = 4;
        long res1 = 5;
        long ans1 = algo51.solution(a);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int b = 3;
        long res2 = 3;
        long ans2 = algo51.solution(b);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
