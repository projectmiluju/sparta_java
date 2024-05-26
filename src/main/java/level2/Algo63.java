package level2;

public class Algo63 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo63 a = new Algo63();

        int[][] data = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        int col = 2;
        int row_begin = 2;
        int row_end = 3;
        int result = 4;
        int answer = a.solution(data, col, row_begin, row_end);
        System.out.println(answer);
        if (result == answer) System.out.println("Y"); else System.out.println("N");
    }
}
