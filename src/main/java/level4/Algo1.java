package level4;

public class Algo1 {
    public int solution(int[] food_times, long k) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo1 algo1 = new Algo1();

        int[] food_times = new int[]{3,1,2};
        long k = 5;
        int result = 1;
        int answer = algo1.solution(food_times, k);
        System.out.println(answer);
        if (answer == result) System.out.println("Y"); else System.out.println("N");
    }
}
