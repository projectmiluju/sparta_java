package level2;

import java.util.HashMap;
import java.util.Map;

public class Algo21 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i],i);
        }

        for (String s : phone_book) {
            for (int j = 0; j < s.length(); j++) {
                if (map.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo21 algo = new Algo21();

        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = false;
        System.out.println(algo.solution(phone_book));
        if (algo.solution(phone_book) == result) System.out.println("Y"); else System.out.println("N");

        String[] phone_book2 = {"123","456","789"};
        boolean result2 = true;
        System.out.println(algo.solution(phone_book2));
        if (algo.solution(phone_book2) == result2) System.out.println("Y"); else System.out.println("N");

        String[] phone_book3 = {"12","123","1235","567","88"};
        boolean result3 = false;
        System.out.println(algo.solution(phone_book3));
        if (algo.solution(phone_book3) == result3) System.out.println("Y"); else System.out.println("N");


    }
}
