package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Algo30 {

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            String[] p = places[i];

            boolean isOk = true;

            for (int j = 0; j < 5 && isOk; j++) {
                for (int k = 0; k < 5 && isOk; k++) {
                    if (p[j].charAt(k) == 'P'){
                        if(!bfs(j, k, p)){
                            isOk = false;
                        }
                    }
                }
            }
            answer[i] = isOk ? 1 : 0;
        }
        return answer;
    }

    private static boolean bfs(int j, int k, String[] p) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{j, k});

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];

                if (nr < 0 || nc < 0 || nr >= 5 || nc >= 5 || (nr == j && nc == k))
                    continue;

                int d = Math.abs(nr - j) + Math.abs(nc - k);

                if (p[nr].charAt(nc) == 'P' && d <= 2)
                    return false;

                else if (p[nr].charAt(nc) == 'O' && d < 2)
                    q.offer(new int[] { nr, nc });
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Algo30 algo30 = new Algo30();
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        int[] result = {1, 0, 1, 1, 1};
        System.out.println(Arrays.toString(algo30.solution(places)));
        if (Arrays.equals(result, algo30.solution(places))) {
            System.out.println("Y");
        }else System.out.println("N");

    }
}
