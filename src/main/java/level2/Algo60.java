package level2;

import java.util.Arrays;

public class Algo60 {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        Arrays.sort(arrayA);
        int a = 0;
        if (arrayA.length == 1) {
            a = arrayA[0];
        } else {
            a = arrayA[arrayA.length - 1];
            for (int i = arrayA.length-1; i > 0; i--){
                a = gcd(a, arrayA[i-1]);
            }
        }
        for (int i = 0; i < arrayB.length; i++){
            if (arrayB[i] % a == 0) {
                a = 0;
                break;
            }
        }


        Arrays.sort(arrayB);
        int b = 0;
        if (arrayB.length == 1) {
            b = arrayB[0];
        } else {
            b = arrayB[arrayB.length-1];
            for (int i = arrayB.length-1; i > 0; i--){
                b = gcd(b, arrayB[i-1]);
            }
        }
        for (int i = 0; i < arrayB.length; i++){
            if (arrayB[i] % b == 0) {
                b = 0;
                break;
            }
        }
        answer = Math.max(a, b);
        return answer;
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Algo60 algo60 = new Algo60();

        int[] arrayA1 = {10, 17};
        int[] arrayB1 = {5, 20};
        int res1 = 0;
        int ans1 = algo60.solution(arrayA1, arrayB1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] arrayA2 = {10, 20};
        int[] arrayB2 = {5, 17};
        int res2 = 10;
        int ans2 = algo60.solution(arrayA2, arrayB2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
//
        int[] arrayA3 = {14, 35, 119};
        int[] arrayB3 = {18, 30, 102};
        int res3 = 7;
        int ans3 = algo60.solution(arrayA3, arrayB3);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");
    }
}
