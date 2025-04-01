package groom.mission;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//문자열 나누기
public class A9_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        List<String[]> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 1; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                String first = S.substring(0,i);
                String second = S.substring(i,j);
                String third = S.substring(j);

                list.add(new String[]{first,second,third});
                set.add(first);
                set.add(second);
                set.add(third);

            }
        }

        List<String> setList = new ArrayList<>(set);
        Collections.sort(setList);

        Map<String, Integer> map = new HashMap<>();
        for (int i  = 0; i < setList.size(); i++) {
            map.put(setList.get(i), i+1);
        }

        int max = -1;
        for (String[] key : list) {
            int score = 0;
            for (String s : key) {
                score +=map.get(s);
            }
            max = Math.max(max, score);
        }

        System.out.println(max);
    }
}
