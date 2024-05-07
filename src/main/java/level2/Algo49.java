package level2;

public class Algo49 {
    public int solution(int[] topping) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Algo49 algo49 = new Algo49();

        int[] topping1 = {1, 2, 1, 3, 1, 4, 1, 2};
        int res1 = 2;
        int ans1 = algo49.solution(topping1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] topping2 = {, 2, 3, 1, 4};
        int res2 = 0;
        int ans2 = algo49.solution(topping2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
