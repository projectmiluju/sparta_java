package groom.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A12_1 {
    static int n, m;
    static int[][] wires;
    static int[] connectionCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        wires = new int[m][2];
        connectionCount = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            wires[i][0] = a;
            wires[i][1] = b;
            connectionCount[a]++;
            connectionCount[b]++;
        }

        List<Integer> safeWires = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = wires[i][0];
            int b = wires[i][1];

            connectionCount[a]--;
            connectionCount[b]--;

            if (connectionCount[a] > 0 && connectionCount[b] > 0) {
                safeWires.add(i + 1);
            }

            connectionCount[a]++;
            connectionCount[b]++;
        }

        if (safeWires.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int wire : safeWires) {
                System.out.print(wire + " ");
            }
        }
    }
}
