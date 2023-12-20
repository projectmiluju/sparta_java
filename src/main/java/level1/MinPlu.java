package level1;

public class MinPlu {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i<absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            }
            else{
                answer -= absolutes[i];
            }
        }

        return answer;
    }
    public static void main(String[] args){
        int[] s = {1,2,3};
        boolean[] signs = {false,false,true};
        MinPlu solution = new MinPlu();
        System.out.println(solution.solution(s, signs));
    }
}
