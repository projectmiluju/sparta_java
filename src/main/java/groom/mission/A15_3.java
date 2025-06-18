package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A15_3 {
    static int N, M, K;
    static boolean[][] isRest;
    static int[][] map;
    static long[][] dp;
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        isRest = new boolean[N + 1][M + 1];
        dp = new long[N + 1][M + 1];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            isRest[r][c] = true;
        }

        // DP 초기화
        dp[1][1] = 1;

        // DP 점화식
        for (int r = 1; r <= N; r++) {
            for (int c = 1; c <= M; c++) {
                if (isRest[r][c]) continue;
                for (int dice = 1; dice <= 6; dice++) {
                    if (r - dice >= 1 && !isRest[r - dice][c]) {
                        dp[r][c] = (dp[r][c] + dp[r - dice][c]) % MOD;
                    }
                    if (c - dice >= 1 && !isRest[r][c - dice]) {
                        dp[r][c] = (dp[r][c] + dp[r][c - dice]) % MOD;
                    }
                }
            }
        }

        System.out.println(dp[N][M]);
    }
}
