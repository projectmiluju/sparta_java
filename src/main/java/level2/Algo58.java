package level2;

public class Algo58 {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Algo58 algo58 = new Algo58();

        int a = 9;
        int[][] wires1 = new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        int res1 = 3;
        int ans1 = algo58.solution(a, wires1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int b = 4;
        int[][] wires2 = new int[][]{{1,2},{2,3},{3,4}};
        int res2 = 0;
        int ans2 = algo58.solution(b, wires2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");

        int c = 7;
        int[][] wires3 = new int[][]{{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}};
        int res3 = 1;
        int ans3 = algo58.solution(c, wires3);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");
    }
}
