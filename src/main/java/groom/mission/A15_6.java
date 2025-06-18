package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A15_6 {
    static final int MOD = 1_000_000;     // 10^6

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        int[][] cur = new int[2][3];      // [b][c]
        int[][] nxt = new int[2][3];
        cur[0][0] = 1;                    // 길이 0, B 미사용, 연속 C = 0

        for (int i = 0; i < N; i++) {
            // next 배열 0 로 초기화
            for (int b = 0; b < 2; b++) for (int c = 0; c < 3; c++) nxt[b][c] = 0;

            for (int b = 0; b < 2; b++) {
                for (int c = 0; c < 3; c++) {
                    int val = cur[b][c];
                    if (val == 0) continue;

                    // ① A
                    nxt[b][0] = (nxt[b][0] + val) % MOD;

                    // ② C (연속 C 가 2 미만일 때만)
                    if (c < 2) {
                        nxt[b][c + 1] = (nxt[b][c + 1] + val) % MOD;
                    }

                    // ③ B (아직 B 사용 전일 때만)
                    if (b == 0) {
                        nxt[1][0] = (nxt[1][0] + val) % MOD;
                    }
                }
            }
            // 배열 교체
            int[][] tmp = cur;  cur = nxt;  nxt = tmp;
        }

        long ans = 0;
        for (int b = 0; b < 2; b++)
            for (int c = 0; c < 3; c++)
                ans = (ans + cur[b][c]) % MOD;

        System.out.println(ans);
    }
}
