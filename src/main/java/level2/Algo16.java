package level2;

public class Algo16 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo16 algo = new Algo16();

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int result = 3;
        System.out.println(algo.solution(k,tangerine));
        if (algo.solution(k,tangerine) == result) System.out.println("Y"); else System.out.println("N");

        int k2 = 2;
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3};
        int result2 = 2;
        System.out.println(algo.solution(k2,tangerine2));
        if (algo.solution(k2,tangerine2) == result2) System.out.println("Y"); else System.out.println("N");

        int k3 = 2;
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};
        int result3 = 1;
        System.out.println(algo.solution(k3,tangerine3));
        if (algo.solution(k3,tangerine3) == result3) System.out.println("Y"); else System.out.println("N");
    }
}
