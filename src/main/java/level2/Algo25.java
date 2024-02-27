package level2;

import java.util.PriorityQueue;

public class Algo25 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++){
            heap.add(scoville[i]);
        }
        int cnt = 0;

        while (heap.peek() < K) {
            if (heap.size() >= 2) {
                int n = heap.poll() + heap.poll() * 2;
                heap.add(n);
                cnt++;
            }else {
                cnt = -1;
                break;
            }
        }
        System.out.println(heap);
        answer = cnt;
        return answer;
    }

    public static void main(String[] args) {
        Algo25 algo = new Algo25();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(algo.solution(scoville,K));
    }

}
