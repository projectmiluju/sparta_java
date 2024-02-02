package level1;


public class Algo27 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo27 algo = new Algo27();
        int a1 = 5;
        int a2 = 5;
        int a3 = 3;

        int[] b1 = {2, 4};
        int[] b2 = {2, 4};
        int[] b3 = {3};

        int[] c1 = {1, 3, 5};
        int[] c2 = {3};
        int[] c3 = {1};

        System.out.println(algo.solution(a1,b1,c1));
        System.out.println(algo.solution(a2,b2,c2));
        System.out.println(algo.solution(a3,b3,c3));
    }
}
