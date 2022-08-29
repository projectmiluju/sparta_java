public class NoNumber {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int i : numbers){
            answer -= i ;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] s = {1,2,3,4,6,7,8,0};
        NoNumber solution = new NoNumber();
        System.out.println(solution.solution(s));
    }
}
