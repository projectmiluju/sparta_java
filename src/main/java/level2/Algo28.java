package level2;

public class Algo28 {

    public String solution(String p) {

        if (p.isEmpty()) return p;

        int left = 0;
        int right = 0;
        int index = 0;
        for (int i = 0; i<p.length(); i++) {
            if (p.charAt(i) == '(') {
                left++;
            }else{
                right++;
            }
            if (left == right) {
                index = i;
                break;
            }
        }

        String u = p.substring(0, index+1);
        String v = p.substring(index+1);

        left = 0;
        right = 0;
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (right > left) {
                StringBuilder sb = new StringBuilder();
                for (int j = 1; j < u.length() - 1; j++) {
                    if (u.charAt(j) == '(') {
                        sb.append(')');
                    } else {
                        sb.append('(');
                    }
                }

                return "(" + solution(v) + ")" + sb;
            }
        }
        return u + solution(v);
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
