package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//하노이의 탑
public class A8_2 {
    static List<int[]> arr = new ArrayList<>();

    public static void hanoi(int n, int start, int end, int via) {
        if (n == 1) {
            arr.add(new int[]{start, end});
            return;
        }

        hanoi(n - 1, start, via, end);

        arr.add(new int[]{start, end});

        hanoi(n - 1, via, end, start);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        hanoi(20, 1, 3, 2);


        List<Integer>[] list = new ArrayList[4];
        for (int i = 1; i <= 3; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 20; i > 0; i--) {
            list[1].add(i);
        }

        for (int i = 0; i < K; i++) {
            int start = arr.get(i)[0];
            int end = arr.get(i)[1];

            int disk = list[start].remove(list[start].size() - 1);
            list[end].add(disk);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=3; i++) {
            int total = 0;
            for (int disk : list[i]) {
                total += disk;
            }
            sb.append(total).append(" ");
        }

        System.out.println(sb.toString());
    }
}