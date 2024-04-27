package level2;

import java.util.Arrays;
import java.util.Objects;

public class Algo39 {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int cnt = 0;
            String s = query[i].replaceAll("and ","");
            int point = Integer.parseInt(s.replaceAll("[^0-9]",""));
            s = s.replaceAll("[0-9]","");
            for (int j = 0; j < info.length; j++) {
                if (Objects.equals(s.split(" ")[0], "-") || Objects.equals(s.split(" ")[0], info[j].split(" ")[0])) {
                    if (Objects.equals(s.split(" ")[1], "-") || Objects.equals(s.split(" ")[1], info[j].split(" ")[1])){
                        if (Objects.equals(s.split(" ")[2], "-") || Objects.equals(s.split(" ")[2], info[j].split(" ")[2])){
                            if (Objects.equals(s.split(" ")[3], "-") || Objects.equals(s.split(" ")[3], info[j].split(" ")[3])){
                                if(Integer.parseInt(info[j].split(" ")[4]) >= point){
                                    cnt ++;
                                }
                            }
                        }

                    }
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo39 algo39 = new Algo39();

        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        System.out.println(Arrays.toString(algo39.solution(info, query)));
        if (Arrays.equals(algo39.solution(info, query), new int[]{1, 1, 1, 1, 2, 4})) System.out.println('Y');
            else System.out.println("N");
    }
}
