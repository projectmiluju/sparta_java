package groom.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//판다는 귀여워
public class A9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        List<int[]> pandas = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            pandas.add(new int[]{r, c});
        }

        int minDissatisfaction = Integer.MAX_VALUE;

        for (int r = 1; r <= N; r++) {
            for (int c = 1; c <= M; c++) {
                boolean isPandaHere = false;

                for (int[] panda : pandas) {
                    if (panda[0] == r && panda[1] == c) {
                        isPandaHere = true;
                        break;
                    }
                }

                if (isPandaHere) continue;

                int dissatisfaction = 0;
                for (int[] panda : pandas) {
                    int pr = panda[0];
                    int pc = panda[1];
                    dissatisfaction += (r - pr) * (r - pr) + (c - pc) * (c - pc);
                }

                minDissatisfaction = Math.min(minDissatisfaction, dissatisfaction);
            }
        }

        System.out.println(minDissatisfaction);
        sc.close();
    }
}
