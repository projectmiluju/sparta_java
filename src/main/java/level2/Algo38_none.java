package level2;

import java.util.Arrays;

public class Algo38_none {
    public int[] solution(int n, int[] info) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo38_none algo38 = new Algo38_none();

        int a = 5;
        int[] info1 = {2,1,1,1,0,0,0,0,0,0,0};
        int[] result1 = {0,2,2,0,1,0,0,0,0,0,0};
        System.out.println(Arrays.toString(algo38.solution(a, info1)));
        if (algo38.solution(a, info1) == result1) System.out.println("Y"); else System.out.println("N");

        int b = 1;
        int[] info2 = {1,0,0,0,0,0,0,0,0,0,0};
        int[] result2 = {-1};
        System.out.println(Arrays.toString(algo38.solution(b, info2)));
        if (algo38.solution(b, info2) == result2) System.out.println("Y"); else System.out.println("N");

        int c = 9;
        int[] info3 = {0,0,1,2,0,1,1,1,1,1,1};
        int[] result3 = {1,1,2,0,1,2,2,0,0,0,0};
        System.out.println(Arrays.toString(algo38.solution(c, info3)));
        if (algo38.solution(c, info3) == result3) System.out.println("Y");

        int d = 10;
        int[] info4 = {0,0,0,0,0,0,0,0,3,4,3};
        int[] result4 = {1,1,1,1,1,1,1,1,0,0,2};
        System.out.println(Arrays.toString(algo38.solution(d, info4)));
        if (algo38.solution(d, info4) == result4) System.out.println("Y");
    }
}
