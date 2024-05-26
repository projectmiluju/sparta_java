package level2;

public class Algo64 {
    public int solution(int x, int y, int n) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo64 algo64 = new Algo64();

        int x1 = 10, y1 = 40, n1 = 5, res1 = 2;
        int ans1 = algo64.solution(x1, y1, n1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int x2 = 10, y2 = 40, n2 = 30, res2 = 1;
        int ans2 = algo64.solution(x2, y2, n2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");

        int x3 = 2, y3 = 5, n3 = 4, res3 = -1;
        int ans3 = algo64.solution(x3, y3, n3);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");
    }
}
