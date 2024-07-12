package level2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Algo77 {

    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int my = n;
        int card = k;
        for (int i = 0; i < enemy.length; i++) {
            my -= enemy[i];
            pq.add(enemy[i]);

            if (my < 0) {
                if (card > 0 && !pq.isEmpty()) {
                    my += pq.poll();
                    card--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo77 algo77 = new Algo77();

        int n1 = 7, k1 = 3, res1 = 5;
        int[] enemy1 = {4, 2, 4, 5, 3, 3, 1};
        int ans1 = algo77.solution(n1,k1,enemy1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int n2 = 2, k2 = 4, res2 = 4;
        int[] enemy2 = {3, 3, 3, 3};
        int ans2 = algo77.solution(n2,k2,enemy2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
