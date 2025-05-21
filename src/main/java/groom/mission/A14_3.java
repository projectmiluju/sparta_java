package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A14_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        // 초코쿠키 개수
        int n = Integer.parseInt(input[0]);
        // 초코쿠키 마다 맛있는 정도 수치
        int[] arr = new int[n+1];
        input = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(input[i-1]);
        }

        List<int[]> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new int[]{arr[i], i});
        }

        list.sort(Comparator.comparingInt(o -> o[0]));

        for (int i = 0; i < n; i++) {
            if (list.get(i)[0] - i <= 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
              return;
            }
        }

        for (int[] pair : list) {
            System.out.print(pair[1] + " ");
        }
    }
}
