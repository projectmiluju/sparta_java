package level2;

import java.util.Arrays;
import java.util.Stack;

public class Algo24 {
    public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//        for (int i = 0; i < prices.length; i++){
//            for (int j = i + 1; j < prices.length; j++){
//                answer[i]++;
//                if (prices[i] > prices[j]){
//                    break;
//                }
//            }
//        }
//
//        return answer;

        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++){
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo24 algo = new Algo24();

        int[] prices = {1, 2 ,3, 2, 3};
        System.out.println(Arrays.toString(algo.solution(prices)));
    }
}
