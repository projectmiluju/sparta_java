package level1;

public class Algo33 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Algo33 algo = new Algo33();

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices ={5, 3, 2, 7, 5};
        String result = "TCMA";
        System.out.println(algo.solution(survey,choices));
        if (result == algo.solution(survey,choices)) System.out.println("Y"); else System.out.println("N");

        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices2 ={7, 1, 3};
        String result2 = "RCJA";
        System.out.println(algo.solution(survey2,choices2));
        if (result2 == algo.solution(survey2,choices2)) System.out.println("Y"); else System.out.println("N");
    }
}
