package level2;

import java.util.Arrays;

public class Algo43 {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo43 algo43 = new Algo43();

        String[] order1 = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course1 = {2,3,4};
        String[] result1 = {"AC", "ACDE", "BCFG", "CDE"};
        System.out.println(Arrays.toString(algo43.solution(order1, course1)));
        if (Arrays.equals(algo43.solution(order1, course1), result1)) System.out.println("Y"); else System.out.println("N");

        String[] order2 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course2 = {2,3,5};
        String[] result2 = {"ACD", "AD", "ADE", "CD", "XYZ"};
        System.out.println(Arrays.toString(algo43.solution(order2, course2)));
        if (Arrays.equals(algo43.solution(order2, course2), result2)) System.out.println("Y"); else System.out.println("N");

        String[] order3 = {"XYZ", "XWY", "WXA"};
        int[] course3 = {2,3,4};
        String[] result3 = {"WX", "XY"};
        System.out.println(Arrays.toString(algo43.solution(order3, course3)));
        if (Arrays.equals(algo43.solution(order3, course3), result3)) System.out.println("Y"); else System.out.println("N");
    }
}
