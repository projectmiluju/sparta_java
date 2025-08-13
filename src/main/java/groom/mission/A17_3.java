package groom.mission;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class A17_3 {
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
            return sgn == 1 ? x : -x;
        }
        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
            do { c = read(); } while (c <= ' ');
            while (c > ' ') { sb.append((char)c); c = read(); }
            return sb.toString();
        }
    }

    static final int[] DR = {-1,-1,-1, 0, 0, 1, 1, 1};
    static final int[] DC = {-1, 0, 1,-1, 1,-1, 0, 1};

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int N = fs.nextInt();
        int M = fs.nextInt();

        char[][] g = new char[N][];
        for (int i = 0; i < N; i++) g[i] = fs.next().toCharArray();

        // 노드 인덱싱: S, 모든 '.', E
        int[][] id = new int[N][M];
        for (int[] row : id) Arrays.fill(row, -1);

        int nodes = 0, sId = -1, eId = -1;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                char ch = g[r][c];
                if (ch == 'S' || ch == '.' || ch == 'E') {
                    id[r][c] = nodes;
                    if (ch == 'S') sId = nodes;
                    if (ch == 'E') eId = nodes;
                    nodes++;
                }
            }
        }

        if (sId == -1 || eId == -1) {
            System.out.println(-1);
            return;
        }

        // 인접 리스트
        ArrayList<int[]>[] adj = new ArrayList[nodes];
        for (int i = 0; i < nodes; i++) adj[i] = new ArrayList<>();

        // 각 노드에서 8방향 스캔하여 간선 생성
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                int u = id[r][c];
                if (u == -1) continue; // 노드 아님
                for (int d = 0; d < 8; d++) {
                    int nr = r + DR[d], nc = c + DC[d];
                    long cost = 0;
                    while (0 <= nr && nr < N && 0 <= nc && nc < M) {
                        char ch = g[nr][nc];
                        if (ch == '#') break; // 막힘
                        if (ch >= '1' && ch <= '9') {
                            cost += ch - '0'; // 숫자칸 비용 누적
                        } else if (ch == '.' || ch == 'S' || ch == 'E') {
                            int v = id[nr][nc];
                            if (v != -1) {
                                // 도착 노드 비용(+1) 포함
                                long w = cost + 1;
                                adj[u].add(new int[]{v, (int)Math.min(w, Integer.MAX_VALUE)});
                            }
                            break; // 첫 노드에서 멈춤
                        }
                        nr += DR[d]; nc += DC[d];
                    }
                }
            }
        }

        // 다익스트라
        final long INF = Long.MAX_VALUE / 4;
        long[] dist = new long[nodes];
        Arrays.fill(dist, INF);
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        dist[sId] = 0;
        pq.offer(new long[]{0, sId});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];
            if (d != dist[u]) continue;
            if (u == eId) break; // 조기 종료
            for (int[] e : adj[u]) {
                int v = e[0];
                long nd = d + (e[1] & 0xffffffffL);
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.offer(new long[]{nd, v});
                }
            }
        }

        System.out.println(dist[eId] >= INF ? -1 : dist[eId]);
    }
}
