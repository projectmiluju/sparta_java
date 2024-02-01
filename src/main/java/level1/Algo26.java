package level1;

import java.util.Arrays;

public class Algo26 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int num = 0;
        int zero = 0;
        for (int i = 0; i < win_nums.length; i++){
            for (int j = 0; j < lottos.length; j ++){
                if(win_nums[i] == lottos[j]){
                    num ++;
                }
            }
            if (lottos[i] == 0){
                zero ++;
            }
        }
        if (num == 0){
            answer = new int[]{1, 6};
        } else if (num == 6) {
            answer = new int[]{1, 1};
        } else answer = new int[]{7-num-zero, 7-num};
        return answer;
    }

    public static void main(String[] args) {
        Algo26 algo = new Algo26();
        int[] a1 = {44, 1, 0, 0, 31, 25};
        int[] a2 = {0, 0, 0, 0, 0, 0};
        int[] a3 = {45, 4, 35, 20, 3, 9};

        int[] b1 = {31, 10, 45, 1, 6, 19};
        int[] b2 = {38, 19, 20, 40, 15, 25};
        int[] b3 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(algo.solution(a1, b1))); // {3,5}
        System.out.println(Arrays.toString(algo.solution(a2, b2))); // {1,6}
        System.out.println(Arrays.toString(algo.solution(a3, b3))); // {1,1}

    }
}
