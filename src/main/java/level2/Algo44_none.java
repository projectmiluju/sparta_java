package level2;


import java.util.ArrayList;
import java.util.HashMap;

public class Algo44_none {
    public long solution(String expression) {
        long answer = 0;
//        String str = expression.replaceAll("[0-9]", "");
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            map.put(str.charAt(i),0);
//        }
//
//        int index = factorial(map.size());
//
//        String str2 = expression.replaceAll("[*+-]"," ");
//        ArrayList<Long> list = new ArrayList<>();
//        for (int i = 0; i < str.length()+1; i++) {
//            list.add(Long.parseLong(str2.split(" ")[i]));
//        }
//
//        return answer;
//    }
//
//    public int factorial(int n) {
//        if (n == 1) return 1;
//        return n * factorial(n - 1);
//    }
//
//    public int cal(int index, long[] list, String str){
//        if (index == 1){
//            ArrayList<Long> list2 = new ArrayList<>();
//            list2.add(list[0]);
//            for (int i = 1; i < list.length; i++) {
//                list2.add(list2[0]);
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        Algo44_none algo44 = new Algo44_none();

        String expression1 = "100-200*300-500+20";
        long result1 = 60420;
        System.out.println(algo44.solution(expression1));
        if (algo44.solution(expression1) == result1) System.out.println("Y"); else System.out.println("N");

        String expression2 = "50*6-3*2";
        long result2 = 300;
        System.out.println(algo44.solution(expression2));
        if (algo44.solution(expression2) == result2) System.out.println("Y"); else System.out.println("N");
    }
}
