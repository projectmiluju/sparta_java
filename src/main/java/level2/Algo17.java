package level2;

public class Algo17 {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    // 깊이 우선 탐색 알고리즘
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){
            if(target == sum) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }

    public static void main(String[] args) {
        Algo17 algo = new Algo17();

        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        System.out.println(algo.solution(numbers, target));
        int result = 2;
        if (algo.answer == result) System.out.println("Y"); else System.out.println("N");


    }
}
