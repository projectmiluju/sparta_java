package level2;

import java.util.LinkedList;

public class Algo31 {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length*5;

        int answer = 0;
        LinkedList<String> queue = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String s  = cities[i].toUpperCase();
            if (queue.remove(s)){
                answer += 1;
                queue.add(s);
            }else {
                answer += 5;
                if (queue.size() >= cacheSize) {
                    queue.remove(0);
                }
                queue.add(s);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo31 algo31 = new Algo31();

        int cacheSize1 = 3;
        String[] cities1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int result1 = 50;
        System.out.println(algo31.solution(cacheSize1, cities1));
        if (algo31.solution(cacheSize1, cities1) == result1) System.out.println("Y"); else System.out.println("N");

        int cacheSize2 = 3;
        String[] cities2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        int result2 = 21;
        System.out.println(algo31.solution(cacheSize2, cities2));
        if (algo31.solution(cacheSize2, cities2) == result2) System.out.println("Y"); else System.out.println("N");

        int cacheSize3 = 2;
        String[] cities3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int result3 = 60;
        System.out.println(algo31.solution(cacheSize3, cities3));
        if (algo31.solution(cacheSize3, cities3) == result3) System.out.println("Y"); else System.out.println("N");

        int cacheSize4 = 5;
        String[] cities4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int result4 = 52;
        System.out.println(algo31.solution(cacheSize4, cities4));
        if (algo31.solution(cacheSize4, cities4) == result4) System.out.println("Y"); else System.out.println("N");

        int cacheSize5 = 2;
        String[] cities5 = {"Jeju", "Pangyo", "NewYork", "newyork"};
        int result5 = 16;
        System.out.println(algo31.solution(cacheSize5, cities5));
        if (algo31.solution(cacheSize5, cities5) == result5) System.out.println("Y"); else System.out.println("N");

        int cacheSize6 = 0;
        String[] cities6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int result6 = 25;
        System.out.println(algo31.solution(cacheSize6, cities6));
        if (algo31.solution(cacheSize6, cities6) == result6) System.out.println("Y"); else System.out.println("N");
    }
}
