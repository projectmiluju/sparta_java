package level2;


public class Algo13 {
    public int solution(int n) {
        int answer = 0;
        while (n != 0){
            if (n % 2 == 0){
                n /= 2;
            }else {
                n--;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo13 algo = new Algo13();
        System.out.println(algo.solution(5));
        System.out.println(algo.solution(6));
        System.out.println(algo.solution(5000));
    }
}
