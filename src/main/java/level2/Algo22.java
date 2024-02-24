package level2;

public class Algo22 {
    public String solution(int[] numbers) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Algo22 algo = new Algo22();

        int[] numbers = {6, 10, 2};
        String result = "6210";
        System.out.println(algo.solution(numbers));
        if (algo.solution(numbers).equals(result)) System.out.println("Y"); else System.out.println("N");

        int[] numbers2 = {3, 30, 34, 5, 9};
        String result2 = "9534330";
        System.out.println(algo.solution(numbers2));
        if (algo.solution(numbers2).equals(result2)) System.out.println("Y"); else System.out.println("N");
    }
}
