package groom.mission;

import java.util.Scanner;

public class A4_3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int sumA = 0;
        int sumB = 0;

        int N = sc.nextInt();

        int[] arrA = new int[N];
        int[] arrB = new int[N];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (arrA[i] > arrB[i]) {
                if (arrA[i] - arrB[i] == 7) {
                    sumA += -1;
                    sumB += 3;
                } else sumA += 2;
            } else if (arrA[i] < arrB[i]) {
                if (arrA[i] - arrB[i] == -7) {
                    sumA += 3;
                    sumB += -1;
                } else sumB += 2;
            } else {
                sumA += 1;
                sumB += 1;
            }
        }
        System.out.println(sumA + " " + sumB);
    }
}
