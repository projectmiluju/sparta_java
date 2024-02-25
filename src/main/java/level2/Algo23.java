package level2;

import java.util.LinkedList;
import java.util.Queue;

public class Algo23 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        int sum = 0;
        int time = 0;
        for (int i = 0; i < truck_weights.length; i++){
            int truck = truck_weights[i];

            while (true){
                if (que.isEmpty()){
                    que.add(truck);
                    sum += truck;
                    time++;
                    break;
                } else if(que.size() == bridge_length){
                    sum -= que.poll();
                } else {
                    if (sum + truck <= weight){
                        que.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        que.add(0);
                        time ++;
                    }
                }
            }
        }
        answer = time + bridge_length;
        return answer;
    }

    public static void main(String[] args) {
        Algo23 algo = new Algo23();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(algo.solution(bridge_length, weight,truck_weights));

        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};
        System.out.println(algo.solution(bridge_length2, weight2, truck_weights2));

        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(algo.solution(bridge_length3, weight3, truck_weights3));
    }
}
