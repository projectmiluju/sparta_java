package level2;

public class Algo75 {
    public int solution(int[][] board) {
        int[][] map = new int[board.length + 1][board[0].length + 1];

        int maxLen = 0;
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                if(board[i-1][j-1] != 0) {
                    int min = Math.min(Math.min(map[i - 1][j], map[i][j - 1]), map[i - 1][j - 1]);
                    map[i][j] = min + 1;

                    maxLen = Math.max(maxLen, min + 1);
                }
            }
        }

        return maxLen * maxLen;
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
