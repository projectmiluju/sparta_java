package level2;

import java.util.Arrays;

public class Algo5 {
    public int[] solution(String s) {
        int[] answer = {};
        int zerosum = 0;
        int zerocount = 0;
        do {
            zerosum = zerosum + s.length() - s.replace("0","").length();
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
            zerocount = zerocount + 1;
            answer = new int[]{zerocount,zerosum};
        } while (!s.equals("1"));
        return answer;
    }

    public static void main(String[] args) {
        Algo5 algo = new Algo5();
        String s = "110010101001";
        String t = "01110";
        String r = "1111111";
        System.out.println(Arrays.toString(algo.solution(s)));
//        System.out.println(Arrays.toString(algo.solution(t)));
//        System.out.println(Arrays.toString(algo.solution(r)));
    }
}
