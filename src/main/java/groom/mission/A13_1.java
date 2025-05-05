package groom.mission;

import java.util.Scanner;
import java.util.Stack;

public class A13_1 {
    static int n, m;
    static char[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        grid = new char[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String line = sc.nextLine();
            if (line.length() != n) {
                throw new IllegalArgumentException("입력 길이 오류: " + line);
            }
            grid[i] = line.toCharArray();
        }

        int objectCount = 0;
        int maxSize = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '#' && !visited[i][j]) {
                    int size = dfs(i, j);
                    objectCount++;
                    maxSize = Math.max(maxSize, size);
                }
            }
        }

        System.out.println(objectCount);
        System.out.println(maxSize);
    }

    static int dfs(int x, int y) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;
        int size = 1;

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    if (!visited[nx][ny] && grid[nx][ny] == '#') {
                        visited[nx][ny] = true;
                        stack.push(new int[]{nx, ny});
                        size++;
                    }
                }
            }
        }

        return size;
    }
}
