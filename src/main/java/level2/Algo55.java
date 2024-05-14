package level2;

public class Algo55 {
    public String solution(String number, int k) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Algo55 algo55 = new Algo55();

        String num1 = "1924";
        int a = 2;
        String res1 = "94";
        String ans1 = algo55.solution(num1, a);
        if (res1.equals(ans1)) System.out.println("Y"); else System.out.println("N");

        String num2 = "1231234";
        int b = 3;
        String res2 = "3234";
        String ans2 = algo55.solution(num2, b);
        if (res2.equals(ans2)) System.out.println("Y"); else System.out.println("N");

        String num3 = "4177252841";
        int c = 4;
        String res3 = "775841";
        String ans3 = algo55.solution(num3, c);
        if (res3.equals(ans3)) System.out.println("Y"); else System.out.println("N");
    }
}
