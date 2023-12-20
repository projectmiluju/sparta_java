package level1;// 프로그래머스 lv1 3진법 뒤집기

public class TritRevers {
    public int solution(int n){
        String a = "";

        while (n >0){
            a = (n % 3) + a;
            n /= 3;
        }

        a = new StringBuilder(a).reverse().toString();

        return Integer.parseInt(a,3);
    }

    public static void main(String[] args) {
        int a = 45;
        TritRevers solution = new TritRevers();
        System.out.println(solution.solution(a));
    }
}
