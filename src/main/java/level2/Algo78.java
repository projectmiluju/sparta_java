package level2;

public class Algo78 {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo78 algo78 = new Algo78();

        int[] picks1 = {1, 3, 2};
        String[] minerals1 = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
        int res1 = 12;
        int ans1 = algo78.solution(picks1, minerals1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] picks2 = {0, 1, 1};
        String[] minerals2 = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
        int res2 = 50;
        int ans2 = algo78.solution(picks2, minerals2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
