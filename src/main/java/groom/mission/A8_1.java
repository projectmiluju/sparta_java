package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Bigger than you
public class A8_1 {
    static final int MAXN = 5;
    static final Long INF = Long.MAX_VALUE;

    static int N;
    static Long K;
    static Long answer;
    static int[] arr = new int[MAXN];

    static void solve(long a){
        if (a > K) {
            answer = Math.min(answer, a);
            return;
        }
        for (int i = 0; i < N; i++) {
            long b = a * 10 + arr[i];
            if (b == 0) continue;
            solve(b);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        K = Long.parseLong(br.readLine());

        answer = INF;
        solve(0);

        System.out.println(answer);
    }


}
