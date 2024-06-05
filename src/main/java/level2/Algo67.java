package level2;

public class Algo67 {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Algo67 algo67 = new Algo67();

        int n1 = 2, t1 = 4, m1 = 2, p1 = 1;
        String res1 = "0111";
        String ans1 = algo67.solution(n1, t1, m1, p1);
        System.out.println(ans1);
        if (res1.equals(ans1)) System.out.println("Y"); else System.out.println("N");

        int n2 = 16, t2 = 16, m2 = 2, p2 = 1;
        String res2 = "02468ACE11111111";
        String ans2 = algo67.solution(n2, t2, m2, p2);
        System.out.println(ans2);
        if (res2.equals(ans2)) System.out.println("Y"); else System.out.println("N");

        int n3 = 16, t3 = 16, m3 = 2, p3 = 2;
        String res3 = "13579BDF01234567";
        String ans3 = algo67.solution(n3, t3, m3, p3);
        System.out.println(ans3);
        if (res3.equals(ans3)) System.out.println("Y"); else System.out.println("N");
    }
}
