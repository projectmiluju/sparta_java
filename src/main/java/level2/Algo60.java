package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Algo60 {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        // 내림차순 정렬
        Arrays.sort(arrayA);
        int a = 0;
        //최대공약수 구하기
        if (arrayA.length == 1) {
            a = arrayA[0];
        } else {
            a = arrayA[arrayA.length - 1];
            for (int i = arrayA.length-1; i > 0; i--){
                a = gcd(a, arrayA[i-1]);
            }
        }
        //최대공약수의 약수 구하기
        ArrayList<Integer> listA = new ArrayList<>();
        if (a != 0 || a != 1){
            for (int i = 1; i <= a; i++){
                if (a % i == 0) {
                    listA.add(i);
                }
            }
        }
        listA.sort(Comparator.reverseOrder());

        //A의 약수 중 B의 모든 수를 나누지 않는 가장 큰수 구하기
        int cntA = 0;
        for (int i = 0; i < arrayB.length; i++){
            for (int j = cntA; j < listA.size(); j++){
                if (arrayB[i] % listA.get(j) == 0){
                    a = 0;
                    cntA++;
                }else {
                    a = listA.get(j);
                    break;
                }
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
        ArrayList<Integer> listB = new ArrayList<>();
        if (b != 0 || b != 1){
            for (int i = 1; i <= b; i++){
                if (b % i == 0) {
                    listB.add(i);
                }
            }
        }

        listB.sort(Comparator.reverseOrder());

        int cntB = 0;
        for (int i = 0; i < arrayA.length; i++){
            for (int j = cntB; j < listB.size(); j++){
                if (arrayA[i] % listB.get(j) == 0){
                    b = 0;
                    cntB++;
                }else {
                    b = listB.get(j);
                    break;
                }
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
