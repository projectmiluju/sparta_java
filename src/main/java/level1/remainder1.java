package level1;

//프로그래머스 LV1 나머지가 1이 되는 수
public class remainder1 {
    public int solution(int n){
        int answer = 0;
        for (int i = 2; i<n; i++){
            if (n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 10;
        remainder1 solution = new remainder1();
        System.out.println(solution.solution(a));
    }
}
