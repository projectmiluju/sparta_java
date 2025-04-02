package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//섭외하기 대작전
public class A10_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long[] S = new long[N];
        for (int i = 0; i < N; i++) {
            S[i] = Long.parseLong(input[i]);
        }

        Arrays.sort(S);

        long answer = getAnswer(N, S);
        System.out.println(answer);
    }

    static long getAnswer(int N, long[] S) {
        long answer = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {

                long sum = S[i] + S[j];
                int index = Arrays.binarySearch(S, j + 1, N, sum);

                if (index < 0) {
                    index = -index - 1;
                } else {
                    index++;
                }

                if (index > j+ 1 ) {
                    answer += (index - (j + 1));
                }
            }
        }
        return answer;
    }
}
