package level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Algo18 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) {
            priorityQueueHighest.offer(i);
        }

        while (!priorityQueueHighest.isEmpty()){
            for (int i = 0; i < priorities.length; i++){
                if (priorityQueueHighest.peek() == priorities[i]) {
                    priorityQueueHighest.poll();
                    answer ++;
                    if (location == i){
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo18 algo = new Algo18();

//        int[] priorities = {2, 1, 3, 2};
//        int location = 2;
//        int result = 1;
//        System.out.println(algo.solution(priorities, location));
//        if (algo.solution(priorities,location) == result) System.out.println("Y"); else System.out.println("N");

        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        int result2 = 5;
        System.out.println(algo.solution(priorities2, location2));
        if (algo.solution(priorities2,location2) == result2) System.out.println("Y"); else System.out.println("N");

    }

}
