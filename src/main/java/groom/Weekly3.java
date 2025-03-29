package groom;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//완전 탐색 과제
public class Weekly3 {
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

        // 최소 불만족도를 구하기 위한 변수
        int minDissatisfaction = Integer.MAX_VALUE;

        // 모든 가능한 빈 칸 탐색
        for (int r = 1; r <= N; r++) {
            for (int c = 1; c <= M; c++) {
                boolean isPandaHere = false;

                // 현재 칸에 판다가 있는지 확인
                for (int[] panda : pandas) {
                    if (panda[0] == r && panda[1] == c) {
                        isPandaHere = true;
                        break;
                    }
                }

                if (isPandaHere) continue; // 판다가 있으면 넘어감

                // 현재 칸 (r, c)의 불만족도 계산
                int dissatisfaction = 0;
                for (int[] panda : pandas) {
                    int pr = panda[0];
                    int pc = panda[1];
                    dissatisfaction += (r - pr) * (r - pr) + (c - pc) * (c - pc);
                }

                // 최소값 갱신
                minDissatisfaction = Math.min(minDissatisfaction, dissatisfaction);
            }
        }

        // 결과 출력
        System.out.println(minDissatisfaction);
        sc.close();
    }
}
