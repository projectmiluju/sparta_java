package groom.mission;

import java.util.*;
public class A6_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;

        while (N > 0) {
            cnt = cnt + N/5;

            N = N / 5;
        }

        System.out.println(cnt);
    }
}
