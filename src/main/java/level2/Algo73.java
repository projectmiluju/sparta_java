package level2;

public class Algo73 {
    public int solution(String[] board) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo73 a = new Algo73();

        String[] board1 = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
        int result1 = 7;
        int answer1 = a.solution(board1);
        System.out.println(answer1);
        if (answer1 == result1) System.out.println("Y"); else System.out.println("N");

        String[] board2 = {".D.R", "....", ".G..", "...D"};
        int result2 = -1;
        int answer2 = a.solution(board2);
        System.out.println(answer2);
        if (answer2 == result2) System.out.println("Y"); else System.out.println("N");
    }
}
