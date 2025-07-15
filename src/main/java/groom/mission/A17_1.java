package groom.mission;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class A17_1 {

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { in = is; }
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        int nextInt() throws IOException {
            int c, sgn = 1, x = 0;
            do { c = read(); } while (c <= ' '); // skip
            if (c == '-') { sgn = -1; c = read(); }
            while (c > ' ') { x = x * 10 + (c - '0'); c = read(); }
            return x * sgn;
        }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int N = fs.nextInt();
        int M = fs.nextInt();
        int S = fs.nextInt();

        // 전방성 인접 리스트 (head/to/next/w)
        int[] head = new int[N + 1];
        Arrays.fill(head, -1);
        int[] to = new int[M];
        int[] next = new int[M];
        int[] w = new int[M];
        int idx = 0;

        for (int i = 0; i < M; i++) {
            int s = fs.nextInt();
            int e = fs.nextInt();
            int ww = fs.nextInt();
            to[idx] = e;
            w[idx] = ww;
            next[idx] = head[s];
            head[s] = idx++;
        }

        final long INF = Long.MAX_VALUE / 4;
        long[] dist = new long[N + 1];
        Arrays.fill(dist, INF);

        // 다익스트라
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        dist[S] = 0;
        pq.offer(new long[]{0, S});
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];
            if (d != dist[u]) continue; // outdated
            for (int ei = head[u]; ei != -1; ei = next[ei]) {
                int v = to[ei];
                long nd = d + w[ei];
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.offer(new long[]{nd, v});
                }
            }
        }

        // 합계(도달 불가는 -1)
        long sum = 0;
        for (int v = 1; v <= N; v++) {
            sum += (dist[v] == INF) ? -1 : dist[v];
        }

        System.out.println(sum);
    }
}
