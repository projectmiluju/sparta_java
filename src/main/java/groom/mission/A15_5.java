package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A15_5 {
    static final int MOD = 100_000_007;
    static final int[] MASKS = {0, 1, 2, 4, 5};          // 5개

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        long[] prev = new long[5];                        // dp[현재 행]
        long[] next = new long[5];
        for (int i = 0; i < 5; i++) prev[i] = 1;          // 첫 행

        for (int row = 1; row < N; row++) {
            for (int j = 0; j < 5; j++) {
                long sum = 0;
                for (int i = 0; i < 5; i++) {
                    if ((MASKS[i] & MASKS[j]) == 0) {     // 세로 인접 금지
                        sum += prev[i];
                    }
                }
                next[j] = sum % MOD;
            }
            // 다음 행으로 이동
            long[] tmp = prev;
            prev = next;
            next = tmp;
        }

        long ans = 0;
        for (long v : prev) ans = (ans + v) % MOD;
        System.out.println(ans);
    }
}
