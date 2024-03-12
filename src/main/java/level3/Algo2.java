package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Algo2 {

    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("I")){
                   arr.add(Integer.parseInt(operations[i].substring(2)));
            } else if (operations[i].contains("D") && !arr.isEmpty()) {
                if (operations[i].contains("-")){
                    Collections.sort(arr);
                    arr.remove(0);
                } else {
                    arr.sort(Collections.reverseOrder());
                    arr.remove(0);
                }
            }
        }
        if (!arr.isEmpty()) {
            arr.sort(Collections.reverseOrder());
            answer[0] = arr.get(0);
            answer[1] = arr.get(arr.size() - 1);
        } else {
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo2 algo = new Algo2();

        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(Arrays.toString(algo.solution(operations)));

        String[] operations2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(algo.solution(operations2)));
    }
}
