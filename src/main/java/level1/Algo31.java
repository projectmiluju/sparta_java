package level1;

public class Algo31 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Algo31 algo = new Algo31();
        int[] n1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        System.out.println(algo.solution(n1,hand1)); //

        int[] n2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        System.out.println(algo.solution(n2,hand2)); //

        int[] n3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";
        System.out.println(algo.solution(n3,hand3)); //
    }
}
