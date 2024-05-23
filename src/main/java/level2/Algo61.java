package level2;

public class Algo61 {
    public int solution(String[][] book_time) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo61 algo = new Algo61();

        String[][] book_time1 = new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
        int res1 = 3;
        int ans1 = algo.solution(book_time1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        String[][] book_time2 = new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}};
        int res2 = 1;
        int ans2 = algo.solution(book_time2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");

        String[][] book_time3 = new String[][]{{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}};
        int res3 = 3;
        int ans3 = algo.solution(book_time3);
        System.out.println(ans3);
        if (res3 == ans3) System.out.println("Y"); else System.out.println("N");
    }
}
