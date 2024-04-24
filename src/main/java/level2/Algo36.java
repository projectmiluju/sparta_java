package level2;

import java.util.*;

public class Algo36 {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");

            if (str[0].equals("Enter")){
                map.put(str[1], str[2]);
            } else if (str[0].equals("Change")) {
                map.put(str[1], str[2]);
                cnt ++;
            }
        }
        String[] answer = new String[record.length-cnt];
        cnt = 0;
        for (int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");
            String s = map.get(str[1]);
            if (str[0].equals("Enter")) {
                answer[cnt++] = s + "님이 들어왔습니다.";
            }else if (str[0].equals("Leave")) {
                answer[cnt++] = s + "님이 나갔습니다.";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo36 algo36 = new Algo36();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        System.out.println(Arrays.toString(algo36.solution(record)));
        if (Arrays.equals(algo36.solution(record), result)) System.out.println("Y"); else System.out.println("N");
    }
}
