package level1;

public class Algo23 {
    public int solution(int n) {
        int answer = 1;
        for (int i = 3; i <= n; i++){
            if (isPrime(i)){
                answer += 1;
            }
        }
        return answer;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i<= (int)Math.sqrt(num); i++){
            // Math.sqrt
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Algo23 algo = new Algo23();
        System.out.println(algo.solution(10));
        System.out.println(algo.solution(5));
    }
}
