package level2;

public class Algo75 {
    public int solution(int[][] board) {
        int answer = 1234;
        return answer;
    }

    public static void main(String[] args) {

        Algo75 algo75 = new Algo75();

        int[][] board1 = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        int res1 = 9;
        int ans1 = algo75.solution(board1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[][] board2 = {{0,0,1,1},{1,1,1,1}};
        int res2 = 4;
        int ans2 = algo75.solution(board2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
