package level1;

import java.util.Arrays;

public class Algo27 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++){
            for (int j = 0; j < reserve.length; j++){
                if (lost[i] == reserve[j]){
                    answer ++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++){
            for (int j = 0; j < reserve.length; j++){
                    if (lost[i] < reserve[j] && reserve[j] - lost[i] == 1){
                        answer ++;
                        reserve[j] = -1;
                        break;
                    }
                    if (lost[i] > reserve[j] && lost[i] - reserve[j] == 1){
                        answer++;
                        reserve[j] = -1;
                        break;
                    }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo27 algo = new Algo27();
//        int a1 = 5;
//        int a2 = 5;
//        int a3 = 3;
        int a4 = 6;

//        int[] b1 = {2,4};
//        int[] b2 = {2,4};
//        int[] b3 = {3};
        int[] b4 = {1,3,4};

//        int[] c1 = {1,3,5};
//        int[] c2 = {3};
//        int[] c3 = {1};
        int[] c4 = {3,4,5};

//
//        System.out.println(algo.solution(a1,b1,c1)); // 5
//        System.out.println(algo.solution(a2,b2,c2)); // 4
//        System.out.println(algo.solution(a3,b3,c3)); // 2
        System.out.println(algo.solution(a4,b4,c4)); // 6
    }
}
