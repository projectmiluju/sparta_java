package level1;

import java.util.Arrays;

public class Algo34 {

    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {

        Algo34 algo34 = new Algo34();

        String today = "2022.05.19";
        String[] terms1 = {"A 6", "B 12", "C 3"};
        String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(algo34.solution(today, terms1, privacies1)));

        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(algo34.solution(today, terms2, privacies2)));
    }
}
