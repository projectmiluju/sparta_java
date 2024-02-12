package level1;

public class Algo33 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[][] sursum = new int[4][2];
        for (int i = 0; i < choices.length; i++){
            if ( choices[i] == 1) {
                choices[i] = 3;
            }else if ( choices[i] == 2) {
                choices[i] = 2;
            }else if ( choices[i] == 3) {
                choices[i] = 1;
            }else if ( choices[i] == 4){
                choices[i] = 0;
            } else if ( choices[i] == 5) {
                choices[i] = -1;
            } else if ( choices[i] == 6) {
                choices[i] = -2;
            } else if ( choices[i] == 7) {
                choices[i] = -3;
            }
        }

        for (int i = 0; i < survey.length; i++){
            if (survey[i].charAt(0) == 'R') {
                sursum[0][0] += choices[i];
            } else if (survey[i].charAt(0) == 'T') {
                sursum[0][1] += choices[i];
            } else if (survey[i].charAt(0) == 'C') {
                sursum[1][0] += choices[i];
            } else if (survey[i].charAt(0) == 'F') {
                sursum[1][1] += choices[i];
            } else if (survey[i].charAt(0) == 'J') {
                sursum[2][0] += choices[i];
            } else if (survey[i].charAt(0) == 'M') {
                sursum[2][1] += choices[i];
            } else if (survey[i].charAt(0) == 'A') {
                sursum[3][0] += choices[i];
            } else if (survey[i].charAt(0) == 'N') {
                sursum[3][1] += choices[i];
            }
        }

        if (sursum[0][0] - sursum[0][1] >= 0) {
            answer += "R";
        } else answer += "T";
        if (sursum[1][0] - sursum[1][1] >= 0) {
            answer += "C";
        } else answer += "F";
        if (sursum[2][0] - sursum[2][1] >= 0) {
            answer += "J";
        } else answer += "M";
        if (sursum[3][0] - sursum[3][1] >= 0) {
            answer += "A";
        } else answer += "N";

        return answer;
    }

    public static void main(String[] args) {
        Algo33 algo = new Algo33();

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices ={5, 3, 2, 7, 5};
        String result = "TCMA";
        System.out.println(algo.solution(survey,choices));
        if (result.equals(algo.solution(survey, choices))) System.out.println("Y"); else System.out.println("N");

        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices2 ={7, 1, 3};
        String result2 = "RCJA";
        System.out.println(algo.solution(survey2,choices2));
        if (result2.equals(algo.solution(survey2, choices2))) System.out.println("Y"); else System.out.println("N");
    }
}
