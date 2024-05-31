package level2;

import java.util.Arrays;

public class Algo65 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = bitCal(numbers[i]);
        }
        return answer;
    }

    public static long bitCal(long n){
        long answer = 0;
        String a = Long.toBinaryString(n);
        long b = n + 1;
        while (answer == 0){
            String bitB = Long.toBinaryString(b);
            if (bitB.length() != a.length()){
                a = "0"+a;
            }
            int cnt = 0;
            for (int i = 0; i < a.length(); i++){
                if (a.charAt(i) != bitB.charAt(i)){
                    cnt++;
                }
                if (cnt > 2){
                    b++;
                    break;
                }
            }
            if (cnt <= 2){
                answer = b;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo65 algo = new Algo65();

        long[] numbers = {2, 7};
        long[] result = {3, 11};
        long[] answer = algo.solution(numbers);
        System.out.println(Arrays.toString(answer));
        if (Arrays.equals(result, answer)) System.out.println("Y"); else System.out.println("N");
    }

}
