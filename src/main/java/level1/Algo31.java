package level1;

import java.util.Objects;

public class Algo31 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] r = {1,3};
        int[] l = {1,3};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 1){
                l = new int[]{1, 0};
                answer += "L";
            }
            if (numbers[i] == 4){
                l = new int[]{1, 1};
                answer += "L";
            }
            if (numbers[i] == 7){
                l = new int[]{1, 2};
                answer += "L";
            }
            if (numbers[i] == 3){
                r = new int[]{1, 0};
                answer += "R";
            }
            if (numbers[i] == 6){
                r = new int[]{1, 1};
                answer += "R";
            }
            if (numbers[i] == 9){
                r = new int[]{1, 2};
                answer += "R";
            }

            if (Objects.equals(hand, "right")){
                if (numbers[i] == 2){
                    if(l[0] + l[1] >= r[0] + r[1]){
                        answer += "R";
                        r = new int[]{0,0};
                    }else {
                        answer += "L";
                        l = new int[]{0,0};
                    }
                }
                if (numbers[i] == 5){
                    if (l[0] + Math.abs(1-l[1]) >= r[0] + Math.abs(1-r[1])){
                        answer += "R";
                        r = new int[]{0,1};
                    }else {
                        answer += "L";
                        l = new int[]{0,1};
                    }
                }
                if (numbers[i] == 8){
                    if (l[0] + Math.abs(2-l[1]) >= r[0] + Math.abs(2-r[1])){
                        answer += "R";
                        r = new int[]{0,2};
                    }else {
                        answer += "L";
                        l = new int[]{0,2};
                    }
                }
                if (numbers[i] == 0){
                    if (l[0] + Math.abs(3-l[1]) >= r[0] + Math.abs(3-r[1])){
                        answer += "R";
                        r = new int[]{0,3};
                    }else {
                        answer += "L";
                        l = new int[]{0,3};
                    }
                }
            }
            if (Objects.equals(hand, "left")){
                if (numbers[i] == 2){
                    if(l[0] + l[1] <= r[0] + r[1]){
                        answer += "L";
                        l = new int[]{0,0};
                    }else {
                        answer += "R";
                        r = new int[]{0,0};
                    }
                }
                if (numbers[i] == 5){
                    if (l[0] + Math.abs(1-l[1]) <= r[0] + Math.abs(1-r[1])){
                        answer += "L";
                        l = new int[]{0,1};
                    }else {
                        answer += "R";
                        r = new int[]{0,1};
                    }
                }
                if (numbers[i] == 8){
                    if (l[0] + Math.abs(2-l[1]) <= r[0] + Math.abs(2-r[1])){
                        answer += "L";
                        l = new int[]{0,2};
                    }else {
                        answer += "R";
                        r = new int[]{0,2};
                    }
                }
                if (numbers[i] == 0){
                    if (l[0] + Math.abs(3-l[1]) <= r[0] + Math.abs(3-r[1])){
                        answer += "L";
                        l = new int[]{0,3};
                    } else {
                        answer += "R";
                        r = new int[]{0,3};
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo31 algo = new Algo31();
        int[] n1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        String result1 = "LRLLLRLLRRL";
        System.out.println(result1);
        System.out.println(algo.solution(n1,hand1));
        if (Objects.equals(algo.solution(n1, hand1), result1)) System.out.println("Y"); else System.out.println("N");

        int[] n2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        String result2 = "LRLLRRLLLRR";
        System.out.println(result2);
        System.out.println(algo.solution(n2,hand2));
        if (Objects.equals(algo.solution(n2, hand2), result2)) System.out.println("Y"); else System.out.println("N");

        int[] n3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";
        String result3 = "LLRLLRLLRL";
        System.out.println(result3);
        System.out.println(algo.solution(n3,hand3));
        if (Objects.equals(algo.solution(n3, hand3), result3)) System.out.println("Y"); else System.out.println("N");
    }
}
