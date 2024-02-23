package level2;

import java.util.Arrays;

public class Algo20 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); // 0, 1, 4, 4, 5, 6, 7
        for (int i = 0; i < citations.length; i++){
            int n = citations.length -i;

            if (citations[i] >= n){
                answer = n;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo20 algo = new Algo20();

        int[] citations = {4, 0, 6, 1, 5, 7, 4};
//        int[] citations = {0,0,0};
        int result = 4;
        System.out.println(algo.solution(citations));
        if (algo.solution(citations) == result) System.out.println("Y"); else System.out.println("N");
    }
}
