package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A12_2 {
    static int[] parent, rank;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            parent = new int[n + 1];
            rank = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }

            int edgeCount = 0;

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (union(a, b)) {
                    edgeCount++;
                    if (edgeCount == n - 1) {
                        for (int j = i + 1; j < m; j++) br.readLine();
                        break;
                    }
                }
            }

            sb.append(edgeCount).append("\n");
        }

        System.out.print(sb);
    }

    static int find(int x) {
        if (x != parent[x]) parent[x] = find(parent[x]);
        return parent[x];
    }

    static boolean union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py) return false;

        // rank 기준 병합
        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else {
            parent[py] = px;
            if (rank[px] == rank[py]) rank[px]++;
        }

        return true;
    }
}

