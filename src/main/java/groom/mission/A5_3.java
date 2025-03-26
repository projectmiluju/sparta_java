package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5_3 {

    static final int MAX = 100000;
    static int N;
    static int[] H = new int[MAX];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 0;
        int ct = 0;

        for (int i = 0; i < N; i++) {

            while (ct > 0 && H[i] > 0) {
                H[i] -= ct + 1;
                ct = (ct + 1) % 4;
                answer++;
            }

            if (H[i] <= 0) {
                continue;
            }

            answer += (H[i] / 10) * 4;
            H[i] %= 10;

            while (H[i] > 0) {
                H[i] -= ct + 1;
                ct = (ct + 1) % 4;
                answer++;
            }
        }

        System.out.println(answer);
    }
}