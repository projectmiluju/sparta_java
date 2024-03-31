package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Algo34 {

    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < terms.length; i++) {
            for (int j = 0; j < privacies.length; j++) {
                if (privacies[j].contains(terms[i].substring(0,1))){
                    int x = Integer.parseInt(terms[i].substring(2));
//                    int a = Integer.parseInt(today.substring(0,4)) - Integer.parseInt(privacies[j].substring(0,4));
//                    int b = Integer.parseInt(today.substring(5,7)) - Integer.parseInt(privacies[j].substring(5,7));
//                    int c = Integer.parseInt(today.substring(8,10)) - Integer.parseInt(privacies[j].substring(8,10));
//
//                    int y = (Math.abs((a * 12) - Math.abs(b)))*28 + c;
//
//                    if ( (y / 28) >= x ){
//                        list.add(j+1);
//                    }
                    int a = Integer.parseInt(today.substring(2,4))*12*28 + Integer.parseInt(today.substring(5,7))*28
                            + Integer.parseInt(today.substring(8,10));
                    int b = Integer.parseInt(privacies[j].substring(2,4))*12*28 + Integer.parseInt(privacies[j].substring(5,7))*28
                            + Integer.parseInt(privacies[j].substring(8,10));

                    if ((a-b) > 0 ){
                        if ( (a-b) / 28 >= x){
                            list.add(j+1);
                        }
                    }
                }
            }
        }
        int[] answer = new int[list.size()];
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

        Algo34 algo34 = new Algo34();

        String today1 = "2022.05.19";
        String[] terms1 = {"A 6", "B 12", "C 3"};
        String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] result1 = {1, 3};
        System.out.println(Arrays.toString(algo34.solution(today1, terms1, privacies1)));
        if (Arrays.equals(algo34.solution(today1, terms1, privacies1), result1)){
            System.out.println("Y");
        }else System.out.println("N");

        String today2 = "2020.01.01";
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] result2 = {1, 4, 5};
        System.out.println(Arrays.toString(algo34.solution(today2, terms2, privacies2)));
        if (Arrays.equals(algo34.solution(today2, terms2, privacies2), result2)){
            System.out.println("Y");
        }else System.out.println("N");
    }
}
