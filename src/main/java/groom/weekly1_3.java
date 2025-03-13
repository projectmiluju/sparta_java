package groom;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class weekly1_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            strings.add(br.readLine());
        }

        int n = Integer.parseInt(strings.get(0).split(" ")[0]);
        int m = Integer.parseInt(strings.get(0).split(" ")[1]);
        int x = Integer.parseInt(strings.get(0).split(" ")[2]);
        int q = Integer.parseInt(strings.get(2));

        int[] arr = Arrays.stream(strings.get(1).split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = 0;
        if (arr[x-1] >= m) {
            answer += arr[x-1];
            arr[x-1] = 0;
        }
        Arrays.setAll(arr, j -> arr[j] + 1);

        String[] arr2 = strings.get(3).split(" ");

        for (int i = 0; i < q-1; i++) {
            switch (arr2[i]) {
                case "L" -> {
                    if (x == 1) {
                        x = n;
                    } else {
                        x = x - 1;
                    }
                    if (arr[x - 1] >= m) {
                        answer += arr[x - 1];
                        arr[x - 1] = 0;
                    }
                }
                case "R" -> {
                    if (x == n) {
                        x = 1;
                    } else {
                        x = x + 1;
                    }
                    if (arr[x - 1] >= m) {
                        answer += arr[x - 1];
                        arr[x - 1] = 0;
                    }
                }
                case "S" -> {
                    if (arr[x - 1] >= m) {
                        answer += arr[x - 1];
                        arr[x - 1] = 0;
                    }
                }
            }
            Arrays.setAll(arr, j -> arr[j] + 1);
        }
        System.out.println(answer);
    }
}
