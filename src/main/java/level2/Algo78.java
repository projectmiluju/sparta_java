package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algo78 {

    static class Mineral {
        private int diamond;
        private int iron;
        private int stone;

        public Mineral(int diamond, int iron, int stone) {
            this.diamond = diamond;
            this.iron = iron;
            this.stone = stone;
        }
    }

    static int[][] scoreBoard;
    static List<Mineral> list;

    public int solution(int[] picks, String[] minerals) {
        int answer = 0;

        scoreBoard = new int[][]{{1,1,1},{5,1,1},{25,5,1}};

        int totalPicks = Arrays.stream(picks).sum();
        list = new ArrayList<>();
        for (int i = 0; i < minerals.length; i+=5) {
            if (totalPicks == 0) break;

            int dia = 0, iron = 0, stone = 0;
            for(int j = i; j < i + 5; j++) {
                if(j == minerals.length) break;

                String mineral = minerals[j];
                int val = mineral.equals("iron") ? 1 :
                        mineral.equals("stone") ? 2 : 0;

                dia += scoreBoard[0][val];
                iron += scoreBoard[1][val];
                stone += scoreBoard[2][val];
            }

            list.add(new Mineral(dia, iron, stone));
            totalPicks--;
        }

        Collections.sort(list, ((o1, o2) -> (o2.stone - o1.stone)));
        for(Mineral m : list) {
            int dia = m.diamond;
            int iron = m.iron;
            int stone = m.stone;

            if(picks[0] > 0) {
                answer += dia;
                picks[0]--;
                continue;
            }
            if(picks[1] > 0) {
                answer += iron;
                picks[1]--;
                continue;
            }
            if(picks[2] > 0) {
                answer += stone;
                picks[2]--;
                continue;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo78 algo78 = new Algo78();

        int[] picks1 = {1, 3, 2};
        String[] minerals1 = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
        int res1 = 12;
        int ans1 = algo78.solution(picks1, minerals1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] picks2 = {0, 1, 1};
        String[] minerals2 = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
        int res2 = 50;
        int ans2 = algo78.solution(picks2, minerals2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
