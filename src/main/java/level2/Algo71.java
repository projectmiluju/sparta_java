package level2;

public class Algo71 {
    public int solution(String word) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo71 algo71 = new Algo71();

        String word1 = "AAAAE";
        int res1 = 6;
        int ans1 = algo71.solution(word1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        String word2 = "AAAE";
        int res2 = 10;
        int ans2 = algo71.solution(word2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");

        String word3 = "I";
        int res3 = 1563;
        int ans3 = algo71.solution(word3);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");

        String word4 = "EIO";
        int res4 = 1189;
        int ans4 = algo71.solution(word4);
        System.out.println(ans4);
        if (res4 == ans4) System.out.println("Y"); else System.out.println("N");
    }
}
