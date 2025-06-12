package groom.mission;

import java.util.Scanner;

public class A15_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        final int MOD = 1_000_000_007;

        if (N == 1) {
            System.out.println(0);
            return;
        } else if (N == 2) {
            System.out.println(1);
            return;
        }

        long a = 0;
        long b = 1;
        long c = 0;
        for (int i = 3; i <= N; i++) {
            c = (a + b) % MOD;
            a = b;
            b = c;
        }

        System.out.println(c);
    }
}
