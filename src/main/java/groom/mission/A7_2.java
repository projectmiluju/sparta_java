package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//이진수 정렬
public class A7_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String str1 = br.readLine();
//        String str2 = br.readLine();
//
//        int N = Integer.parseInt(str1.split(" ")[0]);
//        int K = Integer.parseInt(str1.split(" ")[1]);
//
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(str2.split(" ")[i]);
//        }

        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");

        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }

        List<Pair> pairs = new ArrayList<>();

        for (int value : arr) {
            int cnt = Integer.bitCount(value);

            pairs.add(new Pair(cnt, value));
        }

        pairs.sort((a, b) -> {
            if (a.cnt == b.cnt) {
                return Integer.compare(b.value, a.value);
            }
            return Integer.compare(b.cnt, a.cnt);
        });

        System.out.println(pairs.get(K - 1).value);
    }

    static class Pair {
        int cnt;
        int value;
        Pair(int cnt, int value) {
            this.cnt = cnt;
            this.value = value;
        }
    }
}
