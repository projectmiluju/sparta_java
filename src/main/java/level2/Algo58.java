package level2;

import java.util.LinkedList;
import java.util.Queue;

public class Algo58 {

    static int[][] graph;

    public int solution(int n, int[][] wires) {
        int answer = n;
        graph = new int[n+1][n+1];

        for (int i = 0; i < wires.length; i++) {
            int from = wires[i][0];
            int to = wires[i][1];
            graph[from][to] = 1;
            graph[to][from] = 1;
        }
        for (int i = 0; i < wires.length; i++) {
            int from = wires[i][0];
            int to = wires[i][1];
            graph[from][to] = 0;
            graph[to][from] = 0;

            answer = Math.min(answer, bfs(n, from));
            graph[from][to] = 1;
            graph[to][from] = 1;
        }
        return answer;
    }

    public static int bfs(int n, int x) {
        boolean[] visited = new boolean[n+1];
        int count = 1;

        Queue<Integer> queue = new LinkedList<>();
        visited[x] = true;
        queue.offer(x);

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (graph[temp][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                    count ++;
                }
            }
        }
        return (int)Math.abs(count-(n-count));
    }

    public static void main(String[] args) {
        Algo58 algo58 = new Algo58();

        int a = 9;
        int[][] wires1 = new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        int res1 = 3;
        int ans1 = algo58.solution(a, wires1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int b = 4;
        int[][] wires2 = new int[][]{{1,2},{2,3},{3,4}};
        int res2 = 0;
        int ans2 = algo58.solution(b, wires2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");

        int c = 7;
        int[][] wires3 = new int[][]{{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}};
        int res3 = 1;
        int ans3 = algo58.solution(c, wires3);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");
    }
}
