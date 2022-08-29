public class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i<a.length; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }
    public static void main(String[] args){
        int[] x = {1,2,3,4};
        int[] y = {-3,-1,0,2};

        DotProduct solution = new DotProduct();
        System.out.println(solution.solution(x,y));
    }
}
