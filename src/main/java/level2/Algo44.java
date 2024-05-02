package level2;

public class Algo44 {
    public long solution(String expression) {
        long answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo44 algo44 = new Algo44();

        String expression1 = "100-200*300-500+20";
        long result1 = 60420;
        System.out.println(algo44.solution(expression1));
        if (algo44.solution(expression1) == result1) System.out.println("Y"); else System.out.println("N");

        String expression2 = "50*6-3*2";
        long result2 = 300;
        System.out.println(algo44.solution(expression2));
        if (algo44.solution(expression2) == result2) System.out.println("Y"); else System.out.println("N");
    }
}
