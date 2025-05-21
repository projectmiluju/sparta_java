package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class A14_2 {
    public static void main(String[] args) throws Exception {

        int MAX = 100000;
        long[] x = new long[MAX];
        long[] y = new long[MAX];
        long[] l = new long[MAX];
        long[] r = new long[MAX];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 미사일 개수
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            // 외계인 x 좌표
            x[i] = Long.parseLong(input[0]);
            // 외계인 y 좌표
            y[i] = Long.parseLong(input[1]);
            // 미사일 발표 시각
            l[i] = Long.parseLong(input[2]);

        }

        for (int i = 0; i < n; i++) {
            r[i] = l[i] + (x[i]*x[i] + y[i]*y[i])*2;
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[0] == b[0]) {
                        return Long.compare(a[1], b[1]);
                    }
                    return Long.compare(a[0], b[0]);
                }
        );

        for (int i = 0; i < n; i++) {
            pq.add(new long[]{l[i], 1});
            pq.add(new long[]{r[i], 0});
        }

        int cnt = 0;
        int res = 0;

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long time = cur[0];
            if (cur[1] == 1) {
                cnt++;
            } else {
                cnt--;
            }
            res = Math.max(res, cnt);
        }

        long answer = 0;
        for (int i = 0; i < n; i++) {
            answer += r[i] - l[i];
        }
        answer -= res;

        System.out.println(answer);
    }
}
