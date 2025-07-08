package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class A16_1 {
    static final int MAXN = 10000;
    static int N;
    static int[] dist = new int[MAXN];
    static List<Integer>[] G = new ArrayList[MAXN];

    // 스택 DFS
    static void dfs(int start) {
        Arrays.fill(dist, 0);
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{start, -1});
        while (!stack.isEmpty()) {
            int[] node = stack.pop();
            int i = node[0], p = node[1];
            for (int j : G[i]) {
                if (j != p) {
                    dist[j] = dist[i] + 1;
                    stack.push(new int[]{j, i});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) G[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int u = Integer.parseInt(s[0]) - 1;
            int v = Integer.parseInt(s[1]) - 1;
            G[u].add(v);
            G[v].add(u);
        }

        dfs(0);
        int u = 0;
        for (int i = 1; i < N; i++) if (dist[u] < dist[i]) u = i;

        dfs(u);
        int v = 0;
        for (int i = 1; i < N; i++) if (dist[v] < dist[i]) v = i;

        System.out.println(dist[v] + 1);
    }
}
