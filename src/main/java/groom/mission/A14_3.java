package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A14_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        // 초코쿠키 개수
        int n = Integer.parseInt(input[0]);
        // 초코쿠키 마다 맛있는 정도 수치
        ArrayList<Integer> list = new ArrayList<>();
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(input[i]));
        }

    }
}
