package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A15_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] C = new int[N];

        for (int i = 0; i < N; i++) {
            C[i] = Integer.parseInt(line[i]);
        }

        long maxSum = 0;       // 정답: 최대 상금
        long currentSum = 0;   // 현재까지 연속된 합

        for (int i = 0; i < N; i++) {
            currentSum += C[i];
            if (currentSum < 0) {
                currentSum = 0; // 음수면 버린다
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}
