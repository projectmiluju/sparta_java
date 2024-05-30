package level3;

public class Algo6 {
    public int solution(int[] A, int[] B) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Algo6 algo6 = new Algo6();

        int[] A1 = {5,1,3,7}, B1 = {2,2,6,8};
        int res1 = 3;
        int ans1 = algo6.solution(A1, B1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] A2 = {2,2,2,2}, B2 = {1,1,1,1};
        int res2 = 0;
        int ans2 = algo6.solution(A2, B2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
