package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class A13_2 {
    static final int MAX = 1000;
    static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상하좌우 방향
    static int R, C;
    static int[][] dist = new int[MAX][MAX];
    static boolean[][] visited = new boolean[MAX][MAX];
    static String[] S = new String[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // R과 C 입력 받기
        String[] input = br.readLine().split(" ");
        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);

        // 지도 정보 입력 받기
        for (int i = 0; i < R; i++) {
            S[i] = br.readLine();
        }

        // BFS를 위한 덱 선언
        Deque<int[]> dq = new ArrayDeque<>();

        // 불의 위치를 먼저 모두 덱에 담는다.
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (S[i].charAt(j) == '@') { // 불인 칸
                    dq.add(new int[]{i, j});
                    dist[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }

        // BFS 시작 (불이 확산되는 과정)
        while (!dq.isEmpty()) {
            int[] current = dq.pollFirst(); // 덱에서 현재 위치 꺼냄
            int i = current[0];
            int j = current[1];

            // 사방으로 확장
            for (int[] d : dir) {
                int ni = i + d[0];
                int nj = j + d[1];

                // 범위를 벗어나지 않고, 방문하지 않은 빈 칸만 처리
                if (ni >= 0 && ni < R && nj >= 0 && nj < C && S[ni].charAt(nj) != '#' && !visited[ni][nj]) {
                    visited[ni][nj] = true;
                    dist[ni][nj] = dist[i][j] + 1;
                    dq.addLast(new int[]{ni, nj}); // 다음 위치를 덱에 추가
                }
            }
        }

        // 구름이 위치에서 결과 출력
        boolean foundCloud = false; // 구름을 찾았는지 여부
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (S[i].charAt(j) == '&') { // 구름이 있는 칸
                    foundCloud = true;

                    // 구름이 있는 칸에 불이 도달하지 못했을 경우
                    if (!visited[i][j]) {
                        System.out.println(-1);
                    } else {
                        // 불이 도달한 경우, 거리 -1 을 출력
                        System.out.println(dist[i][j] - 1);
                    }
                    break;
                }
            }
            if (foundCloud) break; // 구름을 찾으면 더 이상 반복하지 않음
        }
    }
}
