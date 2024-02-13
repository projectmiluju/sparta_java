package level2;

import java.util.HashMap;

public class Algo15 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {

            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        answer -= 1;

        return answer;
    }

    public static void main(String[] args) {
        Algo15 algo = new Algo15();

        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"blue_sunglasses", "eyewear"}};
        int result = 5;
        System.out.println(algo.solution(clothes));
        if (algo.solution(clothes) == result) System.out.println("Y"); else System.out.println("N");

        String[][] clothes2 = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
        int result2 = 3;
        System.out.println(algo.solution(clothes2));
        if (algo.solution(clothes2) == result2) System.out.println("Y"); else System.out.println("N");

    }

}
