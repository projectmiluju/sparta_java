package level2;

public class Algo2 {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++){
            if (str[i].isEmpty()){
                answer += " ";
            } else {
                answer += str[i].substring(0,1).toUpperCase();
                answer += str[i].substring(1).toLowerCase();
                answer += " ";
            }
        }
        if (s.endsWith(" ")){
            return answer;
        }
        return answer.substring(0,answer.length()-1);
    }

    public static void main(String[] args) {
        Algo2 algo = new Algo2();
        String s = " ";
        System.out.println(algo.solution(s));
    }
}
