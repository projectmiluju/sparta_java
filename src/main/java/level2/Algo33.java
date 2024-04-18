package level2;

public class Algo33 {

    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (test(s)){
                answer++;
            }
            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

    public boolean test(String s) {
        String a = s;
        if (a.length() % 2 != 0 ){
            return false;
        }
        if (a.charAt(0) == ']' || a.charAt(0) == '}' || a.charAt(0) == ')'){
            return false;
        }
        for (int i = 0; i < s.length()/2; i++) {
            if (a.contains("[]")){
                a = a.replace("[]", "");
            }
            if (a.contains("{}")){
                a = a.replace("{}", "");
            }
            if (a.contains("()")){
                a = a.replace("()", "");
            }
        }
        if (a.isEmpty()) return true;

        return false;
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
