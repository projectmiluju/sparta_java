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

        String[] firstLine = strings.get(0).split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        int q = Integer.parseInt(strings.get(2));


        int[] arr = Arrays.stream(strings.get(1).split(" ")).mapToInt(Integer::parseInt).toArray();

        Long answer = 0L;
        if (arr[x - 1] >= m) {
            answer += arr[x - 1];
            arr[x - 1] = 0;
        }
        for (int i = 0; i < n; i++) arr[i]++;

        String[] commands = strings.get(3).split(" ");

        for (int i = 0; i < q - 1; i++) {
            char cmd = commands[i].charAt(0);

            if (cmd == 'L') {
                x = (x == 1) ? n : x - 1;
            } else if (cmd == 'R') {
                x = (x == n) ? 1 : x + 1;
            }

            if (arr[x - 1] >= m) {
                answer += arr[x - 1];
                arr[x - 1] = 0;
            }

            for (int j = 0; j < n; j++) arr[j]++;
        }

        System.out.println(answer);
    }
}
