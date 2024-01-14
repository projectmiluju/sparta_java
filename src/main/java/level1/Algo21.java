package level1;

public class Algo21 {
    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }

        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo21 algo = new Algo21();
        int a = 5;
        int b = 3;
        int c = 2;
        System.out.println(algo.solution(a,b,c));
    }
}
