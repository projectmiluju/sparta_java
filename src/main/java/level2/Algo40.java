package level2;

import java.util.Arrays;

public class Algo40 {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo40 algo40 = new Algo40();

        int[][] user1 = {{40, 10000}, {25, 10000}};
        int[] emoticon1 = {7000, 9000};
        int[] result1 = {1, 5400};
        System.out.println(Arrays.toString(algo40.solution(user1, emoticon1)));
        if (algo40.solution(user1, emoticon1) == result1) System.out.println("Y"); else System.out.println("N");

        int[][] user2 = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int[] emoticon2 = {1300, 1500, 1600, 4900};
        int[] result2 = {4, 13860};
        System.out.println(Arrays.toString(algo40.solution(user2, emoticon2)));
        if (algo40.solution(user2, emoticon2) == result2) System.out.println("Y"); else System.out.println("N");
    }
}
