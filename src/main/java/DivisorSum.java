//프로그래머스 Lv1 약수의 합
public class DivisorSum {
    public int solution( int n ){
        int answer = 0;
        for (int i = 1; i<=n; ++i){
            if (n % i == 0)
            {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int x = 15;
        DivisorSum solution = new DivisorSum();
        System.out.println(solution.solution(x));
    }
}
