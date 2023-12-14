import java.util.Arrays;

public class Algo3 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++){
            sum += d[i];
            if (sum>budget){
                answer = i;
                break;
            }
        }
        if (sum<=budget){
            answer = d.length;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] x = new int[] {1,3,2,4,5};
        int y = 9;
        Algo3 solution = new Algo3();
        System.out.println(solution.solution(x, y));
    }
}
