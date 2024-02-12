package level2;

public class Algo15 {
    public int solution(String[][] clothes) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algo15 algo = new Algo15();

        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"blue_sunglasses", "eyewear"}};
        int result = 5;
        System.out.println(algo.solution(clothes));
        if (algo.solution(clothes) == result) System.out.println("Y"); else System.out.println("N");

        String[][] clothes2 = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
        int result2 = 3;
        System.out.println(algo.solution(clothes2));
        if (algo.solution(clothes2) == result2) System.out.println("Y"); else System.out.println("N");

    }

}
