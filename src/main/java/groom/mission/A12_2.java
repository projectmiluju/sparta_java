package groom.mission;

import java.util.Scanner;

public class A12_2 {
    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] edges = new int[m][2];

            for (int i = 0; i < m; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
            }

            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }

            int edgeCount = 0;

            for (int i = 0; i < m; i++) {
                int a = edges[i][0];
                int b = edges[i][1];
                if (union(a, b)) {
                    edgeCount++;
                    if (edgeCount == n - 1) break;
                }
            }

            System.out.println(edgeCount);
        }
    }

    static int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    static boolean union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA == rootB) return false;
        parent[rootB] = rootA;
        return true;
    }
}

