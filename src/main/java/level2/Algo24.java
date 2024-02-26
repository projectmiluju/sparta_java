package level2;

import java.util.Arrays;

public class Algo24 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++){
            for (int j = i + 1; j < prices.length; j++){
                answer[i]++;
                if (prices[i] > prices[j]){
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo24 algo = new Algo24();

        int[] prices = {1, 2 ,3, 2, 3};
        System.out.println(Arrays.toString(algo.solution(prices)));
    }
}
