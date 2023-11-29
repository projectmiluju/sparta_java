import java.util.Arrays;
//프로그랴머스 lv1 최대공약수와 최소공배수

public class MaxMin {
    public int[] solution(int n, int m){
        int[] answer = new int[2];
        answer[0] = abc(n,m);
        answer[1] = (n*m)/answer[0];
        return answer;
    }
    public static int abc(int x, int y){
        if (y == 0) return x;
        return abc(y,x%y);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        MaxMin solution = new MaxMin();
        System.out.println(Arrays.toString(solution.solution(a,b)));
    }
}
