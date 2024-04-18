package level2;

public class Algo33 {

    public int solution(String s) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {

        Algo33 algo33 = new Algo33();

        String a = "[](){}";
        int a1 = 3;
        System.out.println(algo33.solution(a));
        if (algo33.solution(a) == a1) System.out.println("Y"); else System.out.println("N");

        String b = "}]()[{";
        int b1 = 2;
        System.out.println(algo33.solution(b));
        if (algo33.solution(b) == b1) System.out.println("Y"); else System.out.println("N");

        String c = "[)(]";
        int c1 = 0;
        System.out.println(algo33.solution(c));
        if (algo33.solution(c) == c1) System.out.println("Y"); else System.out.println("N");

        String d = "}}}";
        int d1 = 0;
        System.out.println(algo33.solution(d));
        if (algo33.solution(d) == d1) System.out.println("Y"); else System.out.println("N");
    }
}
