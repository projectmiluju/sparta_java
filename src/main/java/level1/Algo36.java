package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo36 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < skip.length(); i++){
            arrList.remove(skip.substring(i, i + 1));
        }

        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < arrList.size(); j++){
                if (arrList.get(j).equals(s.substring(i, i + 1))){
                    int cnt = (j+index) % arrList.size();
                    answer.append(arrList.get(cnt));
                }

            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Algo36 algo36 = new Algo36();

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String result = "happy";
        String answer = algo36.solution(s, skip, index);
        System.out.println(answer);
        if (answer.equals(result)) System.out.println("Y"); else System.out.println("N");
    }
}
