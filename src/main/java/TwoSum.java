public class TwoSum {
    public long solution(int a, int b) {
    long answer = 0;

    int min = Math.min(a, b);
    int max = Math.max(a, b);

    for(int i = min; i<=max; i++){
        answer += i;
    }

    return answer;
}
    public static void main(String[] args){

        TwoSum solution = new TwoSum();
        System.out.println(solution.solution(3,5));
    }
}
