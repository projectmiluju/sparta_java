package groom.mission;

import java.io.*;
public class A3_3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            double a = Double.parseDouble(str.split(" ")[0]);
            double b = Double.parseDouble(str.split(" ")[1]);

            double min = Math.min(a, b);
            double max = Math.max(a, b);

            if (min * 1.6 <= max && min * 1.63 >= max) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
