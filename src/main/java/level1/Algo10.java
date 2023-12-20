package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algo10 {
    public String[] solution(String[] strings, int n){
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        for (int i = 0; i<strings.length; i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }

        Collections.sort(list);//

        for (int j = 0; j<list.size(); j++){
            answer[j] = list.get(j).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo10 algo = new Algo10();
        String[] strings1 = {"sun", "bed", "car"};
        String[] strings2 = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(algo.solution(strings1, 1)));
        System.out.println(Arrays.toString(algo.solution(strings2, 2)));

    }
}
