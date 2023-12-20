package level1;

import java.util.Arrays;

public class Algo9 {
    public int[] solution(String s){
        int[] answer = new int[s.length()];
        for (int i = 0; i<s.length(); i++) {
            if (i != 0){
                int a = s.substring(0,i).lastIndexOf(s.charAt(i));
                if (a != -1){
                    answer[i] = i- a;
                }else{
                    answer[i] = a;
                }
            }else {
                answer[i] = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo9 algo = new Algo9();
        System.out.println(Arrays.toString(algo.solution("banana")));
        System.out.println(Arrays.toString(algo.solution("foobar")));

    }
}

