package level2;

public class Algo28 {

    public String solution(String p) {
        String answer = "";

        if (p.isEmpty()) return ""; // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.


        return answer;
    }

    public static void main(String[] args) {
        Algo28 algo28 = new Algo28();

        String a = "(()())()";
        String b = ")(";
        String c = "()))((()";

        System.out.println(algo28.solution(a));
        if (algo28.solution(a).equals("(()())()")){
            System.out.println("Y");
        }else System.out.println("N");

        System.out.println(algo28.solution(b));
        if (algo28.solution(b).equals("()")){
            System.out.println("Y");
        }else System.out.println("N");

        System.out.println(algo28.solution(c));
        if (algo28.solution(c).equals("()(())()")){
            System.out.println("Y");
        }else System.out.println("N");

    }
}
