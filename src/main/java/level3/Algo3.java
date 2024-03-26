package level3;

import java.util.ArrayList;
import java.util.Arrays;

public class Algo3 {

    public int solution(int n, int[][] edge) {
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < edge.length; i++) {
            adj[edge[i][0]].add(edge[i][1]);
            adj[edge[i][1]].add(edge[i][0]);
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        boolean[] visited = new boolean[n+1];

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int cur = 0;
            for (int j = 1; j < n+1; j++) {
                if (!visited[j] && dist[j] < min) {
                    min = dist[j];
                    cur = j;
                }
            }
            visited[cur] = true;

            for (int j = 0; j < adj[cur].size(); j++) {
                int adjNode = adj[cur].get(j);

                if(dist[adjNode] > dist[cur] + 1) {
                    dist[adjNode] = dist[cur] + 1;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        int max = 0;
        for (int i = 1; i < dist.length; i++) {
            if(dist[i] != Integer.MAX_VALUE) {
                max = Math.max(max, dist[i]);
            }
        }
        for (int i = 1; i < dist.length; i++) {
            if(dist[i] == max) {
                list.add(i);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        Algo3 algo = new Algo3();
        int n = 6;
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        System.out.println(algo.solution(n, vertex));
    }
}
