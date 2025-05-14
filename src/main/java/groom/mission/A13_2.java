package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A13_2 {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int R, C;
    static char[][] map;
    static int[][] fireTime;  // 불 도달 시간
    static int[][] goormTime; // 구름이 도달 시간
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Point> fireQ = new LinkedList<>();
    static Queue<Point> goormQ = new LinkedList<>();
    static Point start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        fireTime = new int[R][C];
        goormTime = new int[R][C];

        // 초기화
        for (int i = 0; i < R; i++) {
            Arrays.fill(fireTime[i], Integer.MAX_VALUE);
            Arrays.fill(goormTime[i], -1);
        }

        // 맵 입력 및 시작점 설정
        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'a') {      // 불 시작점
                    fireQ.add(new Point(i, j));
                    fireTime[i][j] = 0;
                } else if (map[i][j] == '&') { // 구름이 시작점
                    start = new Point(i, j);
                    goormTime[i][j] = 0;
                }
            }
        }

        // 불 확산 BFS
        spreadFire();

        // 구름이 탈출 BFS
        int result = escapeGoorm();

        System.out.println(result);
    }

    // 불 확산 BFS
    static void spreadFire() {
        while (!fireQ.isEmpty()) {
            Point cur = fireQ.poll();

            for (int d = 0; d < 4; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
                if (map[nx][ny] == '#' || fireTime[nx][ny] <= fireTime[cur.x][cur.y] + 1) continue;

                fireTime[nx][ny] = fireTime[cur.x][cur.y] + 1;
                fireQ.add(new Point(nx, ny));
            }
        }
    }

    // 구름이 탈출 BFS (최대 시간 계산)
    static int escapeGoorm() {
        goormQ.add(start);
        int maxTime = -1;

        while (!goormQ.isEmpty()) {
            Point cur = goormQ.poll();

            // 현재 위치에서 탈출 가능한지 확인
            boolean canEscape = checkEscape(cur.x, cur.y, goormTime[cur.x][cur.y]);
            if (canEscape) {
                maxTime = Math.max(maxTime, goormTime[cur.x][cur.y]);
                continue; // 더 이상 이동 불필요
            }

            // 이동 가능한 칸 탐색
            for (int d = 0; d < 4; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
                if (map[nx][ny] == '#' || goormTime[nx][ny] != -1) continue;

                // 불보다 늦게 도착하면 이동 불가
                if (fireTime[nx][ny] <= goormTime[cur.x][cur.y] + 1) continue;

                goormTime[nx][ny] = goormTime[cur.x][cur.y] + 1;
                goormQ.add(new Point(nx, ny));
            }
        }

        return maxTime;
    }

    // 탈출 조건 확인
    static boolean checkEscape(int x, int y, int time) {
        // 1. 연구실 경계에 도달한 경우
        if (x == 0 || x == R-1 || y == 0 || y == C-1) return true;

        // 2. 인접 칸에 불이 time+1 시간에 도달하는 경우
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
            if (fireTime[nx][ny] <= time + 1) return true;
        }

        return false;
    }
}
