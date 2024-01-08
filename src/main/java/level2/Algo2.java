package level2;

public class Algo2 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++){
            String firstLetter = str[i].substring(0,1).toUpperCase();
            String remainLetter = str[i].substring(1).toLowerCase();
            str[i] = firstLetter + remainLetter;
            answer = answer + str[i] + " ";
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }

    public static void main(String[] args) {
        Algo2 algo = new Algo2();
        String s = "for the last week";
        System.out.println(algo.solution(s));
    }
}
