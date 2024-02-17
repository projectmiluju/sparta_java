package level2;

public class Algo17 {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo17 algo = new Algo17();

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int result = 5;
        System.out.println(algo.solution(numbers, target));
        if (algo.solution(numbers, target) == result) System.out.println("Y"); else System.out.println("N");

        int[] numbers2 = {4, 1, 2, 1};
        int target2 = 4;
        int result2 = 2;
        System.out.println(algo.solution(numbers2, target2));
        if (algo.solution(numbers2, target2) == result2) System.out.println("Y"); else System.out.println("N");
    }
}
