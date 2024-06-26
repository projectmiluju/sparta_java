package level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class Algo4 {

    public long solution(int n, int[] works) {
        PriorityQueue<Integer> overTime = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < works.length; i++){
            overTime.add(works[i]);
        }

        for (int i = 0; i < n; i++){
            int max = (int)overTime.poll();
            if (max <= 0) break;
            overTime.offer(max -1);
        }

        return sum(overTime);
    }

    public static long sum(PriorityQueue<Integer> works) {
        long sum = 0;
        while (!works.isEmpty()) {
            sum += (long) Math.pow(works.poll(), 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Algo4 algo4 = new Algo4();

        int[] works1 = new int[]{4, 3, 3};
        int a = 4;
        long res1 = 12;
        long ans1 = algo4.solution(a, works1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] works2 = new int[]{2, 1, 2};
        int b = 1;
        long res2 = 6;
        long ans2 = algo4.solution(b, works2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");

        int[] works3 = new int[]{1, 1};
        int c = 3;
        long res3 = 0;
        long ans3 = algo4.solution(c, works3);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");
    }
}
