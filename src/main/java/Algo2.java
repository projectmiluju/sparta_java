import java.util.Arrays;

public class Algo2 {
    public String solution(String s){
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        answer = new StringBuilder(new String(chars)).reverse().toString();

        return answer;
    }

    public static void main(String[] args) {
        String a = "abcAdef";

        Algo2 solution = new Algo2();
        System.out.println(solution.solution(a));
    }
}
