package groom.mission;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//묶음 상품
public class A11_4 {

    static int[] parent;

    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        Set<Integer> uniqueRoots = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            uniqueRoots.add(find(i));
        }

        System.out.println(uniqueRoots.size());
    }
}

