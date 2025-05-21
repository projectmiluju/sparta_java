package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A14_2 {
    public static void main(String[] args) throws Exception {

        int MAX = 100000;
        long[] x = new long[MAX];
        long[] y = new long[MAX];
        long[] l = new long[MAX];
        long[] r = new long[MAX];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 미사일 개수
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            // 외계인 x 좌표
            x[i] = Integer.parseInt(input[0]);
            // 외계인 y 좌표
            y[i] = Integer.parseInt(input[1]);
            // 미사일 발표 시각
            l[i] = Integer.parseInt(input[2]);

        }

    }
}
