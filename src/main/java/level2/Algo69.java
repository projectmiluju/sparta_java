package level2;

import java.util.HashMap;

public class Algo69 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length-9; i++) {
            HashMap<String, Integer> temp = new HashMap<>();
            for (int j = i; j < i + 10; j++){
                if (temp.containsKey(discount[j])){
                    temp.put(discount[j],temp.get(discount[j])+1);
                }
                temp.put(discount[j], temp.getOrDefault(discount[j], 1));

            }
            if (map.equals(temp)) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo69 algo69 = new Algo69();

        String[] want1 = {"banana", "apple", "rice", "pork", "pot"};
        int[] number1 = {3, 2, 2, 2, 1};
        String[] discount1 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        int result1 = 3;
        int answer1 = algo69.solution(want1, number1, discount1);
        System.out.println(answer1);
        if (result1 == answer1) System.out.println("Y"); else System.out.println("N");

        String[] want2 = {"apple"};
        int[] number2 = {10};
        String[] discount2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
        int result2 = 0;
        int answer2 = algo69.solution(want2, number2, discount2);
        System.out.println(answer2);
        if (result2 == answer2) System.out.println("Y"); else System.out.println("N");
    }
}
