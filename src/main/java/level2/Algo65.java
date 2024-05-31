package level2;

import java.util.Arrays;

public class Algo65 {
//    public long[] solution(long[] numbers) {
//        long[] answer = new long[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                answer[i] = numbers[i]+1;
//            }else {
//                answer[i] = bitCal(numbers[i]);
//
//            }
//        }
//        return answer;
//    }
//
//    public static long bitCal(long n){
//        long answer = 0;
//        StringBuilder a = new StringBuilder(Long.toBinaryString(n));
//        for (long i = n+1;;i++){
//            String b = Long.toBinaryString(i);
//            if (b.length() != a.length()) {
//                a.insert(0, "0");
//            }
//            int cnt = 0;
//            for (int j = 0; j < a.length(); j++) {
//                if (a.charAt(j) != b.charAt(j)) {
//                    cnt++;
//                }
//                if (cnt > 2){
//                    break;
//                }
//            }
//            if (cnt <= 2){
//                answer = i;
//                break;
//            }
//        }
//        return answer;
//    }

    public long[] solution(long[] numbers) {
        long[] answer = numbers.clone();
        for (int i = 0; i < numbers.length; i++) {
            answer[i]++; // x보다 큰수로 만든다.
            answer[i] += (answer[i] ^ numbers[i]) >> 2;
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
