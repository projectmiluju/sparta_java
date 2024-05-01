package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Algo43 {
    static HashMap<String, Integer> map;
    public String[] solution(String[] orders, int[] course) {

        for (int i = 0; i < orders.length; i++) {
            char[] chars = orders[i].toCharArray();
            Arrays.sort(chars);
            orders[i] = String.valueOf(chars);
        }

        map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < course.length; i++) {
            for (int j = 0; j < orders.length; j++) {
                combination(orders[j], "", course[i]);
            }
            if (!map.isEmpty()){
                ArrayList<Integer> maxList = new ArrayList<>(map.values());
                int max = Collections.max(maxList);

                if (max > 1){
                    for (String key : map.keySet()){
                        if (map.get(key) == max){
                            list.add(key);
                        }
                    }
                }
            }
            map.clear();
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public void combination(String order, String com, int courseNum){
        if (com.length() == courseNum){
            map.put(com, map.getOrDefault(com, 0) + 1);
            return;
        }

        for (int i = 0; i < order.length(); i++) {
            combination(order.substring(i+1), com + order.charAt(i), courseNum );
        }
    }

    public static void main(String[] args) {
        Algo43 algo43 = new Algo43();

        String[] order1 = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course1 = {2,3,4};
        String[] result1 = {"AC", "ACDE", "BCFG", "CDE"};
        System.out.println(Arrays.toString(algo43.solution(order1, course1)));
        if (Arrays.equals(algo43.solution(order1, course1), result1)) System.out.println("Y"); else System.out.println("N");

        String[] order2 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course2 = {2,3,5};
        String[] result2 = {"ACD", "AD", "ADE", "CD", "XYZ"};
        System.out.println(Arrays.toString(algo43.solution(order2, course2)));
        if (Arrays.equals(algo43.solution(order2, course2), result2)) System.out.println("Y"); else System.out.println("N");

        String[] order3 = {"XYZ", "XWY", "WXA"};
        int[] course3 = {2,3,4};
        String[] result3 = {"WX", "XY"};
        System.out.println(Arrays.toString(algo43.solution(order3, course3)));
        if (Arrays.equals(algo43.solution(order3, course3), result3)) System.out.println("Y"); else System.out.println("N");
    }
}
