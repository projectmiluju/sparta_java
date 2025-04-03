package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

//재고 정리
public class A11_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();
        String[] item;
        String S;
        Integer A;
        for (int i = 0; i < N; i++) {
            item = br.readLine().split(" ");
            S = item[0];
            A = Integer.parseInt(item[1]);
            if (!map.containsKey(S)) {
                map.put(S, A);
            } else {
                map.put(S, map.get(S) + A);
            }
        }
//        List<String> list = new ArrayList<>(map.keySet());
//        Collections.sort(list);
//
//        for (String key : list) {
//            System.out.println(key + " " + map.get(key));
//        }
//        Map<String, Integer> sortedMap = new TreeMap<>(map);

        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()) {
            sb.append(key).append(" ").append(map.get(key)).append("\n");

        }
        System.out.print(sb);

    }
}
