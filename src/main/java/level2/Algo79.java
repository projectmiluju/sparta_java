package level2;

public class Algo79 {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Algo79 algo79 = new Algo79();

        int k = 80;
        int[][] dungeons = {{80,20}, {50, 40}, {30, 10}};
        int result = 3;
        int answer = algo79.solution(k, dungeons);
        System.out.println(answer);
        if (result == answer) System.out.println("Y"); else System.out.println("N");
    }
}
