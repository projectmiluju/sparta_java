package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//구름 찾기 깃발
public class A9_3 {

    static int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};
    static int[] dy = {1, -1, 1, 0, -1, 1, 0, -1};

    public static void main(String[] args) throws Exception {

        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    int cnt = 0;
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                            if (matrix[nx][ny] == 1) {
                                cnt++;
                            }
                        }
                    }
                    if (cnt == K) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
