//프로그래머스 lv1 약수의 개수와 덧셈

public class Algo1 {
    public int solution(int left, int right){
        int answer = 0;

        for (int i = left; i <= right; i++){
            int cnt = 0;

            for (int j = 1; j<=i; j++){
                if (i % j == 0) cnt ++;
            }

            if (cnt % 2 == 0) answer += 1;
            else answer -= i;

        }
        return answer;
    }

    public static void main(String[] args) {
        int a =  13;
        int b = 17;

        Algo1 solution = new Algo1();
        System.out.println(solution.solution(a,b));
    }
}
