package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class A16_3 {
    static final int MAX = 50;
    static final int INF = 1_000_000_000;
    static int N, M, T;
    static int[][] map = new int[MAX][MAX];
    static int[][][] dist = new int[MAX][MAX][MAX * MAX];
    static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상, 하, 좌, 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int left = 0, right = N * M - 1, answer = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canEscape(mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(answer);
    }

    // K 에너지로 T초 이내 탈출 가능한지 BFS로 체크
    static boolean canEscape(int K) {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                Arrays.fill(dist[i][j], INF);

        Queue<int[]> q = new ArrayDeque<>();
        dist[0][0][K] = 0;
        q.offer(new int[]{0, 0, K});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int r = now[0], c = now[1], energy = now[2];

            // 에너지 충전 (땅에서만 가능, 최대 K까지만)
            if (energy < K && map[r][c] == 2 && dist[r][c][energy + 1] > dist[r][c][energy] + 1) {
                dist[r][c][energy + 1] = dist[r][c][energy] + 1;
                q.offer(new int[]{r, c, energy + 1});
            }

            // 4방향 이동
            for (int[] d : dir) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if (map[nr][nc] == 0) continue; // 장애물

                // 땅에서 땅 (에너지 소모 X)
                if (map[r][c] == 2 && map[nr][nc] == 2) {
                    if (dist[nr][nc][energy] > dist[r][c][energy] + 1) {
                        dist[nr][nc][energy] = dist[r][c][energy] + 1;
                        q.offer(new int[]{nr, nc, energy});
                    }
                }
                // 비행 (하늘 포함, 에너지 소모 O)
                else {
                    if (energy > 0 && dist[nr][nc][energy - 1] > dist[r][c][energy] + 1) {
                        dist[nr][nc][energy - 1] = dist[r][c][energy] + 1;
                        q.offer(new int[]{nr, nc, energy - 1});
                    }
                }
            }
        }

        // (N-1,M-1) 도달 가능?
        for (int k = 0; k <= K; k++)
            if (dist[N - 1][M - 1][k] <= T)
                return true;
        return false;
    }
}
