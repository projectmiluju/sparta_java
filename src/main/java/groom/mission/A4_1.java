package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A4_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int answer = 0;


        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[2]);

            switch (input.split(" ")[1]) {
                case "+":
                    answer += a + b;
                    break;
                case "-":
                    answer += a - b;
                    break;
                case "*":
                    answer += a * b;
                    break;
                case "/":
                    answer += a / b;
                    break;
            }
        }
        System.out.println(answer);
    }
}
