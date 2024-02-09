package level1;

import java.util.Arrays;

public class Algo32 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo32 algo = new Algo32();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result = {2,1,1,0};
        System.out.println(Arrays.toString(algo.solution(id_list, report, k)));
        if (algo.solution(id_list,report,k) == result) System.out.println("Y"); else System.out.println("N");

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        int[] result2 = {0,0};
        System.out.println(Arrays.toString(algo.solution(id_list2, report2, k2)));
        if (algo.solution(id_list2,report2,k2) == result2) System.out.println("Y"); else System.out.println("N");
    }
}
