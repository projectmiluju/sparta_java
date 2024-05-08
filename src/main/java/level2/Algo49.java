package level2;

import java.util.Arrays;
import java.util.HashMap;

public class Algo49 {
    public int solution(int[] topping) {

        int cnt = 0;
        for (int i = 1; i < topping.length; i++) {
            int[] topA = Arrays.copyOfRange(topping, 0, i);
            int[] topB = Arrays.copyOfRange(topping, i, topping.length);
            if (cal(topA, topB)) {
                cnt++;
            }
        }
        if (cnt == 0){
            return 0;
        }
        return cnt;
    }

    public boolean cal(int[] topA, int[] topB){
        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();
        for (int i = 0; i < topA.length; i++) {
            mapA.put(topA[i], mapA.getOrDefault(topA[i], 0) + 1);
        }
        for (int i = 0; i < topB.length; i++) {
            mapB.put(topB[i], mapB.getOrDefault(topB[i], 0) + 1);
        }
        if (mapA.size() == mapB.size()){
            return true;
        }
        return false;
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
