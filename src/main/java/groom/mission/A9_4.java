package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 구름 RPG2
public class A9_4 {

    static boolean is_Prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            while (!is_Prime(arr[i]-cnt)) {
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
