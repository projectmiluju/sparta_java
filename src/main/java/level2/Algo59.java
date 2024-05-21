package level2;

public class Algo59 {

    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int digit = storey % 10;
            storey /= 10;

            if (digit == 5){
                if (storey % 10 >= 5){
                    answer = answer + (10 - digit);
                    storey++;
                } else {
                    answer = answer + digit;
                }
            } else if (digit > 5) {
                answer = answer + (10 - digit);
                storey++;
            } else {
                answer = answer + digit;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo59 algo59 = new Algo59();

        int storey1 = 16;
        int res1 = 6;
        int ans1 = algo59.solution(storey1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int storey2 = 2554;
        int res2 = 16;
        int ans2 = algo59.solution(storey2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
