package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A13_5 {
    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static final int MAXN = 100;
    static final int MAXM = 100;
    static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상하좌우 방향

    static int N, M, X, Y, Z;
    static int[][] A = new int[MAXN][MAXN];
    static int[] a = new int[MAXM], b = new int[MAXM], c = new int[MAXM], d = new int[MAXM];
    static int[][] dist = new int[MAXN][MAXN];

    // (sx, sy)에서 (ex, ey)까지의 최단 거리 (BFS)
    static int bfs(int sx, int sy, int ex, int ey) {
        for (int[] row : dist) Arrays.fill(row, -1);
        dist[sy][sx] = 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sy, sx));

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int y = cur.first;
            int x = cur.second;

            for (int[] d : dir) {
                int ny = y + d[0], nx = x + d[1];
                if (0 <= ny && ny < N && 0 <= nx && nx < N) {
                    if (A[ny][nx] == 0 && dist[ny][nx] == -1) {
                        dist[ny][nx] = dist[y][x] + 1;
                        q.add(new Pair(ny, nx));
                    }
                }
            }
        }
        return dist[ey][ex];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        Z = Integer.parseInt(st.nextToken());

        // 지도 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 승하차 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
            d[i] = Integer.parseInt(st.nextToken());
        }

        int x = a[0] - 1, y = b[0] - 1; // 구름이 시작 위치
        int res = 0;

        for (int i = 0; i < M; i++) {
            int move = bfs(x, y, a[i] - 1, b[i] - 1); // 손님 태우러 가는 거리
            int work = bfs(a[i] - 1, b[i] - 1, c[i] - 1, d[i] - 1); // 손님 목적지까지

            x = c[i] - 1;
            y = d[i] - 1;

            if (work <= 5) {
                res += X;
            } else {
                res += X + (work - 5) * Y;
            }

            res -= (move + work) * Z;
        }

        System.out.println(res);
    }
}
