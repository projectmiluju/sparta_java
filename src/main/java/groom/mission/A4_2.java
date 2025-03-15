package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A4_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String S = str.split(" ")[0];
            int P = Integer.parseInt(str.split(" ")[1]);
            map.put(P,S);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        System.out.println(map.get(list.get(list.size()-1)) + " " + list.get(list.size()-1));
        System.out.println(map.get(list.get(0)) + " " + list.get(0));

    }
}
