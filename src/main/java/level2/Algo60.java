package level2;

public class Algo60 {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo60 algo60 = new Algo60();

        int[] arrayA1 = {10, 17};
        int[] arrayB1 = {5, 20};
        int res1 = 0;
        int ans1 = algo60.solution(arrayA1, arrayB1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        int[] arrayA2 = {10, 20};
        int[] arrayB2 = {5, 17};
        int res2 = 10;
        int ans2 = algo60.solution(arrayA2, arrayB2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");

        int[] arrayA3 = {14, 35, 119};
        int[] arrayB3 = {18, 30, 102};
        int res3 = 7;
        int ans3 = algo60.solution(arrayA3, arrayB3);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");
    }
}
