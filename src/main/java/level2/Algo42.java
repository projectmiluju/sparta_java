package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Algo42 {
    public int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();
        char ch = 'A';
        for (int i = 1; i<=26; i++){
            map.put(String.valueOf(ch), i);
            ch++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;

        while (idx +1 < msg.length()){
            String cur = "";
            String pre = String.valueOf(msg.charAt(idx));

            for (int i = 1; idx + i <= msg.length(); i++){
                cur = msg.substring(idx, idx + i);
                if (!map.containsKey(cur)){
                    map.put(cur, map.size()+1);
                    break;
                }
                pre = cur;
            }
            list.add(map.get(pre));
            idx = idx + pre.length();
        }
        if (idx == msg.length()-1){
            list.add(map.get(String.valueOf(msg.charAt(idx))));
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo42 algo42 = new Algo42();

        String msg1 = "KAKAO";
        int[] result1 = {11, 1, 27, 15};
        System.out.println(Arrays.toString(algo42.solution(msg1)));
        if (Arrays.equals(algo42.solution(msg1),result1)) System.out.println("Y"); else System.out.println("N");

        String msg2 = "TOBEORNOTTOBEORTOBEORNOT";
        int[] result2 = {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34};
        System.out.println(Arrays.toString(algo42.solution(msg2)));
        if (Arrays.equals(algo42.solution(msg2),result2)) System.out.println("Y"); else System.out.println("N");

        String msg3 = "ABABABABABABABAB";
        int[] result3 = {1, 2, 27, 29, 28, 31, 30};
        System.out.println(Arrays.toString(algo42.solution(msg3)));
        if (Arrays.equals(algo42.solution(msg3),result3)) System.out.println("Y"); else System.out.println("N");
    }
}
