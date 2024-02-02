package level1;

public class Algo28 {
    public int solution(String dartResult) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo28 algo = new Algo28();

        String a1 = "1S2D*3T";
        System.out.println(algo.solution(a1)); // 37

        String a2 = "1D2S#10S";
        System.out.println(algo.solution(a2)); // 9

        String a3 = "1D2S0T";
        System.out.println(algo.solution(a3)); // 3

        String a4 = "1S*2T*3S";
        System.out.println(algo.solution(a4)); // 23

        String a5 = "1D#2S*3S";
        System.out.println(algo.solution(a5)); // 5

        String a6 = "1T2D3D#";
        System.out.println(algo.solution(a6)); // -4

        String a7 = "1D2S3T*";
        System.out.println(algo.solution(a7)); // 59
    }
}
