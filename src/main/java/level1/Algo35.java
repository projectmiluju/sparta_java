package level1;

public class Algo35 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo35 algo35 = new Algo35();

        int cacheSize1 = 3;
        String[] cities1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int result1 = 50;
        System.out.println(algo35.solution(cacheSize1, cities1));
        if (algo35.solution(cacheSize1, cities1) == result1) System.out.println("Y"); else System.out.println("N");

        int cacheSize2 = 3;
        String[] cities2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        int result2 = 21;
        System.out.println(algo35.solution(cacheSize2, cities2));
        if (algo35.solution(cacheSize2, cities2) == result2) System.out.println("Y"); else System.out.println("N");

        int cacheSize3 = 2;
        String[] cities3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int result3 = 60;
        System.out.println(algo35.solution(cacheSize3, cities3));
        if (algo35.solution(cacheSize3, cities3) == result3) System.out.println("Y"); else System.out.println("N");

        int cacheSize4 = 5;
        String[] cities4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int result4 = 52;
        System.out.println(algo35.solution(cacheSize4, cities4));
        if (algo35.solution(cacheSize4, cities4) == result4) System.out.println("Y"); else System.out.println("N");

        int cacheSize5 = 2;
        String[] cities5 = {"Jeju", "Pangyo", "NewYork", "newyork"};
        int result5 = 16;
        System.out.println(algo35.solution(cacheSize5, cities5));
        if (algo35.solution(cacheSize5, cities5) == result5) System.out.println("Y"); else System.out.println("N");

        int cacheSize6 = 0;
        String[] cities6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int result6 = 25;
        System.out.println(algo35.solution(cacheSize6, cities6));
        if (algo35.solution(cacheSize6, cities6) == result6) System.out.println("Y"); else System.out.println("N");
    }
}
