package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//완전 탐색 과제
public class Weekly3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);
        int K = Integer.parseInt(input.split(" ")[2]);

        for (int i = 0; i <= K; i++) {
            String str = br.readLine();
            int R = Integer.parseInt(str.split(" ")[0]);
            int C = Integer.parseInt(str.split(" ")[1]);
        }

        System.out.println(input);
    }
}
