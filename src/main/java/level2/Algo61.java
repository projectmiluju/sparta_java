package level2;


import java.util.Arrays;
import java.util.Comparator;

public class Algo61 {
    public int solution(String[][] book_time) {
        int answer = 0;

        //분으로 통일해 정수배열로 변경
        int[][] time = changeMin(book_time);

        //0번째 인덱스를 기준으로 오름차순 정렬
        Arrays.sort(time, Comparator.comparingInt(a -> a[0]));

        int[] arr = new int[1440];
        for (int i = 0; i < time.length; i++){
            int start = time[i][0];
            int end = Math.min(1439, time[i][1]+10);
            for (int j = start; j < end; j++){
                arr[j]++;
            }
        }
        for (int i = 0; i < 1440; i++){
            answer = Math.max(answer, arr[i]);
        }
        return answer;
    }

    public static int[][] changeMin(String[][] book_time) {
        int[][] answer = new int[book_time.length][book_time[0].length];

        for (int i = 0; i < book_time.length; i++){
            answer[i][0] = Integer.parseInt(book_time[i][0].split(":")[0])*60 + Integer.parseInt(book_time[i][0].split(":")[1]);
            answer[i][1] = Integer.parseInt(book_time[i][1].split(":")[0])*60 + Integer.parseInt(book_time[i][1].split(":")[1]);
        }

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
