package level3;

import java.util.*;

public class Algo8 {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> num = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if(!num.containsKey(genres[i])){
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i,plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            }else {
                music.get(genres[i]).put(i,plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);
            }
        }

        List<String> keySet = new ArrayList<>(music.keySet());
        keySet.sort((s1, s2) -> num.get(s2) - num.get(s1));

        for (String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> list = new ArrayList<>(map.keySet());

            list.sort((s1, s2) -> map.get(s2) - map.get(s1));

            answer.add(list.get(0));
            if (list.size() > 1) {
                answer.add(list.get(1));
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Algo8 algo8 = new Algo8();

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] result = {4, 1, 3, 0};
        int[] answer = algo8.solution(genres, plays);
        System.out.println(Arrays.toString(answer));
        if (Arrays.equals(result, answer)) System.out.println("Y"); else System.out.println("N");
    }
}
