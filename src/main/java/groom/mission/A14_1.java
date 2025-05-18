package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class A14_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        //x타입으로만 충전 가능한 보조 배터리
        int a = Integer.parseInt(input[0]);
        //y타입으로만 충전 가능한 보조 배터리
        int b = Integer.parseInt(input[1]);
        //x타입과 y타입으로 모두 충전 가능한 보조 배터리
        int c = Integer.parseInt(input[2]);

        input = br.readLine().split(" ");
        //마트에서 판매하는 충전기 개수
        int n = Integer.parseInt(input[0]);

        ArrayList<int[]> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            // 충전기의 가격
            int cost = Integer.parseInt(input[0]);
            // 충전기의 타입 0이면 x타입, 1이면 y타입
            int type = Integer.parseInt(input[1]);

            arr.add(new int[]{cost, type});
        }

        // 가격이 낮은 순서대로 정렬
        arr.sort(Comparator.comparing(o -> o[0]));

        int sum = 0;
        long totalPrice = 0;

        for (int i = 0; i < arr.size(); i++) {
            int[] charger = arr.get(i);
            int cost = charger[0];
            int type = charger[1];

            if (type == 0) {
                if (a > 0) {
                    sum++;
                    a--;
                    totalPrice += cost;
                } else if (c > 0) {
                    sum++;
                    c--;
                    totalPrice += cost;
                }
            } else if (type == 1) {
                if (b > 0) {
                    sum++;
                    b--;
                    totalPrice += cost;
                } else if (c > 0) {
                    sum++;
                    c--;
                    totalPrice += cost;
                }
            }
        }

        System.out.print(sum + " " + totalPrice);
    }
}
