package groom.mission;

import java.io.*;
import java.util.*;

public class A12_3 {

    static final int MAX = 2001;

    static boolean[][] edge = new boolean[MAX][MAX];
    static List<Integer>[] graph = new ArrayList[MAX];
    static boolean[] visited = new boolean[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // 다리 개수

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            edge[from][to] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (edge[i][j] && edge[j][i]) {
                    graph[i].add(j);
                    graph[j].add(i);
                }
            }
        }

        int unionCount = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                unionCount++;
                bfs(i);
            }
        }

        System.out.println(unionCount);
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int next : graph[curr]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }
}
