package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class A15_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // A의 구슬
        int M = Integer.parseInt(st.nextToken());   // B의 구슬
        int K = Integer.parseInt(st.nextToken());   // 최대 라운드 수
        int TOTAL = N + M;                          // 전체 구슬 수 (≤ 200)

        // ── DP 테이블 초기화 ─────────────────────────────────
        BigInteger[][] dp = new BigInteger[K + 1][TOTAL + 1];
        for (int i = 0; i <= K; i++) {
            for (int j = 0; j <= TOTAL; j++) {
                dp[i][j] = BigInteger.ZERO;
            }
        }
        dp[0][N] = BigInteger.ONE;                  // t = 0, a = N

        // ── DP 전개 ─────────────────────────────────────────
        for (int k = 0; k < K; k++) {
            for (int a = 1; a < TOTAL; a++) {       // a == 0·TOTAL 은 이미 종료
                BigInteger cur = dp[k][a];
                if (cur.signum() == 0) continue;    // 경우의 수가 0이면 건너뜀

                dp[k + 1][a - 1] = dp[k + 1][a - 1].add(cur); // A 패
                dp[k + 1][a]     = dp[k + 1][a]    .add(cur); // 무승부
                dp[k + 1][a + 1] = dp[k + 1][a + 1].add(cur); // A 승
            }
        }

        // ── 정답 집계 ────────────────────────────────────────
        BigInteger answer = BigInteger.ZERO;
        for (int k = 0; k <= K; k++) {
            answer = answer.add(dp[k][0]);          // A가 0개가 된 경우
            answer = answer.add(dp[k][TOTAL]);      // B가 0개가 된 경우
        }

        System.out.println(answer);
    }
}
