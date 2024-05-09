package level2;


import java.util.HashMap;
import java.util.Map;

public class Algo49 {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();

        for (int i = 0; i < topping.length; i++) {
            mapB.put(topping[i], mapB.getOrDefault(topping[i], 0) + 1);
        }
        for (int i = 0; i < topping.length; i++) {
            mapA.put(topping[i], mapA.getOrDefault(topping[i], 0) + 1);

            if (mapB.get(topping[i]) - 1 == 0) {
                mapB.remove(topping[i]);
            }else {
                mapB.put(topping[i], mapB.get(topping[i]) - 1);
            }
            if (mapA.size() == mapB.size()) {
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Algo49 algo49 = new Algo49();

        int[] topping1 = {1, 2, 1, 3, 1, 4, 1, 2};
        int res1 = 2;
        int ans1 = algo49.solution(topping1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] topping2 = {1, 2, 3, 1, 4};
        int res2 = 0;
        int ans2 = algo49.solution(topping2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
