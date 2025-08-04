package groom.mission;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class A17_2 {

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { this.in = is; }
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer); ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        int nextInt() throws IOException {
            int c, sgn = 1, x = 0;
            do { c = read(); } while (c <= ' ');
            if (c == '-') { sgn = -1; c = read(); }
            while (c > ' ') { x = x * 10 + (c - '0'); c = read(); }
            return x * sgn;
        }
        long nextLong() throws IOException {
            int c, sgn = 1; long x = 0;
            do { c = read(); } while (c <= ' ');
            if (c == '-') { sgn = -1; c = read(); }
            while (c > ' ') { x = x * 10 + (c - '0'); c = read(); }
            return sgn == 1 ? x : -x;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int N = fs.nextInt();
        int M = fs.nextInt();

        int S = fs.nextInt();
        int E = fs.nextInt();
        long C = fs.nextLong(); // C가 클 수 있으니 long

        // 무향 그래프(전방성 인접 리스트) - M*2 간선
        int[] head = new int[N + 1];
        Arrays.fill(head, -1);
        int[] to = new int[M * 2];
        int[] next = new int[M * 2];
        long[] w = new long[M * 2];
        int idx = 0;

        for (int i = 0; i < M; i++) {
            int a = fs.nextInt();
            int b = fs.nextInt();
            long k = fs.nextLong();
            long cost = (C + k - 1) / k; // ceil(C/k)

            to[idx] = b; w[idx] = cost; next[idx] = head[a]; head[a] = idx++;
            to[idx] = a; w[idx] = cost; next[idx] = head[b]; head[b] = idx++;
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
            if (d != dist[u]) continue;
            if (u == E) break; // 조기 종료 가능
            for (int ei = head[u]; ei != -1; ei = next[ei]) {
                int v = to[ei];
                long nd = d + w[ei];
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.offer(new long[]{nd, v});
                }
            }
        }

        System.out.println(dist[E] == INF ? -1 : dist[E]);
    }
}
