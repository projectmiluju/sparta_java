package level1;

import java.util.Arrays;
import java.util.Objects;


public class Algo32_none {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        String[][] str2  = new String[id_list.length][report.length];
        for (int i = 0; i < id_list.length; i++){

            int idx = 0;
            for (int j = 0; j < report.length; j++){
                String[] str1 = report[j].split(" ");
                if (Objects.equals(id_list[i], str1[0])) {
                    if (str2[i][idx].contains(str1[1])) {
                    }else {
                        str2[i][idx++] = str1[1];
                    }
                }
            }

        }
        System.out.println(Arrays.deepToString(str2));

        return answer;
    }

    public static void main(String[] args) {
        Algo32_none algo = new Algo32_none();

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
