package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A5_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long cnt = 0;
        for (int i = 0; i <N; i++) {
            long h = Integer.parseInt(input[i]);
            while(h > 0){
                cnt++;
                h = h - ((cnt - 1) % 4 + 1);
            }
        }
        System.out.println(cnt);
    }
}
