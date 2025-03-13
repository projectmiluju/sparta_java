package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A3_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int answer = n * 2 + Integer.parseInt(input[0]) + Integer.parseInt(input[n - 1]);

        for (int i = 1; i < n; i++) {
            answer += Math.abs(Integer.parseInt(input[i]) - Integer.parseInt(input[i - 1]));
        }

        System.out.println(answer);
    }
}