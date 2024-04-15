package level2;

import java.util.ArrayList;

public class Algo32 {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        if (!s.contains("0")) {
            long num = Long.parseLong(s);
            if (isPrime(num)) {
                answer++;
                return answer;
            }
            return answer;
        }
        String[] str = s.split("0");
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty() && !str[i].equals("1")) {
                arr.add(str[i]);
            }
        }
        if (arr.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < arr.size(); i++) {
            long num = Long.parseLong(arr.get(i));
            if (isPrime(num)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean isPrime(Long n) {
        if (n == 1) return false;
        else if (n == 2) return true;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Algo32 algo32 = new Algo32();

        System.out.println(algo32.solution(437674,3));
        if (algo32.solution(437674, 3) == 3) System.out.println("Y"); else System.out.println("N");

        System.out.println(algo32.solution(110011, 10));
        if (algo32.solution(110011, 10) == 2) System.out.println("Y"); else System.out.println("N");

        System.out.println(algo32.solution(3,3));
        if (algo32.solution(3,3) == 0) System.out.println("Y"); else System.out.println("N");
    }
}
