package level2;

import java.util.Arrays;

public class Algo22 {
    public String solution(int[] numbers) {

        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }


        return answer.toString();

    }

    public static void main(String[] args) {
        Algo22 algo = new Algo22();

        int[] numbers = {6, 10, 2};
        String result = "6210";
        System.out.println(algo.solution(numbers));
        if (algo.solution(numbers).equals(result)) System.out.println("Y"); else System.out.println("N");

        int[] numbers2 = {3, 30, 34, 5, 9};
        String result2 = "9534330";
        System.out.println(algo.solution(numbers2));
        if (algo.solution(numbers2).equals(result2)) System.out.println("Y"); else System.out.println("N");
    }
}
