package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Algo16 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : tangerine){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());

        for (int i : valueList){
            if (sum + i >= k){
                answer ++;
                break;
            } else {
                sum += i;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo16 algo = new Algo16();

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int result = 3;
        System.out.println(algo.solution(k,tangerine));
        if (algo.solution(k,tangerine) == result) System.out.println("Y"); else System.out.println("N");

        int k2 = 4;
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3};
        int result2 = 2;
        System.out.println(algo.solution(k2,tangerine2));
        if (algo.solution(k2,tangerine2) == result2) System.out.println("Y"); else System.out.println("N");

        int k3 = 2;
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};
        int result3 = 1;
        System.out.println(algo.solution(k3,tangerine3));
        if (algo.solution(k3,tangerine3) == result3) System.out.println("Y"); else System.out.println("N");
    }
}
