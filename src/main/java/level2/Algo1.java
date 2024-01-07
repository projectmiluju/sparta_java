package level2;

import java.util.Arrays;

public class Algo1 {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);

        String answer = "";
        answer += String.valueOf(arr[0]);
        answer += " ";
        answer += String.valueOf(arr[str.length-1]);

        return answer;
    }

    public static void main(String[] args) {
        Algo1 algo = new Algo1();
        String s = "-1 2 3 4";
        System.out.println(algo.solution(s));
    }
}
