package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Algo19 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                q.add((100 - progresses[i]) / speeds[i]);
            }else {
                q.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int x = q.poll();
        int count = 1;
        while (!q.isEmpty()){
            if (x >= q.peek()){
                count++;
                q.poll();
            } else {
                list.add(count);
                count = 1;
                x = q.poll();
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo19 algo = new Algo19();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = {2, 1};
        System.out.println(Arrays.toString(algo.solution(progresses, speeds)));
        if (Arrays.toString(algo.solution(progresses, speeds)).equals(Arrays.toString(result))) System.out.println("Y"); else System.out.println("N");

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        int[] result2 = {1, 3, 2};
        System.out.println(Arrays.toString(algo.solution(progresses2, speeds2)));
        if (Arrays.equals(algo.solution(progresses2, speeds2), result2)) System.out.println("Y"); else System.out.println("N");
    }
}
