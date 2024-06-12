package level4;

import java.util.*;

class Food implements Comparable<Food> {
    int time;
    int idx;

    public Food(int time, int idx) {
        this.time = time;
        this.idx = idx;
    }

    @Override
    public int compareTo(Food other) {
        return Integer.compare(this.time, other.time);
    }
}
public class Algo1 {
    public int solution(int[] food_times, long k) {
        long food_sum = 0;
        for (int foodTime : food_times) {
            food_sum += foodTime;
        }

        if (food_sum <= k) return -1;

        PriorityQueue<Food> pq = new PriorityQueue<>();
        for (int i = 0; i < food_times.length; i++) {
            pq.offer(new Food(food_times[i], i + 1));
        }

        long total = 0;
        long previous = 0;
        long length = food_times.length;

        while (total + ((Objects.requireNonNull(pq.peek()).time - previous) * length) <= k) {
            int now = pq.poll().time;
            total += (now - previous) * length;
            length -= 1;
            previous = now;
        }

        ArrayList<Food> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        result.sort(Comparator.comparingInt(a -> a.idx));

        return result.get((int) ((k - total) % length)).idx;
    }

    public static void main(String[] args) {
        Algo1 algo1 = new Algo1();

        int[] food_times = new int[]{3,1,2};
        long k = 5;
        int result = 1;
        int answer = algo1.solution(food_times, k);
        System.out.println(answer);
        if (answer == result) System.out.println("Y"); else System.out.println("N");
    }
}
