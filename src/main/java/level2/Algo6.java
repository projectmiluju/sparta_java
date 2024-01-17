package level2;

public class Algo6 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i<=n; i++){
            int sum = 0;
            for (int j = i; j<=n; j++){
                sum += j;

                if(sum >= n){
                    if(sum == n) answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo6 algo = new Algo6();
        int n = 15;
        System.out.println(algo.solution(n));
    }
}
